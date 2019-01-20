<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Entreprise</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body background="2.jpg">
 <%@include file="header.jsp" %>
 <div class="container col-md-10 col-md-offset-1">
  <div class="panel panel-primary">
    <div class="panel-heading">search</div>
    <div class="panel-body">
       <form action="chercherbm.do" method="get">
         <label>Mot Clé</label>
         <input type="text" name="motCle" value="${bmmodel.getMotcle()}"/>
         <button type="submit" class="btn btn-primary">Chercher</button>
       </form>
       <p></p>
       <table class="table table-striped">
        <tr class="info">
         <th>ID</th> <th>Nom</th><th>description</th><th>email</th><th>telephone</th><th>NBoffre</th><th>NBemploye</th>
        </tr>
        <c:forEach items="${bmmodel.entreprises}" var="p">
          <tr class="active">
            <td class="active">${p.getIdUser()}</td>
            <td class="active">${p.getNom()}</td>
            <td class="active">${p.getDescription()}</td>
            <td class="active">${p.getEmailM()}</td>
            <td class="active">${p.getNumtelM()}</td>
            <td class="active">${p.getNbredoffre()}</td>
            <td class="active">${p.getNbeployee()}</td>
            <td class="active"><a onclick="return confirm('Etes vous sure?')" href="supprimebm.do?idUser=${p.getIdUser()}">Delete</a></td>
            <td class="active"><a href="editbm.do?idUser=${p.getIdUser()}">Edit</a></td>
          </tr>
        </c:forEach>
       </table>
    </div>
    <div class="panel-heading">search</div>
    <div class="panel-body">
       <form action="chercherbmo.do" method="get">
         <label>Mot Clé</label>
         <input type="text" name="mot" value="${bmodel.getMot()}"/>
         <button type="submit" class="btn btn-primary">Chercher</button>
       </form>
       <p></p>
       <table class="table table-striped">
        <tr class="info">
         <th>ID</th> <th>Titre</th><th>description</th><th>Date de publication</th>
        </tr>
        <c:forEach items="${bmodel.offres}" var="p1">
          <tr class="active">
            <td class="active">${p1.getIdOffre()}</td>
            <td class="active">${p1.getTitre()}</td>
            <td class="active">${p1.getDescription()}</td>
            <td class="active">${p1.getDatePub()}</td>
            <td class="active"><a onclick="return confirm('Etes vous sure?')" href="supprimebmo.do?idoffre=${p1.getIdOffre()}">Delete</a></td>
            <td class="active"><a href="editbmo.do?idoffre=${p1.getIdOffre()}">Edit</a></td>
          </tr>
        </c:forEach>
       </table>
    </div>
  </div>
 </div>
</body>
</html>