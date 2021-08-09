<template>
    <el-header>
        <el-row>
            <el-col :span="4" class="logo-img">
                <div ></div>
            </el-col>
            <el-col :span="12">
                <nav-menu></nav-menu>
            </el-col>
            <el-col :span="4" class="search">
                <div ></div>
            </el-col>
            <el-col :span="4" class="login-in">
                <div ></div>
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
    padding: 0 0;
    margin-bottom: 10px;
}
.logo-img {
    background-color: greenyellow;
}
.search {
    background-color: cadetblue;
}
.login-in {
    background-color: cornsilk;
}
</style>