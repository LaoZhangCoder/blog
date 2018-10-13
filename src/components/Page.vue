<template>

  <div>
   <el-row :gutter="10">
  <el-col :xs="24" :sm="24" :md="24" :lg="{span:14,offset:10}" :xl="{span:14,offset:10}" ><div class="grid-content ">
    <el-pagination
     @current-change="handleCurrentChange"
    
  background
  layout="prev, pager, next"
  :total="count"
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
  data() {return{
  	count:null
  }},
  methods: {
      handleCurrentChange(val) {
        this.$emit('changepage',val)
      },
      getitemcount:function(){
	axios.get('http://localhost:8081/getcount').then(this.getsuccsize)
},
getsuccsize:function(res){
this.count=res.data

}
    },
    mounted(){
    	this.getitemcount();
    }
  
}
</script>

<style scoped>
.el-pagination{
  
  
}
</style>
