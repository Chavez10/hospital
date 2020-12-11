<%-- 
    Document   : login
    Created on : 10-dic-2020, 23:29:43
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="../header.jsp" />
        <style>
            @import url('https://fonts.googleapis.com/css2?family=PT+Serif:ital@1&display=swap');
        </style>
    </head>
    <body>
        <div class="container mt-4 col-lg-6">
            <hr/>
            <div class="">
                <div class="card text-center col-sm-12">

                    <div class="card-header">
                        <p>INICIO DE SESIÓN</p>
                        <p>SISTEMA DE GESTION HOSPITALARIO</p>
                    </div>
                    <div class="card-body">
                        <form>
                            <div class="form-group">
                                <label for="usuario">Usuario de Sesión</label>
                                <input type="text" class="form-control" placeholder="Ingrese su Usuario" name="usuario" id="usuario" />
                            </div>
                            <div class="form-group">
                                <label for="pass">Contraseña de Sesión</label>
                                <input type="password" class="form-control" placeholder="Ingrese su Contraseña" name="pass" id="pass" />
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-success form-control" value="Iniciar Sesión" />
                            </div>
                        </form>
                    </div>
                    <div class="card-footer">
                        <a href="#" class="btn btn-danger">¿Olvido su contraseña?</a>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>

</html>
