<template>
  <div class="index_home">
   <div id="Odiv"  style="position: absolute;"></div>
    <Header :headerdata="Category" @changetag="changepagetag"></Header>
    <Swiped></Swiped>
    <Article :homecontent="Articlelist"></Article>
    <Page :homepage="Articlelist"  :coutcategory="categorypage" @changepage="changecurrentpage"></Page>
    <Footer :news="newsarticle"></Footer>
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
    categorypage:null
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

  axios.get('http://localhost:8081/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
  axios.get('http://localhost:8081/newarticle').then(this.getsuccnews)
  axios.get('http://localhost:8081/Category/count?tag='+this.thistag).then(this.getsucctagcount)
  
},
changepagetag:function(thistag){
this.thistag=thistag
this.thispage=1
 axios.get('http://localhost:8081/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
axios.get('http://localhost:8081/Category/count?tag='+this.thistag).then(this.getsucctagcount)
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
  axios.get('http://localhost:8081/homedata?tag='+this.thistag+'&thispage='+this.thispage).then(this.getsuccjson)
},
getHomecategory:function(){
  axios.get('http://localhost:8081/homedatacategory').then(this.getcategoryjson)
},
  
  getsuccjson:function(res){
res=res.data

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
