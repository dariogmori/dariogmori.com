<template>
  <el-row justify="space-evenly">
    <el-col :span="getSpan(1)" class="center-container" style="border;1px solid var(--secondary-color);">
      <slot name="center-col"></slot>
    </el-col>
  </el-row>

  <el-row justify="space-evenly">
    <el-col :span="getSpan(0)" class="left-container" >
      <slot name="left-col"></slot>
    </el-col>

    <el-col :span="getSpan(2)" class="right-container">
      <slot name="right-col"></slot>
    </el-col>
  </el-row>
</template>

<script setup lang="ts">
import { getSpan } from "@/scripts/layout";
</script>


<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>
