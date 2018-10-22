<template>
  <div>
<Heade :headerdata="Category"></Heade>
<Person_message></Person_message>
 <Footer :news="newsarticle" :newcomments="newcomments"></Footer>

</div>
</template>

<script>
import Heade from './Heade'
import Person_message from './Person_message'
import axios from 'axios'
import Footer from './Footer'

export default {
  name: 'Aboutblog',
  data () {
    return {
    Category:[],
     newsarticle:[],
      newcomments:[],
    
    }
  },
components:{
    'Heade':Heade,
   'Person_message':Person_message,
    'Footer': Footer
   
},
methods:{
getHomecategory:function(){
  axios.get('http://admin.shendehaizi.com:8088/homedatacategory').then(this.getcategoryjson)
   axios.get('http://admin.shendehaizi.com:8088/newarticle').then(this.getsuccnews)
     axios.get('http://admin.shendehaizi.com:8088/Category/getnewcomment').then(this.getnewcomment)
    

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
