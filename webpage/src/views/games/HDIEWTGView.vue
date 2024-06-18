<template>
  <GameLayout :name="game.id" :date="game.date" :tags="game.tags">
    <template #left-col>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/hdiewtg/capture2.png'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.hdiewtg.first-game') }}</p>
      </LayoutRow>
    </template>
    <template #right-col>
      <LayoutRow>
        <p>awa</p>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/hdiewtg/capture1.png'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow>
        <p>{{ t('games.hdiewtg.languages') }}</p>
      </LayoutRow>
      <LayoutRow :justify="'end'">
        <img alt="capture3" :src="'/img/game/hdiewtg/capture3.png'" style="width: 60%; rotate: -10deg;" class="logo"/>
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
  id : 'hdiewtg',
  date: '15-09-2023',
  tags: ['puzzle', 'minigames']
}
const { t } = useTranslation();
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>