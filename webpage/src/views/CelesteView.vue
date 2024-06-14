<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <img alt="celeste game" src="https://gaming-cdn.com/images/products/8003/orig/celeste-pc-mac-juego-steam-cover.jpg?v=1705489821" class="image-display" style="width: 90%">
      <el-row>
        <el-col :span="16">
          <p>
            {{ t('celeste.description') }}
          </p>
        </el-col>
        <el-col :span="8">
          <img alt="madeline" src="https://media.spelunky.fyi/mods/logo/01G8PXMPWZ2K3CVW70DJ5HEMGA/1658626661282822.gif" class="image-display" style="width: 90%">
        </el-col>
      </el-row>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../assets/celeste/logo.png" class="logo">
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <el-col :span="24">
        <CelesteComponent />
      </el-col>
      <el-row>
        <VideoCardComponent :video="'https://www.youtube.com/embed/_iBkkwy0fcM'" :title="'Cool speedy thingie'" :article="'yay me go fast'" ></VideoCardComponent>
      </el-row>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import CelesteComponent from "@/components/CelesteComponent.vue";
import { useTranslation } from "i18next-vue";
import VideoCardComponent from "@/components/VideoCardComponent.vue";
import ViewLayout from "@/components/ViewLayout.vue";

const { t } = useTranslation();
</script>

<style scoped>
@import '../assets/styles/view.css';
</style>