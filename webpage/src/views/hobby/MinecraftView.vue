<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <el-col>
        <img alt="skin" src="/img/hobby/minecraft/body.png" class="image-display" style="width: 70%">
        <canvas id="minecraftCanvas" style="width:30%;"></canvas>
      </el-col>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../../../public/img/hobby/minecraft/logo.gif" class="logo" style="width: 60%; ">
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <!--
      <LayoutRow>
        <iframe src="http://map.dariogmori.com:8123/" style="width: 100%; height: 30vh;"></iframe>
      </LayoutRow>
      -->
      <LayoutRow>
        <el-carousel indicator-position="outside" :interval="4000" height="33vh" style="width:100%;">
          <el-carousel-item v-for="image_name in images" >
            <img :src="'../../img/hobby/minecraft/' + image_name" class="image-display" style="width: 100%">
          </el-carousel-item>
        </el-carousel>
      </LayoutRow>
      <LayoutRow>
        <el-col>
          <p>
            {{ t('minecraft.description') }}
          </p>
        </el-col>
      </LayoutRow>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import {onMounted} from "vue";

const { t } = useTranslation();
import { useImageStore } from '@/stores/imageStore';

onMounted(() => {
  const imageStore = useImageStore()
  imageStore.setImageUrl('./img/hobby/minecraft/logo.gif')
})
const images = [
  '1.png',
  '2.png',
  '3.png',
  '4.png',
  '5.png',
  '6.png',
  '7.png',
  '8.png',
  '9.png',
  '10.png',
  '11.png',
  '12.png'
]
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>