<template>

  <el-col :span="getSpan(1)" :push="isMobile() ? 0 : 6" class="center-container" >
    <slot name="center-col"></slot>
  </el-col>

  <el-col :span="getSpan(0)" :pull="isMobile() ? 0 : 12"  class="left-container" >
    <slot name="left-col"></slot>
  </el-col>

  <el-col :span="getSpan(2)" class="right-container">
    <slot name="right-col"></slot>
  </el-col>
</template>

<script setup lang="ts">
import { getSpan } from "@/scripts/layout";
import {isMobile} from "@/scripts/utils";
</script>


<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';
</style>