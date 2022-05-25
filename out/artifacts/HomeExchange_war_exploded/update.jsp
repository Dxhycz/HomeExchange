<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户编辑</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateServlet" method="post" style="align-items: center">
    <table border="1" >
        <tr>
            <td colspan="2"><h1>Edit house</h1></td>
        </tr>
        <tr>
            <td>address</td>
            <td><input type="text" name="address" value="${house.address}" /></td>
        </tr>
        <tr>
            <td>city</td>
            <td><input type="text" name="city" value="${house.city}" /></td>
        </tr>
        <tr>
            <td>code_postal</td>
            <td><input type="text" name="code_postal" value="${house.code_postal}" /></td>
        </tr>
        <tr>
            <td>country</td>
            <td><input type="text" name="country" value="${house.country}" /></td>
        </tr>
        <tr>
            <td>code_postal</td>
            <td><input type="text" name="code_postal" value="${house.code_postal}" /></td>
        </tr>
        <tr>
            <td>date_start</td>
            <td><input type="text" name="date_start" value="${house.date_start}" /></td>
        </tr>
        <tr>
            <td>date_fin</td>
            <td><input type="text" name="date_fin" value="${house.date_fin}" /></td>
        </tr>
        <tr>
            <td>num_people</td>
            <td><input type="text" name="num_people" value="${house.num_people}" /></td>
        </tr>
        <tr>
            <td>house_type</td>
            <td><input type="text" name="house_type" value="${house.house_type}" /></td>
        </tr>
        <tr>
            <td>description</td>
            <td><input type="text" name="description" value="${house.description}" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="submit"/>
                <input type="button" value="Back" onclick="history.go(-1)"/>
            </td>

        </tr>
    </table>

</form>
</body>
</html>
