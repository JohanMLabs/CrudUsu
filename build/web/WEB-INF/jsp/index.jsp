
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <title>Listar Usuarios</title>
    </head>
    <body>
        <h1>Listar Usuarios</h1>
        
        <div class="container mt-4">
            
            <div class="card border-info">
                <div class="card header-info">
                    <a href="registrar.htm">Registrar</a>
            </div>
            </div>
            <div class="card-body">
                <table class="table table-hover" border="1">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Clave</th>
                            <th>Acciones</th>
                         
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="datos" items="${lista}">
                        <tr>
                            
                            <td>${datos.Id}</td>
                            <td>${datos.Nombre}</td>
                            <td>${datos.Clave}</td>
                            <td>
                                <a href="Editar.htm?Id=${datos.Id}" class="btn btn-warding">Editar</a>
                                <a href="Eliminar.htm?Id=${datos.Id}"class="btn btn-danger">Eliminar</a>
                            </td>
                            
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
    </body>
</html>
