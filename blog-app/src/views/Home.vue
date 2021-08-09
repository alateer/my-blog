<template>
    <el-containe>
        <base-header></base-header>
        <router-view class="main"/>
        <base-footer></base-footer>
    </el-containe>
</template>

<script>
import BaseFooter from '../components/BaseFooter.vue'
import BaseHeader from '../components/BaseHeader.vue'
export default {
    name: 'Home',
    components: {
        BaseHeader,
        BaseFooter
    }
}
</script>

<style scoped>
.main {
    background-color: darkgray;
    padding-bottom: 50px;
}
</style>