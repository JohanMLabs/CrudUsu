<%-- 
    Document   : Editar
    Created on : 15/07/2019, 01:10:40 PM
    Author     : blanclabs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Editar</h1>
        <div class="container mt-4 col-lg4">
            <div class="card border-info">

                <div class="card-body">
                    <form method="POST">
                        <label>Usuario</label>
                        <input type="text" name="Nombre" value="${lista[0].Nombre}">
                        <label>Contraseña</label>
                        <input type="password" name="Clave" value="${lista[0].Clave}">
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>
