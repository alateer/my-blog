import { createApp } from 'vue'
import App from '../App.vue'
import { createRouter, createWebHistory } from "vue-router"

const app = createApp(App)
app.use(router)

const routes = [
    {
        path: "/",
        name: "Home",
        component: () => import("@/views/Home.vue")
    },
    {
        path: "/category/:name",
        name: "Category",
        component: () => import("@/views/Category.vue")
    },
    {
        path: "/tag/:name",
        name: "Tag",
        component: () => import("@/views/Tag.vue")
    },
    {
        path: "/timeline",
        name: "TimeLine",
        component: () => import("@/views/TimeLine.vue")
    },
    {
        path: "/message",
        name: "Message",
        component: () => import("@/views/Message.vue")
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

app.mount('#app')
export default router;