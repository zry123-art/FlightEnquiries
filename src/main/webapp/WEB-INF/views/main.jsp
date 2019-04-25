<%--
  Created by IntelliJ IDEA.
  User: 龙大侠
  Date: 2019/3/12
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../css/main.css" type="text/css">
</head>
<body>
<div class="main">
    <form action="queryResultsMapper" method="post">

        出发城市：<input class="input_1" name="takeOffAirport" type="text" /><br/><br/>

        到达城市：<input class="input_2" name="aerodromeOfLanding" type="text"/><br/>

        <button class="sousuo" type="submit">搜索</button>
    </form>
</div>

</body>
</html>