<%-- 
    Document   : registrar
    Created on : 15/07/2019, 01:10:30 PM
    Author     : blanclabs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
    </head>
    <body>
        <h1>Registrar</h1>
        <div class="container mt-4 col-lg4">
            <div class="card border-info">

                <div class="card-body">
                    <form method="POST">
                        <label>Usuario</label>
                        <input type="text" name="Nombre" placeholder="Ingrese su Usiario">
                        <label>Contraseña</label>
                        <input type="password" name="Clave" placeholder="Ingrese su Contraseña">
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>
