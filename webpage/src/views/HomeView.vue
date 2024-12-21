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
    </template>

    <!-- CENTER CONTAINER -->
    <template #center-col>
      <el-row>
        <el-col :span="16">
          <h1> Darío Gutiérrez Mori </h1>
          <h3> Junior Platform Engineer</h3>
          <el-row :justify="'space-between'">
            <el-col :span="14">
              <p>dariogmori@gmail.com</p>
            </el-col>
            <el-col :span="5">
              <p>LinkedIn</p>
            </el-col>
            <el-col :span="5">
              <p>GitHub</p>
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="8">
          <el-image :src="'/img/me.jpg'" style="width: 80%;"></el-image>
        </el-col>
      </el-row>
      <el-row :justify="'center'">
        <h2>About me</h2>
        <p>
          Soon-to-be Software Engineering graduate that looks to get their first job as a junior developer, highly motivated to learn as much as possible and give it their all. Capable of developing web applications (see examples in my webpage), having worked with Java Spring Boot 3 and Vue.js.
        </p>
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'">
        <el-col>
          <h2>Experience</h2>
        </el-col>
        <ExperienceComponent title="Junior Platform Engineer" company="Resizes" location="Gijón" :dates="['December 2024 - Present']"/>
        <ExperienceComponent title="Software Engineer Intern" company="Simbiosys" location="Gijón" :dates="['October 2021 - July 2022', 'September 2023 - January 2024']"/>
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>Education</h2>
        </el-col>
        <h3>Software Engineering Degree, University of Oviedo</h3>
        <p>September 2020 - November 2024</p>
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
        <el-col>
          <h2>Languages</h2>
        </el-col>
        <el-col :span="8">
          <h3>Spanish</h3>
          <p>Native</p>
        </el-col>
        <el-col :span="8">
          <h3>English</h3>
          <p>C1 Advanced Grade A</p>
        </el-col>
        <el-col :span="8">
          <h3>Japanese</h3>
          <p>JLPT N4 Certificate</p>
        </el-col>
      </el-row>
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
import ExperienceComponent from "@/components/ExperienceComponent.vue";


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
