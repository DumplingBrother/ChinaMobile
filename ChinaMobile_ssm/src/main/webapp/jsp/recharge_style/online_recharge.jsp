<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css" />

<script>
	function setDiscount(i) {
		var values = i.split(",");
		document.getElementById("discount").value = values[1];
		document.getElementById("T4").value = parseInt(values[1])
				+ parseInt(values[0]);
	}
</script>
</head>



<body>
	<div id="online-contain">

		<div id="card-procedure2"></div>
		<div id="online-main">


			<form method="POST" action="--WEBBOT-SELF--" class="form-style">
				<table class="table-style-online">

					<tr>
						<td class="left-td-style">充值号码：</td>
						<td class="right-td-style"><input type="text" name="T3"
							size="20" class="input-form-style" value="13775357881"></td>
					</tr>
					<tr>
						<td class="left-td-style">充值金额：</td>
						<td class="right-td-style"><input type="radio" name="value"
							value="10,0" onclick="setDiscount(this.value)" />10元 <input
							type="radio" name="value" value="30,1"
							onclick="setDiscount(this.value)">30元 <input type="radio"
							name="value" value="50,3" onclick="setDiscount(this.value)" />50元
							<input type="radio" name="value" value="100,8" checked="checked"
							onclick="setDiscount(this.value)" />100元 <input type="radio"
							name="value" value="200,10" onclick="setDiscount(this.value)">200元
							<input type="radio" name="value" value="500,25"
							onclick="setDiscount(this.value)" />500元 <input type="radio"
							name="value" value="1000,50" onclick="setDiscount(this.value)" />1000元
						</td>
					</tr>
					<tr>
						<td class="left-td-style">充值优惠：</td>
						<td class="right-td-style"><input type="text"
							readOnly="readOnly" name="discount" id="discount" size="20"
							class="input-form-style" value="8"></td>
					</tr>
					<tr>
						<td class="left-td-style">实际到账：</td>
						<td class="right-td-style"><input type="text" name="T4"
							id="T4" size="20" class="input-form-style" value="108"></td>
					</tr>

					<tr class="button-tr-style">
						<td colspan="2" class="left-td-style"><input type="button"
							value="下一步" class="button-sub"
							onclick="location.href='online_comfirm.jsp'" /> <input
							type="reset" value="重置" class="button-res" /></td>
					</tr>

				</table>




			</form>


		</div>

	</div>
</body>
</html>