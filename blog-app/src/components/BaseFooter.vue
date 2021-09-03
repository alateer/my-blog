<template>
    <el-footer class="me-area">
        <div class="me-footer">
            <p>
                Designed by
                <strong>
                    <router-link to="/" class="me-login-font">Tao</router-link>
                </strong>
            </p>
        </div>
    </el-footer>
</template>

<script>
export default {
    name: 'BaseFooter'
}
</script>

<style scoped>
.el-footer {
    position: absolute;
    z-index: 1024;
    bottom: 0;
    left: 0;
    min-width: 100%;
}
.me-footer {
    text-align: center;
    line-height: 60px;
    font-size: 18px;
}
.me-login-font {
    color: #5FB878 !important;
}
</style>