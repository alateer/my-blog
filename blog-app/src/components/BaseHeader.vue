<template>
    <el-header class="me-area">
        <el-row>
            <el-col :span="4" class="logo-img">
                <router-link to="/" />
            </el-col>
            <el-col :span="12">
                <nav-menu class="nav"></nav-menu>
            </el-col>
            <el-col :span="4">
                <el-input  class="search" placeholder="请输入搜索内容" prefix-icon="el-icon-search" />
            </el-col>
            <el-col :span="4" >
                <el-button class="login-out" type="primary">登出</el-button>
            </el-col>
        </el-row>
    </el-header>
</template>

<script>
import NavMenu from '../components/NavMenu.vue'
export default {
    name: 'BaseHeader',
    components: {
        NavMenu
    }
}
</script>

<style scoped>
.el-header {
    position: fixed;
    min-width: 100%;
    z-index: 1024;
}
.search {
    margin-top: 10px;
    width: 70%;
    float: none;
    margin-left: 30px;
}

.login-out {
    margin-top: 10px;
    margin-left: 50px;
}
</style>