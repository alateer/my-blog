<template>
    <el-menu 
        :default-active="activeIndex" 
        class="el-menu-demo" 
        router 
        mode="horizontal" 
        active-text-color="#5FB878"
    >
        <el-menu-item index="/index">主页</el-menu-item>
        <el-menu-item index="/timeline">时间线</el-menu-item>
        <el-menu-item index="/say">留言</el-menu-item>
    </el-menu>
</template>

<script>
export default {
    name: 'NavMenu',
    data() {
        return {
            activeIndex: '/index'
        }
    }
}
</script>

<style scoped>

</style>