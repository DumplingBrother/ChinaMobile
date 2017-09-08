<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<!-- <link rel="stylesheet" href="Style/default.css" type="text/css" /> -->
<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css" />

</head>


<body>
	<div id="head-contain">
		<div id="head-head">
			<marquee>
				欢迎来到中国移动! <span> 张三!13775357881!您的账户余额为：100</span>
				<sapn class="loginout"> <a href="login.jsp"
					target="_blank">[退出]</a> </span>
			</marquee>
		</div>

		<div id="head-main">

			<img class="logo" src="<%=request.getContextPath()%>/image/logo.gif" /> <img
				src="<%=request.getContextPath()%>/image/js_logo.gif" height="89" class="js-log" /> <img
				id="image-right" align="right" src="<%=request.getContextPath()%>/image/yd_right_logo.gif" />

		</div>
	</div>

</body>
</html>