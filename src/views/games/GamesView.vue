<template>
  <GameLayout id="medium-expendedore" date="23-01-2024" title="Medium Expendedore" url="https://dariogmori.itch.io/medium-expendedore">
	<template #content>
	      <LayoutRow :justify="'center'">
	        <img
	          alt="title"
	          :src="'/img/game/medium-expendedore/capture1.png'"
	          style="width: 80%;"
	          class="logo"
	        />
	      </LayoutRow>
	      <LayoutRow :justify="'center'">
	        <p>{{ t('games.medium-expendedore.language') }}</p>
	      </LayoutRow>
	      <LayoutRow>
	        <img
	          alt="capture2"
	          :src="'/img/game/medium-expendedore/capture2.png'"
	          style="width: 60%;"
	          class="logo"
	        />
	      </LayoutRow>
	      <LayoutRow :justify="'center'">
	        <p>{{ t('games.medium-expendedore.development') }}</p>
	      </LayoutRow>
	</template>
  </GameLayout>
  <GameLayout id="flerovium" date="20-10-2023" title="Half life of flerovium" url="https://dariogmori.itch.io/the-half-life-of-flevorium">
	  <template #content>
	     <LayoutRow :justify="'center'">
		   <img
		     alt="title"           
		     :src="'/img/game/flerovium/capture2.png'"
		     style="width: 60%;"
		     class="logo"
		   />
		 </LayoutRow>
		 <LayoutRow :justify="'center'">
		   <p>{{ t('games.flerovium.language') }}</p>
		 </LayoutRow>
		 <LayoutRow style="justify-content:space-around; flex-wrap: wrap; align-content: space-around;">
		   <img
		     alt="title"
		     :src="'/img/game/flerovium/capture3.png'"
		     style="min-width: 300px;  margin: 10px;"
		     class="logo"
		   />
   		   
		   <img
		     alt="capture2"
		     :src="'/img/game/flerovium/capture1.png'"
		     style="min-width: 300px;  margin: 10px;"
		     class="logo"
		   />
		 </LayoutRow>
		 
	     <LayoutRow :justify="'center'">
	       <p>{{ t('games.flerovium.understanding') }}</p>
	     </LayoutRow>
	  </template>
    </GameLayout>
    <GameLayout id="hdiewtg" date="15-09-2023" title="How do I even win this game?" url="https://arive.itch.io/how-do-i-even-win-this-game">
      <template #content>
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
            style="min-width: 300px;  margin: 10px;"
            class="logo"
          />
        </LayoutRow>
        <LayoutRow :justify="'center'">
          <p>{{ t('games.hdiewtg.developers') }}</p>
          <button type="primary" @click="openAriLink()">Ari's socials</button>
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
  	<GameLayout id="big-crunch" date="21-01-2022" title="Big Crunch" url="https://dariogmori.itch.io/big-crunch">
      <template #content>
        <LayoutRow style="justify-content:space-around; flex-wrap: wrap; align-content: space-around;">
          <img
            alt="capture2"
            :src="'/img/game/big-crunch/capture1.png'"
            style="min-width: 300px; margin: 10px;"
            class="logo"
          />
          <img
            alt="title"
            :src="'/img/game/big-crunch/capture2.png'"
            style="min-width: 300px;  margin: 10px;"
            class="logo"
          />
        </LayoutRow>
        <LayoutRow :justify="'center'">
          <p>{{ t('games.big-crunch.first-game') }}</p>
        </LayoutRow>
        <LayoutRow :justify="'end'">
           <p>{{ t('games.big-crunch.development') }}</p>
        </LayoutRow>
        <LayoutRow>
          <p>{{ t('games.big-crunch.languages') }}</p>
        </LayoutRow>
              
        <LayoutRow>
          <a
            :href="'https://www.youtube.com/embed/x5Yj8gDjvs0'"
          >Demo</a>
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
p {
	font-family: var(--secondary-font-family);
	font-size: var(--secondary-font-size);
}
</style>
