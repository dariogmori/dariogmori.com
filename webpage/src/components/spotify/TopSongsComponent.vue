<template>
  <h1>Songs I listened to most this month</h1>
  <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
    <el-carousel-item v-for="song in config.user.topSongs" key="song.name" >
      <SongComponent :song="song"/>
    </el-carousel-item>
  </el-carousel>
</template>

<script setup lang="ts">
import {onMounted, reactive} from "vue";
 import SongComponent from "@/components/spotify/SongComponent.vue";
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