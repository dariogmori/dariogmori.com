import fs from "fs";
import path from "path";
import fetch from "node-fetch";

const API_URL = "https://api.dariogmori.com/spotify/info";
const OUT_DIR = "src/data";

async function downloadImage(url, filename) {
  if (!url) return;
  const res = await fetch(url);
  if (!res.ok) {
    console.error(`❌ Failed to download ${url}`);
    return;
  }
  const buffer = await res.arrayBuffer();
  fs.writeFileSync(filename, Buffer.from(buffer));
  console.log(`✅ Saved ${filename}`);
}

async function main() {
  const res = await fetch(API_URL);
  if (!res.ok) throw new Error(`API request failed: ${res.status}`);
  const data = await res.json();

  // ensure output folder
  fs.mkdirSync(OUT_DIR, { recursive: true });

  // save JSON
  fs.writeFileSync(path.join(OUT_DIR, "info.json"), JSON.stringify(data, null, 2));

  // download avatar
  await downloadImage(data.avatar, path.join(OUT_DIR, "avatar.jpg"));

  // download top songs covers
  for (let i = 0; i < data.top_songs.length; i++) {
    const song = data.top_songs[i];
    await downloadImage(song.cover_url, path.join(OUT_DIR, `song_${i + 1}.jpg`));
  }

  // download top artists avatars
  for (let i = 0; i < data.top_artists.length; i++) {
    const artist = data.top_artists[i];
    await downloadImage(artist.avatar_url, path.join(OUT_DIR, `artist_${i + 1}.jpg`));
  }
}

main().catch((err) => {
  console.error(err);
  process.exit(1);
});
