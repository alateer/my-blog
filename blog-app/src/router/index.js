import { createRouter, createWebHashHistory } from 'vue-router'

export default  new createRouter( {
    history: createWebHashHistory(),
    routes: [
        {
            path: '/login',
            name: 'Login',
            component: () => import('@/views/Login')
        },
        {
            path: '/',
            redirect: '/home'
        },
        {
            path: '/home',
            name: 'Home',
            component: () => import('@/views/Home')
        }
    ]
})

