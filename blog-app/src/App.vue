<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
}
body {
  background-color: #f5f5f5;
  font-weight: 400;
  font-family: "Microsoft YaHei","微软雅黑",Arial,sans-serif;
  line-height: 1.5;
}
a {
  cursor: pointer;
  text-decoration: none;
}
html {
  height: 100%;
}
body {
  min-height: 100%;
}
body {
  position: relative;
}
.me-area {
  background-color: #fff;
}
</style>
