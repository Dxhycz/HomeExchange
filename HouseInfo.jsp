<%@ page import="main.java.Model.House" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
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
    <th>country</th>
    <th>num_people</th>
    <th>house_type</th>
    <th>description</th>
    <th>constraints</th>

  </tr>
  <%
    List<House> list = (List<House>) request.getAttribute("list");
  %>
  <%
    for(House house:list){
      String houseId = house.getHouseId();
      String adress = house.getAdress();
      String city = house.getCity();
      String country = house.getCountry();
      String num_people =house.getNum_people();
      String house_type= house.getHouse_type();
      String description =house.getDescription();
      String constraints =house.getConstraints();

  %>

  <tr>
    <th><%=houseId%></th>
    <th><%=adress%></th>
    <th><%=city%></th>
    <th><%=country%></th>
    <th><%=num_people%></th>
    <th><%=house_type%></th>
    <th><%=description%></th>
    <th><%=constraints%></th>

  </tr>
  <%
    }
  %>

</table>


<div class="footer">
  <input type = "button" value = "Book now" onclick = "window.location.href = 'book.jsp'">
  <p>Home Exchange</p>
</div>
</body>
</html>
