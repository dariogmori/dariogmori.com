<template>
  <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
    <el-carousel-item v-for="image_name in props.images" >
      <img :src="'../../img/hobby/art/' + props.id + '/' + image_name" class="image-display" style="width: 100%">
    </el-carousel-item>
  </el-carousel>
  <p>
    {{ t('art.' + props.id + '.description')}}
  </p>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";

const { t } = useTranslation();
const props = defineProps({
  images: Array<String>,
  id: String

})
</script>

<style scoped>

</style>