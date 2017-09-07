<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册——移动网上营业厅</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="register-contain">
		<div id="register-main">
			<img src="image/register.jpg" id="reg-img" />
			<form class="add-customer" action="login.jsp">

				<table>
					<tr>
						<td class="regtitle">账号：</td>
						<td class="reginput"><span><input type="text" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td><span class="regtitle">姓名：</span></td>
						<td><span><input type="text" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td><span class="regtitle">手机号码：</span></td>
						<td><span><input type="text" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td><span class="regtitle">身份证号码：</span></td>
						<td><span><input type="text" /></span></td>
					</tr>
					<tr>
						<td><span class="regtitle">出生日期:</span></td>
						<td><span><input type="text" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td><span class="regtitle">登录密码：</span></td>
						<td><span><input type="password" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td><span class="regtitle">确认密码：</span></td>
						<td><span><input type="password" /></span></td>
						<td></td>
					</tr>
					<tr>
						<td colspan="3"><button type="submit" id="reg-sub">立即注册</button></td>
					</tr>
				</table>

			</form>
		</div>
	</div>
</body>
</html>