<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@ include file="/style/style.css" %>
    <%@ include file="/style/reset.css" %>
</style>
<html>
<head>
    <title>main</title>
    <meta http-equiv="Content-type" content="text/html" charset="UTF-8">
</head>
<body>
<div style="margin-left: 42%; margin-top: 100px;">
    <form action="FrontController" method="get">
        <input type="hidden" name="command" value="SAX"/>
        <input type="hidden" name="page" value="1"/>
        <input type="submit" class="pars_btn" value="SAX"/>
    </form>

    <form action="FrontController" method="get">
        <input type="hidden" name="command" value="StAX">
        <input type="hidden" name="page" value="1"/>
        <input type="submit" class="pars_btn" value="StAX"/>
    </form>

    <form action="FrontController" method="get">
        <input type="hidden" name="command" value="DOM">
        <input type="hidden" name="page" value="1"/>
        <input type="submit" class="pars_btn" value="DOM"/>
    </form>
</div>
</body>
</html>