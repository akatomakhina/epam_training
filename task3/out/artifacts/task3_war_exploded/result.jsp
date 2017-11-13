<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@ include file="resources/stylesForResult.css" %>
    <%@ include file="resources/reset.css" %>
</style>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <link rel="stylesheet" type="text/css" href="resources/stylesForResult.css" media="all">
    <link rel="stylesheet" type="text/css" href="resources/reset.css" media="all">
    <title>Result</title>
</head>
<body>
<div class="wrapper">
    <div class="free-registration">
        <div class="container">
            <div class="table">
                <jsp:useBean id="person" class = "entity.Person" scope="request"/>
                <table class="inner_table">
                    <tr class="tr_item">
                        <th class="th__item">id</th>
                        <th class="th__item">name</th>
                        <th class="th__item">surname</th>
                        <th class="th__item">phone Number</th>
                        <th class="th__item">e-mail</th>
                    </tr>
                    <tr class="tr_item">
                        <td class="th__item">${person.id}</td>
                        <td class="th__item">${person.name}</td>
                        <td class="th__item">${person.surname}</td>
                        <td class="th__item">${person.phone}</td>
                        <td class="th__item">${person.email}</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
