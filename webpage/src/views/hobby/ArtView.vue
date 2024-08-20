<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <ArtComponent v-for="paint in getArt('left')" :art="paint"/>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <!--<img src="../../assets/hobby/art/logo.gif" class="logo" style="width: 60%; ">-->
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <ArtComponent v-for="paint in getArt('right')" :art="paint"/>
    </template>

  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import ArtComponent from "@/components/art/ArtComponent.vue";
import {isMobile} from "@/scripts/utils";

const { t } = useTranslation();

const art = [
  {id: "ace-attorney", month: "august", year: "2024", images: ['maya.png','gumshoe.png','edgeworth.png'], vertical: false},
  {id: "me-sketches", month: "august", year: "2024", images: ['1.png','2.png','3.png','4.png'], vertical: false},
  {id: "mix/jose-emilio", month: "april", year: "2024", images: ['kiwi.gif'], vertical: false},
  {id: "pfp/2024", month: "march", year: "2024", images: ['2.png','3.png','4.png','1.png','5.png','6.png'], vertical: false},
  {id: "class", month: "december", year: "2023", images: ['1.jpg','2.png','3.jpg','4.jpg','5.jpg'], vertical: false},
  {id: "tf2/merasmus", month: "october", year: "2023", images: ['merasmus.png','explanation.png'], vertical: false},
  {id: "pfp/2023", month: "june", year: "2023", images: ['1.png','2.gif'], vertical: false},
  {id: "mix/snails-house", month: "january", year: "2023", images: ['1.jpg'], vertical: false},
  {id: "pfp/2022", month: "october", year: "2022", images: ['2.png','3.png'], vertical: false},
  {id: "mix/omori", month: "october", year: "2022", images: ['1.jpg'], vertical: false},
  {id: "mix/oneshot", month: "september", year: "2022", images: ['1.jpg'], vertical: false},
  {id: "pfp/2022", month: "june", year: "2022", images: ['1.png'], vertical: false},
  {id: "helltaker", month: "may", year: "2021", images: ['1.jpeg'], vertical: true}
]

function getArt( position: String){
  if(isMobile()){
    if(position === 'left'){
      return art.slice(0, Math.floor(art.length / 2));
    }else{
      return art.slice(Math.floor(art.length / 2));
    }
  }
  else{
    if(position === 'left'){
      return art.filter((element, index) => index % 2 === 0);
    }else{
      return art.filter((element, index) => index % 2 !== 0);
    }
  }
}
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>