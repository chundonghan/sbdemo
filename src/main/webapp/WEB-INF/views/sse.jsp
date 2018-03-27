<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSE</title>
<script type="text/javascript" src="assets/jquery-2.2.3.min.js"></script>
<script type="text/javascript">
$(function(){
	
})
	if(!!window.EventSource){
		var source = new EventSource('push');
		s = '';
		source.addEventListener('message',function(e){
			s+=e.data+"<br>";
			$("div#pushMsg").html(s);
		});
		source.addEventListener('open',function(e){
			console.log("连接打开");
		},false);
		source.addEventListener('error',function(e){
			if(e.readyState == EventSource.CLOSED){
				console.log("连接关闭");
			}else{
				console.log(e.readyState);
			}
		},false);
	}else{
		console.log("the browser is not supported")
	}
	function send(){
		var inputText = $("textarea#inputText").val();
		$.ajax({
	        url: 'sendMsg.do',
	        type: 'GET',
	        data: {
	        	inputText:inputText
	        },
	        success: function(data) {
	        	
	        }
	    });
	}
</script>
</head>
<body>
	<div id="pushMsg">
	</div>
	
	<div id="inputMsg">
		<textarea rows="4"  style="width:100%" id="inputText">
		</textarea>
		<br>
		<input type="button" id="send" value="发送" onclick="send();">
	</div>
</body>
</html>