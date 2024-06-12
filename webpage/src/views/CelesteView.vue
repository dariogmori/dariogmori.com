<template>
  <el-row>
    <!-- LEFT CONTAINER -->
    <el-col :span="6" class="left-container">
      <img alt="celeste game" src="https://gaming-cdn.com/images/products/8003/orig/celeste-pc-mac-juego-steam-cover.jpg?v=1705489821" style="width: 90%">
      <el-row>
        <el-col :span="16">
          <p>
            {{ t('celeste.description') }}
          </p>
        </el-col>
        <el-col :span="8">
          <img alt="madeline" src="https://media.spelunky.fyi/mods/logo/01G8PXMPWZ2K3CVW70DJ5HEMGA/1658626661282822.gif" style="width: 90%">
        </el-col>
      </el-row>
      <el-row>
        </el-row>
    </el-col>

    <!-- CENTER CONTAINER -->
    <el-col :span="12" class="center-container">
      <h1>{{ t('celeste.title') }}</h1>
    </el-col>

    <!-- RIGHT CONTAINER -->
    <el-col :span="6" class="right-container">
      <el-col :span="24">
        <CelesteComponent />
      </el-col>
      <el-row justify="end">
        <el-col :span="20" >
        </el-col>
      </el-row>
    </el-col>
  </el-row>
</template>

<script setup lang="ts">
import CelesteComponent from "@/components/CelesteComponent.vue";
import { useTranslation } from "i18next-vue";
const { t } = useTranslation();
</script>

<style scoped>
@import '../assets/styles/view.css';
</style>