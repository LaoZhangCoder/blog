<template>
	<div class="header_swiped">
  <el-carousel :interval="4000" type="card" height="200px">
    <el-carousel-item v-for="item in imgsurl" :key="item">	
    	<div >
      <img :src="item" width="900" height="200">
  </div>
    </el-carousel-item>
  </el-carousel>
</div>
</template>

<script>

export default {
  name: 'HomeSwiped',
  data (){
    return {
      imgsurl:['./static/swipe1.png','./static/swipe2.png','./static/swiped3.png']
    }
  }
 
}
</script>

<style scoped>
.header_swiped{
	position:relative;
	padding-top:100px;
	
}

</style>
