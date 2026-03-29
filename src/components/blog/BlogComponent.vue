<template>
  <CardComponent>
  	<template #content>
  		<h2>{{ date }}</h2>
        <h1>{{ title }}</h1>

        <hr class="dashed" />
        <slot name="body"></slot>
        <hr class="dashed" />
        <slot name="references"></slot>
  	</template>
  </CardComponent>
</template>

<script setup lang="ts">
import LayoutRow from '@/components/layout/LayoutRow.vue'
import CardComponent from '@/components/layout/CardComponent.vue'
import { isMobile } from '@/scripts/utils'

const props = defineProps<{
  date: string
  title: string
}>()
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
h1 {
  font-family: 'Courier New', Courier, monospace;
}
h2 {
  font-family: 'Courier New', Courier, monospace;
}
.center-container{
  border: 6px double var(--secondary-color);
  background-color: var(--main-color);
}
hr {
  width: 80%;
}

.desktop {
  width: 58%;
}
.mobile {
  width: 98%;
}
</style>
