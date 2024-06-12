import App from './App.vue'
import router from './router'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import './assets/styles/theme.css'
import i18next from 'i18next'
import I18NextVue from 'i18next-vue'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(I18NextVue, { i18next })
app.mount('#app')

