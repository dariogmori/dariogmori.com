<template>
  <el-row :justify="props.justify" class="row">
    <slot></slot>
  </el-row>
</template>

<script setup lang="ts">
 const props = defineProps({
   justify: String
 });
</script>

<style scoped>
.row{
  margin-top:10%;
  margin-bottom:10%;
}
</style>