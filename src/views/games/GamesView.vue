<template>
  <!--<GameLayout id="kiwiq" date="23-04-2024">
    <template #content>
      <button type="primary" @click="openRepoLink()">Github repo</button>
      <LayoutRow :justify="'center'">
        <img
          alt="title"
          :src="'/img/game/kiwiq/capture1.jpeg'"
          style="width: 60%;"
          class="logo"
        />
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <p>{{ t('games.kiwiq.development') }}</p>
      </LayoutRow>
      <LayoutRow :justify="'center'"> </LayoutRow>
      <LayoutRow>
        <img
          alt="capture2"
          :src="'/img/game/kiwiq/capture2.jpeg'"
          style="width: 60%;"
          class="logo"
        />
      </LayoutRow>
      <LayoutRow :justify="'center'">
        <img
          alt="title"
          :src="'/img/game/kiwiq/capture3.jpeg'"
          style="width: 60%;"
          class="logo"
        />
      </LayoutRow>
    </template>
  </GameLayout>-->
  <GameLayout id="flerovium" date="20-10-2023">
	  <template #content>
	     <button type="primary" @click="openGameLink()">Play</button>
	     <LayoutRow :justify="'center'">
		   <img
		     alt="title"
		     :src="'/img/game/flerovium/capture1.png'"
		     style="width: 60%; rotate: 10deg"
		     class="logo"
		   />
		 </LayoutRow>
		 <LayoutRow :justify="'center'">
		   <p>{{ t('games.flerovium.language') }}</p>
		 </LayoutRow>
		 <LayoutRow :justify="'end'">
		   <img
		     alt="title"
		     :src="'/img/game/flerovium/capture3.png'"
		     style="width: 60%; rotate: -10deg"
		     class="logo"
		   />
		 </LayoutRow>
		 <LayoutRow>
		   <img
		     alt="capture2"
		     :src="'/img/game/flerovium/capture2.png'"
		     style="width: 60%; rotate: 10deg"
		     class="logo"
		   />
		 </LayoutRow>
		 <LayoutRow :justify="'center'">
		   <p>{{ t('games.flerovium.understanding') }}</p>
		 </LayoutRow>
	  </template>
    </GameLayout>
    <GameLayout id="hdiewtg" date="15-09-2023">
      <template #content>
        <button type="primary" @click="openGameLink()">Play</button>
        <LayoutRow style="justify-content:space-around; flex-wrap: wrap; align-content: space-around;">
          <img
            alt="capture2"
            :src="'/img/game/hdiewtg/capture2.png'"
            style="min-width: 300px; margin: 10px;"
            class="logo"
          />
          <img
            alt="title"
            :src="'/img/game/hdiewtg/capture1.png'"
            style="min-width: 300px;"
            class="logo"
          />
        </LayoutRow>
        <LayoutRow :justify="'center'">
          <p>{{ t('games.hdiewtg.developers') }}</p>
          <el-col>
            <el-button type="primary" @click="openAriLink()">Ari's socials</el-button>
          </el-col>
        </LayoutRow>
        <LayoutRow :justify="'end'">
          <img
            alt="capture3"
            :src="'/img/game/hdiewtg/capture3.png'"
            style="width: 60%;"
            class="logo"
          />
        </LayoutRow>
        <LayoutRow>
          <p>{{ t('games.hdiewtg.languages') }}</p>
        </LayoutRow>
</template>
  </GameLayout>
</template>

<script setup lang="ts">
import GameLayout from '@/components/layout/GameLayout.vue'
import LayoutRow from '@/components/layout/LayoutRow.vue'
import { useTranslation } from 'i18next-vue'
const { t } = useTranslation()

function openRepoLink() {
  window.open('https://github.com/Arquisoft/wiq_en2b', '_blank')
}
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
</style>
