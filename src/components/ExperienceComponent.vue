<template>
  <el-col>
    <h3>{{ title }} @ {{ company }}, {{ location }}</h3>
  </el-col>
  <el-col>
    <p v-for="date in dates"> {{ date }}</p>
  </el-col>
</template>

<script setup lang="ts">
import { defineProps } from 'vue'
defineProps({
  title: String,
  company : String,
  location: String,
  dates: Array<String>
})
</script>

<style scoped>

</style>