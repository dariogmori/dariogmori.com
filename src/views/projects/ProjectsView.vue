<template>
  <div>
    <ViewLayout>
      <template #content>
        <h1>Projects</h1>
        <LayoutRow>
         <a
           href="/#/talks/sustainable-platform-engineering"
           style="align-content: center; margin: 10px"
         >
           Talks
         </a>
         <a
            href="/#/games"
            style="align-content: center; margin: 10px"
          >
	       Games 
	      </a>
        </LayoutRow>
      </template>
    </ViewLayout>
  </div>
</template>

<script setup lang="ts">
import ViewLayout from '@/components/layout/ViewLayout.vue'
import LayoutRow from '@/components/layout/LayoutRow.vue'
import { useTranslation } from 'i18next-vue'
import { reactive } from 'vue'
const game = {
  id: 'flerovium',
  date: '20-10-2023',
  tags: ['yes', 'menu-sim']
}
const { t } = useTranslation()

const ad = reactive({
  show: true
})

function openGameLink() {
  window.open('https://dariogmori.itch.io/the-half-life-of-flevorium', '_blank')
}

const images = ['talk-title.jpg', 'guadalajara-1.jpg', 'talk-1.jpg']
</script>

<style scoped>
@import '../../assets/styles/palette.css';
@import '../../assets/styles/view.css';
.fake-ad {
  width: 20%;
  position: fixed;
  bottom: 30px;
  right: 60px;
  animation: ad 1s linear infinite;
}
@keyframes ad {
  0% {
    width: 20%;
  }
  50% {
    width: 21%;
  }
  100% {
    width: 20%;
  }
}
@keyframes ad {
  0% {
    width: 20%;
  }
  50% {
    width: 21%;
  }
  100% {
    width: 20%;
  }
}
.cool-3d-text {
  color: var(--main-color);
  text-shadow:
    -2px -2px 0 var(--secondary-color),
    1px -1px 0 var(--secondary-color),
    -1px 1px 0 var(--secondary-color),
    1px 1px 0 var(--secondary-color);
}
p {
  font-family: 'Courier New', Courier, monospace;
  font-style: italic;
  font-size: 18px;
  text-align: left;
}
</style>
