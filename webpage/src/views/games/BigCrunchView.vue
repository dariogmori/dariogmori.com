<template>
  <ViewLayout>
    <template #left-col>
      <LayoutRow :justify="'end'">
        <img alt="logo" src="../../assets/games/big-crunch/logo.png" class="image-display" style="width: 90%; rotate: -10deg">
      </LayoutRow>
    </template>

    <template #center-col>
      <img alt="title" :src="getLogoURI()" style="width: 40%;" class="logo">
    </template>
    <template #right-col>
      <LayoutRow >
        <img alt="title" :src="getLogoURI()" style="width: 60%;" class="logo">
      </LayoutRow>
    </template>
  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
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
  return '/img/game/big-crunch/logo-' + config.theme + '.png'
}
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>