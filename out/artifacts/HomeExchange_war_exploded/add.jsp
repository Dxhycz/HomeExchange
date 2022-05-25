<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String ctx  = request.getContextPath();
    pageContext.setAttribute("ctx",ctx);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add House</title>
</head>
<body>
    <div>
        <<form action="${pageContext.request.contextPath}/addServlet" method="get">
        <p>houseId</p>
        <input type="text" placeholder="houseId" name="houseId"/>
            <p>address</p>
            <input type="text" placeholder="address" name="address"/>
            <p>city</p>
            <input type="text" placeholder="city" name="city"/>
            <p>code_postal</p>
            <input type="text" placeholder="code_postal" name="code_postal"/>
            <p>country</p>
            <input type="text" placeholder="country" name="country"/>
            <p>date_start</p>
            <input type="date" placeholder="date_start" name="date_start"/>
            <p>date_fin</p>
            <input type="date" placeholder="date_fin" name="date_fin"/>
            <p>num_people</p>
            <input type="text" placeholder="num_people" name="num_people"/>
            <p>house_type</p>
            <input type="text" placeholder="house_type" name="house_type"/>
            <p>description</p>
            <input type="text" placeholder="description" name="description"/>
            <br/>
            <input type="submit" value="submit" />
        </form>
    </div>
</form>
</body>
</html>
