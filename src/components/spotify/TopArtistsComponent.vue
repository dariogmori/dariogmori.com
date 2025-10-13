<template>
  <h1>Artists I listened to most this month</h1>
  <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
    <el-carousel-item v-for="(artist, index) in config.user.top_artists" :key="index">
      <ArtistComponent :artist="artist" :index="index" />
    </el-carousel-item>
  </el-carousel>
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