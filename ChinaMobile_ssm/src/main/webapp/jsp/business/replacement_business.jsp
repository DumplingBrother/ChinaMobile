<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
<link href="../css/reset.css" rel="stylesheet" type="text/css" />
<title>无标题文档</title>

<script>
	/**		
		关闭或者开通业务
		@param bussinessId 业务编号 
		@param target 事件源对象
	 */
	function switchStatus(bussinessId, target) {
		//获得业务的当前状态（存在hidden中）
		var status = target.parentNode.childNodes[0].value;

		if (status == 1) {

			target.value = "开通";
			//切换业务状态
			target.parentNode.childNodes[0].value = 0;

		} else {

			target.value = "关闭";
			target.parentNode.childNodes[0].value = 1;
		}

	}
</script>
</head>

<body id="changebus-body">
	<div id="changebus-contain">
		<div id="changebus-main">

			<div class="ywbl"></div>

			<table class="table-infor-record-style2" width="700px">
				<tr>
					<th width="20%">业务名称</th>
					<th width="10%">资费</th>

					<th width="25%">启用时间</th>
					<th width="25%">终止时间</th>
					<th width="20%">操作</th>
				</tr>
				<tr>
					<td>来电显示</td>
					<td>基础业务</td>

					<td id="st">2009-12-4</td>
					<td id="ed">--</td>
					<td></td>
				</tr>
				<tr>
					<td>短信功能</td>
					<td>基础业务</td>

					<td id="st">2009-12-4</td>
					<td id="ed">--</td>
					<td></td>
				</tr>

				<tr>
					<td>国内数据流量60M</td>
					<td>套餐内业务</td>

					<td id="st">2014-1-1</td>
					<td id="ed">--</td>
					<td></td>
				</tr>
				<tr>
					<td>国内通话时间50分钟</td>
					<td>套餐内业务</td>

					<td id="st">2014-1-1</td>
					<td id="ed">--</td>
					<td></td>
				</tr>
				<tr>
					<td>彩铃</td>
					<td>5元</td>

					<td id="st">2015-2-13</td>
					<td id="ed">--</td>
					<td><input type="hidden" id="status" value="1" /><input
						type="button" id="open" class="blywkt" value="关闭"
						onclick="switchStatus(1001,this)" /></td>
				</tr>



				<tr>
					<td>短信100条</td>
					<td>6元</td>
					<td id='st2'>2014-3-1</td>
					<td id='ed2'>--</td>
					<td><input type="hidden" id="status" value="1" /><input
						type="button" id="open" class="blywkt" value="关闭"
						onclick="switchStatus(1001,this)" /></td>
				</tr>


				<tr>
					<td>语音留言</td>
					<td>3元</td>
					<td id='st2'>2014-2-1</td>
					<td id='ed2'>--</td>
					<td><input type="hidden" id="status" value="1" /><input
						type="button" id="open" class="blywkt" value="关闭"
						onclick="switchStatus(1007,this)" /></td>
				</tr>

				<tr>
					<td>5元包30MB国内流量</td>
					<td>5元</td>
					<td id='st2'>2016-2-1</td>
					<td id='ed2'>2016-2-29</td>
					<td></td>
				</tr>
				<tr>
					<td>10元包70MB国内流量</td>
					<td>5元</td>
					<td id='st2'>2016-2-16</td>
					<td id='ed2'>2016-2-29</td>
					<td></td>
				</tr>
				<tr>
					<td>亲情号码</td>
					<td>1元</td>
					<td id='st2'></td>
					<td id='ed2'></td>
					<td><input type="hidden" id="status" value="0" /><input
						type="button" id="open" class="blywkt" value="开通"
						onclick="switchStatus(1006,this)" /></td>
				</tr>
				<tr>
					<td>20元包150MB国内流量</td>
					<td>20元</td>
					<td id='st2'></td>
					<td id='ed2'></td>
					<td><input type="hidden" id="status" value="0" /><input
						type="button" id="open" class="blywkt" value="开通"
						onclick="switchStatus(1006,this)" /></td>
				</tr>

			</table>

			<div class="tcbl"></div>

			<table class="table-infor-record-style2" width="700px">
				<tr>
					<th>套餐名称</th>
					<th>套餐资费</th>
					<th>套餐详情</th>


					<th>操作</th>
				</tr>
				<tr>
					<td>神州行18元套餐</td>
					<td>18元</td>
					<td>通话50分钟，流量50M</td>
					<td><input type="submit" id='dqtc' name="meal" class="dqtc"
						value="当前套餐" /></td>
				</tr>


				<tr>
					<td>动感地带20元套餐</td>
					<td>20元</td>
					<td>短信100条，流量50M</td>
					<td><input type="submit" id='gb' name="meal" class="dqtc"
						value="开通" /></td>
				</tr>

				<tr>
					<td>神州行28元套餐</td>
					<td>28元</td>
					<td>通话80分钟，流量100M</td>
					<td><input type="submit" id='gb' name="meal" class="dqtc"
						value="开通" /></td>
				</tr>

			</table>
			</form>
		</div>
	</div>

</body>
</html>