<<html>
<head>
    <meta charset="utf-8">
    <title>login</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            background: #f3f3f3;
        }
        .control{
            width: 340px;
            background: white;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            border-radius: 5px;
        }
        .item{
            width: 340px;
            height: 60px;
            background: #eeeeee;
        }
        .item div{
            width: 170px;
            height: 60px;
            display: inline-block;
            color: black;
            font-size: 18px;
            text-align: center;
            line-height: 60px;
            cursor: pointer;
        }
        .content{
            width: 100%;
        }
        .content div{
            margin: 20px 30px;
            display: none;
            text-align: left;
        }
        p{
            color: #4a4a4a;
            margin-top: 30px;
            margin-bottom: 6px;
            font-size: 15px;
        }
        .content input[type="text"]{
            width: 100%;
            height: 40px;
            border-radius: 3px;
            border: 1px solid #adadad;
            padding: 0 10px;
            box-sizing: border-box;
        }
        .content input[type="submit"]{
            margin-top: 40px;
            width: 100%;
            height: 40px;
            border-radius: 5px;
            color: white;
            border: 1px solid #adadad;
            background: #00dd60;
            cursor: pointer;
            letter-spacing: 4px;
            margin-bottom: 40px;
        }
        .active{
            background: white;
        }
        .item div:hover{
            background: #f6f6f6;
        }
    </style>
    <script>
        window.onload = function(){
            var item = document.getElementsByClassName("item");
            var it = item[0].getElementsByTagName("div");

            var content = document.getElementsByClassName("content");
            var con = content[0].getElementsByTagName("div");

            for(let i=0;i<it.length;i++){
                it[i].onclick = function(){
                    for(let j=0;j<it.length;j++){
                        it[j].className = '';
                        con[j].style.display = "none";
                    }
                    this.className = "active";
                    it[i].index=i;
                    con[i].style.display = "block";
                }
            }
        }

    </script>
</head>
<body>

</body>
</html>
