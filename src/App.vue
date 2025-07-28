<template>
  
  <body :class="{ 'body-mobile' : isMobile(), 'body-desktop' : !isMobile() } " >
    <div class="parallax-container">
      <div class="parallax-layer layer-background">
        <img :src="'/img/backgrounds/' + config.theme + '/layer-background.png'" alt="layer-background" />
      </div>
      <div class="parallax-layer layer-back">
        <img :src="'/img/backgrounds/' + config.theme + '/layer-4.png'" alt="layer-4" />
      </div>
      <div class="parallax-layer layer-mid-2">
        <img :src="'/img/backgrounds/' + config.theme + '/layer-3.png'" alt="layer-3" />
      </div>
      <div class="parallax-layer layer-mid">
        <img :src="'/img/backgrounds/' + config.theme + '/layer-2.png'" alt="layer-2" />
      </div>
      <div class="parallax-layer layer-front">
        <img :src="'/img/backgrounds/' + config.theme + '/layer-1.png'"  alt="layer-1" />
      </div>
    </div>
    <div class="parallax-content">
          <div style="margin-bottom: 10vh" >
            <router-view/>
          </div>
          <!--<iframe  v-if="!isMobile()" src="../game/webpage.html" style=" z-index: 1; position: fixed; bottom:10vh; left:35%; width: 30%; height:50%; border: 0; "></iframe>-->
    </div>
    <el-row justify="center" style="z-index: 11; margin-bottom: 10vh" >
            <el-menu 
                mode="horizontal"
                :class="{ 'mobile': isMobile(), 'desktop': !isMobile(),'el-menu' : true}"
                style="position:fixed; bottom:0vh; border: 4px dashed var(--main-color);"
                :ellipsis="true"
            >
              <el-menu-item index="1">
                <el-menu-item index="4-1" @click="goToRoute('/')">Home</el-menu-item>
              </el-menu-item>
              <el-menu-item index="2">
                <el-menu-item index="2-1" @click="goToRoute('/about-me')">{{ t('about-me.title') }}</el-menu-item>
              </el-menu-item>
              <el-sub-menu index="3">
                <template #title>{{ t('projects.title') }}</template>
                <el-sub-menu index="3-1">
                  <template #title>{{ t('games.title') }}</template>
                  <el-menu-item index="3-1-1" @click="goToRoute('/games/big-crunch')">Big-Crunch</el-menu-item>
                  <el-menu-item index="3-1-2" @click="goToRoute('/games/how-do-i-even-win-this-game')">HDIEWTG?</el-menu-item>
                  <el-menu-item index="3-1-3" @click="goToRoute('/games/a-nice-place-4-art')">A nice play 4 art</el-menu-item>
                  <el-menu-item index="3-1-4" @click="goToRoute('/games/the-half-life-of-flerovium')">The half life of flerovium</el-menu-item>
                  <el-menu-item index="3-1-5" @click="goToRoute('/games/medium-expendedore')">Medium Expendedore</el-menu-item>
                  <el-menu-item index="3-1-6" @click="goToRoute('/games/kiwiq')">Kiwiq</el-menu-item>
                </el-sub-menu>
                <el-sub-menu index="3-2">
                  <template #title>{{ t('projects.talks.title') }}</template>
                  <el-menu-item index="3-2-1" @click="goToRoute('/talks/sustainable-platform-engineering')">Sustainable Platform Engineering?</el-menu-item>
                </el-sub-menu>
              </el-sub-menu>
              <el-sub-menu index="4">
                <template #title>Hobbies</template>
                <el-menu-item index="4-1" @click="goToRoute('/celeste')">{{ t('celeste.title') }}</el-menu-item>
                <el-menu-item index="4-2" @click="goToRoute('/minecraft')">Minecraft </el-menu-item>
                <el-menu-item index="4-3" @click="goToRoute('/art')">{{ t('art.title') }}</el-menu-item>
              </el-sub-menu>
              <el-sub-menu index="5">
                <template #title>Settings</template>
                <el-menu-item index="5-1" @click="setTheme('light')">{{ t('config.theme.light-mode') }}</el-menu-item>
                <el-menu-item index="5-1" @click="setTheme('dark')">{{ t('config.theme.dark-mode') }}</el-menu-item>
                <el-menu-item index="5-1" @click="setTheme('dark-typical')">{{ 'Dark Typical' }}</el-menu-item>
                <el-menu-item index="5-2" @click="changeLanguage('es')">{{ t('config.language.spanish') }}</el-menu-item>
                <el-menu-item index="5-3" @click="changeLanguage('en')">{{ t('config.language.english') }}</el-menu-item>
              </el-sub-menu>
            </el-menu>
    </el-row>
        
  </body>

</template>

<style>
@import './assets/styles/theme.css';
#app {
  font-family: 'Press Start 2P';
  font-size: 13px;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: var(--main-color);
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: var(--main-color);
}

nav a.router-link-exact-active {
  color: var(--main-color);
}
.mobile{
  width:98%;
}
.desktop {
}
.body-desktop {
  max-width:98.8%;
}
.body-mobile{
  max-width:100%;
  overflow-x: hidden;
}

.parallax-wrapper {
  position: relative;
  overflow-x: hidden;
}

.parallax-layer {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  pointer-events: none;
  overflow-x: hidden;
}

.parallax-layer img {
  width: 100%;
  object-fit: cover;
}
.layer-background {
  transform: translateZ(0);
  z-index: 1;
}
.layer-back {
  transform: translateZ(0);
  z-index: 2;
}
.layer-mid-2 {
  z-index: 3;
}
.layer-mid {
  z-index: 4;
}
.layer-front {
  z-index: 5;
}

.parallax-content {
  position: relative;
  z-index: 10;
  overflow-x: visible;
}

.parallax-layer::before {
  content: '';
  position: absolute;
  inset: 0;
  backdrop-filter: blur(1.5px);
  z-index: 10; /* Adjust to sit above layers, but maybe below text if needed */
  pointer-events: none; /* Allow interaction through the layer */
}
</style>
<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
const { t, i18next } = useTranslation()
import { onMounted, reactive } from 'vue'
import {isMobile} from "@/scripts/utils";
import router from "@/router";

const config = reactive({
  theme: 'dark-typical',
  lang: 'es'
})
onMounted(() => {
  const savedTheme = localStorage.getItem('theme')
  const savedLang = localStorage.getItem('lang')
  if (savedTheme) {
    config.theme = savedTheme
    document.documentElement.setAttribute('data-theme', config.theme)
    changeLanguage(config.lang)
  }
  if( savedLang ) {
    config.lang = savedLang
    document.documentElement.setAttribute('data-lang', config.lang)
    changeLanguage(config.lang)
  }
  window.addEventListener('scroll', handleScroll)
})
function setTheme (theme: string) {
  config.theme = theme
  document.documentElement.setAttribute('data-theme', config.theme)
  localStorage.setItem('theme', config.theme) // Save the current theme to local storageç
  location.reload();
}
function changeLanguage ( lang: string) {
  config.lang = lang
  document.documentElement.setAttribute('data-lang', config.lang)
  localStorage.setItem('lang', config.lang) // Save the current language to local storage
  i18next.changeLanguage(lang)
}

function goToRoute(route: string) {
  router.push(route)
}
const layers = [
  { selector: '.layer-back', speed: -0.3 },
  { selector: '.layer-mid-2', speed: -0.4 },
  { selector: '.layer-mid', speed: -0.5 },
  { selector: '.layer-front', speed: -0.7 },
];

const isMobileModifier = isMobile() ? 0.1 : 1;

const handleScroll = () => {
  const scrollY = window.scrollY;

  for (const { selector, speed } of layers) {
    const el = document.querySelector<HTMLElement>(selector);
    if (el) {
      el.style.transform = `translateY(${scrollY * speed * isMobileModifier}px)`;
    }
  }
};

onMounted(() => {
  
})

</script>
