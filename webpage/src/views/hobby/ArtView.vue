<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <ArtComponent :images="['maya.png','gumshoe.png','edgeworth.png']" id="ace-attorney" :month="'august'" :year="2024"/>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <img src="../../assets/hobby/art/logo.gif" class="logo" style="width: 60%; ">
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <LayoutRow>

      </LayoutRow>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import ArtComponent from "@/components/art/ArtComponent.vue";

const { t } = useTranslation();
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>