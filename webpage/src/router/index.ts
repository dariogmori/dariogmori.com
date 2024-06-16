import { createRouter, createWebHashHistory } from 'vue-router'

const routes= [
  {
    path: '/',
    name: 'home',
    component: () => import(/* webpackChunkName: "about" */ '../views/HomeView.vue')
  },
  {
    path: '/celeste',
    name: 'celeste',
    component: () => import(/* webpackChunkName: "about" */ '../views/CelesteView.vue')
  },
  {
    path: '/about-me',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutMe.vue')
  },
  {
    path: '/games/big-crunch',
    name: 'big-crunch',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/games/BigCrunchView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
