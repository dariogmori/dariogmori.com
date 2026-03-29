<template>
  <div style="display: flex; width: 100%">
    <div style="width: 100%">
      <h1>Darío Gutiérrez Mori</h1>
      <h2>Mid Platform Engineer</h2>
      <el-row :justify="'center'" style="margin: 20px">
        <img src="/img/me.jpg" alt="Me" style="width: 70%; border-radius: 10px" />
      </el-row>
      <div style="justify-content: space-between; display: flex">
        <div style="width: 33%">
          <a href="https://dariogmori.itch.io/">
            <div style="display: flex; justify-content: center">
              <div>
                <img
                  src="../../assets/home/itchio.png"
                  alt="itchio logo"
                  class="image-display"
                  style="image-rendering: crisp-edges"
                />
              </div>
            </div>
          </a>
        </div>
        <div style="width: 33%">
          <a href="https://www.linkedin.com/in/dariogmori/">
            <div style="display: flex; justify-content: center">
              <div>
                <img
                  src="../../assets/home/linkedin.png"
                  alt="itchio logo"
                  class="image-display"
                  style="image-rendering: crisp-edges"
                />
              </div>
            </div>
          </a>
        </div>
        <div style="width: 33%">
          <a href="https://github.com/dariogmori">
            <div style="display: flex; justify-content: center">
              <div>
                <img
                  src="../../assets/home/github.png"
                  alt="itchio logo"
                  class="image-display"
                  style="image-rendering: crisp-edges"
                />
              </div>
            </div>
          </a>
        </div>
      </div>
      <el-row :justify="'center'">
        <el-col :span="20">
          <p class="secondary-text">{{ t('home.about-me') }}</p>
        </el-col>
      </el-row>
    </div>
  </div>
</template>
<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
const { t } = useTranslation()
</script>
