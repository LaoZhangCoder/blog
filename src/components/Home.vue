<template>
  <div class="index_home">
   <div id="Odiv"  style="position: absolute;"></div>
    <Header :headerdata="Category"></Header>
    <Swiped></Swiped>
    <Article></Article>
    <Page></Page>
    <Footer></Footer>
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
    Category:[]
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

  axios.get('http://localhost:8081/homedata').then(this.getsuccjson)
  
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
  getcategoryjson:function(res){
res=res.data

if(res.ok&&res.listcategory){
  const listcate=res.listcategory
  
this.Category=listcate

}

},
},
mounted(){
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
