<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OFFRE</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body background="2.jpg">
 <%@include file="header.jsp" %>
 <div class="container col-md-8 col-md-offset-2 col-xs-12">
  <div class="panel panel-primary">
    <div class="panel-heading">Modifier Offre</div>
    <div class="panel-body">
    
       <form action="updateOffre.do" method="post">
       
         <div class="form-group">
           <label class="control-label">ID</label>
           <input type="text" name="idoffre" value="${offre.getIdOffre()}" class="form-control" required="required"/>
           <span></span>
         </div> 
         <div class="form-group">
           <label class="control-label">Titre</label>
           <input type="text" name="titre" value="${offre.getTitre()}" class="form-control" required="required"/>
           <span></span>
         </div>

       
         <div class="form-group">
           <label class="control-label">Description</label>
           <input type="text" name="Description" value="${offre.getDescription()}" class="form-control" required="required"/>
           <span></span>
         </div>
         
         <div class="form-group">
           <label class="control-label">Date de publication</label>
           <input type="text" name="datePub" value="${offre.getDatePub()}" class="form-control" required="required"/>
           <span></span>
         </div>
       
         <div>
           <button type="submit" class="btn btn-primary">Enregistrer</button>
         </div>
       </form>
    </div>
  </div>
 </div>
</body>
</html>