<template>
  <div>
<Heade :headerdata="Category"></Heade>
<Links_detail :links="links"></Links_detail>
 <Footer :news="newsarticle" :newcomments="newcomments"></Footer>

</div>
</template>

<script>
import Heade from './Heade'
import Links_detail from './Links_detail'
import axios from 'axios'
import Footer from './Footer'
export default {
  name: 'Links',
  data () {
    return {
    Category:[],
     newsarticle:[],
      newcomments:[],
      links:[]
    }
  },
components:{
    'Heade':Heade,
    'Links_detail':Links_detail,
    'Footer': Footer
   
},
methods:{
getHomecategory:function(){
  axios.get('http://admin.shendehaizi.com:8088/homedatacategory').then(this.getcategoryjson)
   axios.get('http://admin.shendehaizi.com:8088/newarticle').then(this.getsuccnews)
     axios.get('http://admin.shendehaizi.com:8088/Category/getnewcomment').then(this.getnewcomment)
      axios.get('http://admin.shendehaizi.com:8088/Category/getlinks').then(this.getlinks)

},
getlinks:function(res){
if(res.status){
  this.links=res.data
  console.log(res)
}
},

getnewcomment:function(res){
  if(res.status){
this.newcomments=res.data
  }
},
getcategoryjson:function(res){
res=res.data

if(res.ok&&res.listcategory){
  const listcate=res.listcategory
  
this.Category=listcate

}

},
 getsuccnews:function(res){
res=res.data

if(res.ok&&res.list){
  const list=res.list
  
this.newsarticle=list


}
  },
},
mounted(){
    this.getHomecategory();
  }
}

</script>

<style scoped>


</style>
