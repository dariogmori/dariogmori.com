import { createRouter, createWebHashHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/HomeView.vue')
  },
  {
    path: '/art',
    name: 'art',
    component: () => import('../views/hobby/ArtView.vue')
  },
  {
    path: '/talks/sustainable-platform-engineering',
    name: 'sustainable-platform-engineering',
    component: () => import('../views/talks/SustainablePlatformEngineering.vue')
  },
  {
    path: '/blog',
    name: 'blog',
    component: () => import('../views/blog/BlogView.vue')
  },
  {
  	path: '/projects',
  	name: 'projects',
  	component: () => import('../views/projects/ProjectsView.vue')
  },
  {
  	path: '/games',
  	name: 'ANP4A',
  	component: () => import('../views/games/GamesView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
