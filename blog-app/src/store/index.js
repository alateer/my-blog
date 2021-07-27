import { createApp } from 'vue'
import App from '../App.vue'
import { createStore } from 'vuex'

const app = createApp(App)
app.use(store)

const store = createStore({
    state: {
        token: window.sessionStorage.getItem("token"),
        userInfo: null
    },
    mutations: {
        setToken(state, token) {
            state.token = token;
            window.sessionStorage.getItem("token", token);
        },
        removeToken(state) {
            state.token = "";
            state.userInfo = null;
            window.sessionStorage.removeItem("token");
        },
        setUserInfo(state, userInfo) {
            state.userInfo = userInfo;
        }
    },
    actions: {}
});

app.mount('#app')

export default store