<template>
  <div class="index_home">
   <div id="Odiv"  style="position: absolute;"></div>
    <Header :headerdata="Category" @changetag="changepagetag" @searcharticle="searchartic" :thispage="thispage"></Header>
    <Swiped></Swiped>
    <Article :homecontent="Articlelist" :totala="totala" :error="error"></Article>
    <Page :homepage="Articlelist"  :coutcategory="categorypage" :thispage="thispage" @changepage="changecurrentpage"></Page>
    <Footer :news="newsarticle" :newcomments="newcomments"></Footer>
  </div>
</template>
<script>
import Header from './Header'
import Swiped from './Swiped'
import Article from './Article'
import Page from './Page'
import Footer from './Footer'
import axios from 'axios'
export default {
  name: 'Home',
  data () {
    return {
    Articlelist:[],
    Category:[],
    newsarticle:[],
    thispage:'',
    thistag:'',
    categorypage:null,
    totala:[],
    newcomments:[],
    issearch:null,
    search:null,
    error:null
    }
  },
  components:{
  	'Header':Header,
  	'Swiped':Swiped,
    'Article': Article,
    'Page':Page,
    'Footer': Footer
  },
    methods:{
getHomeInfo:function(){

  axios.get('http://admin.shendehaizi.com:8088/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
  axios.get('http://admin.shendehaizi.com:8088/newarticle').then(this.getsuccnews)
  axios.get('http://admin.shendehaizi.com:8088/Category/count?tag='+this.thistag).then(this.getsucctagcount)
  axios.get('http://admin.shendehaizi.com:8088/Category/getcommenttotal').then(this.getcommenttotal)
  axios.get('http://admin.shendehaizi.com:8088/Category/getnewcomment').then(this.getnewcomment)
  
},
searchartic:function(searchdata){
this.Articlelist=searchdata.list
this.error=""
this.categorypage=0
if(searchdata.count==0){
this.error="抱歉不存在该文章！"}
},
getnewcomment:function(res){
  if(res.status){
this.newcomments=res.data
  }
  
},
getcommenttotal:function(res){
   if(res.status){
this.totala=res.data
}
},
changepagetag:function(thistag){
this.thistag=thistag
this.thispage=1
 axios.get('http://admin.shendehaizi.com:8088/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
axios.get('http://admin.shendehaizi.com:8088/Category/count?tag='+this.thistag).then(this.getsucctagcount)
},
getsucctagcount:function(res){
  this.categorypage=res.data
},
getsucctag:function(res){
res=res.data

if(res.ok&&res.list){
  const list=res.list
  
this.Articlelist=list


}
},
changecurrentpage:function(thispage){
  this.thispage=thispage
  axios.get('http://admin.shendehaizi.com:8088/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
},
getHomecategory:function(){
  axios.get('http://admin.shendehaizi.com:8088/homedatacategory').then(this.getcategoryjson)
},
  
  getsuccjson:function(res){
res=res.data
console.log(res)
if(res.ok&&res.list){
  const list=res.list
  
this.Articlelist=list


}
  },
  getsuccnews:function(res){
res=res.data

if(res.ok&&res.list){
  const list=res.list
  
this.newsarticle=list


}
  },
  getcategoryjson:function(res){
res=res.data

if(res.ok&&res.listcategory){
  const listcate=res.listcategory
  
this.Category=listcate

}

},
},
mounted(){
  this.thispage=1
  this.thistag=this.$store.state.Category

    this.getHomeInfo();
    this.getHomecategory();
  }
}
</script>

<style scoped>
.index_home{
	background-color:#f7f7f7;
}
</style>
