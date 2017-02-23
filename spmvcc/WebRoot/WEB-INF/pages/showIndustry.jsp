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
	<script type="text/javascript">
		function newIndustry(){
			$("#newIndustry").show();
		}
	</script>
  </head>
  
  <body>
  	<form action="industry/saveIndustry.do" method="post" >
  		<div align="center"><a onclick="newIndustry();">新增行业</a></div>
  		<table id="newIndustry" align="center"  border="1" style="display:none">
  			<tr>
  				<td>类别名称:</td>
  				<td>
  					<input type="text" name="categoryName" />
  				</td>
  			</tr>	
  			<tr>
  				<td>类别说明:</td>
  				<td>
  					<input type="text" name="categoryExplain" />
  				</td>
  			</tr>
  			<tr>
  				<td colspan="2" align="center"><button type="submit">提交</button></td>
  			</tr>		
  		</table>
  	</form>	
   	
   	
   	<table align="center"  border="1" style="margin-top:100px">
   	 	<tr>
   	 		<th width="20%">类别名称</th>
   	 		<th width="20%">类别说明</th>
   	 		<th >操作</th>
   	 	</tr>
   	 	<c:forEach items="${listIndustry}" var="list" varStatus="status">
   	 		<tr>
   	 			<td>${list.categoryName}</td>
   	 			<td>${list.categoryExplain}</td>
   	 			<td>
   	 				<a href="industry/editCarInfoById.do?id=${list.id}">修改</a>
   	 				<a href="industry/delIndustry.do?id=${list.id}">删除</a>
 				</td>
   	 		</tr>
   	 	</c:forEach>
   	 </table>
  </body>
</html>
