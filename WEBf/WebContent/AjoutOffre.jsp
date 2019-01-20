<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Offre</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body background="2.jpg">
 <%@include file="header.jsp" %>
 <div class="container col-md-8 col-md-offset-2 col-xs-12">
  <div class="panel panel-primary">
    <div class="panel-heading">AJOUTER NOUVEAU OFFRE</div>
    <div class="panel-body">
    
       <form action="saveOffre.do" method="post">

         <div class="form-group has-success">
           <label class="control-label">ID</label>
           <input type="text" name="idoffre" value="${offre.getIdOffre()}" class="form-control" required="required"/>
           <span></span>
         </div>
      
         <div class="form-group has-success">
           <label class="control-label">titre</label>
           <input type="text" name="titre" value="${offre.getTitre()}" class="form-control" required="required"/>
           <span></span>
         </div>
       
         <div class="form-group has-success">
           <label class="control-label">Description</label>
           <input type="text" name="Description" value="${offre.getDescription()}" class="form-control" required="required"/>
           <span></span>
         </div>
       <div class="form-group has-success">
           <label class="control-label">Date de publication</label>
           <input type="text" name="datePub" value="${offre.getDatePub()}" class="form-control" required="required"/>
           <span></span>
         </div>

           <button type="submit" class="btn btn-primary">Enregistrer</button>
       </form>
         </div>
       
    </div>
  </div>
 </div>

</body>
</html>