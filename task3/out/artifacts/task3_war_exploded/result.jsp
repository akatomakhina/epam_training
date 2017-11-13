<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 13.11.2017
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>Table</title>
    <style type="text/css">
        table {
            width: 500px;
            border-collapse: collapse;
        }
        td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<jsp:useBean id="person" class = "entity.Person" scope="request"/>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Phone Number</th>
        <th>e-mail</th>
    </tr>
    <tr>
        <td>${person.name}</td>
        <td>${person.surname}</td>
        <td>${person.phone}</td>
        <td>${person.email}</td>
    </tr>
</table>
</body>
</html>
