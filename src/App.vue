<template>
  <body :class="{ 'body-mobile' : isMobile(), 'body-desktop' : !isMobile() } " >
    <div class="parallax-content">
      <div style="margin-bottom: 10vh" >
        <router-view/>
      </div>
    </div> 
    <el-row justify="center" style="z-index: 11;" >
      <MenuComponent />
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
  color: var(--secondary-color);
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: var(--secondary-color);
}

nav a.router-link-exact-active {
  color: var(--secondary-color);
}
.mobile{
  width:100%;
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
import MenuComponent from "@/components/MenuComponent.vue";
import router from "@/router";

const config = reactive({
  theme: 'light',
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
