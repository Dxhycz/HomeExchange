<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <a href="recommend.jsp">Recommended Houses</a>
                </li>
                <li>
                    <a href="profile.jsp">Personal Spaces</a>
                </li>
                <li>
                    <a href="xf.jsp">Home Management</a>
                </li>

                <li>
                    <a href="login.jsp">Registration</a>
                </li>
                <li>
                    <a href="login.jsp">Log out</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="title-two">
    <h3>Houses Management</h3>
</div>
<h2>${deleted}</h2>
<div class="list">
    <ul>
        <li>
            <a href="">
                <img src="resources/img/tj01.jpeg" alt="">
                <p>MyHouses01</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/tj1.jpg" alt="">
                <p>MyHouses02</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/tj2.jpg" alt="">
                <p>MyHouses03</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/tj3.jpg" alt="">
                <p>MyHouses04 </p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/tj4.jpg" alt="">
                <p>MyHouses05 </p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/tj5.jpg" alt="">
                <p>MyHouses06</p>
            </a>
        </li>
    </ul>
</div>
<table>
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