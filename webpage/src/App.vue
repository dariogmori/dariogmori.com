<template>
  <body>
    <div style="z-index: 2;">
      <router-view/>
    </div>
    <img v-if="!isMobile()" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7vnGsgBgV8QW50dp-wZ4GoCNWu4egKYuxAw&s" style=" z-index: 1; position: fixed; bottom:10vh; left:35%; width: 30%">
  </body>

  <nav style="position:fixed; left:40%; bottom:1vh;">
    <router-link to="/">Home</router-link>
    <router-link to="/about-me">{{ t('about-me.title') }}</router-link>
    <router-link to="/celeste">{{ t('celeste.title') }}</router-link>
    <router-link to="/games/big-crunch">{{ t('games.big-crunch.title') }}</router-link>
    <el-button @click="toggleTheme">{{ languageMode() }}</el-button>
    <el-button @click="changeLanguage('es')">{{ t('config.language.spanish') }}</el-button>
    <el-button @click="changeLanguage('en')">{{ t('config.language.english') }}</el-button>
  </nav>
</template>

<style>
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
</style>
<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
const { t, i18next } = useTranslation()
import { onMounted, reactive } from 'vue'
import {isMobile} from "@/scripts/utils";

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
  }
  if( savedLang ) {
    config.lang = savedLang
    document.documentElement.setAttribute('data-lang', config.lang)
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
</script>
