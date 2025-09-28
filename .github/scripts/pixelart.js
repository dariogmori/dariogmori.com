// pixelart.js
import Jimp from "jimp";

const palette = [
  "#A0DDD3", "#6FB0B7", "#577F9D", "#4A5786", "#3E3B66",
  "#392945", "#2D1E2F", "#452E3F", "#5D4550", "#7B6268",
  "#9C807E", "#C3A79C", "#DBC9B4", "#FCECD1", "#AAD795",
  "#64B082", "#488885", "#3F5B74", "#EBC8A7", "#D3A084",
  "#B87E6C", "#8F5252", "#6A3948", "#C57F79", "#AB597D"
];


// Convert hex (#rrggbb) -> { r, g, b, a }
function hexToRgba(hex) {
  const n = parseInt(hex.replace("#", ""), 16);
  return {
    r: (n >> 16) & 255,
    g: (n >> 8) & 255,
    b: n & 255,
    a: 255
  };
}

// Find closest palette color
function closestColor(r, g, b) {
  let best = palette[0];
  let bestDist = Infinity;

  for (const hex of palette) {
    const { r: pr, g: pg, b: pb } = hexToRgba(hex);
    const dist = (r - pr) ** 2 + (g - pg) ** 2 + (b - pb) ** 2;
    if (dist < bestDist) {
      bestDist = dist;
      best = hex;
    }
  }

  return hexToRgba(best);
}

async function makePixelArt(url, resolution = 32, output = "pixel.png", scale = 20) {
  // Load image
  const img = await Jimp.read(url);

  // shrink image
  img.resize(resolution, Jimp.AUTO, Jimp.RESIZE_NEAREST_NEIGHBOR);

  // snap to palette
  img.scan(0, 0, img.bitmap.width, img.bitmap.height, function (x, y, idx) {
    const r = this.bitmap.data[idx + 0];
    const g = this.bitmap.data[idx + 1];
    const b = this.bitmap.data[idx + 2];

    const { r: nr, g: ng, b: nb, a: na } = closestColor(r, g, b);

    this.bitmap.data[idx + 0] = nr;
    this.bitmap.data[idx + 1] = ng;
    this.bitmap.data[idx + 2] = nb;
    this.bitmap.data[idx + 3] = na; // force solid color
  });

  // scale back up (configurable)
  img.resize(img.bitmap.width * scale, img.bitmap.height * scale, Jimp.RESIZE_NEAREST_NEIGHBOR);

  await img.write(output);
  console.log(`✅ Saved pixel art to ${output}`);
}

// --- CLI usage ---
const [,, url, resolutionArg, outputArg, scaleArg] = process.argv;
if (!url) {
  console.log("Usage: node pixelart.js <imageUrl> <resolution> <outputFile> [scale]");
  process.exit(1);
}

const resolution = resolutionArg ? parseInt(resolutionArg, 10) : 32;
const output = outputArg || "pixel.png";
const scale = scaleArg ? parseInt(scaleArg, 10) : 20;

makePixelArt(url, resolution, output, scale);
