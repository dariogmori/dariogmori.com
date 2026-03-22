<template>
  <ViewLayout>
    <template #content>
      <h1>Art</h1>
      <ArtComponent v-for="paint in art" :art="paint" />
    </template>
  </ViewLayout>
</template>

<script setup lang="ts">
import { useTranslation } from 'i18next-vue'
import ViewLayout from '@/components/layout/ViewLayout.vue'
import ArtComponent from '@/components/art/ArtComponent.vue'

const { t } = useTranslation()

const art = [
  {
    id: 'ace-attorney',
    month: 'august',
    year: '2024',
    images: ['maya.png', 'gumshoe.png', 'edgeworth.png', 'judge.png']
  },
  {
    id: 'me-sketches',
    month: 'august',
    year: '2024',
    images: ['1.png', '2.png', '3.png', '4.png', '5.png']
  },
  { id: 'mix/jose-emilio', month: 'april', year: '2024', images: ['kiwi.gif'] },
  {
    id: 'pfp/2024',
    month: 'march',
    year: '2024',
    images: ['2.png', '3.png', '4.png', '1.png', '5.png', '6.png']
  },
  {
    id: 'class',
    month: 'december',
    year: '2023',
    images: ['1.jpg', '2.png', '3.jpg', '4.jpg', '5.jpg']
  },
  {
    id: 'tf2/merasmus',
    month: 'october',
    year: '2023',
    images: ['merasmus.png', 'explanation.png']
  },
  { id: 'pfp/2023', month: 'june', year: '2023', images: ['1.png', '2.gif'] },
  { id: 'mix/snails-house', month: 'january', year: '2023', images: ['1.jpg'] },
  { id: 'pfp/2022', month: 'october', year: '2022', images: ['2.png', '3.png'] },
  { id: 'mix/omori', month: 'october', year: '2022', images: ['1.jpg'] },
  { id: 'mix/oneshot', month: 'september', year: '2022', images: ['1.jpg'] },
  { id: 'pfp/2022', month: 'june', year: '2022', images: ['1.png'] },
  { id: 'helltaker', month: 'may', year: '2021', images: ['1.jpeg'] }
]
</script>

<style scoped>
@import '../../assets/styles/view.css';
</style>
