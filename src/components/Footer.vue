<template>
  <div  style="background:#F56C6C">
<el-row :gutter="1">
  <el-col :xs="24" :sm="24" :md="24" :lg="{span:8,push:6}" :xl="8"><div class="grid-content "><img src="../assets/imgs/8.png" width="100" height="100"><h3>神的孩子@</h3></div></el-col>
    <el-col :xs="24" :sm="24" :md="24" :lg="8" :xl="8"><div class="grid-content "> <h3 class="meta-title" style="margin-left:20px">最新留言</h3>
               <ul style="margin:1px 1px">
                <li v-for="comment in newcomments">
                    <a href="javascript:void(0)">{{comment.username}}:{{comment.comment}} </a>
                </li></ul></div></el-col>
      <el-col :xs="24" :sm="24" :md="24" :lg="8" :xl="8"><div class="grid-content "> <h3 class="meta-title" style="margin-left:20px">最新文章</h3>
 <ul style="margin:1px 1px">
<li v-for="item of news" :key="item.id">
<router-link :to="'/detail/'+item.id"  class="item-thumb  ">{{item.title}}</router-link>
</li></ul>
</div>
</el-col>
</el-row>
  </div>
</template>
<script>
export default {
  name: 'Homefoot',
  props: {
    news: Array,
    newcomments: Array }
}
</script>
<style scoped>
  .el-col {
    border-radius: 4px;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
</style>
