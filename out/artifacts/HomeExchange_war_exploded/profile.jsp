<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Home Exchange</title>
    <link rel="stylesheet" type="text/css" href="./resources/css/style.css"/>
    <script src="./resources/js/banner.js" type="text/javascript" charset="utf-8"></script>

    <style type="text/css">
        .Content-Main{
            max-width: 500px;
            margin: auto;
            border: none;
            border-radius: 5px;
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            font: 12px "Helvetica Neue", Helvetica, Arial, sans-serif;
            text-shadow: 1px 1px 1px #444;
            color: #D3D3D3;
            background: #555;
        }
        .Content-Main h1{
            padding: 8px 0px 40px 10px;
            display: block;
            border-bottom: 1px solid #444;
        }
        .text1{
            margin-left: 3px;
        }
        .Content-Main label{
            margin: 0px 0px 5px;
            display: block;
        }
        .fileInputContainer{
            height: 99px;
            width: 99px;
            margin: 20px 20px 20px 20px ;
            border: none;
            background: url("img/Example.jpg");
            overflow: hidden;
            position: relative;
        }
        .fileInput{
            height: 106px;
            border: none;
            font-size: 300px;
            opacity: 0;
            filter:alpha(opacity=0);
            cursor: pointer;
            position: absolute;
        }
        .Content-Main label>span{
            width: 20%;
            float: left;
            text-align: right;
            padding-right: 10px;
            margin-top: 10px;
            font-weight: bold;
        }
        .Main-sex{
            padding-right: 13px;
            padding-bottom: 13px;
            font-weight: bold;
            line-height: 4px;
        }
        .Main-sex input[type=checkbox]{
            margin-top:6px;
            vertical-align:middle;
        }
        .Content-Main input[type="text"],.Content-Main input[type="email"],.Content-Main textarea{
            height: 25px;
            width: 70%;
            line-height: 15px;
            padding: 5px 0px 5px 5px;
            margin-bottom: 16px;
            margin-right: 6px;
            margin-top: 2px;
            border: none;
            border-radius:2px;
            -webkit-border-radius:2px;
            -moz-border-radius:2px;
            outline: 0 none;
            background:  #DFDFDF;
            color: #525252;
        }
        .Content-Main textarea{
            height: 100px;
            width: 70%;
            padding: 5px 0px 0px 5px;
        }
        .Content-Main .button{
            padding: 8px 24px 8px 24px;
            margin-bottom: 8px;
            border: none;
            border-radius: 4px;
            -moz-border-radius: 4px;
            -webkit-border-radius: 4px;
            font-weight: bold;
            text-shadow: 1px 1px 1px #FFE477;
            box-shadow: 1px 1px 1px  #3D3D3D;
            -moz-box-shadow: 1px 1px 1px  #3D3D3D;
            -webkit-box-shadow: 1px 1px 1px  #3D3D3D;
            color: #585858;
            background: #f6ff0a;
        }
        .Content-Main .button:hover{
            color:  #333;
            background-color:  #EBEBEB ;
        }
    </style>

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

<div class="PContent-Main">
    <form  action="" method="post" class="form-userInfo">
        <h1>个人信息</h1>
        <span class="Ptext1">请在文本框中完善您的个人信息：</span>
        <p>
        <div class="PfileInputContainer">
            <input class="PfileInput" id="" type="file" name="">
        </div>
        <label>
            <span>Your name:</span>
            <input type="text"  name="name" placeholder="Your Full Name">
        </label>
        <label class="PMain-sex">
            <span>Your sex:</span>
            <input type="checkbox" class="man">男
            <input type="checkbox" class="women">女
        </label>
        <label>
            <span>Your email :</span>
            <input type="email" name="email" placeholder="@.com">
        </label>
        <label>
            <span>Your phone:</span>
            <input type="text" name="phone" placeholder="Please input 11 number">
        </label>
        <label>
            <span>Message:</span>
            <textarea id="message" name="message" placeholder="Your message to us"></textarea>
        </label>
        <label>
            <input type="button" class="button" value="提交">
        </label>
    </form>
</div>

</body>
</html>