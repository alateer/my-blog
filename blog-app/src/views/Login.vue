<template>
    <div class="main">
        <div class="center">
            <div class="title">
                My Blog
            </div>
            <el-form ref="userForm" :model="userForm">
                <el-form-item prop="name" class="in">
                    <el-input type="text" v-model="userForm.name" placeholder="请输入用户名"/>
                </el-form-item>
                <el-form-item prop="password" class="in">
                    <el-input type="password" v-model="userForm.password" placeholder="请输入密码"/>
                </el-form-item>
                <el-form-item size="small" class="sure">
                    <el-button type="primary" @click="login()">确定</el-button>
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
            this.axios.get("http://localhost:9000/api/user/login/" + this.userForm.name + "/" + this.userForm.password)
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