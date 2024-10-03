<template>
  <h1>Artists I listened to most this month</h1>
  <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
    <el-carousel-item v-for="artist in config.user.topArtists" key="song.name" >
      <ArtistComponent :artist="artist"/>
    </el-carousel-item>
  </el-carousel>
</template>

<script setup lang="ts">
import {onMounted, reactive} from "vue";
 import ArtistComponent from "@/components/spotify/ArtistComponent.vue";
import { getSpotifyInfo } from '@/scripts/services/spotifyService';

  const config = reactive({
    user: {
      username: '',
      avatar: '',
      profileUrl: '',
      topSongs: [],
      topArtists: []
    }
  })
 onMounted(() =>{
   getSpotifyInfo().then((res) => {
     config.user = res
   })
 })
</script>

<style scoped>

</style>