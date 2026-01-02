<template>
  <el-row justify="space-evenly">
    <el-col :span="16" class="center-container" align="center">
      <h2>{{ date }}</h2>
      <h1>{{ title }}</h1>
      <el-divider></el-divider>
      <slot name="body"></slot>
      <el-divider></el-divider>
      <slot name="references"></slot>
    </el-col>
  </el-row>    
</template>

<script setup lang="ts">
const props = defineProps<{
  date: string,
  title: string
}>()
</script>


<style scoped>
@import '../../assets/styles/palette.css';
/* @import '../../assets/styles/view.css'; */
h1 {
  font-family: 'Courier New', Courier, monospace;
}
h2 {
  font-family: 'Courier New', Courier, monospace;
}
.center-container{
  border: 1px solid var(--secondary-color);
}
.el-divider{
  width:80%;
}
</style>