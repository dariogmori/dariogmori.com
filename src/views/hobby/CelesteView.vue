<template>
  <ViewLayout>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../../assets/celeste/logo.gif" class="logo">
      <!-- <el-divider></el-divider> -->
      <LayoutRow :justify="'center'">
        <CelesteComponent style="max-width: 80%;"/>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p style="max-width: 80%;">
          {{ t('celeste.description') }}
        </p>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <VideoCardComponent :video="'https://www.youtube.com/embed/_iBkkwy0fcM'" :title="'Cool speedy thingie'" :article="'yay me go fast'" style="max-width: 80%;" ></VideoCardComponent>
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