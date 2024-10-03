<template>
  <div class="image-container">
    <img :src="song.cover_url" style="width:100%;" />
    <div class="hover-text">
      <h3><a :href="props.song.url" target="_blank">{{props.song.name}}</a></h3>
    </div>
    <div class="author-text">
      <a v-for="artist in props.song.artists" :href="artist.profile_url" target="_blank" style="margin-right: 10%">{{artist.name}}</a>
    </div>
  </div>
</template>

<script setup lang="ts">
class Artist {
  name: string;
  profile_url: string;
  constructor(name: string, profile_url: string) {
    this.name = name;
    this.profile_url = profile_url;
  }
}

const props = defineProps<{
    song: {
      name: string,
      cover_url: string,
      url: string,
      artists: Artist[],
      artist_url: string
    }
  }>()
</script>

<style scoped>
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

  .image-container .hover-text {
    position: absolute;
    top: 70%;
    left: 20%;
    transform: translate(-0%, -50%);
    font-size: 18px;
    font-weight: bold;
    opacity: 0;
    transition: 0.5s ease;
  }
  .image-container .author-text {
    position: absolute;
    top: 80%;
    left: 20%;
    transform: translate(-0%, -50%);
    font-weight: bold;
    opacity: 0;
    transition: 0.5s ease;
  }

  .image-container:hover img {
    filter: brightness(50%);
  }

  .image-container:hover .hover-text {
    opacity: 1;
    left:10%;
  }
  .image-container:hover .author-text {
    opacity: 1;
    left:10%;
  }
  .image-container:hover .hover-text:hover {
    animation: scroll-left 10s linear infinite; /* Infinite scrolling */
  }
  .image-container:hover .author-text:hover {
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