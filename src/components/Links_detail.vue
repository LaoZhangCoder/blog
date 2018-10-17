<template>
  <div style="background:#f7f7f7">
<article class="main-content post-page" >
    <div id="post-content" class="post-content">
        <h3>友情链接</h3>
        <ul class="flinks">
        <li v-for="(link,index) in links">🔒<a :href="link.url" target="_blank" :key="index">{{link.name}}</a></li>
        </ul>
        <h3>链接须知</h3>
        <blockquote>
            <ul style="color:black">
                <li><p>请确定贵站可以稳定运营</p></li>
                <li><p>原创博客优先,技术类博客优先,设计,视觉类博客优先</p></li>        
            </ul>
        </blockquote>
        <p style="color:black">备注：默认申请友情链接均为内页（当前页面）</p>
        <h3 style="color:black">基本信息</h3>
        <pre><code class="lang-md hljs markdown">
                网站名称：神的孩子
                网站地址：www.shendehaizi.com</code>
              </pre>
        <p style="color:black">可通过留言来申请友链</p>
        <p style="color:black">暂时先这样，同时欢迎互换友链，这个页面留言即可。</p>
        <p style="color:black">如果发现本网站的bug可以留言告之谢谢</p>
      </div>
</article>
</div>
</template>
<script>
export default {
  name: 'Links_detail',
  props: {
    links: Array
  }
}
</script>

<style scoped>
</style>
