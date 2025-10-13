<template>
  <GameLayout :game="game">
    <template #left-col>
      <el-button type="primary" @click="openGameLink()">Play</el-button>
    </template>
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/flerovium/capture1.png'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.flerovium.language') }}</p>
      </LayoutRow>
      <LayoutRow :justify="'end'">
        <img alt="title" :src="'/img/game/flerovium/capture3.png'" style="width: 60%; rotate: -10deg;" class="logo">
      </LayoutRow>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/flerovium/capture2.png'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.flerovium.understanding') }}</p>
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
  id : 'flerovium',
  date: '20-10-2023',
  tags: ['yes','menu-sim']
}
const { t } = useTranslation();

function openGameLink() {
  window.open('https://dariogmori.itch.io/the-half-life-of-flevorium', '_blank')
}
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>