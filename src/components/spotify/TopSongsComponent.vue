<template>
  <h3>Songs I listened to most this month</h3>
  <el-carousel :interval="4000" type="card" height="200px" style="width:100%;">
    <el-carousel-item v-for="(song, index) in config.user.top_songs" :key="index">
      <SongComponent :song="song" :index="index" />
    </el-carousel-item>
  </el-carousel>
</template>

<script setup lang="ts">
import {onMounted, reactive} from "vue";
 import SongComponent from "@/components/spotify/SongComponent.vue";

  const config = reactive({
    user: {
      username: '',
      avatar: '',
      profileUrl: '',
      topSongs: [],
      topArtists: []
    }
  })
onMounted(async () => {
  const response = await fetch('/data/info.json');
  const data = await response.json();
  config.user = data;
  console.log(data);
});
</script>

<style>
.el-carousel__mask {
    background-color: rgba(255, 255, 255, 0);
}
</style>