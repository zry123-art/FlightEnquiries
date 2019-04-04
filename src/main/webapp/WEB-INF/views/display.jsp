<%--
  Created by IntelliJ IDEA.
  User: 龙大侠
  Date: 2019/3/12
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="../css/display.css" type="text/css">
</head>
<body>
<div class="display">

    <form action="main" method="post">

        机票编号: <input class="input_1" name="bian_hao" type="text" value="${flightNumber}"/>

        起飞时间: <input class="input_2" name="time" type="text" value="${takeOffTime}"/>

        降落时间: <input class="input_3" name="jl_time" type="text" value="${landingTime}"/>

        起飞地点: <input class="input_4" name="fly_time" type="text" value="${takeOffAirport}"/><br/><br/>

        <a class="zuo">到达地点:</a> <input class="input_5" name="dao_da_di_dian" type="text" value="${aerodromeOfLanding}"/>

        日期时间: <input class="input_6" name="ri_qi" type="text" value="${price}"/>

        价格: <input class="input_7" name="price" type="text" value="${dateOfDeparture}"/>

    &nbsp;&nbsp;&nbsp;&nbsp;${error_one}
        <button class="sousuo" type="submit">返回主页</button>

    </form>




</div>

</body>
</html>