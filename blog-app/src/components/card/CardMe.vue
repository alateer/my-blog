<template>
    <el-card shadow="hover">
        <h1 class="me-card-title">alateer</h1>
        <div class="me-card-information">
            <span><i class="el-icon-location-information"></i>&nbsp; 江苏南京</span>
            <span><i class="el-icon-collection-tag"></i>&nbsp; 软件工程师</span>
        </div>
        <div class="me-card-tool">
            <div class="tool-item">
                <span><i class="el-icon-chat-dot-round"></i>&nbsp;QQ</span>
                <br/>
                <strong>1265696937</strong>
            </div>
            <div class="tool-item">
                <span><i class="el-icon-user-solid"></i>&nbsp;Github</span>
                <br/>
                <strong>https://github.com/alateer</strong>
            </div>
        </div>
    </el-card>
</template>

<script>
export default {
    name: 'CardMe'
}
</script>

<style scoped>
.me-card-title {
    text-align: center;
    font-size: 30px;
    font-weight: boilder;
}
.me-card-information {
    padding: 8px 0;
}
.el-icon-collection-tag {
    padding-left: 22px;
}
.me-card-tool {
    margin-top: 20px;
}
.tool-item {
    margin-bottom: 5px;
}
</style>