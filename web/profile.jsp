<%@ page import="main.java.Model.House" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">House List</h1>
<table align="center" border="1px" width="50%">
    <tr>
        <th>houseId</th>
        <th>adress</th>
        <th>city</th>
        <th>code_postal</th>
        <th>country</th>
        <th>date_start</th>
        <th>date_fin</th>
        <th>num_people</th>
        <th>house_type</th>
        <th>houseId</th>
        <th>description</th>
    </tr>
    <%
        List<House> list = (List<House>) request.getAttribute("list");
    %>
    <%
        for(House house:list){
            String houseId = house.getHouseId();
            String address = house.getAdress();
            String city = house.getCity();
            String code_postal = house.getCode_postal();
            String country = house.getCountry();
            String date_start = house.getDate_start();
            String date_fin = house.getDate_fin();
            String num_people =house.getNum_people();
            String house_type= house.getHouse_type();
            String description =house.getDescription();

    %>

    <tr>
        <th><%=houseId%></th>
        <th><%=address%></th>
        <th><%=city%></th>
        <th><%=code_postal%></th>
        <th><%=country%></th>
        <th><%=date_start%></th>
        <th><%=date_fin%></th>
        <th><%=num_people%></th>
        <th><%=house_type%></th>
        <th><%=description%></th>
        <th>
            <a href="update.jsp">modify</a>
            <a href="add.jsp">Add house</a>
        </th>
    </tr>
    <%
        }
    %>


</table>


</body>
</html>
