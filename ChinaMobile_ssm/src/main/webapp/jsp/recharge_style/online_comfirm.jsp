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



<body>
	<div id="online-contain">
		<div id="online-head"></div>
		<div class="clear"></div>
		<div id="card-procedure3"></div>
		<div id="online-main">


			<form method="POST" action="--WEBBOT-SELF--" class="form-style">
				<table class="table-style">
					<tr>
						<td class="left-td-style">充值方式：</td>
						<td class="right-td-style">在线充值</td>
					</tr>
					<tr>
						<td class="left-td-style">客户姓名：</td>
						<td class="right-td-style">张三</td>
					</tr>
					<tr>
						<td class="left-td-style">充值号码：</td>
						<td class="right-td-style"><span id="numb">13775357881</span><span>请认真核对</span></td>
					</tr>
					<tr>
						<td class="left-td-style">充值金额：</td>
						<td class="right-td-style">100元</td>
					</tr>
					<tr>
						<td class="left-td-style">充值优惠：</td>
						<td class="right-td-style"><span id="cheap">冲100送5元</span></td>
					</tr>

					<tr>
						<td class="left-td-style">实际到账：</td>
						<td class="right-td-style"><span id="acc">105</span>元</td>
					</tr>


					<tr class="button-tr-style">

						<td colspan="2" class="left-td-style"><input type="button"
							value="支付" class="button-sub"
							onclick="location.href='Account.jsp'" /> <input type="reset"
							value="上一步" class="button-res"
							onclick="location.href='online_recharge.jsp'" /></td>

					</tr>

				</table>





			</form>



		</div>

	</div>
</body>
</html>