<template>
  <h3>Songs I listened to most this month</h3>
  <div style="display:flex; width:90%; flex-wrap: wrap; justify-content: space-around;">
	<div v-for="(song, index) in config.user.top_songs" :key="index" style="width:40%; margin:10px;">
		<SongComponent :song="song" :index="index" />
	</div>
  </div>
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
