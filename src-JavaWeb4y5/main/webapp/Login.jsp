<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <!--caracteres especiales-->
    <meta charset="UTF-8">
    <!--author-->
    <meta name="autor"  content="Maria Hernandez">
    <!--descripcion--->
    <meta name="descripcion" content="Esta página le permitirá ingresar los datos del usuario que se haya registrado">
    <!--keywords-->
    <meta name="keywords" content="">
    <!--minimun responsive viewport-->
    <meta name="viewport" content="width=device-width,initial-scale=1">

    <!--TITLE-->
    <title>Logueo de Usuario | Lottus</title>
    <!--FAVICON-->
    <link rel="icon" type="image/x-icon" href="./img/icon.png">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/sign.css">
    <!--Bootstrap css/icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
          crossorigin="anonymous">
    <!--Extension icon-->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>

<body class="text-center">
<!--login form-->
<div class="container">
    <main class="form-signin w-100 m-auto">
        <form action="" method="post">
            <img  class="img-login mb-4" src="./img/loto.png" alt="logo" width="100">
            <h4 class="text-secondary">Lottus</h4>
            <h1 class="h5 mb-3 fw-normal">Logueo de Usuario</h1>

            <div class="form-floating">
                <input type="text" class="form-control" id="floatingInput"
                       placeholder="Ingrese el nombre de su Usuario" required autofocus
                       pattern="[A-Za-z0-9]{}{8,12}">
                <label for="floatingInput">Usuario:</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword"
                       placeholder="Ingrese el nombre de su Usuario" required autofocus
                       pattern="[A-Za-z0-9]{}{8,12}">
                <label for="floatingPassword">Contraseña:</label>
            </div>

            <button class="w-100 btn btn-lg btn-primary" type="submit">Ingresar</button>
            <div id="registrer">
                <a href="Registrer.jsp">Registrarse</a>
            </div>
        </form>
        <footer>
            <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados <br> Lottus
                &copy; <%=displayDate()%>
            </p>

            <%!
                public String displayDate(){
                    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
                    Date date = Calendar.getInstance().getTime();
                    return dateFormat.format(date);
                }
            %>
            <!--Bootstrap script-->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                    crossorigin="anonymous">
            </script>
        </footer>
    </main>
</div>

</body>
</html>