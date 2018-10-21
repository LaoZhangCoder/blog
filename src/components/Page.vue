<template>

  <div>
   <el-row :gutter="10">
  <el-col :xs="24" :sm="24" :md="24" :lg="{span:14,offset:10}" :xl="{span:14,offset:10}" ><div class="grid-content ">
    <el-pagination
     @current-change="handleCurrentChange"
    
  background
  layout="prev, pager, next"
  :total="coutcategory ?coutcategory:count"
  :current-page="thispage"
  :page-size="12">
</el-pagination>

  </div></el-col>
  
</el-row>
 

</div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Homepage',
  props:{
  	coutcategory:null,
    thispage:null
  },
  data() {return{
  	count:null
  }},
  methods: {
      handleCurrentChange(val) {
        this.$emit('changepage',val)
      }
    },
   
}
</script>

<style scoped>
.el-pagination{
  
  
}
</style>
