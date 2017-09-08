<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>移动网上营业厅首页</title>
</head>

<frameset rows="135,*" cols="*" framespacing="0"  frameborder="no" border="0" id="framset"  >
  
  <frame src="view/header.jsp" name="topFrame" scrolling="no" id="topFrame" title="topFrame" /> 
  
  <frameset cols="220,*" frameborder="no" border="0" framespacing="0" id="main-frameset" >
    <frame src="view/menu.jsp" name="leftFrame" scrolling="no"  noresize="false" id="leftFrame" title="leftFrame" >
    <frame src="view/content.jsp" name="mainFrame" id="mainFrame" title="mainFrame"  style="border:1px #1A76B7 solid;" noresize="false" />
</frameset> </frameset>
<noframes></noframes>

</html>