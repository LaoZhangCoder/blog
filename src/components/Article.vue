<template>
<div class="main-content index-page clearfix">
    <div class="post-lists">
        <div class="post-lists-body">
<!--这里开始!-->
            <div class="post-list-item" v-for="item of homecontent" :key="item.id">
                <div class="post-list-item-container">
                    <router-link :to="'/detail/'+item.id"  class="item-thumb  bg-deepgrey"
                      >
                        <dir class="item-desc" v-html="delHtmlTag('作者:'+item.autor+item.content)"></dir>
                    </router-link>
                    <div class="item-slant reverse-slant &lt; bg-deepgrey"></div>
                    <div class="item-slant"></div>
                    <div class="item-label">
                        <div class="item-title"><router-link :to="'/detail/'+item.id"> {{item.title}}  </router-link>
                        </div>
                        <div class="item-meta clearfix">
                           
                            <div class="item-meta-cat">
                                <el-badge  :max="99" class="item" :value="count.count" v-for="count in totala" :key="count.id" v-if="count.id==item.id">

  <el-button size="small">评论</el-button>
</el-badge>
                                <a href="/category/%E5%AF%AE%E6%AF%94%E8%B5%9B"><el-button type="text" class="button">查看详情</el-button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
</template>

<script>

export default {
  name: 'Homearticle',
 props: {
    homecontent: Array,
    totala:Array
 },
 methods :{

    delHtmlTag:function(str){

return str.replace(/<[^>]+>/g,"");
    }
 },

  
}
</script>

<style scoped>
.item{
    float:left;
    margin-top:20px;
}

</style>
