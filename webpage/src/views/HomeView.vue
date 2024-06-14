<template>
  <main>
    <el-row >
      <!-- LEFT CONTAINER -->
      <el-col :span="6" class="left-container" >

      </el-col>

      <!-- CENTER CONTAINER -->
      <el-col :span="12" class="center-container" >
        <el-image :src="getLogoURI()" class="logo" />
      </el-col>


      <!-- RIGHT CONTAINER -->
      <el-col :span="6" class="right-container">

      </el-col>
    </el-row>
  </main>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';
</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";

const { t } = useTranslation();
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

function getLogoURI() {
  return '/img/home/logo-' + config.theme + '.png'
}
</script>
