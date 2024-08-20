<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <ArtComponent id="ace-attorney"  :images="['maya.png','gumshoe.png','edgeworth.png']" :month="'august'" :year="'2024'"/>
      <ArtComponent id="pfp2024"  :images="['2.png','3.png','4.png','1.png','5.png','6.png']" :month="'march'" :year="'2024'"/>
      <ArtComponent id="pfp2022"  :images="['1.png']" :month="'june'" :year="'2022'"/>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <!--<img src="../../assets/hobby/art/logo.gif" class="logo" style="width: 60%; ">-->
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <ArtComponent id="me-sketches"  :images="['1.png','2.png','3.png','4.png']" :month="'august'" :year="'2024'"/>
      <ArtComponent id="pfp2023"  :images="['1.png','2.gif']" :month="'june'" :year="'2023'"/>
      <ArtComponent id="helltaker" :images="['1.jpeg']" :month="'may'" :year="'2021'"/>
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