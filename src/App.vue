<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  beforeCreate () {

  document.querySelector('body').setAttribute('style', 'background-color:#f7f7f7')

}
}
</script>

<style>
</style>
