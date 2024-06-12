import App from './App.vue'
import router from './router'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import './assets/styles/theme.css'
import i18next from 'i18next'
import I18NextVue from 'i18next-vue'
import Backend from 'i18next-http-backend'

const app = createApp(App)

i18next
    .use(Backend)
    .init({
        lng: 'en',
        fallbackLng: 'en',
        backend:{
            loadPath: '/locales/{{lng}}/{{ns}}.json'
        },
        interpolation: {
            escapeValue: false,
        }
    });

app.use(createPinia())
app.use(router)
app.use(I18NextVue, { i18next })
app.mount('#app')

