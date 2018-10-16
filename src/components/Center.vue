<template>
<div>
 <article class="main-content post-page">
    <div class="post-header">
        <h1 class="post-title" itemprop="name headline">
            <a href="javascript:void(0)">{{detail.title}}</a>
        </h1>
        <div class="post-data">
            <time datetime="2018-03-14" itemprop="datePublished">发布于 {{detail.date | dateFmt('YYYY-MM-DD')}}</time>
            /<a href="#comments">没有评论</a> /
            {{detail.liulanliang?detail.liulanliang:0}}浏览
        </div>
    </div>
    <div id="post-content" class="post-content" itemprop="articleBody">
        <p class="post-tags">
          <a v-for="tag in tags" href="javascript:void(0)">{{tag}}</a>
</p>
</div>
</article>
  <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " v-html="detail.content" style="background:#f7f7f7;color:black;letter-spacing:3px">
  </div>
  </el-col>
</el-row>
<hr />
     <el-row :gutter="10">
  <el-col :xs="{span:24}" :sm="{span:10,offset:7}" :md="{span:10,offset:7}" :lg="{span:10,offset:7}" :xl="{span:10,offset:7}"><div class="grid-content "  style="color:black;letter-spacing:3px; font-size:14px">
    本文由 <router-link to="/">神的孩子</router-link> 创作，本站文章除注明转载/出处外，均为本站原创或翻译，转载前请务必署名
最后编辑时间为:  {{detail.date | dateFmt('YYYY-MM-DD')}}
  </div>
  </el-col>
</el-row>
<hr />
<div style="background:#f7f7f7">
    <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content ">
    <div >
    <div>
       

        <form method="post" id="comment-form" class="comment-form" role="form" onsubmit="return TaleComment.subComment();">
            <input type="text" name="author" maxlength="12" id="author" class="form-control input-control clearfix"
                   placeholder="姓名 (*)" value="" required/>
            <input type="email" name="mail" id="mail" class="form-control input-control clearfix" placeholder="邮箱 (*)"
                   value="" required/>
            <input type="url" name="url" id="url" class="form-control input-control clearfix" placeholder="你的网址 (http://)"
                   value=""/>
            <textarea name="text" id="textarea" class="form-control" placeholder="小基佬，请留下你的评论." required minlength="5" maxlength="2000"></textarea>
            <button type="submit" class="submit" id="misubmit">提交</button>
        </form>




    </div>
</div>
  </div>
  </el-col>
</el-row>
   
   <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " style="background:white; color:black; font-size:18px">
   <div style="display:flex"> <img  src="../assets/imgs/8.png" width="50" height="50" style="margin:20px; border-radius:4px; " /><span style="margin-top:20px;font-size:14px;color:#5f5f5f;">wwww</span>

   </div>
   <div style="font-size:14px; margin-left:20px">厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉厉害厉害厉害厉害厉害厉害厉害</div>
 
<div style="font-size:14px; margin-left:20px">2012-12-12</div>


  </div>
  </el-col>
</el-row>
 <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " style="background:white; color:black; font-size:18px">
   <div style="display:flex"> <img  src="../assets/imgs/8.png" width="50" height="50" style="margin:20px; border-radius:4px; " /><span style="margin-top:20px;font-size:14px;color:#5f5f5f;">wwww</span>

   </div>
   <div style="font-size:14px; margin-left:20px">厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉厉害厉害厉害厉害厉害厉害厉害</div>

<div style="font-size:14px; margin-left:20px">2012-12-12</div>


  </div>
  </el-col>
</el-row>
 <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " style="background:white; color:black; font-size:18px">
   <div style="display:flex"> <img  src="../assets/imgs/8.png" width="50" height="50" style="margin:20px; border-radius:4px; " /><span style="margin-top:20px;font-size:14px;color:#5f5f5f;">wwww</span>

   </div>
   <div style="font-size:14px; margin-left:20px">厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉厉害厉害厉害厉害厉害厉害厉害</div>

<div style="font-size:14px; margin-left:20px">2012-12-12</div>


  </div>
  </el-col>
</el-row>
 <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " style="background:white; color:black; font-size:18px">
   <div style="display:flex"> <img  src="../assets/imgs/8.png" width="50" height="50" style="margin:20px; border-radius:4px; " /><span style="margin-top:20px;font-size:14px;color:#5f5f5f;">wwww</span>

   </div>
   <div style="font-size:14px; margin-left:20px">厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害厉害
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉 厉害厉害厉
   厉害厉害厉厉害厉害厉
   厉害厉害厉
   厉害厉害厉厉害厉害厉害厉害厉害厉害厉害</div>

<div style="font-size:14px; margin-left:20px">2012-12-12</div>


  </div>
  </el-col>
</el-row>

</div>

</div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Center',
  data () {
    return {
      detail:Object,
      tags:[]
    }
  },
methods: {
  getDetailinfo () {
    axios.get('http://localhost:8081/Category/detail?id='+this.$route.params.id).then(this.getsuccdata)
  },
  getsuccdata:function(res){
this.detail=res.data
this.tags=res.data.tag.split(',')
  },

},
mounted () {
this.getDetailinfo()
}
  }

</script>

<style scoped>

 
</style>
