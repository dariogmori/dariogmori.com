<template>
    <div>
        <ViewLayout>
            <template #left-col>
                <LayoutRow>
                    <p>
                        {{ t('projects.talks.kcd-guadalajara.description') }}
                    </p>
                </LayoutRow>
                <LayoutRow :justify="'end'">
                   <el-carousel indicator-position="outside" :interval="4000" height="33vh" style="width:100%;">
                       <el-carousel-item>
                           <img :src="'../../img/projects/talks/sustainability/talk-title.png'" class="image-display" style="width: 100%">
                       </el-carousel-item>
                       <el-carousel-item>
                           <img :src="'../../img/projects/talks/sustainability/guadalajara-1.png'" class="image-display" style="width: 50%">
                       </el-carousel-item>
                       <el-carousel-item>
                           <img :src="'../../img/projects/talks/sustainability/talk-1.png'" class="image-display" style="width: 100%">
                       </el-carousel-item>
                   </el-carousel>
                </LayoutRow>
                <LayoutRow :justify="'center'">
                    <p> {{ t('projects.talks.kcd-guadalajara.thanks') }}</p>
                    <img alt="Main Presentation" src="/img/projects/talks/sustainability/logo-kcd.png" class="image-display" style="width: 120px; ">
                </LayoutRow>
            </template>

            <template #center-col>
                <h1> Sustainable Platform Engineering? </h1>
                <h3>Having a green thumb without shooting up the costs</h3>
                </template>

            <template #right-col>
                <LayoutRow :justify="'center'">
                    <p>>>></p>
                    <a href="https://www.youtube.com/embed/lTLttAcs1zE?si=EdE_M3TAI53or9WX"> {{ 'Youtube Video' }} </a>
                    <p>{{'<<<'}}</p>
                </LayoutRow>
                <LayoutRow :justify="'center'">
                    <p>>>></p>
                    <a href="https://www.slideshare.net/slideshow/sustainable-platform-engineering-having-a-green-thumb-without-shooting-up-the-costs-dario-gutierrez-mori/277450234"> {{ t('projects.talks.kcd-guadalajara.slides') }} </a>
                    <p>{{'<<<'}}</p>
                </LayoutRow>
                <LayoutRow :justify="'center'">
                    <p> {{ t('projects.talks.kcd-guadalajara.to_be_fair') }}</p>
                </LayoutRow>
            
            </template>
        </ViewLayout>
        <LayoutRow :justify="'end'">
            <div class="fake-ad" v-if="ad.show" >
                <div style="justify-content: space-between; align-content: end; display:flex;">
                    <h3 class="cool-3d-text">
                        Watch now! </h3>
                    <el-button class="cool-3d-text" @click="ad.show = false" style="border: 3px solid var(--main-color);">x</el-button>
                </div>
                <a href="https://www.youtube.com/watch?v=lTLttAcs1zE" target="_blank" rel="noopener noreferrer">
                    <img alt="Main Presentation" src="/img/projects/talks/sustainability/promo-1.png" style="width: 100%; cursor: pointer;border: 3px solid var(--secondary-color);"/>
                </a>
            </div>
            
        </LayoutRow>
</div>
    
  </template>
  
  <script setup lang="ts">
  import ViewLayout from "@/components/layout/ViewLayout.vue";
  import LayoutRow from "@/components/layout/LayoutRow.vue";
  import { useTranslation } from "i18next-vue";
import { reactive } from "vue";
  const game = {
    id : 'flerovium',
    date: '20-10-2023',
    tags: ['yes','menu-sim']
  }
  const { t } = useTranslation();
  
  const ad = reactive({
    show: true
  });

  function openGameLink() {
    window.open('https://dariogmori.itch.io/the-half-life-of-flevorium', '_blank')
  }

    const images = [
    'talk-title.jpg',
    'guadalajara-1.jpg',
    'talk-1.jpg'
    ]
  </script>
  
  <style scoped>
  @import '../../assets/styles/palette.css';
  @import '../../assets/styles/view.css';
  .fake-ad{
    width: 20%;
    position:fixed;
    bottom: 30px;
    right: 60px; 
    animation: ad 1s linear infinite;
  }
  @keyframes ad {
    0% { width: 20%; }
    50% { width: 21%; }
    100% { width: 20%; }
  }
   @keyframes ad {
    0% { width: 20%; }
    50% { width: 21%; }
    100% { width: 20%; }
  }
  .cool-3d-text {
    color: var(--main-color);
    text-shadow:
        -2px -2px 0 var(--secondary-color),
        1px -1px 0 var(--secondary-color),
        -1px  1px 0 var(--secondary-color),
        1px  1px 0 var(--secondary-color);           
  }
  </style>
