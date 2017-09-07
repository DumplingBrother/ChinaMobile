<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>移动营业厅</title>
<link href="../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="contain">
		<div id="head">
			<img src="../image/logo.gif" />
		</div>
		<div id="main">
			<ul class="main-recommend-list">
				<li><a href="">在线充值</a>
					<p>冲100送5，冲200送12，多冲多送</p></li>
				<li><a href="">选号购机</a>
					<p>海量靓号免费选，在线购机优惠多</p></li>
				<li><a href="">优惠活动</a>
					<p>话费免费领，登录有惊喜！缤纷活动尽在促销 优惠专区</p></li>


				<li><a href=""> 查询办理</a>
					<p>千余项业务查询办理，让您轻松掌握、自在选择！</p></li>
			</ul>
			<div id="main-loginBox">

				<ul id="main-loginBox-tab">
					<li><span class="current" id="current">用户登录</span></li>
				</ul>




				<form class="main-loginBox-center" action="index.html">

					<div class="tusername">
						<span>账户</span> <input type="text" name="username" />&nbsp;
					</div>
					<div class="tpassword">
						<span>密码</span> <input type="password" name="pwd" />
					</div>
					<div class="submitbutt">
						<button type="submit">
							<font color="#ffffff" size="4">登录</font>
						</button>
						<a href="register.html"> <span id="register"
							style="display: ''; font-size: 17px">立即注册！</span>

						</a>
					</div>
				</form>
			</div>
		</div>


	</div>
</body>
</html>