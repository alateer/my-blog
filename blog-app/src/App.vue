<template>
  <div id="app">
    <NavMenu></NavMenu>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {};
  },
  components: {
    NavMenu: () => import("@/components/NavMenu.vue")
  }
}
</script>

<style>

</style>
