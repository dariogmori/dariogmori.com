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
    component: () => import('../views/CelesteView.vue')
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
    // route level code-splitting
    component: () => import('../views/games/HDIEWTGView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
