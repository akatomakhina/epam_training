<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  <%@ include file="resources/styles.css" %>
  <%@ include file="resources/reset.css" %>
</style>
<html>
<head>
  <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">--%>
  <link rel="stylesheet" type="text/css" href="resources/styles.css" media="all">
    <link rel="stylesheet" type="text/css" href="resources/reset.css" media="all">
  <meta http-equiv="content-type" content="text/html; charset=utf-8">
  <title>ForTaskThree</title>
</head>
<body>
</br>
<form action="Controller" method="post">
  <%--<div class="container">
    <div class="form-group row">
      <label for="inputName1" class="col-1 col-form-label">Name</label>
      <input type="text" id="inputName1" class="form-control col-6" aria-describedby="basic-addon1" name="name" value="Ivan">
    </div>
    <div class="form-group row">
      <label for="inputSurname1" class="col-1 col-form-label">Surname</label>
      <input type="text" id="inputSurname1" class="form-control col-6" aria-describedby="basic-addon1" name="surname" value="Ivanov">
    </div>
    <button class="btn btn-primary" type="submit">Press me</button>
  </div>--%>
<body>
<div class="wrapper">
  <div class="free-registration">
    <div class="container">
      <div class="registration">
        <div class="title">
          <p>Введите имя и фамилию</p>
        </div>
        <div class="registration__form">
          <input type="text" name="login" class="registration__input" placeholder="Имя"><br>
          <input type="text" name="login" class="registration__input" placeholder="Фамилия"><br>
          <button class="registration__button">Отправить запрос</button>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</form>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>
