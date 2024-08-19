<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <el-col>
        <img alt="skin" src="/img/hobby/minecraft/body.png" class="image-display" style="width: 90%">
        <canvas id="minecraftCanvas" style="width:30%;"></canvas>
      </el-col>
      <LayoutRow>
        <el-col>
          <p>
            {{ t('minecraft.description') }}
          </p>
        </el-col>
      </LayoutRow>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../../assets/hobby/minecraft/logo.gif" class="logo" style="width: 60%; ">
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <LayoutRow>
        <iframe src="http://map.dariogmori.com:8123/" style="width: 100%; height: 30vh;"></iframe>
      </LayoutRow>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";

const { t } = useTranslation();
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>