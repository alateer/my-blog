import { createApp } from 'vue'
import App from './App.vue'
import store from "@/store/index.js"
import router from "@/router/index.js"
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css';

createApp.use(ElementUI);

createApp(App,store,router).mount('#app')
