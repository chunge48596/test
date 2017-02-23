<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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
	function saveCarInfo(){
		$("#carInfoForm").summit();
	} 
  </script>
  	
  </head>
  
  <body>
  <form id="carInfoForm" action="carInfo/saveCarInfo.do" method="post">
  	 
   	 <table align="center"  border="1" style="margin-top:100px">
   	 	<tr>
   	 		<td align="right">工单号</td>
   	 		<td>${carInfo.orderCode}</td>
   	 	</tr>
   	 	<tr>
   	 		<td align="right">车辆品牌</td>
   	 		<td><input type="text" name="carInfo.carBrand" value="${carInfo.carBrand}" /></td>
   	 	</tr><tr>
   	 		<td align="right">车牌号</td>
   	 		<td><input type="text" name="carInfo.carNumber" value="${carInfo.carNumber}" /></td>
   	 	</tr><tr>
   	 		<td align="right">里程数</td>
   	 		<td><input type="text" name="carInfo.mileage" value="${carInfo.mileage}" /></td>
   	 	</tr>
 		<tr>
			<td align="center" colspan="2">
				<a onclick="saveCarInfo()">保存</a>
			</td>
 		</tr>
   	 </table>
  </form>
  </body>
</html>
