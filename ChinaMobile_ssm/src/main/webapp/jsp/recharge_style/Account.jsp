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

<body id="new-operator-body">
	<div id="new-operator-contain">
		<div class="zhzf"></div>
		<div id="new-operator-main">

			<form method="POST" action="" class="form-style">
				<table class="table-style">
					<tr>
						<td class="left-td-style">银行卡号：</td>
						<td class="right-td-style"><input type="text" name="T2"
							size="20" class="input-form-style"></td>
					</tr>
					<tr>
						<td class="left-td-style">密码：</td>
						<td class="right-td-style"><input type="password" name="T3"
							size="20" class="input-form-style"></td>
					</tr>

					<tr class="button-tr-style">
						<td colspan="2" class="right-td-style"><input type="submit"
							value="提交" name="B1" class="button-sub" /> <input type="reset"
							value="重置" name="B1" class="button-res" /></td>
					</tr>
				</table>

			</form>






		</div>

	</div>

</body>
</html>