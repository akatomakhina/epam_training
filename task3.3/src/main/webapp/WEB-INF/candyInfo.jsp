<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>candies</title>
    <meta http-equiv="Content-type" content="text/html" charset="UTF-8">
</head>
<body>
<a href="../index.jsp"><h2>back</h2></a>
<table border="1" style="width: 64%; margin-left: 18%; margin-top: 100px;">
    <tr>
        <th>№</th>
        <th>type</th>

        <th>name</th>
        <th>energy</th>
        <th>water</th>
        <th>sugar</th>
        <th>fructose</th>
        <th>type_of_chocolate</th>
        <th>vanillin</th>
        <th>proteins</th>
        <th>fats</th>
        <th>carbohydrates</th>
        <th>production</th>
    </tr>
    <c:forEach var="candy" items="${requestScope.candyList}">
        <tr>
            <td>${candy.id}</td>
            <td>${candy.type}</td>
            <td>${candy.name}</td>
            <td>${candy.energy}</td>
            <td>${candy.ingredients.water}</td>
            <td>${candy.ingredients.sugar}</td>
            <td>${candy.ingredients.fructose}</td>
            <td>${candy.ingredients.type_of_chocolate}</td>
            <td>${candy.ingredients.vanillin}</td>
            <td>${candy.value.proteins}</td>
            <td>${candy.value.fats}</td>
            <td>${candy.value.carbohydrates}</td>
            <td>${candy.production}</td>
        </tr>
    </c:forEach>
</table>

<div style="margin-left: 45%;">
    <c:if test="${requestScope.currentPage != requestScope.firstPage && requestScope.prevPage != requestScope.firstPage}">
        <a href="/FrontController?command=${requestScope.command}&page=${requestScope.firstPage}">${requestScope.firstPage}</a> ...
    </c:if>


    <c:if test="${requestScope.currentPage != requestScope.firstPage}">
        <a href="/FrontController?command=${requestScope.command}&page=${requestScope.prevPage}">${requestScope.prevPage}</a>
    </c:if>

    <a><b><c:out value="${requestScope.currentPage}"/></b></a>

    <c:if test="${requestScope.currentPage != requestScope.lastPage}">
        <a href="/FrontController?command=${requestScope.command}&page=${requestScope.nextPage}">${requestScope.nextPage}</a>
    </c:if>


    <c:if test="${requestScope.currentPage != requestScope.lastPage && requestScope.nextPage != requestScope.lastPage}">
        ... <a href="/FrontController?command=${requestScope.command}&page=${requestScope.lastPage}">${requestScope.lastPage}</a>
    </c:if>
</div>

</body>
</html>
