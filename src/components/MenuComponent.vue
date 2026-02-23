<template>
  <!--<el-menu 
          mode="horizontal"
          :class="{ 'mobile': isMobile(), 'desktop': !isMobile(),'el-menu' : true}"
          style="position:fixed; bottom:0vh; border: 4px solid var(--secondary-color);"
          :ellipsis="false"
      >
        <el-menu-item index="1" @click="goToRoute('/')"><el-icon><HomeFilled /></el-icon>{{ isMobile() ? '': 'Home' }}</el-menu-item>
        <el-menu-item index="2" @click="goToRoute('/blog')"><el-icon><List /></el-icon>{{ isMobile() ? '': 'Blog' }}</el-menu-item>
        <el-sub-menu index="3">
          <template #title><el-icon><Management /></el-icon>{{ isMobile() ? '': t('projects.title') }}</template>
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
          <template #title><el-icon><StarFilled /></el-icon>{{ isMobile() ? '': 'Hobbies' }}</template>
          <el-menu-item index="4-1" @click="goToRoute('/celeste')">{{ t('celeste.title') }}</el-menu-item>
          <el-menu-item index="4-2" @click="goToRoute('/minecraft')">Minecraft </el-menu-item>
          <el-menu-item index="4-3" @click="goToRoute('/art')">{{ t('art.title') }}</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="5">
          <template #title><el-icon><Tools /></el-icon></template>
    -->
          <!--<el-menu-item index="5-1" @click="setTheme('dark-typical')">{{ 'Dark Typical' }}</el-menu-item>-->
    <!--      <el-sub-menu index="5-1">
            <template #title>{{ t('config.theme.name') }}</template>
            <el-menu-item index="5-1" @click="setTheme('light')">{{ t('config.theme.light-mode') }}</el-menu-item>
            <el-menu-item index="5-2" @click="setTheme('dark-typical')">{{ t('config.theme.dark-mode') }}</el-menu-item>
          </el-sub-menu>
          <el-menu-item index="5-2" @click="changeLanguage('es')">{{ t('config.language.spanish') }}</el-menu-item>
          <el-menu-item index="5-3" @click="changeLanguage('en')">{{ t('config.language.english') }}</el-menu-item>
        </el-sub-menu>
    </el-menu>
    -->
    <div :class="{ 'mobile': isMobile(), 'desktop': !isMobile(), 'menu': true}">
    	<div class="menu-button-container">
			<button class="menu-button" @click="goToRoute('/')"><el-icon><HomeFilled /></el-icon>{{ isMobile() ? '': 'Home' }}</button>
    	</div>
    	<div class="menu-button-container">
			<button class="menu-button" @click="goToRoute('/blog')"><el-icon><List /></el-icon>{{ isMobile() ? '': 'Blog' }}</button>
    	</div>
    	<div class="menu-button-container">
			<button class="menu-button" @click="goToRoute('/talks/sustainable-platform-engineering')"><el-icon><Management /></el-icon>{{ isMobile() ? '': 'Talks' }}</button>
    	</div>
    	<div class="menu-button-container">
			<button class="menu-button"><el-icon><StarFilled /></el-icon>{{ isMobile() ? '': 'Hobbies' }}</button>
    	</div>
    	<div class="menu-button-container">
			<button class="menu-button"><el-icon><Tools /></el-icon></button>
    	</div>
    </div>
</template>

<style>
@import '../assets/styles/theme.css';
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
.desktop{
  width:40%;
}
.menu{
  max-width:99%;
  position:fixed;
  bottom:0px;
  border: 4px solid var(--secondary-color);
  display:flex; justify-content:center;
}
.menu-button-container{
  width:20%;
}
.menu-button{
  font-family: var(--el-font-family) !important;
  font-size: var(--el-font-size-base);
  color: var(--secondary-color);
  width:100%;
  height:50px;
  background: var(--main-color);
  border:none;
}
.menu-button:hover{
  background: var(--hover-color);
}
i{
	font-size:18px !important;
}

</style>
<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
const { t, i18next } = useTranslation()
import { onMounted, reactive } from 'vue'
import {isMobile} from "@/scripts/utils";

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
</script>
