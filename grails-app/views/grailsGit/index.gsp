<!doctype html>
<html lang="es">
<head>
    <meta name="layout" content="main"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="Proyecto MELI - GITHUB" content="">
    <meta name="Sofia M. Varela Merino" content="">
    <title>Proyecto-MELI</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <link href="https://fonts.googleapis.com/css?family=Nunito:200,300" rel="stylesheet">
    <asset:stylesheet src="index.css"/>
</head>

<body>

<div class="container">
    <h1>LOGIN</h1>

    <g:form method="post" action="index">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="form-group">
                    <div class="input-group">
                        <g:field class="input" type="text" name="usuario" placeholder="Ingrese Usuario"/><br>

                        <g:field class="input" type="password" name="contrasenia" placeholder="Ingrese Contrseña"/><br>

                        <g:submitButton class="btn btn-warning text-center" id="ingresar" name="INGRESAR" />
                    </div>
                </div>
            </div>
        </div>
    </g:form>
</div>


</body>
</html>

