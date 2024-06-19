<template>
  <GameLayout :name="game.id" :date="game.date" :tags="game.tags">
    <template #left-col>
      <el-button type="primary" @click="openGameLink()">Play</el-button>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/anp4a/capture2.png'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
    </template>
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/anp4a/capture1.png'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.anp4a.development') }}</p>
      </LayoutRow>
      <LayoutRow :justify="'end'">
        <img alt="pallette" :src="'/img/game/anp4a/pallette.png'" style="width: 60%; rotate: -10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow :justify="'start'">
        <img alt="paint bucket" :src="'/img/game/anp4a/paint-bucket.png'" style="width: 60%; rotate: -10deg;" class="logo"/>
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
  id : 'anp4a',
  date: '30-09-2023',
  tags: ['art', 'multiplayer']
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