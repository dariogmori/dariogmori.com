<template>
  <ViewLayout>
    <!-- CENTER CONTAINER -->
    <template #center-col>
      <h1>About me</h1>
      <LayoutRow :justify="'center'">
        <div style="max-width: 400px;">
          <el-col align="center">
            <el-row style="max-width: 60%;">
              <el-col>
                <img src="../assets/about-me/me.png" class="image-display" style="width: 90%;image-rendering: crisp-edges;" alt="Profile picture">
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="24">
            <p>
              {{ t('about-me.description') }}
            </p>
            </el-col>
        </div>
       
      </LayoutRow>
      <el-divider></el-divider>
      <LayoutRow :justify="'center'">
        <div style="max-width: 400px;">
          <el-col align="center">
            <el-row style="max-width: 60%;">
              <el-col :span="12">
                <img src="../assets/about-me/guatemala.png" class="image-display" style="width: 100%; max-width: 150px; rotate: -10deg; image-rendering: crisp-edges;" alt="Flag of Guatemala">
              </el-col>
              <el-col :span="12">
                <img src="../assets/about-me/asturias.png" class="image-display" style="width: 100%; max-width: 150px; rotate: 10deg; image-rendering: crisp-edges;" alt="Flag of Asturias">
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="24" align="center">
            <p>
              {{ t('about-me.nationality') }}
            </p>
          </el-col>
        </div>
        <div style="max-width: 400px;">
          <el-col align="center">
            <el-row style="max-width: 60%;">
              <el-col :span="12">
                <img  src="../assets/about-me/enby.png" class="image-display" style="width: 100%; max-width: 150px; rotate: -10deg; image-rendering: crisp-edges; border: 2px solid var(--main-color); " alt="Non binary flag">
              </el-col>
              <el-col :span="12">
                <h3 style="rotate:10deg"> he/they/she </h3>
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="24">
            <p>
              {{ t('about-me.gender') }}
            </p>
          </el-col>
        </div>
        <div style="max-width: 400px;">
          <el-col align="center">
            <el-row style="max-width: 60%;">
              <el-col :span="24">
                <img src="../assets/about-me/mushrooms.png" class="image-display" style="width: 90%; max-width: 150px; image-rendering: crisp-edges;" alt="Mushrooms" >
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="24">
            <p>
              {{ t('about-me.mushrooms') }}
            </p>
          </el-col>
        </div>  
      </LayoutRow>
      <el-divider></el-divider>
      <LayoutRow justify="space-around">
        <img src="/img/me-2.jpg" class="image-display" style="width: 80%; max-width: 300px;  rotate:10deg;" alt="Image of me">
        <img src="/img/me-1.jpg" class="image-display" style="width: 90%; max-height:320px; max-width: 400px; rotate: -10deg" alt="Image of me">
      </LayoutRow>
      <el-divider></el-divider>
      <LayoutRow :justify="'space-between'">
        <div style="width: 400px;">
          <TopArtistsComponent />
        </div>
        <div style="width: 400px;">
          <TopSongsComponent />
        </div>
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
  return '/img/about-me/logo-' + config.theme + '-' + config.lang + '.png'
}

</script>
