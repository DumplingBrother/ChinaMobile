<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />
</head>

<body id="card-body">
	<div id="card-contain">
		<div id="card-main">
			<div id="card-procedure"></div>

			<form method="POST" action="--WEBBOT-SELF--" class="form-style">
				<table class="table-style">
					<tr>
						<td class="left-td-style">手机号码：</td>
						<td class="right-td-style"><input type="text" name="T3"
							size="20" class="input-form-style" value="13775357881"></td>

					</tr>
					<tr>
						<td class="left-td-style">充值卡卡号：</td>
						<td class="right-td-style"><input type="text" name="T3"
							size="20" class="input-form-style"></td>
					</tr>
					<tr>
						<td class="left-td-style">充值卡密码：</td>
						<td class="right-td-style"><input type="password" name="T4"
							size="20" class="input-form-style"></td>
					</tr>
					<tr class="button-tr-style">
						<td colspan="2" class="left-td-style"><input type="button"
							value="提交" class="button-sub" /> <input type="reset" value="重置"
							class="button-res" /></td>
					</tr>
				</table>




			</form>




		</div>

	</div>
</body>
</html>