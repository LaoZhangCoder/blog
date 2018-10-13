<template>
<div class="main-content index-page clearfix">
    <div class="post-lists">
        <div class="post-lists-body">
<!--这里开始!-->
            <div class="post-list-item" v-for="item of homecontent" :key="item.id">
                <div class="post-list-item-container">
                    <a href="http://www.mofum.com/article/mission-317-01" class="item-thumb  bg-deepgrey"
                       style="background-image:url(/templates/themes/default/static/img/rand/7.jpg);">
                        <dir class="item-desc" v-html="delHtmlTag('作者:'+item.autor+item.content)"></dir>
                    </a>
                    <div class="item-slant reverse-slant &lt; bg-deepgrey"></div>
                    <div class="item-slant"></div>
                    <div class="item-label">
                        <div class="item-title"><a href="http://www.mofum.com/article/mission-317-01">{{item.title}}</a>
                        </div>
                        <div class="item-meta clearfix">
                           
                            <div class="item-meta-cat">
                                <a href="/category/%E5%AF%AE%E6%AF%94%E8%B5%9B"><el-button type="text" class="button">查看详情</el-button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
<!--这里结束!-->
  
             
              
             
              
           















        </div>
    </div>
</div>
</template>

<script>

export default {
  name: 'Homearticle',
 props: {
    homecontent: Array
 },
 methods :{
    delHtmlTag:function(str){
return str.replace(/<[^>]+>/g,"");
    }
 },

  
}
</script>

<style scoped>


</style>
