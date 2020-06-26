<%-- 
    Document   : jeu
    Created on : May 22, 2020, 8:53:17 PM
    Author     : Gaby's
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Jeu | Super Belote</title>
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="css/input.css" />

        <script type='text/javascript' src='scripts/jquery-1.3.2.min.js' ></script>
        <script type='text/javascript' src='scripts/jquery.easing.1.3.js' ></script>
        <script type='text/javascript' src='scripts/script.js' ></script>
    </head>
    <body>
        <header>
            Jouez !
        </header>

        <form action="GameServlet" method="post" style="text-align: center">
            <section id="bloc_page">
                <table class="center joueur">
                    <tr>
                        <td><img src="images/avatars/avatar.png" alt="Photo de Profil" /></td>
                        <td><img src="images/avatars/avatarinass.jpg" alt="Photo de Profil" /></td>
                        <td><img src="images/avatars/avatar2.jpeg" alt="Photo de Profil" /></td>
                        <td><img src="images/avatars/avatar.png" alt="Photo de Profil" /></td>
                    </tr>
                </table>

                <div class="center" id="cartes">
                </div>




                <table class="center cartesJoueur" id="cartesJoueur">
                    <tr>
                        <c:forEach items="${sessionScope.main}" var="carte"> 
                            <td><img src="/images/cartes/${carte.getNom()}.png" /></td>
                            </c:forEach>
                    </tr>
                </table>
                <aside id="buttons">		
                    <input type="submit" name="action" value="belote" class="btn btn-lg mt-4 btn-block" id="bkBtn"></button>
                    <input type="submit" name="action" value="rebelote" class="btn btn-lg mt-4 btn-block" id="bkBtn"></button>
                    <input type="submit" name="action" value="back" class="btn btn-lg mt-4 btn-block" id="bkBtn"></button>
                </aside>
            </section>		
        </form>


        <footer>
            ${sessionScope.joueur.pseudo} joue.
        </footer>
    </body>
</html>