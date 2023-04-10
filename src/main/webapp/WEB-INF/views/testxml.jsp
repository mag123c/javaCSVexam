<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
<link rel="stylesheet" href="/resources/css/testxml.css">
</head>
<body>
<form name="create_data" action="create_data" method="post">
<table>
	<thead>
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>나이</td>
			<td>이메일</td>
		</tr>
	</thead>
	<tbody id="xmlData">
		<c:forEach var="list" items="${list}">
		<tr>
			<td class="custId">${list.custId}</td>
			<td class="custName">${list.custName}</td>
			<td class="custAge">${list.custAge}</td>
			<td class="custEmail">${list.custEmail}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</form>
<input type="button" value="추가하기" id="addBtn">
<input type="button" value="등록하기" id="createBtn">
<script src = "/resources/js/testxml.js"></script>
</body>
</html>