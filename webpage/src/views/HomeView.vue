<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
     <template #left-col>

    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <el-image :src="getLogoURI()" class="logo" />
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>

    </template>

  </ViewLayout>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';
</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";
import ViewLayout from "@/components/ViewLayout.vue";


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
