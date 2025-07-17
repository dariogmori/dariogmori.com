<template>
  <el-row class="header-color" >
    <el-col :span="16" >
      <h1> Darío Gutiérrez Mori </h1>
      <h3> Junior Platform Engineer</h3>
      <el-row :justify="'space-between'">
        <el-col :span="8">
          <a href="https://dariogmori.itch.io/">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/itchio.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
              </el-col>
              <el-col :span="12" style="color:var(--background-color)" >
                <p>Itch.io</p>
              </el-col>
            </el-row>
          </a>
        </el-col>
        <el-col :span="8">
          <a href="https://www.linkedin.com/in/dariogmori/">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/linkedin.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
              </el-col>
              <el-col :span="12" style="color:var(--background-color)">
                <p>LinkedIn</p>
              </el-col>
            </el-row>
          </a>
        </el-col>
        <el-col :span="8">
          <a href="https://github.com/dariogmori">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/github.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
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
          <p>{{ t('home.about-me')}}</p>
        </el-col>
      </el-row>
    </el-col>
    <el-col :span="8" style="margin-top: 10px">
      <el-image :src="'/img/me.jpg'" style="width: 75%; border-radius: 10px"></el-image>
    </el-col>
  </el-row>
</template>
<script setup lang="ts">
import {isMobile} from "@/scripts/utils";
import {useTranslation} from "i18next-vue";
const { t } = useTranslation();
</script>
<style scoped>

</style>