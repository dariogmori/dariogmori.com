<template>
    <ViewLayout>
        <template #left-col>
            <LayoutRow :justify="'end'">
                <el-carousel indicator-position="outside" :interval="4000" height="33vh" style="width:100%;">
                    <el-carousel-item>
                        <img :src="'../../img/projects/talks/sustainability/talk-title.jpg'" class="image-display" style="width: 100%">
                    </el-carousel-item>
                    <el-carousel-item>
                        <img :src="'../../img/projects/talks/sustainability/guadalajara-1.jpg'" class="image-display" style="width: 50%">
                    </el-carousel-item>
                    <el-carousel-item>
                        <img :src="'../../img/projects/talks/sustainability/talk-1.jpg'" class="image-display" style="width: 100%">
                    </el-carousel-item>
                </el-carousel>
            </LayoutRow>
            
        </template>

        <template #center-col>
            <h1> Sustainable Platform Engineering? </h1>
            <h3>Having a green thumb without shooting up the costs</h3>
        </template>

        <template #right-col>
            <LayoutRow :justify="'end'">
                <iframe width="100%" height="355" src="https://www.youtube.com/embed/lTLttAcs1zE?si=EdE_M3TAI53or9WX" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
                <a href="https://www.slideshare.net/slideshow/sustainable-platform-engineering-having-a-green-thumb-without-shooting-up-the-costs-dario-gutierrez-mori/277450234"> Slides  </a>
            </LayoutRow>
           
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