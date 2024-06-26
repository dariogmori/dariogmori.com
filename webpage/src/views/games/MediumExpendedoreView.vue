<template>
  <GameLayout :game="game">
    <template #left-col>
      <el-button type="primary" @click="openGameLink()">Play</el-button>
    </template>
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/medium-expendedore/capture1.png'" style="width: 80%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.medium-expendedore.language') }}</p>
      </LayoutRow>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/medium-expendedore/capture2.png'" style="width: 80%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.medium-expendedore.development') }}</p>
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
  id : 'medium-expendedore',
  date: '23-01-2024',
  tags: ['puzzle']
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