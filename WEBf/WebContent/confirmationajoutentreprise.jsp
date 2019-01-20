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
 <div class="container col-md-8 col-md-offset-2 col-xs-12">
  <div class="panel panel-primary">
    <div class="panel-heading">Confirmation d'ajouter une Entreprise</div>
    <div class="panel-body">
    <div class="form-group">
       <label>ID : </label>
       <label>${entreprise.getIdUser()}</label>
    </div>
        <div class="form-group">
       <label>Username : </label>
       <label>${entreprise.getUserName()}</label>
    </div>
        <div class="form-group">
       <label>Password : </label>
       <label>${entreprise.getPassword()}</label>
    </div>
        <div class="form-group">
       <label>Nom : </label>
       <label>${entreprise.getNom()}</label>
    </div>
        <div class="form-group">
       <label>Description : </label>
       <label>${entreprise.getDescription()}</label>
    </div>
        <div class="form-group">
       <label>Num Tel : </label>
       <label>${entreprise.getNumtelM()}</label>
    </div>
        <div class="form-group">
       <label>Email : </label>
       <label>${entreprise.getEmailM()}</label>
    </div>
        <div class="form-group">
       <label>Nombre d'employee:</label>
       <label>${entreprise.getNbeployee()}</label>
    </div>
    
    </div>
  </div>
 </div>
</body>
</html>