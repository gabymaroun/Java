<%-- 
    Document   : accueil
    Created on : May 22, 2020, 4:53:17 PM
    Author     : Gaby's
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Accueil | Jeu Belote</title>
        <link href="css/bootstrap_1.css" rel="stylesheet">

        <link href="css/bootstrap-grid.min.css" rel="stylesheet">    
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style-sb_1.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="css/all.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/input.css"/>
    </head>
    <body>
        <header>
            Bienvenue <c:out value="${sessionScope.joueur.pseudo}"></c:out>
            </header>
            <section id="bloc_page">
                <article id="parties" style="text-align:center">
                    <h1>Parties</h1>
                    <form action="AccueilServlet" method="post">
                        <input type="submit" name = "action" style="width: 500px;" value="Creer une nouvelle partie" />
                        <input type="hidden" name = "hid"  value="${sessionScope.joueur.pseudo}" >
                    <table class="partiesTab">
                        <colgroup>
                            <col span="2" width="60%" style="background-color:#B8C7D3" />
                            <col span="3" width="40%" style="background-color: #CCCCCC" />
                        </colgroup>
                        <thead>
                            <tr>
                                <th>Nom de la partie</th>
                                <th>Joueurs</th>
                                <th>Equipe 1</th>
                                <th>Equipe 2</th>
                                <th></th>
                            </tr>
                        </thead>
                        <c:forEach items="${sessionScope.parties}" var="part">            
                            <tbody>
                                <tr>
                                    <td>Partie ${part.idPartie}</td>
                                    <td>x / 4</td>
                                    <td>${part.idEquipe1}</td>
                                    <td>${part.idEquipe2}</td>
                                    <td><input type="submit" name="action" value="rejoindre" /></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </form>
            </article>
            <aside id="profil">				
                <p id="photo_profil"><img src="images/avatars/avatarinass.jpg" alt="Photo de Profil" /></p>
                <form action="AccueilServlet" method="post" style="text-align: center">
                    <input type="submit" name="action" value="Mon Profil" />
                </form>
                <p>Profil et infos tournois.</p>
            </aside>
        </section>	
        <footer>
            Votre score total est de  points
        </footer>
    </body>
</html>