<template>
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
			<button class="menu-button"  @click="goToRoute('/art')"><el-icon><StarFilled /></el-icon>{{ isMobile() ? '': 'Art' }}</button>
    	</div>
    	<div class="menu-button-container">
			<button class="menu-button" style="width:50%;" @click="toggleTheme()"><el-icon><Opportunity /></el-icon></button>
			<button class="menu-button" style="width:50%;" @click="toggleLanguage()" >{{ config.lang }}</button>
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
})

function changeLanguage(lang: string){
  config.lang = lang;
  document.documentElement.setAttribute('data-lang', config.lang)
  localStorage.setItem('lang', config.lang) // Save the current language to local storage
  i18next.changeLanguage(config.lang)
}

function toggleTheme () {
  config.theme = config.theme == 'light'? 'dark-typical' : 'light';
  document.documentElement.setAttribute('data-theme', config.theme)
  localStorage.setItem('theme', config.theme) // Save the current theme to local storageç
  location.reload();
}
function toggleLanguage () {
  config.lang = config.lang == 'es'? 'en': 'es';
  document.documentElement.setAttribute('data-lang', config.lang)
  localStorage.setItem('lang', config.lang) // Save the current language to local storage
  i18next.changeLanguage(config.lang)
}

function goToRoute(route: string) {
  router.push(route)
}
</script>
