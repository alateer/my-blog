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
            component: () => import('@/views/Home'),
            children: [
                {
                    path: '/index',
                    name: 'Index',
                    component: () => import('@/views/Index')
                },
                {
                    path: '/timeline',
                    name: 'TimeLine',
                    component: () => import('@/views/TimeLine')
                },
                {
                    path: '/say',
                    name: 'Say',
                    component: () => import('@/views/Say')
                }
            ]
        }
    ]
})

