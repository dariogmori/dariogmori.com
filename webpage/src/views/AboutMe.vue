<template>
  <el-row >
    <!-- LEFT CONTAINER -->
    <el-col :span="6" class="left-container" >
      <el-row justify="end" style="margin-top:10%;margin-bottom:10%;">
        <img alt="Me" src="/img/me-1.jpg" class="image-display" style="width: 90%; rotate: -10deg">
      </el-row>

      <el-row style="margin-top:10%;margin-bottom:10%;">
        <el-col :span="14">
          <p>
            {{ t('about-me.description') }}
          </p>
        </el-col>
        <el-col :span="7">
          <img alt="Profile picture" src="../assets/about-me/me.png" class="image-display" style="width: 90%;image-rendering: crisp-edges;">
        </el-col>
      </el-row>

      <el-row justify="end" style="margin-top:10%;margin-bottom:10%;">
        <el-col :span="7">
          <el-row>
            <el-col :span="12">
              <img src="../assets/about-me/guatemala.png" class="image-display" style="width: 100%; rotate: -10deg; image-rendering: crisp-edges;">
            </el-col>
            <el-col :span="12">
              <img src="../assets/about-me/asturias.png" class="image-display" style="width: 100%; rotate: 10deg; image-rendering: crisp-edges;">
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="14">
          <p>
            {{ t('about-me.nationality') }}
          </p>
        </el-col>

      </el-row><el-row justify="start" style="margin-top:10%;margin-bottom:10%;">
        <el-col :span="14">
          <p>
            {{ t('about-me.gender') }}
          </p>
        </el-col>
        <el-col :span="7">
          <el-row>
            <el-col :span="12">
              <img  src="../assets/about-me/enby.png" class="image-display" style="width: 100%; rotate: -10deg; image-rendering: crisp-edges; border: 2px solid var(--main-color); ">
            </el-col>
            <el-col :span="12">
              <h3 style="rotate:10deg"> he/they/she </h3>
            </el-col>
          </el-row>
        </el-col>
      </el-row>
    </el-col>

    <!-- CENTER CONTAINER -->
    <el-col :span="12" class="center-container" >
      <el-image :src="getLogoURI()" class="logo" />
    </el-col>


    <!-- RIGHT CONTAINER -->
    <el-col :span="6" class="right-container">
      <el-col :span="20" style="margin-top:10%;margin-bottom:10%;">
        <img alt="me again" src="/img/me-2.jpg" class="image-display" style="width: 90%; rotate:10deg;">
      </el-col>


    </el-col>
  </el-row>
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
  return '/img/about-me/logo-' + config.theme + '-' + config.lang + '.png'
}
</script>
