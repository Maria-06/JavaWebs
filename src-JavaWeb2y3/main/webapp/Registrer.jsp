<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!--caracteres especiales-->
    <meta charset="UTF-8">
    <!--author-->
    <meta name="autor"  content="Maria Hernandez">
    <!--descripcion--->
    <meta name="descripcion" content="Esta página le permitirá registrar los datos al usuario">
    <!--keywords-->
    <meta name="keywords" content="">
    <!--minimun responsive viewport-->
    <meta name="viewport" content="width=device-width,initial-scale=1">

    <!--TITLE-->
    <title>Registro de Usuario | Lottus</title>
    <!--FAVICON-->
    <link rel="icon" type="image/x-icon" href="./img/idea.png">
    <link rel="stylesheet" type="text/css" href="./css/index.css">
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
<body>
<div class="container">
    <header></header>
    <nav></nav>
    <section>
        <form action="" method="#"><br><br>
            <h3>Registro de Usuario</h3><br>
            <!--Expresiones regulares(pattern)-regex-->

            <label for="firstName">Nombres:</label>
            <input type="text"   id="firstName" name="firstName" placeholder="Ingrese su nombre" required autofocus pattern="[A-Za-z]{2,40}" class="form-control"><br>

            <label for="lastName">Apellidos:</label>
            <input type="text" id="lastName" name="lastName" placeholder="Ingrese su apellido" required  pattern="[A-Za-z]{2,40}" class="form-control"><br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Ingrese su correo" required pattern="{60}" class="form-control"><br>

            <label for="password">Password</label>
            <!--Contraseña no es segura<=>Recursos al decifrar-->
            <input  type="password" id="password" name="password" placeholder="Ingrese su contraseña" required pattern="^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$" class="form-control"><br>

            <button type="submit" class="btn btn-success">Enviar</button>
        </form>
    </section>
    <footer></footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</div>
</body>
</html>