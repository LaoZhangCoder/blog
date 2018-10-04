// JavaScript Document
$(function(){
	var interval;

	    var width1=$(document).width();
	 	 var height1=$(document).height();
	 	  var width2=width1;
	 	$(window).resize(function(){
	 		$("#Odiv").children().remove(); 
	 		 clearInterval(interval);
	 	      width1=$(document).width();
	 		 	height1=$(document).height();
	 		 	 if(width2>width1){
	 		 		 width2=width1;
	 		 		
	 	           	var interval=setInterval(function() {
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
	 		            
	 		        }, 2000)
	 		 	 }else{
	 		 		 width2=width1;
	 		 		
	 	           	var interval=setInterval(function() {
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
	 		            
	 		        }, 2000)
	 		 		 
	 		 	 }
	 		 	 
	 	})
	var snowflakeURl = [
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png',
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png',
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png',
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png',
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png',
	'C:/自学第一次/yourweb/WebContent/imgs/snowflake/snowflake1.png'
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
            
        }, 2000)
		
	
	})
	