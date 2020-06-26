<%-- 
    Document   : createPartie
    Created on : May 23, 2020, 6:37:23 AM
    Author     : Gaby's
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Partie</title>
        <link href="css/bootstrap_1.css" rel="stylesheet">

        <link href="css/bootstrap-grid.min.css" rel="stylesheet">    
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="css/style-sb_1.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <!--<link rel="stylesheet" href="css/all.css">-->
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="css/input.css"/>
    </head>
    <body>
        <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
            <main role="main" class="inner cover">
                <h1 class="mb-4">${sessionScope.pseudo}</h1>

                <form action="AccueilServlet" method="post" class="form-container">

                    <label class="btn btn-lg mt-4">Créer partie avec :</label>
                    <table class="table">
                        <colgroup>
                            <col span="2" width="60%" style="background-color:#B8C7D3" />
                            <col span="3" width="40%" style="background-color: #CCCCCC" />
                        </colgroup>
                        <thead class="thead-dark">
                            <tr>
                                <th>Id Equipe</th>
                                <th>Choisir</th>
                                <th>Joueur 1</th>
                                <th>Joueur 2</th>
                            </tr>
                        </thead>
                        <c:forEach items="${sessionScope.equipes}" var="sp1">  
                            <tbody >
                                <tr scope="row">
                                    <td>Equipe ${sp1.idEquipe}</td>
                                    <td><input type="checkbox" class="btn btn-lg mt-4" name="equipe" value="${sp1.idEquipe}" ></td>
                                    <td>${sp1.idJoueur1}</td>
                                    <td>${sp1.idJoueur2}</td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                    <label class="btn btn-lg mt-4">Créer Equipe avec :</label>
                    <table class="table">
                        <colgroup>
                            <col span="2" width="60%" style="background-color:#B8C7D3" />
                            <col span="3" width="40%" style="background-color: #CCCCCC" />
                        </colgroup>
                        <thead class="thead-dark">
                            <tr>
                                <th>Id Joueur</th>
                                <th>Choisir</th>
                                <th>Joueur</th>
                            </tr>
                        </thead>
                        <c:forEach items="${sessionScope.joueurs}" var="sp2">  
                            <tbody >
                                <tr scope="row">
                                    <td>Joueur ${sp2.idJoueur}</td>
                                    <td><input type="checkbox" class="btn btn-lg mt-4" name="joueur" value="${sp2.pseudo}" ></td>
                                    <td>${sp2.pseudo}</td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>

                    <div class="form-group"> 
                        <button type="submit" name="action" value="creerP" class="btn btn-lg mt-4 btn-block" id="exBtn">Créer</button>
                    </div>
                    <div class="form-group"> 
                        <button type="submit" name="action" value="back" class="btn btn-lg mt-4 btn-block" id="bk1Btn">Back</button>
                    </div>
                </form>
            </main>
        </div>
    </body>
</html>
