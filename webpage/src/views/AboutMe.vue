<template>
  <el-row >
    <el-col :span="6" class="left-container">
      <img alt="Vue logo" src="/img/me-1.jpg" style="width: 90%">
      <el-row>
        <el-col :span="18">
          <p>
            {{ t('about-me.description') }}
          </p>
        </el-col>

        <el-col :span="4">

        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
        </el-col>

        <el-col :span="18">
          <p>
            {{ t('about-me.description') }}
          </p>
        </el-col>
      </el-row>
    </el-col>
    <el-col :span="12" class="center-container">
      <h1>{{ t('about-me.title') }}</h1>
    </el-col>
    <el-col :span="6" class="right-container">
      <el-col :span="20">
        <img alt="asturies" src="https://centrodesarrollodirectivo.es/wp-content/uploads/2019/05/asturias-mapa-1024x619.png" style="width: 90%">
      </el-col>
      <el-row justify="end">
        <el-col :span="20" >
          <img alt="enby flag" src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Nonbinary_flag.svg/640px-Nonbinary_flag.svg.png" style="width: 90%">
        </el-col>
      </el-row>
      <el-col :span="20">
        <img alt="me again" src="/img/me-2.jpg" style="width: 90%">
      </el-col>


    </el-col>
  </el-row>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';
</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
const { t } = useTranslation();
</script>
