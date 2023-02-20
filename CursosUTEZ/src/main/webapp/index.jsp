<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<h1>Hello, world!</h1>
<a href="hello-servlet">Hello Servlet</a>
<a href="ServletCourse">Cursosss</a>
<table class="table table-hover table-triped table-bordered">
    <thead>
    <tr>
        <th>No.</th>
        <th>Curso</th>
        <th>Descripcion</th>
        <th>Precio</th>
        <th>Profesor</th>
        <th>Estado actual</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listaCursos}" var="courses" varStatus="status">
       <tr>
           <td>${status.count}</td>
           <td>${courses.nombreCurso}</td>
           <td>${courses.descripcion}</td>
           <td>${courses.precio}</td>
           <td>${courses.nombreProfesor}</td>
           <td>${courses.estado}</td>
       </tr>
    </c:forEach>
    </tbody>
</table>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>