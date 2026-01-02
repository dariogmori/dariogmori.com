<template>
  <el-row justify="space-evenly">
    <el-col :span="16" class="center-container">
      <h2>{{ title }}</h2>
      <slot name="body"></slot>
    </el-col>
  </el-row>
</template>

<script setup lang="ts">
const props = defineProps<{
  title: string
}>()
</script>


<style scoped>
@import '../../assets/styles/palette.css';
/* @import '../../assets/styles/view.css'; */
h2 {
  font-family: 'Courier New', Courier, monospace;
}
.body p {
  font-family: 'Courier New', Courier, monospace;
}
</style>