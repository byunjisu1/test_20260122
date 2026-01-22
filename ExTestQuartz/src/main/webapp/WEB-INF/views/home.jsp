<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
	<script>
		function btnStart() {
			location.href = "start";
		}
		function btnEnd() {
			location.href = "end";
		}
	</script>
</head>
<body>
	<button onclick="btnStart();">스케줄러 시작</button>
	<button onclick="btnEnd();">스케줄러 종료</button>
</body>
</html>
