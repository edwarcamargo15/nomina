<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar</title>
    <link rel="stylesheet" href="../style/style.css">
    <!--FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <!-- Los iconos tipo Solid de Fontawesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
</head>

<body class="fondo">

    <div class="titulo">
        <h1>Registrar Empleado</h1>
    </div>

    <form action="" class="form-registro">
        <div class="form-group row">
            <label for="staticEmail" class="col-sm-2 col-form-label">Codigo:</label>
            <div class="col-sm-5">
                <input type="number" class="form-control" id="codigo">
            </div>
        </div>

        <div class="form-group row">
            <label for="inputPassword" class="col-sm-2 col-form-label" id="cedula">Cedula: </label>
            <div class="col-sm-5">
                <input type="number" class="form-control" id="cedula">
            </div>
        </div>

        <div class="form-group row">
            <label for="staticEmail" class="col-sm-5 col-form-label">Fecha De Nacimiento: <i class="fas fa-calendar-alt"></i></label>
            <div class="col-sm-4">
                <input type="date" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="staticEmail" class="col-sm-5 col-form-label">Fecha De Ingreso: <i class="fas fa-calendar-alt"></i></label>
            <div class="col-sm-4">
                <input type="date" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="staticEmail" class="col-sm-5 col-form-label">Fecha De Retiro: <i class="fas fa-calendar-alt"></i></label>
            <div class="col-sm-4">
                <input type="date" class="form-control">
            </div>
        </div>

        <button class="btn btn-info" type="submit">Registrar</button>
        <button class="btn btn-info" type="submit"><a href="/index.html">Volver</a></button>
    </form>

</body>
</html>