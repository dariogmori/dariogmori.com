<template>

  <img :src="song.cover_url" style="width:100%;" />
  <h3>{{ props.song.name }}</h3>
</template>

<script setup lang="ts">
  const props = defineProps<{
    song: {
      name: string,
      cover_url: string
    }
  }>()
</script>

<style scoped>

</style>