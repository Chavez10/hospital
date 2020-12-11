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
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="assets/plugins/fontawesome-free/css/all.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- icheck bootstrap -->
        <link rel="stylesheet" href="assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="assets/dist/css/adminlte.min.css">
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    </head>
    <body class="hold-transition login-page" style="background-image: url(assets/image/empre.jfif)" >
        <div class="login-box" >
            <!-- /.login-logo -->
            <div class="card" >
                <div class="card-body login-card-body">
                <div class="image">
                    <center>
                        <img src="assets/image/usu.jpg" class="img-circle elevation-2" alt="User Image" width="30%" height="30%">
                    </center>
                   </div>
                    <p class="login-box-msg"><b>Iniciar Sesion</b></p>
                    <form action="GenerarSesion" method="POST" >
                        <div class="input-group mb-3">
                            <input name="usuario" type="text" class="form-control" placeholder="Usuario">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-envelope"></span>
                                </div>
                            </div>
                        </div>
                        <div class="input-group mb-3">
                            <input name="password" type="password" class="form-control" placeholder="Contraseña">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-lock"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-8">
                                <div class="col-8">
                                <input type="submit" name="accion" value="Ingresar" class="btn btn-primary">
                            </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-4">
                                <a href="RegUsuariosServlet?menu=MostrarTipoUsu" type="submit" class="btn btn-primary btn-danger">Registrate</a>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>

                    
                    <!-- /.social-auth-links -->

                    
                </div>
                <!-- /.login-card-body -->
            </div>
        </div>
        <!-- /.login-box -->

        <!-- jQuery -->
        <script src="assets/plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- AdminLTE App -->
        <script src="assets/dist/js/adminlte.min.js"></script>

    </body>
    
</html>
