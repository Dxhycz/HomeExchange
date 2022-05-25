<%@ page import="main.java.Model.House" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx  = request.getContextPath();
    pageContext.setAttribute("ctx",ctx);
%>
<html>
<head>
  <meta charset="utf-8" />
  <title>Home Exchange</title>
  <link rel="stylesheet" type="text/css" href="./resources/css/style.css"/>
  <script src="./resources/js/banner.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="header">
  <div class="header-f">
    <title>Home Exchange</title>
    <div class="nav">
      <ul>
        <li>
          <a style="color: #FF0000;" href="index.jsp">Home</a>
        </li>
        <li>
          <a href="about.jsp">About</a>
        </li>
        <li>
          <a href="recommend.jsp">Recommended Houses</a>
        </li>

        <li>
          <a href="login.jsp">Registration&Login</a>
        </li>

        <li>
          <a href="book.jsp">Booking</a>
        </li>
      </ul>
    </div>
  </div>
</div>
<h1 align="center">House List</h1>
<div>
    <form action="${ctx}/sendServlet?action=addHouse" method="post">
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
        <input type="submit" value="submit application" />
    </form>
</div>

<a href="index.jsp">Quit applying</a>
<div class="footer">
    <p>Home Exchange</p>
</div>
</body>
</html>
