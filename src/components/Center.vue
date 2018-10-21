<template>
<div>
 <article class="main-content post-page">
    <div class="post-header">
        <h1 class="post-title" itemprop="name headline">
            <a href="javascript:void(0)">{{detail.title}}</a>
        </h1>
        <div class="post-data">
            <time datetime="2018-03-14" itemprop="datePublished">发布于 {{detail.date | dateFmt('YYYY-MM-DD')}}</time>
            /<a href="#comments">{{this.count?this.count:0}}条评论</a> /
            {{detail.liulanliang>0?detail.liulanliang:0}}浏览
        </div>
    </div>
    <div id="post-content" class="post-content" itemprop="articleBody">
        <p class="post-tags">
          <a v-for="tag in tags" href="javascript:void(0)">{{tag}}</a>
</p>
</div>
</article>
  <el-row :gutter="1">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " v-html="detail.content" style="background:#f7f7f7;color:black;letter-spacing:3px; overflow-x:scroll">
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
        <form  id="comment-form" class="comment-form" onclick="return false">
            <input type="text" name="username" v-model="username" maxlength="12" id="author" class="form-control input-control clearfix"
                   placeholder="姓名 (*必填)" value="" required/>
            <input type="email" name="email"  v-model="email" id="mail" class="form-control input-control clearfix" placeholder="邮箱 (*必填)"
                   value="" required/>
            <input type="text" name="href" id="url" v-model="href" class="form-control input-control clearfix" placeholder="你的网址(选填)"
                   value=""/>
            <textarea name="comment" id="textarea" v-model="comment" class="form-control" placeholder="小基佬，请留下你的评论(必填)." required minlength="5" maxlength="2000"></textarea>
          

             <el-button @click="handlesubmit" type="button" class="submit"size="mini" round>提交</el-button>
        </form>
    </div>
</div>
  </div>
  </el-col>
</el-row>
   
   <el-row :gutter="1" v-for="comments in leavecomments" :key="comments.itemid">
  <el-col :xs="{span:24}" :sm="{span:8,offset:8}" :md="{span:8,offset:8}" :lg="{span:8,offset:8}" :xl="{span:8,offset:8}"><div class="grid-content " style="background:white; color:black; font-size:18px">
   <div style="display:flex"> <img  src="../assets/imgs/8.png" width="50" height="50" style="margin:20px; border-radius:4px; " /><span style="margin-top:20px;font-size:14px;color:#5f5f5f;">{{comments.username}}</span>

   </div>
   <div style="font-size:14px; margin-left:20px">{{comments.comment}}</div>
<div style="font-size:14px; margin-left:20px">{{comments.date | dateFmt('YYYY-MM-DD hh:mm')}}</div>
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
      id:null,
      tags:[],
     username:null,
   email:null,
  href:null,
  comment:null,
  leavecomments:[],
  count:null
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
handlesubmit:function(){
  var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");

if(this.username&&this.email&&this.comment&&reg.test(this.email))
  {
    
 axios.post('http://localhost:8081/Category/leavemessage?username='+this.username+'&email='+this.email+'&href='+this.href+'&comment='+this.comment+'&id='+this.detail.id).then(this.getsuccmessage)
}

},
getsuccmessage:function(res){
if(res.data.ok){
 window.location.reload();
}
},
getcomments:function()
 {
   axios.get('http://localhost:8081/Category/leavecomments?id='+this.id).then(this.getleavecomments);
 },
 getleavecomments:function(res){
res=res.data
if(res.ok&&res.listcomments)
{
  this.leavecomments=res.listcomments
  this.count=res.count;
}
 }
},
mounted ()        {
this.id=this.$route.params.id
this.getDetailinfo()
this.getcomments() }
}
</script>

<style scoped>
</style>
