<template>
  <div class="main-container">
    <img alt="Vue logo" src="/img/me-1.jpg" style="width: 30vh">
    <h1>{{ t('about-me.title') }}</h1>
    <p>
      {{ t('about-me.description') }}
    </p>
  </div>
</template>

<style scoped>
@import '../assets/styles/palette.css';
@import '../assets/styles/view.css';
</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
const { t } = useTranslation();
</script>
