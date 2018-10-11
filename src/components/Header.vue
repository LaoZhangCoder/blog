<template>
   <div id="header" class="header bg-white">
    <div class="navbar-container">
        <a href="#" class="navbar-logo">
            <img src="../assets/imgs/8.png" alt="神的孩子"/>
        </a>
        <div class="navbar-menu">
            <a v-for="item in headerdata " href="#">{{item.category}}</a>
            <a href="#">归档</a>
            <a href="#">关于本站</a>
            <a href="#">友情链接</a>
            
        </div>
        <div class="navbar-search">
            <span class="icon-search"></span>
            <form role="search" onsubmit="return false;">
                <span class="search-box">
                    <input type="text" id="search-inp" class="input" placeholder="搜索..." maxlength="30"
                           autocomplete="off">
                </span>
            </form>
        </div>
        <div class="navbar-mobile-menu" onclick="">
            <span class="icon-menu cross"><span class="middle"></span></span>
            <ul>
                <li v-for="item in headerdata "><a href="#">{{item.category}}</a></li>
                <li><a href="#">归档</a></li>
                 <li><a href="#">关于本站</a></li>
                  <li><a href="#">友情链接</a></li>
            </ul>
        </div>
    </div>
</div>
</template>
<script>
export default {
  name: 'Header',
  props:{
    headerdata:Array
  },
  mounted(){

  }
}
</script>

<style scoped>
@import "../assets/common/common.css";
.hljs{display:block;overflow-x:auto;padding:0.5em;background:#fff;color:black}
.hljs-comment,.hljs-quote{color:#006a00}.hljs-keyword,.hljs-selector-tag,.hljs-literal{color:#aa0d91}.hljs-name{color:#008}.hljs-variable,.hljs-template-variable{color:#660}.hljs-string{color:#c41a16}.hljs-regexp,.hljs-link{color:#080}.hljs-title,.hljs-tag,.hljs-symbol,.hljs-bullet,.hljs-number,.hljs-meta{color:#1c00cf}.hljs-section,.hljs-class .hljs-title,.hljs-type,.hljs-attr,.hljs-built_in,.hljs-builtin-name,.hljs-params{color:#5c2699}.hljs-attribute,.hljs-subst{color:#000}.hljs-formula{background-color:#eee;font-style:italic}.hljs-addition{background-color:#baeeba}.hljs-deletion{background-color:#ffc8bd}.hljs-selector-id,.hljs-selector-class{color:#9b703f}.hljs-doctag,.hljs-strong{font-weight:bold}.hljs-emphasis{font-style:italic}

</style>
