<template>
  <GameLayout :game="game">
    <template #left-col>
      <el-button type="primary" @click="openGameLink()">Play</el-button>
    </template>
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/kiwiq/capture1.jpeg'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.kiwiq.development') }}</p>
      </LayoutRow>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/kiwiq/capture2.jpeg'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/kiwiq/capture3.jpeg'" style="width: 60%; rotate: -10deg;" class="logo">
      </LayoutRow>
    </template>
  </GameLayout>
</template>

<script setup lang="ts">
import GameLayout from "@/components/layout/GameLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import VideoCardComponent from "@/components/VideoCardComponent.vue";
import { useTranslation } from "i18next-vue";
const game = {
  id : 'kiwiq',
  date: '23-04-2024',
  tags: ['quiz', 'trivia']
}
const { t } = useTranslation();

function openAriLink() {
  window.open('https://x.com/WomenVideogames', '_blank')
}

function openGameLink() {
  window.open('https://toto-hitori.itch.io/a-nice-place-4-art', '_blank')
}
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>