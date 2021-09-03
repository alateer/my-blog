<template>
    <div>
        <el-container>
            <el-main>
                <article-scroll-page></article-scroll-page>
            </el-main>
            <el-aside>
                <card-me></card-me>
                <card-tag></card-tag>
                <card-article></card-article>
            </el-aside>
        </el-container>
    </div>
</template>

<script>
import CardMe from '../components/card/CardMe.vue'
import CardArticle from '../components/card/CardArticle.vue'
import CardTag from '../components/card/CardTag.vue'
import ArticleScrollPage from './common/ArticleScrollPage.vue'
export default {
    name: 'Index',
    components: { ArticleScrollPage, CardMe, CardTag, CardArticle }
}
</script>

<style scoped>
.el-container {
    width: 960px;
}
.el-aside {
    margin-left: 40px;
    width: 300px;
}
.el-main {
    padding: 0px;
    line-height: 16px;
}
.el-card {
    border: 2px solid rgb(132, 224, 70);
    border-radius: 15px;
}
.el-card:not(:first-child) {
    margin-top: 40px;
}
</style>