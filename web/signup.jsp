<%-- 
    Document   : signup
    Created on : May 22, 2020, 6:53:17 PM
    Author     : Gaby's
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenue sur Belote !</title>
        <link href="css/bootstrap_1.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/cover.css" rel="stylesheet">
        <link href="css/bootstrap-grid.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
            <main role="main" class="inner cover">

                <form action="SignUpServlet" method="post" class="form-container">

                    <h1 class="mb-4">Pour s'inscrire</h1>
                    <div class="form-group">
                        <label class="btn btn-lg mt-4">Pseudo</label>
                        <input name="pseudo" class="btn btn-lg mt-4" placeholder="Saisissez votre pseudo" required="">
                    </div>
                    <div class="form-group">    
                        <label class="btn btn-lg mt-4">Password</label>
                        <input name="pw" class="btn btn-lg mt-4"  placeholder="Saisissez votre mot de passe" required>
                    </div>
                    <div class="form-group"> 
                        <label class="btn btn-lg mt-4">Adresse</label>
                        <input name="ville" class="btn btn-lg mt-4" placeholder="Saisissez votre adresse">
                    </div>
                    <div class="form-group"> 
                        <label class="btn btn-lg mt-4">Age</label>
                        <input name="age" class="btn btn-lg mt-4" placeholder="Saisissez votre age">
                    </div>
                    <div class="form-group"> 
                        <input type="radio" class="btn btn-lg mt-4" name="sexe" value="h"> 
                        <label class="btn btn-lg mt-8">Homme</label>
                        <input type="radio" class="btn btn-lg mt-4" name="sexe" value="f" >
                        <label class="btn btn-lg mt-8">Femme</label>
                    </div>

                    <button type="submit" value="creer" class="btn btn-lg mt-4 btn-block"  name="action" id="exBtn">Exécuter</button>
                    <button type="reset" value="Remise à zéro"class="btn btn-lg mt-4 btn-block"  name="resBtn" id="resBtn"/>Remise à zéro</button>
                    <button type="submit" value="back"class="btn btn-lg mt-4 btn-block"  name="action" id="resBtn"/>Back</button>
                </form>
            </main>
        </div>    
    </body>
</html>
