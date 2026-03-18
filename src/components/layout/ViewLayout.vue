<template>
  <el-row justify="space-evenly">
    <el-col :span="getSpan(1)" class="center-container">
      <slot name="content"></slot>
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
