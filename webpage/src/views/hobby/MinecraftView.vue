<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <el-col>
        <!-- <img alt="skin" src="/img/hobby/minecraft/body.png" class="image-display" style="width: 70%">
        <canvas id="minecraftCanvas" style="width:30%;"></canvas> -->

        <canvas id="skin_container"></canvas>
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
import * as skinview3d from "skinview3d";

const { t } = useTranslation();
import { useImageStore } from '@/stores/imageStore';

onMounted(() => {
  const imageStore = useImageStore()
  imageStore.setImageUrl('./img/hobby/minecraft/logo.gif')
  loadMinecraftSkin();
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

const loadMinecraftSkin = (): void => {
  const canvas = document.getElementById("skin_container") as HTMLCanvasElement;
  if (!canvas) return;

  // Set width and height based on the view width
  const viewWidth = window.innerWidth;
  // Example: make the canvas 40% of the view width, max 800px, min 300px
  const width = Math.max(300, Math.min(0.4 * viewWidth, 800));
  const height = width * 0.625; // maintain aspect ratio similar to 800x500

  canvas.width = width;
  canvas.height = height;

  let skinViewer = new skinview3d.SkinViewer({
    canvas,
    width,
    height,
    skin: "img/skin.png"
  });

  // Rotate the player
  skinViewer.autoRotate = true;

  // Apply an animation
  skinViewer.animation = new skinview3d.WalkingAnimation();

  // Set the speed of the animation
  skinViewer.animation.speed = 0.5;

  skinViewer.autoRotateSpeed = 0.2;
}

</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>