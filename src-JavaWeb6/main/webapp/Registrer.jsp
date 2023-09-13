<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!--caracteres especiales-->
    <meta charset="UTF-8">
    <!--author-->
    <meta name="autor"  content="Maria Hernandez">
    <!--descripcion--->
    <meta name="descripcion" content="Esta página le permitirá ingresar los datos al usuario">
    <!--keywords-->
    <meta name="keywords" content="">
    <!--minimun responsive viewport-->
    <meta name="viewport" content="width=device-width,initial-scale=1">

    <!--TITLE-->
    <title>Registro de Usuario | Lottus</title>
    <!--FAVICON-->
    <link rel="icon" type="image/x-icon" href="./img/icon.png">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/sign.css">

    <!--CSS-->

    <!--Bootstrap css/icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
          crossorigin="anonymous">
    <!--Extension icon-->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <!--Custom css-->

</head>
<body class="text-center">
<div class="container">
    <section class="form-signup w-100 m-auto">
        <form action="" method="post"><br><br>
            <img  class=" img-registrer mb-4" src="./img/loto.png" alt="logo" width="100">
            <h3 class="text-secondary">Lottus</h3>
            <h4 class="h5 mb-3 fw-normal">Registro de Usuario</h4>
            <h1 class="h5 mb-3 fw-normal"></h1>

            <!--Expresiones regulares(pattern)-regex-->
            <div class="form-floating">
                    <input type="text"   id="firstName" name="firstName" placeholder="Ingrese su nombre" required
                           autofocus pattern="[A-Za-z]{2,40}" class="form-control"><br>
                    <label for="firstName">Nombres:</label>
            </div>
            <div class="form-floating">
                    <input type="text" id="lastName" name="lastName" placeholder="Ingrese su apellido" required
                           pattern="[A-Za-z]{2,40}" class="form-control"><br>
                    <label for="lastName">Apellidos:</label>
            </div>
            <div class="form-floating">
                    <input type="email" id="email" name="email" placeholder="Ingrese su correo" required
                           pattern="{60}" class="form-control"><br>
                    <label for="email">Email:</label>
            </div>
            <div class="form-floating">
                <!--Contraseña no es segura<=>Recursos al decifrar-->
                <input  type="password" id="password" name="password" placeholder="Ingrese su contraseña" required
                        pattern="^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$" class="form-control"><br>
                <label for="password">Password</label>
            </div>

            <button class="w-100 btn btn-lg btn-primary" type="submit" id="button-registro">Registrar</button><br>
        </form>
    </section>
    <footer>
        <!--Bootstrap script-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                crossorigin="anonymous">
        </script>
    </footer>
</div>
</body>
</html>