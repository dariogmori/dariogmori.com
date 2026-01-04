<template>
  <ViewLayout>
    <!-- CENTER CONTAINER -->
    <template #center-col>
      <DescriptionAboutMeComponentMobile v-if="isMobile()"/>
      <DescriptionAboutMeComponent v-if="!isMobile()"/>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>{{t('home.experience.title')}}</h2>
        </el-col>
        <ExperienceComponent :title="t('home.experience.resizes-title-2')" company="Resizes" location="Gijón" :dates="[t('month.december') + ' 2025 - ' + t('home.experience.present')]"/>
        <ExperienceComponent :title="t('home.experience.resizes-title')" company="Resizes" location="Gijón" :dates="[t('month.december') + ' 2024 - ' + t('month.december') + ' 2025'] "/>
        <el-divider style="width:80%;"></el-divider>
        <ExperienceComponent :title="t('home.experience.simbio-title')" company="Simbiosys" location="Gijón" :dates="[t('month.october') +  ' 2021 - ' + t('month.october') + ' 2022', t('month.september') + ' 2023 - ' + t('month.january') + ' 2024']"/>
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>{{ t('home.education.title') }}</h2>
        </el-col>
        <h3>{{ t('home.education.degree')}}, {{t('home.education.university') }}</h3>
        <p>{{ t('month.september') + ' 2020 - ' + t('month.november') + ' 2024' }} </p>
      </el-row>
      <el-divider></el-divider>
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
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>{{ t('home.certifications.title') }}</h2>
        </el-col>
        <el-col :span="8">
          <a href="https://www.credly.com/badges/763920b2-175d-4ceb-a670-7fbfcf59ba06/public_url">
            <img src="../assets/home/cloud-practitioner.png" style="width: 80%;" class="image-display"/>
            <h3 style="color:var(--secondary-color);">AWS Cloud Practitioner</h3>
          </a>
        </el-col>
        <el-col :span="8">
          <a href="https://www.credly.com/badges/e6d17c17-454c-40fb-9e88-e033e3dd1653/public_url">
            <img src="../assets/home/solutions-architect.png" style="width: 80%;" class="image-display"/>
            <h3 style="color:var(--secondary-color);">AWS Solutions Architect</h3>
          </a>
        </el-col>
      </el-row>
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


</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";
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
