<%-- 
    Document   : index
    Created on : May 21, 2020, 12:07:41 AM
    Author     : Gaby's
--%>

<%@page import="inassGaby.dao.JoueurDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenue sur Belote !</title>

        <link rel="icon" href="image/icon.ico">

        <link href="css/bootstrap_1.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/cover.css" rel="stylesheet">
        <link href="css/bootstrap-grid.min.css" rel="stylesheet">
        <script type="text/javascript">
            window.history.forward();
            function noBack() {
                window.history.forward();
            }
        </script>
    </head>
    <body class="text-center">
        <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
            <main role="main" class="inner cover">

                <form action="SignUpServlet" method="post" class="form-container">
                    <h1 class="mb-4"  >Pour se connecter</h1>
                    <div class="form-group">
                        <label class="btn btn-lg mt-4">Pseudo</label>
                        <input name="pseudoL" placeholder="Saisissez votre pseudo" class="btn btn-lg mt-4" id="loginUsername" required>

                    </div>
                    <div class="form-group">
                        <label class="btn btn-lg mt-4">Password</label>
                        <input name="pwL" type="password" class="btn btn-lg mt-4" id="loginPass"  placeholder="Saisissez votre mot de passe" required>                   
                        <%  try {
                                JoueurDao joueurdao = new JoueurDao();
                                if (request.getParameter("pseudoL") != null && request.getParameter("pwL") != null && (joueurdao.getJoueur(request.getParameter("pseudoL"), request.getParameter("pwL")) == null)) {%>
                        <div class="text-danger " style="font-size:12px;">
                            <i class="fas fa-exclamation-triangle"></i>
                            Le nom d'utilisateur ou le mot de passe que vous avez entré est incorrect.
                        </div>
                        <%}
                        } catch (Exception e) {%>
                        <div class="text-danger " style="font-size:12px;">
                            <i class="fas fa-exclamation-triangle"></i>
                            Le nom d'utilisateur ou le mot de passe que vous avez entré est incorrect.
                        </div>
                        <%     }
                        %>
                    </div>
                    <div class="form-group">
                        <button type="submit" name="action" value="jouer" class="btn btn-lg mt-4 btn-block" >Jouer</button>
                    </div>
                    <h1 class="mb-4">Pour s'inscrire</h1>
                    <div class="form-group">
                        <button type="submit" name="action" value="signup" class="btn btn-lg mt-4 btn-block" >Sign Up</button>
                    </div>
                </form>
            </main>
        </div>
    </body>
</html>