<template>
  <div class="image-container" style="width:100%;">
    <img :src="`/img/pixels/artist_${props.index + 1}.jpg`" style="width:100%;" :alt="props.artist.name + ' cover'" class="logo"/>
    <div class="artist-text">
      <h3><a :href="props.artist.profile_url" target="_blank" class="link-bright">{{props.artist.name}}</a></h3>
    </div>
    <div class="genre-text">
      <el-tag
        v-for="genre in genresArray"
        :key="genre"
        type="info"
        style="margin-right: 10%;"
      >{{genre}}</el-tag>
    </div>
  </div>
</template>

<script setup lang="ts">
import { computed } from 'vue'

const props = defineProps<{
  artist: {
    name: string,
    avatar_url: string | null,
    profile_url: string,
    genres: string
  },
  index: number
}>()

// Safely parse genres
const genresArray = computed(() => {
  if (!props.artist.genres) return []
  try {
    const parsed = JSON.parse(props.artist.genres)
    return Array.isArray(parsed) ? parsed : []
  } catch {
    console.warn(`Invalid genres for artist ${props.artist.name}:`, props.artist.genres)
    return []
  }
})
</script>

<style scoped>

.logo{
    image-rendering: crisp-edges;
}

.image-container {
  position: relative;
  display: inline-block;
}

.image-container img {
  display: block;
  width: 100%;
  height: auto;
  transition: 0.5s ease;
}

.image-container .artist-text {
  position: absolute;
  top: 70%;
  left: 20%;
  transform: translate(-0%, -50%);
  font-size: 18px;
  font-weight: bold;
  opacity: 0;
  white-space: nowrap;
  transition: 0.5s ease;
  
}
.image-container .genre-text {
  position: absolute;
  top: 82%;
  left: 20%;
  transform: translate(-0%, -50%);
  white-space: nowrap;
  font-weight: bold;
  opacity: 0;
  transition: 0.5s ease;
}

.image-container:hover img {
  filter: brightness(50%);
}

.image-container:hover .artist-text {
  opacity: 1;
  left:10%;
}
.image-container:hover .genre-text {
  opacity: 1;
  left:10%;
}
.image-container:hover .artist-text:hover {
  animation: scroll-left 10s linear infinite; /* Infinite scrolling */
}
.image-container:hover .genre-text:hover {
  animation: scroll-left 10s linear infinite; /* Infinite scrolling */
}
/* Smooth scrolling from right to left and wrap back to the start */
@keyframes scroll-left {
  0% {
    transform: translate(0%,-50%); /* Start from the right */
  }
  20% {
    transform: translate(0%,-50%); /* Scroll to the left */
  }
  100% {
    transform: translate(-100%,-50%); /* Wrap back to the starting point */
  }
}
</style>
