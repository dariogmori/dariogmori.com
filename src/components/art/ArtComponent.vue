<template>
  <div style="width: 100%">
  	<h2>{{ t('month.' + props.art.month) + ' ' + props.art.year }}</h2>
  </div>
  <div style="display: flex; width: 90%; flex-wrap: wrap; justify-content: space-around">
     <div v-for="image_name in props.art.images" style="width: 40%; margin: 10px">
       <img
         :src="'../../img/hobby/art/' + props.art.id + '/' + image_name"
         class="image-display"
         style="width: 100%"
       />
     </div>
   </div>
   <p class="secondary-text">
     {{ t('art.' + props.art.id + '.description') }}
   </p>
</template>

<script setup lang="ts">
import { useTranslation } from 'i18next-vue'

const { t } = useTranslation()
const props = defineProps<{
  art: {
    images: Array<String>
    id: String
    month: String
    year: String
  }
}>()
</script>
