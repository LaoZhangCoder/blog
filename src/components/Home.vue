<template>
  <div class="index_home">
    <Header></Header>
  </div>
</template>

<script>
import Header from './Header'
export default {
  name: 'Home',
  components:{
  	'Header':Header
  }
}
</script>

<style scoped>
.index_home{
	background-color:#f7f7f7;
}
</style>
