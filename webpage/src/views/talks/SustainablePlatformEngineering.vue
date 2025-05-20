<template>
    <ViewLayout>
        <template #left-col>
            <LayoutRow :justify="'end'">
                <img alt="Main Presentation" src="/img/projects/talks/sustainability/talk-title.jpg" class="image-display" style="width: 90%; ">
                <img alt="Main Presentation" src="/img/projects/talks/sustainability/promo-1.jpg" class="image-display" style="width: 90%; ">
                <img alt="Main Presentation" src="/img/projects/talks/sustainability/talk-1.jpg" class="image-display" style="width: 90%; ">
                <img alt="Main Presentation" src="/img/projects/talks/sustainability/guadalajara-1.jpg" class="image-display" style="width: 90%; ">
            </LayoutRow>
            
        </template>

        <template #center-col>
            <h1> Sustainable Platform Engineering? </h1>
            <h3>Having a green thumb without shooting up the costs</h3>
        </template>

        <template #right-col>
            <LayoutRow :justify="'end'">
                <a href="https://www.slideshare.net/slideshow/sustainable-platform-engineering-having-a-green-thumb-without-shooting-up-the-costs-dario-gutierrez-mori/277450234"> Slides  </a>
            </LayoutRow>
            <a href="https://www.youtube.com/watch?v=88AbNnnwkb4"> Youtube</a>
            
            <img alt="Main Presentation" src="/img/projects/talks/sustainability/logo-kcd.jpg" class="image-display" style="width: 90%; ">
        </template>
    </ViewLayout>
  </template>
  
  <script setup lang="ts">
  import ViewLayout from "@/components/layout/ViewLayout.vue";
  import LayoutRow from "@/components/layout/LayoutRow.vue";
  import { useTranslation } from "i18next-vue";
  const game = {
    id : 'flerovium',
    date: '20-10-2023',
    tags: ['yes','menu-sim']
  }
  const { t } = useTranslation();
  
  function openGameLink() {
    window.open('https://dariogmori.itch.io/the-half-life-of-flevorium', '_blank')
  }
  </script>
  
  <style scoped>
  @import '../../assets/styles/palette.css';
  @import '../../assets/styles/view.css';
  </style>