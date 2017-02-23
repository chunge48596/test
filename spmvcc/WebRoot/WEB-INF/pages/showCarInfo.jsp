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
  </head>
  
  <body>
   	 <table align="center"  border="1" style="margin-top:100px">
   	 	<tr>
   	 		<th>工单号</th>
   	 		<th>车辆品牌</th>
   	 		<th>车牌号</th>
   	 		<th>里程数</th>
   	 		<th>操作</th>
   	 	</tr>
   	 	<c:forEach items="${listCarInfo}" var="list" varStatus="status">
   	 		<tr>
   	 			<td>${list.orderCode}</td>
   	 			<td>${list.carBrand}</td>
   	 			<td>${list.carNumber}</td>
   	 			<td>${list.mileage}</td>
   	 			<td>
   	 				<a href="carInfo/editCarInfoById.do?id=${list.id}">修改</a>
   	 				<a href="carInfo/delCarInfoById.do?id=${list.id}">删除</a>
 				</td>
   	 		</tr>
   	 	</c:forEach>
   	 </table>
  </body>
</html>
