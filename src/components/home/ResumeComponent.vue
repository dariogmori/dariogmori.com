<template>
  <el-row :justify="'center'" class="header-color">
    <el-col>
      <h2>{{ t('home.experience.title') }}</h2>
    </el-col>
    <ExperienceComponent
      :title="t('home.experience.resizes-title-2')"
      company="Resizes"
      location="Gijón"
      :dates="[t('month.december') + ' 2025 - ' + t('home.experience.present')]"
    />
    <ExperienceComponent
      :title="t('home.experience.resizes-title')"
      company="Resizes"
      location="Gijón"
      :dates="[t('month.december') + ' 2024 - ' + t('month.december') + ' 2025']"
    />
    <el-divider style="width: 80%"></el-divider>
    <ExperienceComponent
      :title="t('home.experience.simbio-title')"
      company="Simbiosys"
      location="Gijón"
      :dates="[
        t('month.october') + ' 2021 - ' + t('month.october') + ' 2022',
        t('month.september') + ' 2023 - ' + t('month.january') + ' 2024'
      ]"
    />
    <el-divider style="width: 80%"></el-divider>
  </el-row>
  <el-row :justify="'center'" class="header-color">
    <el-col>
      <h2>{{ t('home.education.title') }}</h2>
    </el-col>
    <h3>{{ t('home.education.degree') }}, {{ t('home.education.university') }}</h3>
    <p>{{ t('month.september') + ' 2020 - ' + t('month.november') + ' 2024' }}</p>
    <el-divider style="width: 80%"></el-divider>
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
    <el-divider style="width: 80%"></el-divider>
  </el-row>
  <el-row :justify="'space-around'" class="header-color">
    <el-col>
      <h2>{{ t('home.certifications.title') }}</h2>
    </el-col>
    <div style="width: 300px">
      <a href="https://www.credly.com/badges/763920b2-175d-4ceb-a670-7fbfcf59ba06/public_url">
        <img
          src="../../assets/home/cloud-practitioner.png"
          style="width: 80%"
          class="image-display"
        />
        <p style="color: var(--secondary-color)">AWS Cloud Practitioner</p>
      </a>
    </div>
    <div style="width: 300px">
      <a href="https://www.credly.com/badges/e6d17c17-454c-40fb-9e88-e033e3dd1653/public_url">
        <img
          src="../../assets/home/solutions-architect.png"
          style="width: 80%"
          class="image-display"
        />
        <p style="color: var(--secondary-color)">AWS Solutions Architect</p>
      </a>
    </div>
    <el-divider style="width: 80%"></el-divider>
  </el-row>
</template>
<script setup lang="ts">
import ExperienceComponent from '@/components/home/ExperienceComponent.vue'
import { useTranslation } from 'i18next-vue'
const { t } = useTranslation()
</script>
