<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <ArtComponent v-for="paint in art.filter((element, index) => index % 2 === 0)" :art="paint"/>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <!--<img src="../../assets/hobby/art/logo.gif" class="logo" style="width: 60%; ">-->
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <ArtComponent v-for="paint in art.filter((element, index) => index % 2 !== 0)" :art="paint"/>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import ArtComponent from "@/components/art/ArtComponent.vue";

const { t } = useTranslation();

const art = [
  {id: "ace-attorney", month: "august", year: "2024", images: ['maya.png','gumshoe.png','edgeworth.png']},
  {id: "me-sketches", month: "august", year: "2024", images: ['1.png','2.png','3.png','4.png']},
  {id: "mix/jose-emilio", month: "april", year: "2024", images: ['kiwi.gif']},
  {id: "pfp/2024", month: "march", year: "2024", images: ['2.png','3.png','4.png','1.png','5.png','6.png']},
  {id: "pfp/2023", month: "june", year: "2023", images: ['1.png','2.gif']},
  {id: "pfp/2022", month: "june", year: "2022", images: ['1.png']},
  {id: "tf2/merasmus", month: "october", year: "2023", images: ['merasmus.png','explanation.png']},
  {id: "helltaker", month: "may", year: "2021", images: ['1.jpeg'], vertical: true}
]
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>