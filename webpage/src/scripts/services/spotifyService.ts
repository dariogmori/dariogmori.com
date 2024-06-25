import axiosInstance from './axiosInstance'
export async function getSpotifyInfo() {
    const req: Record<string, unknown> = {
        url: '/spotify/info',
        method: 'GET'
    }
    let user = {
        username: '',
        avatar: '',
        profileUrl: '',
        topSongs: [],
        topArtists: []
    };
    const res = await axiosInstance(req)
    if (res.status !== 200) {
        throw new Error('Failed to get Spotify info')
    } else {
        const body = JSON.parse(JSON.stringify(res.data))
        user.username = body.username
        user.avatar = body.avatar
        user.topSongs = body.top_songs
        user.topArtists = body.top_artists
        return user
    }
}