<template>
    <scroll-page>
        <article-item></article-item>
    </scroll-page>
</template>

<script>
import ArticleItem from '../../components/article/ArticleItem.vue'
import ScrollPage from '../../components/article/ScrollPage.vue'
export default {
    name: 'ArticleScrollPage',
    components: { ScrollPage, ArticleItem }
}
</script>

<style scoped>

</style>