<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <LayoutRow>
        <img alt="minecraft game" src="https://gaming-cdn.com/images/products/442/616x353/minecraft-java-bedrock-edition-java-bedrock-edition-pc-juego-cover.jpg?v=1716387513" class="image-display" style="width: 90%">
      </LayoutRow>

      <LayoutRow>
        <el-col :span="16">
          <p>
            {{ t('celeste.description') }}
          </p>
        </el-col>
        <el-col :span="8">
          <img alt="madeline" src="https://media.spelunky.fyi/mods/logo/01G8PXMPWZ2K3CVW70DJ5HEMGA/1658626661282822.gif" class="image-display" style="width: 90%">
        </el-col>
      </LayoutRow>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../../assets/celeste/logo.gif" class="logo">
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <LayoutRow>
        <CelesteComponent />
      </LayoutRow>
      <LayoutRow>
        <VideoCardComponent :video="'https://www.youtube.com/embed/_iBkkwy0fcM'" :title="'Cool speedy thingie'" :article="'yay me go fast'" ></VideoCardComponent>
      </LayoutRow>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import CelesteComponent from "@/components/CelesteComponent.vue";
import { useTranslation } from "i18next-vue";
import VideoCardComponent from "@/components/VideoCardComponent.vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";

const { t } = useTranslation();
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>