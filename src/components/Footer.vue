<template>
  <div  style="background:#F56C6C">
<el-row :gutter="1">
  <el-col :xs="24" :sm="24" :md="24" :lg="{span:8,push:6}" :xl="8"><div class="grid-content "><img src="../assets/imgs/8.png" width="100" height="100"><h3>神的孩子@</h3></div></el-col>
    <el-col :xs="24" :sm="24" :md="24" :lg="8" :xl="8"><div class="grid-content "> <h3 class="meta-title" style="margin-left:20px">最新留言</h3>
               <ul style="margin:1px 1px">
                <li>
                    <a href="http://www.mofum.com/article/mission-317">一灯一世界3.17日寮比赛</a>
                </li>
              
               
                <li>
                    <a href="http://www.mofum.com/article/java-emulator-fc-02">FC模拟器的实现 - CPU相关知识（2） - JAVA</a>
                </li>
                <li>
                    <a href="http://www.mofum.com/article/article-mission-315">一灯一世界征文活动</a>
                </li>
                <li>
                    <a href="http://www.mofum.com/article/java-alipay-sign-01">支付宝APP支付生成签名 - JAVA</a>
                </li></ul></div></el-col>

      <el-col :xs="24" :sm="24" :md="24" :lg="8" :xl="8"><div class="grid-content "> <h3 class="meta-title" style="margin-left:20px">最新文章</h3>
        <ul style="margin:1px 1px">
                <li v-for="item of news">
                    <a href="http://www.mofum.com/article/mission-317">{{item.title}}</a>
                </li>
               
</ul>              </div></el-col>
</el-row>
  </div>
</template>

<script>

export default {
  name: 'Homefoot',
  props:{
    news:Array
  }
 
}
</script>

<style scoped>
  .el-col {
    border-radius: 4px;
  }
 
  .bg-purple {
   
  }
  .bg-purple-light {
 
  }
  .grid-content {
    border-radius: 4px;
    min-height: 36px;
  }
  
  
  
</style>
