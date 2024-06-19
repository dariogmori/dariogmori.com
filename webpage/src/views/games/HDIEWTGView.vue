<template>
  <GameLayout :name="game.id" :date="game.date" :tags="game.tags">
    <template #left-col>
      <el-button type="primary" @click="openGameLink()">Play</el-button>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/hdiewtg/capture2.png'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>
    </template>
    <template #right-col>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/hdiewtg/capture1.png'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.hdiewtg.developers') }}</p>
        <el-col>
          <el-button type="primary" @click="openAriLink()">Ari's socials</el-button>
        </el-col>
      </LayoutRow>
      <LayoutRow :justify="'end'">
        <img alt="capture3" :src="'/img/game/hdiewtg/capture3.png'" style="width: 60%; rotate: -10deg;" class="logo"/>
      </LayoutRow>
      <LayoutRow>
        <p>{{ t('games.hdiewtg.languages') }}</p>
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

function openAriLink() {
  window.open('https://x.com/WomenVideogames', '_blank')
}
function openGameLink() {
  window.open('https://arive.itch.io/how-do-i-even-win-this-game', '_blank')
}
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>