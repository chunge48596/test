<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>"/>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<script src="<%=basePath%>include/jquery/jquery-1.9.1.js" type="text/javascript"></script>
	<script>
		function queryCarInfoByOrderCode(){
			var orderCode = $("#orderCode").val();
			if(orderCode == ""){
				alert("工单号不能为空！！！");
				return;
			}
			window.location.href = "<%=basePath%>carInfo/queryCarInfo.do?orderCode="+orderCode+"&abc=路虎";
		} 
	</script>
	
  </head>
  
  <body>
    嗦嘎，吆西思密达 <br/>
    
    <table align="center">
    	<tr>
    		<td align="center">
    			<a  href="<%=basePath%>carInfo/queryCarInfo.do">点击查询所有车辆信息</a>
    			<br/>
    			<br/>
    			<br/>
    			<a  href="<%=basePath%>industry/queryIndustry.do">点击查询所有行业信息</a>
    			<br/>
    			<br/>
    			<br/>
    		</td>
    	</tr>
    	<tr>
    		<td>请输入工单号：<input id="orderCode" type="text" /></td>
    		<td><button onclick="queryCarInfoByOrderCode()">检索</button></td>
   		</tr>
    </table>
  </body>
</html>
