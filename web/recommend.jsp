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
                    <a href="about.jsp">About</a>
                </li>
                <li>
                    <a href="recommend.jsp">Recommended Houses</a>
                </li>

                <li>
                    <a href="login.jsp">Registration</a>
                </li>
                <li>
                    <a href="login.jsp">Log in</a>
                </li>
                <li>
                    <a href="book.jsp">Booking</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="title-two">
    <h3>Most Popular Houses</h3>
</div>
<h2>${deleted}</h2>
<div class="list">
    <ul>
        <li>
            <a href="">
                <img src="resources/img/top6.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 01</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/top1.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 02</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/top2.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 03</p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/top3.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 04 </p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/top4.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 05 </p>
            </a>
        </li>
        <li>
            <a href="">
                <img src="resources/img/top5.jpg" alt="" href="HouseInfo.jsp">
                <p>Top House 06</p>
            </a>
        </li>
    </ul>
</div>


<div class="footer">
    <p>Home Exchange</p>
</div>
</body>
</html>