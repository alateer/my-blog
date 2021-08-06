<template>
    <div class="main">
        <div class="center">
            <div class="title">
                My Blog
            </div>
            <div class="in">
                <el-input type="text" placeholder="请输入用户名"/>
            </div>
            <div class="in">
                <el-input type="password" placeholder="请输入密码"/>
            </div>
            <div class="sure">
                <el-button>确定</el-button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: 'Login'
}
</script>

<style scoped>
.main {
    width: 100%;
    height: 100%;
    position: fixed;
}
.center {
    background-color: rgb(86, 209, 231);
    position: absolute;
    left: 35%;
    height: 300px;
    width: 400px;
    margin: 250px 0;
    padding: 20px;
}
.title {
    margin: 20px 0;
    text-align: center;
    height: 50px;
}
.in {
    margin: 25px auto;
    height: 40px;
}
.sure {
    margin: 0 auto;
    height: 40px;
    text-align: center;
}
</style>