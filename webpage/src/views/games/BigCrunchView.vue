<template>
  <GameLayout :name="game.id" :date="game.date" :tags="game.tags">
    <template #left-col>
      <LayoutRow>
        <img alt="capture2" :src="'/img/game/big-crunch/capture2.png'" style="width: 60%; rotate: 10deg;" class="logo"/>
      </LayoutRow>


    </template>
    <template #right-col>
      <LayoutRow>
        <VideoCardComponent :video="'https://www.youtube.com/embed/x5Yj8gDjvs0'"></VideoCardComponent>
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <img alt="title" :src="'/img/game/big-crunch/capture1.png'" style="width: 60%; rotate: 10deg;" class="logo">
      </LayoutRow>
      <LayoutRow>
        <p>Only available in spanish, although you dont need it to enjoy it!</p>
      </LayoutRow>
      <LayoutRow :justify="'end'">
        <img alt="capture3" :src="'/img/game/big-crunch/capture3.png'" style="width: 60%; rotate: -10deg;" class="logo"/>
      </LayoutRow>
    </template>
  </GameLayout>
</template>

<script setup lang="ts">
import GameLayout from "@/components/layout/GameLayout.vue";
import LayoutRow from "@/components/layout/LayoutRow.vue";
import VideoCardComponent from "@/components/VideoCardComponent.vue";
const game = {
  id : 'big-crunch',
  date: '21-01-2024',
  tags: ['puzzle', 'speed-run']
}

</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>