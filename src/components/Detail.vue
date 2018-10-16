<template>
  <div>
<Heade :headerdata="Category"></Heade>
<Center></Center>
</div>
</template>

<script>
import Heade from './Heade'
import axios from 'axios'
import Center from './Center'
export default {
  name: 'Detail',
  data () {
    return {
    Category:[],
    }
  },
components:{
    'Heade':Heade,
    'Center':Center
},
methods:{
getHomecategory:function(){
  axios.get('http://localhost:8081/homedatacategory').then(this.getcategoryjson)
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
    this.getHomecategory();
  }
}

</script>

<style scoped>


</style>
