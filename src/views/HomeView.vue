<template>
  <ViewLayout>
    <!-- CENTER CONTAINER -->
    <template #center-col>
      <DescriptionAboutMeComponentMobile v-if="isMobile()"/>
      <DescriptionAboutMeComponent v-if="!isMobile()"/>
      
      <el-row :justify="'center'" class="header-color">
      	<el-divider style="width:80%"></el-divider>
        <el-col>
          <h2>{{t('home.experience.title')}}</h2>
        </el-col>
        <ExperienceComponent :title="t('home.experience.resizes-title-2')" company="Resizes" location="Gijón" :dates="[t('month.december') + ' 2025 - ' + t('home.experience.present')]"/>
        <ExperienceComponent :title="t('home.experience.resizes-title')" company="Resizes" location="Gijón" :dates="[t('month.december') + ' 2024 - ' + t('month.december') + ' 2025'] "/>
        <el-divider style="width:80%;"></el-divider>
        <ExperienceComponent :title="t('home.experience.simbio-title')" company="Simbiosys" location="Gijón" :dates="[t('month.october') +  ' 2021 - ' + t('month.october') + ' 2022', t('month.september') + ' 2023 - ' + t('month.january') + ' 2024']"/>
      	<el-divider style="width:80%"></el-divider>
      </el-row>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>{{ t('home.education.title') }}</h2>
        </el-col>
        <h3>{{ t('home.education.degree')}}, {{t('home.education.university') }}</h3>
        <p>{{ t('month.september') + ' 2020 - ' + t('month.november') + ' 2024' }} </p>
        <el-divider style="width:80%"></el-divider>
      </el-row>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>{{ t('home.languages.title') }}</h2>
        </el-col>
        <el-col :span="8">
          <h3>{{ t('home.languages.spanish') }}</h3>
          <p>{{ t('home.languages.native') }}</p>
        </el-col>
        <el-col :span="8">
          <h3>{{ t('home.languages.english') }}</h3>
          <p>C1 Advanced Grade A</p>
        </el-col>
        <el-col :span="8">
          <h3>{{ t('home.languages.japanese') }}</h3>
          <p>JLPT N4 Certificate</p>
        </el-col>
        <el-divider style="width:80%"></el-divider>
      </el-row>
      <el-row :justify="'space-around'" class="header-color">
        <el-col>
          <h2>{{ t('home.certifications.title') }}</h2>
        </el-col>
        <div style="width: 300px;">
          <a href="https://www.credly.com/badges/763920b2-175d-4ceb-a670-7fbfcf59ba06/public_url">
            <img src="../assets/home/cloud-practitioner.png" style="width: 80%;" class="image-display"/>
            <p style="color:var(--secondary-color);">AWS Cloud Practitioner</p>
          </a>
        </div>
        <div style="width: 300px;">
          <a href="https://www.credly.com/badges/e6d17c17-454c-40fb-9e88-e033e3dd1653/public_url">
            <img src="../assets/home/solutions-architect.png" style="width: 80%;" class="image-display"/>
            <p style="color:var(--secondary-color);">AWS Solutions Architect</p>
          </a>
        </div>
        <el-divider style="width:80%"></el-divider>
      </el-row>
      <LayoutRow :justify="'center'">
        <div class="about-me-fact">
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
        <el-divider style="width:80%"></el-divider>
      </LayoutRow>
      <LayoutRow justify="space-around">
        <img src="/img/me-2.jpg" class="image-display" style="width: 80%; max-width: 300px;  rotate:10deg;" alt="Image of me">
        <img src="/img/me-1.jpg" class="image-display" style="width: 90%; max-height:320px; max-width: 400px; rotate: -10deg" alt="Image of me">
        <div class="about-me-fact" style="align-content: center;">
          <el-col align="center" justify="center">
            <el-row style="max-width: 60%;" align="end">
              <el-col :span="12">
                <img  src="../assets/about-me/enby.png" class="image-display" style="width: 100%; max-width: 150px; rotate: -10deg; image-rendering: crisp-edges; border: 2px solid var(--main-color); " alt="Non binary flag">
              </el-col>
              <el-col :span="12">
                <h3 style="rotate:10deg; width:50%;"> he/they/she </h3>
              </el-col>
            </el-row>
            <el-row :span="24">
              <p>
                {{ t('about-me.gender') }}
              </p>
            </el-row>
          </el-col>
        </div>
        <img src="../assets/about-me/me-japan-oss.png" class="image-display" style="width: 90%; max-width: 500px; rotate: 5deg" alt="Image of me in Open Source Summit Japan">
		<el-divider style="width:80%"></el-divider>
      </LayoutRow>
      <LayoutRow :justify="'space-around'">
        <div style="width: 400px;">
          <TopArtistsComponent />
        </div>
        <div style="width: 400px;">
          <TopSongsComponent />
        </div>
        <el-divider style="width:80%"></el-divider>
      </LayoutRow>
      <LayoutRow justify="space-around">
        <img src="../assets/about-me/mushrooms/cesta-mixta-pinar.png" class="image-display" style="width: 70%; max-width: 400px;  max-height:550px;  rotate:10deg;" alt="Image of me">
        <img src="../assets/about-me/mushrooms/cesta-cocina.png" class="image-display" style="width: 70%;  max-width: 400px; max-height:580px;rotate: -10deg" alt="Image of me">
        <div class="about-me-fact" style="align-content: center;">
          <el-col align="center" justify="center">
            <el-row style="max-width: 60%;" align="end">
              <el-col :span="24">
                <img src="../assets/about-me/mushrooms.png" class="image-display" style="width: 90%; max-width: 150px; image-rendering: crisp-edges;" alt="Mushrooms" >
              </el-col>
            </el-row>
            <el-row :span="24">
              <p>
                {{ t('about-me.mushrooms') }}
              </p>
            </el-row>
          </el-col>
        </div>
        <img src="../assets/about-me/mushrooms/muscaria.png" class="image-display" style="width: 70%; max-width: 400px; rotate: 5deg" alt="Image of me in Open Source Summit Japan">
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
.about-me-fact{
  max-width: 400px;
}

</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import TopSongsComponent from "@/components/spotify/TopSongsComponent.vue";
import TopArtistsComponent from "@/components/spotify/TopArtistsComponent.vue";
import ViewLayout from "@/components/layout/ViewLayout.vue";
import ExperienceComponent from "@/components/ExperienceComponent.vue";
import DescriptionAboutMeComponentMobile from "@/components/home/DescriptionAboutMeComponentMobile.vue";
import {isMobile} from "@/scripts/utils";
import DescriptionAboutMeComponent from "@/components/home/DescriptionAboutMeComponent.vue";


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
</script>
