<template>
  <ViewLayout>
    <!-- LEFT CONTAINER -->
    <template #left-col>
      <LayoutRow :justify="'center'">
        <img src="../assets/home/itchio.png" alt="itchio logo" class="image-display" style="width:40%;image-rendering: crisp-edges;"/>
        <el-col>
          <p>{{ t('home.itchio.recommendation') }}</p>
        </el-col>
        <el-col>
          <el-button type="primary" @click="openItchioLink()">{{ t('home.github.button') }}</el-button>
        </el-col>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <TopSongsComponent />
      </LayoutRow>
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <el-image :src="getLogoURI()" class="logo" />
    </template>

    <!-- RIGHT CONTAINER -->
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img src="../assets/home/github.png"  alt="github screenshot" class="image-display" style="width:55%;"/>
        <el-col>
          <p>{{ t('home.github.recommendation') }}</p>
        </el-col>
        <el-col>
          <el-button type="primary" @click="openGithubLink()">{{ t('home.github.button') }}</el-button>
        </el-col>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <TopArtistsComponent />
      </LayoutRow>
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
import ViewLayout from "@/components/layout/ViewLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import TopSongsComponent from "@/components/spotify/TopSongsComponent.vue";
import TopArtistsComponent from "@/components/spotify/TopArtistsComponent.vue";


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

function openGithubLink() {
  window.open('https://github.com/Toto-hitori/dariogmori.com', '_blank')
}function openItchioLink() {
  window.open('https://toto-hitori.itch.io/', '_blank')
}
</script>
