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
    <div class="panel-heading">Confirmation d'ajouter un Offre</div>
    <div class="panel-body">
    <div class="form-group">
       <label>ID : </label>
       <label>${offre.getIdOffre()}</label>
    </div>
        <div class="form-group">
       <label>Title : </label>
       <label>${offre.getTitre()}</label>
    </div>
        <div class="form-group">
       <label>Description : </label>
       <label>${offre.getDescription()}</label>
    </div>
     </div>
        <div class="form-group">
       <label>Date de publication : </label>
       <label>${offre.getDatePub()}</label>
    </div>
        
    
    </div>
  </div>
 
</body>
</html>