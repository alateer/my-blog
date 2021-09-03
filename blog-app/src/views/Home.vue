<template>
    <el-container>
        <base-header></base-header>
        <router-view class="me-container"/>
        <base-footer></base-footer>
    </el-container>
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
.me-container {
    margin: 100px auto 140px;
}
</style>