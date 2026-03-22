<template>
  <div style="display: flex; justify-content: space-evenly">
    <div class="center-container" :class="{ desktop: !isMobile(), mobile: isMobile() }">
      <slot name="content"></slot>
    </div>
  </div>
</template>

<script setup lang="ts">
import { isMobile } from '@/scripts/utils'
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
.desktop {
  width: 58%;
}
.mobile {
  width: 100%;
}
</style>
