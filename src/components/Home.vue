<template>
  <div class="index_home">
   <div id="Odiv"  style="position: absolute;"></div>
    <Header></Header>
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
export default {
  name: 'Home',
  components:{
  	'Header':Header,
  	'Swiped':Swiped,
    'Article': Article,
    'Page':Page,
    'Footer': Footer
  }
}
</script>

<style scoped>
.index_home{
	background-color:#f7f7f7;
}
</style>
