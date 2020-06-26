<%-- 
    Document   : profile
    Created on : May 23, 2020, 1:59:26 AM
    Author     : Gaby's
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="css/bootstrap_1.css" rel="stylesheet">

        <link href="css/bootstrap-grid.min.css" rel="stylesheet">    
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style-sb_1.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="css/all.css">
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/input.css"/>
    </head>
    <body>
        <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
            <main role="main" class="inner cover">
                <h1 class="mb-4">Profile</h1>

                <form action="JoueurServlet" method="post" class="form-container">
                    <div class="form-group">
                        <img src="images/avatars/avatarinass.jpg" alt="Photo de Profil" />
                        <label class="btn btn-lg mt-4">Nombre d'annonces</label>
                        <label name="pseudo" class="btn btn-lg mt-4" value="${sessionScope.stats.nbrAnnonces}">${sessionScope.stats.nbrAnnonces}</label>
                        <label class="btn btn-lg mt-4">Nombre de capots</label>
                        <label name="pseudo" class="btn btn-lg mt-4" value="${sessionScope.stats.nbrCapots}">${sessionScope.stats.nbrCapots}</label>
                        <label class="btn btn-lg mt-4">Nombre de prises d'atouts</label>
                        <label name="pseudo" class="btn btn-lg mt-4" value="${sessionScope.stats.nbrPrisesAtout}">${sessionScope.stats.nbrPrisesAtout}</label>

                    </div>                    
                    <div class="form-group">
                        <label class="btn btn-lg mt-4">Pseudo</label>
                        <input name="pseudo" class="btn btn-lg mt-4" value="${sessionScope.profile.pseudo}" disabled="disabled">
                    </div>
                    <div class="form-group">    
                        <label class="btn btn-lg mt-4">Password</label>
                        <input name="pw" type="password" class="btn btn-lg mt-4"  value="${sessionScope.profile.password}" placeholder="Changer password">

                    </div>
                    <div class="form-group"> 
                        <label class="btn btn-lg mt-4">Adresse</label>
                        <input name="ville" class="btn btn-lg mt-4" value="${sessionScope.profile.ville}" placeholder="Saisissez votre adresse">

                    </div>
                    <div class="form-group"> 
                        <label class="btn btn-lg mt-4">Age</label>
                        <input name="age" class="btn btn-lg mt-4" value="${sessionScope.profile.age}" placeholder="Saisissez votre age"
                               pattern="[0-9]+"
                               oninvalid='setCustomValidity("L\'age doit contenir des nombres seulement")'
                               oninput='setCustomValidity("")'>
                    </div>
                    <div class="form-group"> 
                        <input type="radio" class="btn btn-lg mt-4" name="sexe" value="h"> 
                        <label class="btn btn-lg mt-8">Homme</label>
                        <input type="radio" class="btn btn-lg mt-4" name="sexe" value="f" >
                        <label class="btn btn-lg mt-8">Femme</label>
                    </div>
                    <div class="form-group"> 
                        <button type="submit" name="action" value="modifier" class="btn btn-lg mt-4 btn-block" id="exBtn">Modifier</button>
                    </div>
                    <div class="form-group"> 
                        <button type="submit" name="action" value="supprimer" class="btn btn-lg mt-4 btn-block" id="exBtn">Supprimer</button>
                    </div>
                    <div class="form-group"> 
                        <button type="submit" name="action" value="back2" class="btn btn-lg mt-4 btn-block" id="bk2Btn">Back</button>
                    </div>
                </form>
            </main>
        </div>
    </body>
</html>
