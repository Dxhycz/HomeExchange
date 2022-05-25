<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show houses</title>
</head>
<body>
<h1>show houses</h1>
<h2>${deleted}</h2>
<table>
    <tr>
        <td>houseId</td>
        <td>address</td>
        <td>city</td>
        <td>code_postal</td>
        <td>country</td>
        <td>date_start</td>
        <td>date_fin</td>
        <td>num_people</td>
        <td>house_type</td
        <td>description</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.houssId}</td>
            <td>${item.address}</td>
            <td>${item.city}</td>
            <td>${item.code_postal}</td>
            <td>${item.country}</td>
            <td>${item.date_start}</td>
            <td>${item.date_fin}</td>
            <td>${item.num_people}</td>
            <td>${item.house_type}</td>
            <td>${item.description}</td>
            <td><a href="${pageContext.request.contextPath}/deleteServlet?id=${item.id}">delete</a>-----<a href="${pageContext.request.contextPath}/updateServlet?id=${item.id}">edit</a> </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="2" style="text-align: left"><a href="add.jsp">Add house</a> </td>
    </tr>
</table>

</body>
</html>