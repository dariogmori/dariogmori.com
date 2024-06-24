<template>
  <h1>Top Songs</h1>
  <el-carousel :interval="4000" type="card" height="200px" style="width:100%;">
    <el-carousel-item v-for="song in songs.list" key="song.name" >
      <SongComponent :song="song"/>
    </el-carousel-item>
  </el-carousel>
</template>

<script setup lang="ts">
 import {reactive} from "vue";
 import SongComponent from "@/components/SongComponent.vue";

 const songs = reactive({
   list: [{
     "name": "song1"
   },
   {
     "name": "song2"
   },
   {
     "name": "song3"
   }]
 })
</script>

<style scoped>

</style>