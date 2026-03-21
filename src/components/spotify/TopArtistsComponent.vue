<template>
  <h3>Artists I listened to most this month</h3>
  <div style="display:flex; width:90%; flex-wrap: wrap; justify-content: space-around;">
  	<div v-for="(artist, index) in config.user.top_artists" :key="index" style="width:40%; margin:10px;">
  		<ArtistComponent :artist="artist" :index="index" />
  	</div>
  </div>
</template>

<script setup lang="ts">
import {onMounted, reactive} from "vue";
 import ArtistComponent from "@/components/spotify/ArtistComponent.vue";

  const config = reactive({
    user: {
      username: '',
      avatar: '',
      profileUrl: '',
      topSongs: [],
      topArtists: []
    }
  })
 onMounted(async () =>{
   const response = await fetch('/data/info.json');
    const data = await response.json();
    config.user = data;
    console.log(data);
 })
</script>

<style scoped>

</style>
