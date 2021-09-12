<template>
    <el-card class="me-area" :body-style="{ padding: '16px'  }">
        <div class="me-article-header">
        </div>
        <div class="me-article-description"></div>
        <div class="me-article-footer"></div>
    </el-card>
</template>

<script>
export default {
    name: 'ArticleItem'
}
</script>

<style scoped>
.me-article-header {
    padding-bottom: 10px;
}
.me-article-description {
    margin-bottom: 10px;
}
</style>