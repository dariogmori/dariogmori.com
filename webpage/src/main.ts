import App from './App.vue'
import router from './router'

import './assets/styles/theme.css'
import { createApp } from 'vue'

// i18n
import i18next from 'i18next'
import I18NextVue from 'i18next-vue'
import Backend from 'i18next-http-backend'
//element plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

import './assets/styles/theme.css';
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

app.use(ElementPlus)
app.use(router)
app.use(I18NextVue, { i18next })
app.mount('#app')

