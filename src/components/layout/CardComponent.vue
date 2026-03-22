<template>
  <LayoutRow style=" margin-bottom: 50px; ">
    <div
      class="card-component"
      :class="{ desktop: !isMobile(), mobile: isMobile() }"
      align="center"
    >
      <div style="width: 83%">
        <slot name="content"></slot>
      </div>
    </div>
  </LayoutRow>
</template>

<script setup lang="ts">
import { getSpanBlog } from '@/scripts/layout'
import LayoutRow from '@/components/layout/LayoutRow.vue'
import { isMobile } from '@/scripts/utils'
</script>

<style scoped>
@import '../../assets/styles/palette.css';
.card-component{
  border: 6px double var(--secondary-color);
  background-color: var(--main-color);
}
.desktop {
  width: 58%;
}
.mobile {
  width: 98%;
}
</style>
