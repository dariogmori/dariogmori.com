import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import './assets/styles/theme.css'

// i18n
import i18next from 'i18next'
import I18NextVue from 'i18next-vue'
import Backend from 'i18next-http-backend'
//element plus
import{ ElCol, ElRow, ElDivider } from 'element-plus'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

const savedLang = localStorage.getItem('lang') || 'en'

import * as ElementPlusIconsVue from '@element-plus/icons-vue'


async function bootstrap() {
  await i18next
    .use(Backend)
    .init({
      lng: savedLang,
      fallbackLng: 'en',
      backend: {
        loadPath: '/locales/{{lng}}/{{ns}}.json'
      },
      interpolation: {
        escapeValue: false
      }
    })

  const app = createApp(App)

  for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
  }

  app.use(ElCol)
  app.use(ElRow)
  app.use(ElDivider)
  app.use(router)
  app.use(I18NextVue, { i18next })

  app.mount('#app')
}

bootstrap()
