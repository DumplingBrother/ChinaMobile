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
	/**
	 	选择城市，选中某个城市城市颜色变为背景颜色变为
		红色，边框变为黄色
	 */
	function chooseCity(ii) {
		//ii代表选中的li对象
		var temp = document.getElementById('myul');
		var lis = temp.getElementsByTagName('li'); //获得ul下面所有的li对象

		for (var i = 0; i < lis.length; i++) {

			if (lis[i].getAttribute("value") == ii.getAttribute("value")) {
				//遍历li对象，循环对比li对象value值是否和传入ii对象值是否一致
				lis[i].style.background = "#FFDDDD";
				lis[i].style.borderColor = "#FFCC00";
			} else {

				lis[i].style.background = "#E1E1E1";
				lis[i].style.borderColor = "#BEBEBE";

			}

		}

	}

	function query_telfee(ii, ul_id) {

		temp = document.getElementById(ul_id);
		lis = temp.getElementsByTagName('li');

		for (var i = 0; i < lis.length; i++) {

			if (lis[i].getAttribute("value") == ii.getAttribute("value")) {
				lis[i].style.background = "#03AFEB";
				lis[i].style.color = "white";

			} else {
				lis[i].style.background = "white";
				lis[i].style.color = "#666666";

			}

		}

	}

	var temp = document.getElementById('myul');
	var lis = temp.getElementsByTagName('li');
	var add = lis[i].getAttribute("add");

	temp = document.getElementById(ul_id);
	lis = temp.getElementsByTagName('li');
	var myulfee = lis[i].getAttribute("myulfee");
	var dnseg = lis[i].getAttribute("dnseg");
	var type = lis[i].getAttribute("type");
</script>
</head>

<body>

	<div id="select_number_contain">
		<div id="select_number_main_main">
			<ul class="loc" id="myul">
				<li onclick="chooseCity(this)" value="南京">南京</li>
				<li onclick="chooseCity(this)" value="镇江">镇江</li>
				<li onclick="chooseCity(this)" value="常州">常州</li>
				<li onclick="chooseCity(this)" value="无锡">无锡</li>
				<li onclick="chooseCity(this)" value="苏州">苏州</li>
				<li onclick="chooseCity(this)" value="南通">南通</li>
				<li onclick="chooseCity(this)" value="泰州">泰州</li>
				<li onclick="chooseCity(this)" value="扬州">扬州</li>
				<li onclick="chooseCity(this)" value="宿迁">宿迁</li>
				<li onclick="chooseCity(this)" value="淮安">淮安</li>
				<li onclick="chooseCity(this)" value="徐州">徐州</li>
				<li onclick="chooseCity(this)" value="连云港">连云港</li>
				<li onclick="chooseCity(this)" value="盐城">盐城</li>
			</ul>
			<div class="clear"></div>
			<ul class="fee" id="my-ul-fee">
				<li><span class="numb-form">预存话费</span></li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="" class="renyi">任意</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="50">50元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="100">100元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="200">200元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="300">300元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="400">400元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="500">500元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="600">600元</li>
				<li onclick="query_telfee(this,'my-ul-fee')" value="800">800元</li>
			</ul>
			<div class="clear"></div>
			<ul id="dnseg">
				<li><span class="numb-form">号段</span></li>
				<li class="renyi" onclick="query_telfee(this,'dnseg')" value="">任意</li>
				<li onclick="query_telfee(this,'dnseg')" value="13X">13X</li>
				<li onclick="query_telfee(this,'dnseg')" value="15X">15X</li>
				<li onclick="query_telfee(this,'dnseg')" value="18X">18X</li>
			</ul>
			<div class="clear"></div>
			<ul id="type">
				<li><span class="numb-form">手机卡类别</span></li>
				<li class="renyi" onclick="query_telfee(this,'type')" value="">任意</li>
				<li onclick="query_telfee(this,'type')" value="4G">4G</li>
				<li onclick="query_telfee(this,'type')" value="3G">3G</li>
				<li onclick="query_telfee(this,'type')" value="GSM">GSM</li>
			</ul>
			<div class="clear"></div>
			<div id="search">
				<span class="numb-form">指定数字</span> <input type="text"
					id="inputstyle" />
				<button type="button" id="sousuo"></button>
			</div>
			<div class="clear"></div>
			<table width="700" class="table-infor-record-style">
				<tr>
					<th>号码</th>
					<th>号码归属地</th>
					<th>预存话费</th>
					<th>操作</th>
				</tr>

				<tr>
					<td>13775357881</td>
					<td>江苏南通</td>
					<td>100元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>
				<tr>
					<td>18851317743</td>
					<td>江苏南通</td>
					<td>200元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>
				<tr>
					<td>13851912747</td>
					<td>江苏南京</td>
					<td>300元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>
				<tr>
					<td>13751212710</td>
					<td>江苏徐州</td>
					<td>200元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>
				<tr>
					<td>13751712781</td>
					<td>江苏泰州</td>
					<td>200元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>
				<tr>
					<td>13751788888</td>
					<td>江苏苏州</td>
					<td>800元</td>
					<td>
						<div align="center">
							<input type="button" class="buy" value="立即购买"
								onclick="location.href='select_number_bysetmeal.jsp' " />
						</div>
					</td>
				</tr>

			</table>
			<div id="clear"></div>
			<table class="table-infor-record-style" id="page">
				<tr>
					<th width="113">第1页/共8页</th>
					<td>首页 上一页 下一页 尾页 &nbsp;&nbsp;<input type="text"
						class="input-page-style">&nbsp; <input type="submit"
						value="go" /></td>
				</tr>
			</table>


		</div>
	</div>


	</div>
</body>
</html>