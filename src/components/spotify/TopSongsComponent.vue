<template>
  <h1>Songs I listened to most this month</h1>
  <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
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
  const response = await fetch('/src/data/info.json');
  const data = await response.json();
  config.user = data;
  console.log(data);
});
</script>

<style scoped>

</style>