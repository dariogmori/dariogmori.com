<template>
  <LayoutRow :justify="'center'" :align="'middle'" >
    <h1>{{ t('month.'+ props.art.month) + ' ' + props.art.year }}</h1>
    <el-carousel :interval="4000" type="card" height="33vh" style="width:100%;">
      <el-carousel-item v-for="image_name in props.art.images" >
        <img :src="'../../img/hobby/art/' + props.art.id + '/' + image_name" class="image-display" :class="{ 'square-image' : !props.art.vertical, 'vertical-image' : props.art.vertical }" >
      </el-carousel-item>
    </el-carousel>
    <p>
      {{ t('art.' + props.art.id + '.description')}}
    </p>
  </LayoutRow>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import {isMobile} from "@/scripts/utils";

const { t } = useTranslation();
const props = defineProps<{
  art:{
    images: Array<String>,
    id: String,
    month: String,
    year: String,
    vertical: Boolean
  }
}>()
</script>

<style scoped>
.square-image {
  width: 100%;
}
.vertical-image{
  max-height: 100%;
}
</style>