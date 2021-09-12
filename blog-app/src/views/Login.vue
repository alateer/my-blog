<template>
    <div class="main">
        <div class="center">
            <div class="title">
                My Blog
            </div>
            <el-form ref="userForm" :model="userForm">
                <el-form-item prop="name">
                    <el-input 
                        type="text" 
                        v-model="userForm.name"
                        prefix-icon="el-icon-s-custom" 
                        placeholder="请输入用户名" 
                        clearable
                    />
                </el-form-item>
                <el-form-item prop="password">
                    <el-input 
                        type="password" 
                        v-model="userForm.password"
                        prefix-icon="el-icon-s-promotion" 
                        placeholder="请输入密码" 
                        clearable
                    />
                </el-form-item>
                <el-form-item class="sure">
                    <el-button type="primary" @click="login()">登录</el-button>
                    <el-button type="primary">注册</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
import { ElMessage } from 'element-plus'
import routerfrom from '../router'
export default {
    name: 'Login',
    data() {
        return {
            userForm: {
                name: '',
                password: ''
            }
        }
    },
    methods: {
        login() {
            this.axios.get("http://localhost:8080/api/user/login/" + this.userForm.name + "/" + this.userForm.password)
                .then((response) => {
                    var data = response.data
                    if(data == 1) {
                        routerfrom.push('/')
                    } else {
                        ElMessage('用户名或密码错误！')
                    }
                })
        }
    }
}
</script>

<style scoped>
.main {
    width: 100%;
    height: 100%;
    position: fixed;
    background-image: url('../assets/login-background-img.jpg');
    background-size: cover;
    background-color: rgb(244, 246, 246);
    background-repeat: no-repeat;
}
.center {
    background-color: rgba(244, 246, 246, 0.2);
    position: absolute;
    left: 52%;
    height: 300px;
    width: 400px;
    margin: 300px 0;
    padding: 20px;
    border: 1px rgba(244, 246, 246, 0.2) solid;
    border-radius: 15px;
}
.title {
    margin: 20px 0;
    text-align: center;
    font-size: 30px;
    height: 50px;
    font-family:serif;
}
.sure {
    text-align: center;
}
</style>