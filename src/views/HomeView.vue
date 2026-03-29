<template>
  <ViewLayout>
    <template #content>
      <DescriptionAboutMeComponentMobile v-if="isMobile()" />
      <DescriptionAboutMeComponent v-if="!isMobile()" />
      <br>
      <div style="display: flex; width: 100%; justify-content: center">
        <el-divider style="width: 80%;"></el-divider>
      </div>
      <!--<ResumeComponent />-->
      <hr>
      <LayoutRow style="justify-content: center">
        <div class="about-me-fact">
          <div style="width: 100%; display: flex; justify-content: center">
            <LayoutRow style="max-width: 75%">
              <div style="width: 50%; display: flex; justify-content: center">
                <img
                  src="../assets/about-me/guatemala.png"
                  class="image-display"
                  style="
                    width: 100%;
                    max-width: 150px;
                    rotate: -10deg;
                    image-rendering: crisp-edges;
                  "
                  alt="Flag of Guatemala"
                />
              </div>
              <div style="width: 50%; display: flex; justify-content: center">
                <img
                  src="../assets/about-me/asturias.png"
                  class="image-display"
                  style="width: 100%; max-width: 150px; rotate: 10deg; image-rendering: crisp-edges"
                  alt="Flag of Asturias"
                />
              </div>
            </LayoutRow>
          </div>
          <div style="width: 100%; display: flex; justify-content: center">
            <p class="secondary-text">
              {{ t('about-me.nationality') }}
            </p>
          </div>
        </div>
      </LayoutRow>
      <LayoutRow style="justify-content: space-around">
        <img
          src="/img/me-2.jpg"
          class="image-display"
          style="width: 80%; max-width: 300px; rotate: 10deg"
          alt="Image of me"
        />
        <img
          src="/img/me-1.jpg"
          class="image-display"
          style="width: 90%; max-height: 320px; max-width: 400px; rotate: -10deg"
          alt="Image of me"
        />
        <div class="about-me-fact" style="align-content: center; justify-content; center; ">
          <div style=" display: flex; justify-content: center; align-content: center; flex-wrap: wrap;">
            <LayoutRow style="max-width: 60%; align-content: end;">
              <div style="width: 50%; display: flex; justify-content: center;">
                <img
                  src="../assets/about-me/enby.png"
                  class="image-display"
                  style="
                    width: 100%;
                    max-width: 150px;
                    rotate: -10deg;
                    image-rendering: crisp-edges;
                    border: 2px solid var(--main-color);
                  "
                  alt="Non binary flag"
                />
              </div>
              <div style="width: 50%; display: flex; justify-content: center;">
                <p style="rotate: 10deg; font-size: 16px;">he/they/she</p>
              </div>
            </LayoutRow>
            <LayoutRow style="width:100%;">
              <p class="secondary-text">
                {{ t('about-me.gender') }}
              </p>
            </LayoutRow>
          </div>
        </div>
        <img
          src="../assets/about-me/me-japan-oss.png"
          class="image-display"
          style="width: 90%; max-width: 500px; rotate: 5deg"
          alt="Image of me in Open Source Summit Japan"
        />
      </LayoutRow>
      <LayoutRow style="justify-content: space-around">
        <div style="width: 400px">
          <TopArtistsComponent />
        </div>
        <div style="width: 400px">
          <TopSongsComponent />
        </div>
      </LayoutRow>
      <LayoutRow style="justify-content: space-around">
        <img
          src="../assets/about-me/mushrooms/cesta-mixta-pinar.png"
          class="image-display"
          style="width: 70%; max-width: 400px; max-height: 550px; rotate: 10deg"
          alt="Image of me"
        />
        <img
          src="../assets/about-me/mushrooms/cesta-cocina.png"
          class="image-display"
          style="width: 70%; max-width: 400px; max-height: 580px; rotate: -10deg"
          alt="Image of me"
        />
        <div class="about-me-fact" style="align-content: center">
          <div style="width: 100%; display: flex; justify-content: center; align-content: center; flex-wrap: wrap;">
            <LayoutRow style="max-width: 60%" align="end">
              <div style="width: 100%; display: flex; justify-content: center;">
                <img
                  src="../assets/about-me/mushrooms.png"
                  class="image-display"
                  style="width: 90%; max-width: 150px; image-rendering: crisp-edges"
                  alt="Mushrooms"
                />
              </div>
            </LayoutRow>
            <LayoutRow>
              <p class="secondary-text">
                {{ t('about-me.mushrooms') }}
              </p>
            </LayoutRow>
          </div>
        </div>
        <img
          src="../assets/about-me/mushrooms/muscaria.png"
          class="image-display"
          style="width: 70%; max-width: 400px; rotate: 5deg"
          alt="Image of me in Open Source Summit Japan"
        />
      </LayoutRow>
    </template>
  </ViewLayout>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';

.header-color {
  background-color: var(--main-color);
  color: var(--secondary-color);
  padding: 5px;
}
.about-me-fact {
  max-width: 400px;
}
hr {
	width: 80%;
	margin-top: 30px;
	margin-bottom: 30px;
	color: var(--primary-color);
}
</style>

<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
import { onMounted, reactive } from 'vue'
import LayoutRow from '@/components/layout/LayoutRow.vue'
//import ResumeComponent from '@/components/home/ResumeComponent.vue'
import TopSongsComponent from '@/components/spotify/TopSongsComponent.vue'
import TopArtistsComponent from '@/components/spotify/TopArtistsComponent.vue'
import ViewLayout from '@/components/layout/ViewLayout.vue'
import DescriptionAboutMeComponentMobile from '@/components/home/DescriptionAboutMeComponentMobile.vue'
import { isMobile } from '@/scripts/utils'
import DescriptionAboutMeComponent from '@/components/home/DescriptionAboutMeComponent.vue'

const { t } = useTranslation()
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
  if (savedLang) {
    config.lang = savedLang
    document.documentElement.setAttribute('data-lang', config.lang)
  }
})
</script>
