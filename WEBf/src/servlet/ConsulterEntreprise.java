package servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Entreprise;
import Entity.Offre;
import Models.EntrepriseModel;
import services.EntepriseService;
import services.EntrepriseEJBimpl;

/**
 * Servlet implementation class ConsulterEntreprise
 */
@WebServlet(name="cs",urlPatterns= {"*.do"})
public class ConsulterEntreprise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB
       private EntepriseService metier;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsulterEntreprise() {
        super();
        // TODO Auto-generated constructor stub
        metier=new EntrepriseEJBimpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path=request.getServletPath();
 	   if(path.equals("/index.do")) {
 		   request.getRequestDispatcher("consulterEntreprise.jsp").forward(request, response);
 	   }
 	   else if(path.equals("/chercherbm.do")) {
 		   String m=request.getParameter("motCle");
 		   EntrepriseModel bmmodel=new EntrepriseModel();
 		   bmmodel.setMotcle(m);
 		   List<Entreprise> entreprises=metier.getEntrepriseByName("'%"+m+"%'");
 		   bmmodel.setEntreprises(entreprises);
 		   request.setAttribute("bmmodel", bmmodel);
 		   request.getRequestDispatcher("consulterEntreprise.jsp").forward(request, response);
 	   }
 	   else if(path.equals("/ajoutbm.do")) {
 		   request.setAttribute("entreprise", new Entreprise());
 		   request.getRequestDispatcher("AjoutEntreprise.jsp").forward(request, response);
 	   }
 	

 	   else if(path.equals("/saveEntreprise.do")&&(request.getMethod().equals("POST"))) {
		   String userName=request.getParameter("Username");
		   String password=request.getParameter("Password");
		   String nom=request.getParameter("Nom");
		   String description=request.getParameter("Description");
		   int numtelM=Integer.parseInt(request.getParameter("NumTel"));
		 
		   int nbredoffre=Integer.parseInt(request.getParameter("nbreoffre"));
		   int nbeployee=Integer.parseInt(request.getParameter("nbeployee"));
		   String emailM=request.getParameter("Email");
		   
		   Entreprise entreprise =new Entreprise(userName, password,  nom, description, numtelM, emailM, nbredoffre, nbeployee);
		   metier.addEntreprise(entreprise);
		   request.setAttribute("entreprise",entreprise);
		   request.getRequestDispatcher("confirmationajoutentreprise.jsp").forward(request, response);
  	   }
 	  else if(path.equals("/chercherbmo.do")) {
		   String m=request.getParameter("mot");
		   EntrepriseModel bmodel=new EntrepriseModel();
		   bmodel.setMot(m);
		   List<Offre> offres=metier.getOffreByTitle("'%"+m+"%'");
		   bmodel.setOffres(offres);
		   request.setAttribute("bmodel", bmodel);
		   request.getRequestDispatcher("consulterEntreprise.jsp").forward(request, response);
	   }
	 
 	   else if(path.equals("/ajoutof.do")) {
  		  request.setAttribute("offre", new Offre());
 		   request.getRequestDispatcher("AjoutOffre.jsp").forward(request, response);
  	   }
 	  else if(path.equals("/supprimebmo.do")) {
 		 int idOffre=Integer.parseInt(request.getParameter("idoffre"));
 		   metier.removeOffre(idOffre);
 		   response.sendRedirect("chercherbmo.do?motCle=");
 	   }
  	   else if(path.equals("/saveOffre.do")&&(request.getMethod().equals("POST"))) {
  		   int idOffre=Integer.parseInt(request.getParameter("idoffre"));
 		   String description=request.getParameter("Description");
 		   String titre=request.getParameter("titre");
 		   String datePub=request.getParameter("datePub");
 		   Offre offre=new Offre(idOffre, titre, datePub, description);
 		   metier.addOffre(offre);
 		   request.setAttribute("offre",offre);
 		   request.getRequestDispatcher("confirmationajoutoffre.jsp").forward(request, response);
  	   }
  	 else if(path.equals("/editbmo.do")) {
		  int idoffre=Integer.parseInt(request.getParameter("idoffre"));
		   Offre offres=metier.getOffreId(idoffre);
		   request.setAttribute("offres", offres);
		   request.getRequestDispatcher("editerOffre.jsp").forward(request, response);
	   }
  	 else if(path.equals("/updateOffre.do")&&(request.getMethod().equals("POST"))) {
  		int idOffre=Integer.parseInt(request.getParameter("idoffre"));
		   String description=request.getParameter("Description");
		   String titre=request.getParameter("titre");
		   String datePub=request.getParameter("datePub");
		   Offre offre=new Offre(idOffre, titre, datePub, description);
		   metier.updateOffre(offre);
		   request.setAttribute("offre",offre);
		   request.getRequestDispatcher("confirmationeditof.jsp").forward(request, response);
   	       	   }
 	   else if(path.equals("/supprimebm.do")) {
 		  int idUser=Integer.parseInt(request.getParameter("idUser"));
 		   metier.removeEntreprise(idUser);
 		   response.sendRedirect("chercherbm.do?motCle=");
 	   }
 	   else if(path.equals("/editbm.do")) {
 		  int idUser=Integer.parseInt(request.getParameter("idUser"));
 		   Entreprise entreprises=metier.getEntrepriseById(idUser);
 		   request.setAttribute("entreprise", entreprises);
 		   request.getRequestDispatcher("editEntreprise.jsp").forward(request, response);
 	   }
 	   else if(path.equals("/updateEntreprise.do")&&(request.getMethod().equals("POST"))) {
 	   int idUser=Integer.parseInt(request.getParameter("IdUser"));
 	  String userName=request.getParameter("Username");
	   String password=request.getParameter("Password");
	   String nom=request.getParameter("Nom");
	   String description=request.getParameter("Description");
	   int numtelM=Integer.parseInt(request.getParameter("NumTel"));
	   //int reference=Integer.parseInt(request.getParameter("Reference"));
	   int nbredoffre=Integer.parseInt(request.getParameter("nbreoffre"));
	   int nbeployee=Integer.parseInt(request.getParameter("nbeployee"));
	   String emailM=request.getParameter("Email");
		   
	   Entreprise entreprise =new Entreprise(userName, password, nom, description, numtelM, emailM, nbredoffre, nbeployee);

		   entreprise.setIdUser(idUser);
		   metier.updateEntreprise(entreprise);
		   request.setAttribute("entreprise", entreprise);
		   request.getRequestDispatcher("confirmationedit.jsp").forward(request, response);
  	   }
 	  else if(path.equals("/about.do")) {
  		  
 		   request.getRequestDispatcher("About.jsp").forward(request, response);
  	   }
 	   
 	   
 	   else {
 		   response.sendError(response.SC_NOT_FOUND);
 	   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
