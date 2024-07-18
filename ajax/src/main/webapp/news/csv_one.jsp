<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- Ajax 엔진을 사용하여 [csv_two.jsp] 문서를 요청해 실행결과를 응답받아 태그내용을 변경하여
    응답하는 JSP 문서 --%>
    <%-- CSV (Comma Separated Values) : 콤마 를 사용해 값을 구분하여 제공하는 비구조적인 데이타 표현방식 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#newsList {
	width: 50%;
	margin: 0 auto;
}
#newsHeader {
	padding: 5px;
	text-align: center;
	font-size: x-large;;
	border: 2px solid black;
}

#newsContents {
	padding: 5px;
	font-size: medium;
	border: 2px dashed black;
	display: none;
}


</style>
</head>
<body>
	<h1>헤드라인 뉴스</h1>
	<hr>
	<div id="newsList">
		<div id="newsHeader">오늘의 뉴스</div>
		<div id="newsContents"></div>
		
		<script type="text/javascript">
		document.getElementById("newsList").onmouseover=function(){
			var xhr=new XMLHttpRequest();
			
			xhr.onreadystatechange=function(){
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						//alert(xhr.responseText);	
						
						//XMLHttpRequest 객체에 저장된 응답결과(CSV) 제공받아 변수 저장
						var csv=xhr.responseText;
						
						//응답결과(CSV) 행단위로 분리하여 Array 객체의 요소 저장
						var newsList=csv.split("*");
						//alert(newsList.length);
						
						var html="<ol>";
						for(i=0;i<newsList.length;i++){
							//행을 열단위로 분리하여 Array 객체 요소값 저장
							var news=newsList[i].split("|");
							
							var title=news[0].trim();
							
							html+="<li>"+title+"["+publisher+"]</li>";
						}
						html+="<ol>";
					}else {
						alert(xhr.status);
					}
				}
			}
			xhr.open("get","csv_two.jsp");
			xhr.send(null);
		}
		document.getElementById("newsList").onmouseout=function(){
			document.getElementById("newsContents").style="display: none;";
		}
		
		</script>
	</div>
</body>
</html>