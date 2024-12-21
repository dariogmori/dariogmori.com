<template>
  <ViewLayout>
    <!-- CENTER CONTAINER -->
    <template #center-col>
      <el-row class="header-color">
        <el-col :span="16" >
          <h1> Darío Gutiérrez Mori </h1>
          <h3> Junior Platform Engineer</h3>
          <el-row :justify="'space-between'">
            <el-col :span="8">
              <a href="https://toto-hitori.itch.io/">
                <el-row :justify="'center'">
                  <el-col :span="4">
                    <img src="../assets/home/itchio.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
                  </el-col>
                  <el-col :span="12" style="color:var(--background-color)">
                    <p>Itch.io</p>
                  </el-col>
                </el-row>
              </a>
            </el-col>
            <el-col :span="8">
              <a href="https://www.linkedin.com/in/dariogmori/">
                <el-row :justify="'center'">
                  <el-col :span="4">
                    <img src="../assets/home/linkedin.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
                  </el-col>
                  <el-col :span="12" style="color:var(--background-color)">
                    <p>LinkedIn</p>
                  </el-col>
                </el-row>
              </a>
            </el-col>
            <el-col :span="8">
              <a href="https://https://github.com/Toto-hitori">
                <el-row :justify="'center'">
                  <el-col :span="4">
                    <img src="../assets/home/github.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
                  </el-col>
                  <el-col :span="12" style="color:var(--background-color)">
                    <p>GitHub</p>
                  </el-col>
                </el-row>
              </a>
            </el-col>
          </el-row>
          <el-row :justify="'center'">
            <el-col :span="20">
              <p>
                Soon-to-be Software Engineering graduate that looks to get their first job as a junior developer, highly motivated to learn as much as possible and give it their all. Capable of developing web applications (see examples in my webpage), having worked with Java Spring Boot 3 and Vue.js.
              </p>
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="8">
          <el-image :src="'/img/me.jpg'" style="width: 80%;"></el-image>
        </el-col>
      </el-row>
      <el-divider></el-divider>
      <el-row :justify="'center'" class="header-color">
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
  </ViewLayout>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';

.header-color {
  background-color: var(--main-color);
  color: var(--background-color);
  border: 4px dashed var(--background-color);
  padding: 5px;
}
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
</script>
