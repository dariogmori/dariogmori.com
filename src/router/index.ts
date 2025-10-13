import { createRouter, createWebHashHistory } from 'vue-router'

const routes= [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/HomeView.vue')
  },
  {
    path: '/celeste',
    name: 'celeste',
    component: () => import('../views/hobby/CelesteView.vue')
  },
  {
    path: '/minecraft',
    name: 'minecraft',
    component: () => import('../views/hobby/MinecraftView.vue')
  },{
    path: '/art',
    name: 'art',
    component: () => import('../views/hobby/ArtView.vue')
  },
  {
    path: '/about-me',
    name: 'about',
    component: () => import('../views/AboutMe.vue')
  },
  {
    path: '/games/big-crunch',
    name: 'big-crunch',
    component: () => import('../views/games/BigCrunchView.vue')
  },
  {
    path: '/games/how-do-i-even-win-this-game',
    name: 'how-do-i-even-win-this-game',
    component: () => import('../views/games/HDIEWTGView.vue')
  },
  {
    path: '/games/a-nice-place-4-art',
    name: 'a-nice-place-4-art',
    component: () => import('../views/games/ANP4AView.vue')
  },
  {
    path: '/games/the-half-life-of-flerovium',
    name: 'the-half-life-of-flerovium',
    component: () => import('../views/games/FleroviumView.vue')
  },
  {
    path: '/games/medium-expendedore',
    name: 'medium-expendedore',
    component: () => import('../views/games/MediumExpendedoreView.vue')
  },
  {
    path: '/games/kiwiq',
    name: 'kiwiq',
    component: () => import('../views/games/KiwiqView.vue')
  },
  {
    path: '/talks/sustainable-platform-engineering',
    name: 'sustainable-platform-engineering',
    component: () => import('../views/talks/SustainablePlatformEngineering.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
