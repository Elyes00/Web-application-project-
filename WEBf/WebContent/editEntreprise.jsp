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
    <div class="panel-heading">Modifier Entreprise</div>
    <div class="panel-body">
    
       <form action="updateEntreprise.do" method="post">
       
         <div class="form-group">
           <label class="control-label">ID</label>
           <input type="text" name="IdUser" value="${entreprise.getIdUser()}" class="form-control" required="required"/>
           <span></span>
         </div> 
         
         <div class="form-group">
           <label class="control-label">Username</label>
           <input type="text" name="Username" value="${entreprise.getUserName()}" class="form-control" required="required"/>
           <span></span>
         </div>

         <div class="form-group">
           <label class="control-label">Password</label>
           <input type="text" name="Password" value="${entreprise.getPassword()}" class="form-control" required="required"/>
           <span></span>
         </div>

         <div class="form-group">
           <label class="control-label">Nom</label>
           <input type="text" name="Nom" value="${entreprise.getNom()}" class="form-control" required="required"/>
           <span></span>
         </div>
       
         <div class="form-group">
           <label class="control-label">Description</label>
           <input type="text" name="Description" value="${entreprise.getDescription()}" class="form-control" required="required"/>
           <span></span>
         </div>
       
         <div class="form-group">
           <label class="control-label">NumTel</label>
           <input type="text" name="NumTel" value="${entreprise.getNumtelM()}" class="form-control" required="required"/>
           <span></span>
         </div>
       
         <div class="form-group">
           <label class="control-label">Email</label>
           <input type="text" name="Email" value="${entreprise.getEmailM()}" class="form-control" required="required"/>
           <span></span>
         </div>
         
          <div class="form-group">
           <label class="control-label">nombre d'employe</label>
           <input type="text" name="nbeployee" value="${entreprise.getNbeployee()}" class="form-control" required="required"/>
           <span></span>
         </div>
         <div class="form-group">
           <label class="control-label">nombre d'offre</label>
           <input type="text" name="nbreoffre" value="${entreprise.getNbredoffre()}" class="form-control" required="required"/>
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