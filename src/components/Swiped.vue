<template>
	<div class="header_swiped">
  <el-carousel :interval="4000" type="card" height="200px">
    <el-carousel-item v-for="item in 3" :key="item">	
    	<div >
    		<span style="position:absolute;margin-left:30%;line-height:200px;color:white;">念念不忘，必有回响</span>
      <img src="../assets/imgs/swipe1.png" width="900" height="200">
  </div>
    </el-carousel-item>
  </el-carousel>
</div>
</template>

<script>

export default {
  name: 'HomeSwiped',
 
}
</script>

<style scoped>
.header_swiped{
	position:relative;
	padding-top:100px;
	
}

</style>
