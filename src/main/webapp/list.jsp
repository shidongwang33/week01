<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
</head>
<body>
<table>
  <tr>
    <th>ID</th>
    <th>英雄</th>
    <th>阵营</th>
    <th>价格</th>
    <th>状态</th>
    <th>上线时间</th>
    <th>图片</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list }" var="h">
  <tr>
    <td>${h.hid }</td>
    <td>${h.hname }</td>
    <td>${h.cname }</td>
    <td>${h.price }</td>
    <td>${h.status==1?"已拥有":"未拥有" }</td>
    <td>${h.uptime }</td>
    <td>${h.picurl }</td>
    <td>操作</td>
  </tr>
  </c:forEach>
  <tr>
    <td colspan="10">
       当前${plist.pageNum }页/${plist.pages } ，共${plist.total }条数据
       <a href="selectFindAll?pageNum=${plist.firstPage }">首页</a>
       <a href="selectFindAll?pageNum=${plist.prePage }">上一页</a>
       <a href="selectFindAll?pageNum=${plist.nextPage }">下一页</a>
       <a href="selectFindAll?pageNum=${plist.lastPage }">尾页</a>
    </td>
  </tr>
</table>

</body>
</html>