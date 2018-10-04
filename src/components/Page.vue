<template>

  <div>
   <el-row :gutter="10">
  <el-col :xs="24" :sm="24" :md="24" :lg="{span:14,offset:10}" :xl="{span:14,offset:10}" ><div class="grid-content ">
    <el-pagination
  background
  layout="prev, pager, next"
  :total="10">
</el-pagination>

  </div></el-col>
  
</el-row>
 

</div>
</template>

<script>
export default {
  name: 'Homepage',

  
}
</script>

<style scoped>
.el-pagination{
  
  
}
</style>
