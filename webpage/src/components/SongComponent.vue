<template>
  <h1>{{ props.song.name }}</h1>
</template>

<script setup lang="ts">
  const props = defineProps<{
    song: {
      name: string
    }
  }>()
</script>

<style scoped>

</style>