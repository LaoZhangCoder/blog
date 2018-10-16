<template>
  <div id="app">
    <router-view/>
  </div>
</template>
<script>
export default {
  name: 'App',
 
}
</script>
<script>
$(function(){
	var interval;

	    var width1=$(document).width();
	 	 var height1=$(document).height();
	 	  var width2=width1;
	 	$(window).resize(function(){
	 		$("#Odiv").remove(); 
	 	
	 		 	 
	 	})
	var snowflakeURl = [
	'../static/snowflake1.png',
	'../static/snowflake2.png',
	'../static/snowflake3.png',
	'../static/snowflake4.png',
	'../static/snowflake5.png',
	'../static/snowflake6.png',
    ]
        // 雪花容器
        var $flakeContainer = $('#Odiv');

        // 随机六张图
       
        // 创建一个雪花元素
       
	  function createSnowBox() {
            var url = getImagesName();
            return $('<div class="snowbox" />').css({
                'width': 41,
                'height': 41,
                'position': 'absolute',
                'backgroundSize': 'cover',
                'zIndex': 100000,
                'top': '-41px',
                'backgroundImage': 'url(' + url + ')'
            }).addClass('snowRoll');
        };
		 function getImagesName() {
            return snowflakeURl[[Math.floor(Math.random() * 6)]];
        }
	  
		var interval = setInterval(function() {
            // 运动的轨迹
            var startPositionLeft = Math.random() * width1 - 100,
                startOpacity    = 1,
                endPositionTop  = height1 - 100,
                endPositionLeft = startPositionLeft - 400 + Math.random() * 500,
                duration        = height1* 10 + Math.random() * 5000;

            // 随机透明度，不小于0.5
            var randomStart = Math.random();
            randomStart = randomStart < 0.5 ? startOpacity : randomStart;

            // 创建一个雪花
            var $flake = createSnowBox();

            // 设计起点位置
            $flake.css({
                left: startPositionLeft,
                opacity : randomStart
            });

            // 加入到容器
            $flakeContainer.append($flake);

            // 开始执行动画
            $flake.animate({
                top: endPositionTop,
                left: endPositionLeft,
                opacity: 0.7,
				 
            },10000,'linear',function() {
                $(this).remove() //结束后删除
            });
            
        }, 3000)
		
	
	})
	</script>
<style>
@import "./assets/common/common.css";
.hljs{display:block;overflow-x:auto;padding:0.5em;background:#fff;color:black}
.hljs-comment,.hljs-quote{color:#006a00}.hljs-keyword,.hljs-selector-tag,.hljs-literal{color:#aa0d91}.hljs-name{color:#008}.hljs-variable,.hljs-template-variable{color:#660}.hljs-string{color:#c41a16}.hljs-regexp,.hljs-link{color:#080}.hljs-title,.hljs-tag,.hljs-symbol,.hljs-bullet,.hljs-number,.hljs-meta{color:#1c00cf}.hljs-section,.hljs-class .hljs-title,.hljs-type,.hljs-attr,.hljs-built_in,.hljs-builtin-name,.hljs-params{color:#5c2699}.hljs-attribute,.hljs-subst{color:#000}.hljs-formula{background-color:#eee;font-style:italic}.hljs-addition{background-color:#baeeba}.hljs-deletion{background-color:#ffc8bd}.hljs-selector-id,.hljs-selector-class{color:#9b703f}.hljs-doctag,.hljs-strong{font-weight:bold}.hljs-emphasis{font-style:italic}
</style>
