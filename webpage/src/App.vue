<template>
  <body :class="{ 'body-mobile' : isMobile(), 'body-desktop' : !isMobile() }">
    <div style="z-index: 2;">
      <router-view/>
    </div>
    <img v-if="!isMobile()" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7vnGsgBgV8QW50dp-wZ4GoCNWu4egKYuxAw&s" style=" z-index: 1; position: fixed; bottom:10vh; left:35%; width: 30%">
    <el-row justify="center" >
      <el-menu
          mode="horizontal"
          :class="{ 'mobile': isMobile(), 'desktop': !isMobile(),'el-menu' : true}"
          style="position:fixed;bottom:0vh;"
          :ellipsis="true"
      >
        <el-menu-item index="1">
          <el-menu-item index="4-1" @click="goToRoute('/')">Home</el-menu-item>
        </el-menu-item>
        <el-menu-item index="2">
          <el-menu-item index="2-1" @click="goToRoute('/about-me')">{{ t('about-me.title') }}</el-menu-item>
        </el-menu-item>
        <el-sub-menu index="3">
          <template #title>Hobbies</template>
          <el-menu-item index="3-1" @click="goToRoute('/celeste')">{{ t('celeste.title') }}</el-menu-item>

        </el-sub-menu>
        <el-sub-menu index="4">
          <template #title>{{ t('projects.title') }}</template>
          <el-menu-item index="4-1" @click="goToRoute('/games/big-crunch')">Big-Crunch</el-menu-item>
          <el-menu-item index="4-2" @click="goToRoute('/games/how-do-i-even-win-this-game')">HDIEWTG?</el-menu-item>
          <el-menu-item index="4-3" @click="goToRoute('/games/a-nice-place-4-art')">A nice play 4 art</el-menu-item>
          <el-menu-item index="4-4" @click="goToRoute('/games/the-half-life-of-flerovium')">The half life of flerovium</el-menu-item>
        </el-sub-menu>
        <el-sub-menu index="5">
          <template #title>Settings</template>
          <el-menu-item index="5-1" @click="toggleTheme">{{ languageMode() }}</el-menu-item>
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
  font-family: Avenir, Helvetica, Arial, sans-serif;
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
function toggleTheme () {
  config.theme = config.theme === 'light' ? 'dark' : 'light'
  document.documentElement.setAttribute('data-theme', config.theme)
  localStorage.setItem('theme', config.theme) // Save the current theme to local storage
}
function changeLanguage ( lang: string) {
  config.lang = lang
  document.documentElement.setAttribute('data-lang', config.lang)
  localStorage.setItem('lang', config.lang) // Save the current language to local storage
  i18next.changeLanguage(lang)
}
function languageMode () {
  return config.theme === 'dark' ? t('config.theme.light-mode') : t('config.theme.dark-mode')
}

function goToRoute(route: string) {
  router.push(route)
}
</script>
