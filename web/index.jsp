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
          <a href="">Recommended Houses</a>
        </li>

        <li>
          <a href="login.jsp">Registration&Login</a>
        </li>
        <li>
          <a href="xf.jsp">HouseManage</a>
        </li>
      </ul>
    </div>
  </div>
</div>
<div class="swiper">
  <div id="wrap" class="wrap">
    <ul id="pic">
      <li><img src="resources/img/home01.jpg" alt="" /></li>
      <li><img src="resources/img/home02.jpg" alt="" /></li>
      <li><img src="resources/img/home03.jpg" alt="" /></li>
    </ul>
    <ol id="list">
      <li class="on">1</li>
      <li>2</li>
      <li>3</li>
    </ol>
  </div>
</div>
<div class="title-two">
  <h3>Home Exchange</h3>
</div>
<div class="about">
  <div class="about-img">
    <img src="resources/img/FW.jpg">
  </div>
  <div class="about-text">
    <p>We are a free home exchange website that provides a platform for exchange. It is designed to help people:
    </p>
    <p>Who want to exchange their homes for a different living experience.
    </p>
    <p>Who want to exchange their homes and live in each other's homes to save money and thus travel on exchange.
    </p>
  </div>
</div>
<div class="title-two">
  <h3>Recommended Houses</h3>
</div>
<div class="list">
  <ul>
    <li>
      <a href="">
        <img src="resources/img/tj01.jpeg" alt="">
        <p>Houses01</p>
      </a>
    </li>
    <li>
      <a href="">
        <img src="resources/img/tj1.jpg" alt="">
        <p>Houses02</p>
      </a>
    </li>
    <li>
      <a href="">
        <img src="resources/img/tj2.jpg" alt="">
        <p>Houses03</p>
      </a>
    </li>
    <li>
      <a href="">
        <img src="resources/img/tj3.jpg" alt="">
        <p>Houses04 </p>
      </a>
    </li>
    <li>
      <a href="">
        <img src="resources/img/tj4.jpg" alt="">
        <p>Houses05 </p>
      </a>
    </li>
    <li>
      <a href="">
        <img src="resources/img/tj5.jpg" alt="">
        <p>Houses06</p>
      </a>
    </li>
  </ul>
</div>
<div class="home button" style="text-align:center;">
  <form method="get" action="login.jsp">

    <button type="submit">Join Us for free!</button>

  </form>
</div>

<div class="footer">
  <p>Home Exchange</p>
</div>
</body>
</html>
