<template>
    <el-menu 
        :default-active="activeIndex" 
        class="el-menu-demo" 
        router 
        mode="horizontal" 
        text-color="#fff"
        active-text-color="#ffd04b"
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
.el-menu-demo {
    background-color: #545c64;
}
</style>