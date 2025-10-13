<template>
  <el-row class="header-color" justify="center">
    <h1> Darío Gutiérrez Mori </h1>
    <el-col>
      <h3> Junior Platform Engineer</h3>
    </el-col>
    <el-row style="margin-bottom: 10px">
      <el-col :span="10">
        <el-image :src="'/img/me.jpg'" style="width: 80%; border-radius: 10px"></el-image>
      </el-col>
      <el-col :span="12">
        <el-row>
          <p>{{ t('home.about-me')}}</p>
        </el-row>
        <el-row :justify="'space-between'">
          <el-col :span="8">
            <a href="https://dariogmori.itch.io/">
              <el-row :justify="'center'">
                <el-col :span="4">
                  <img src="../../assets/home/itchio.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
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
              </el-row>
            </a>
          </el-col>
          <el-col :span="8">
            <a href="https://github.com/dariogmori">
              <el-row :justify="'center'">
                <el-col :span="4">
                  <img src="../../assets/home/github.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
                </el-col>
              </el-row>
            </a>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </el-row>
</template>
<script setup lang="ts">
import {isMobile} from "@/scripts/utils";
import {useTranslation} from "i18next-vue";
const { t } = useTranslation();
</script>
<style scoped>

</style>