package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Studente;
import service.StudenteService;

import java.util.List;

/**
 * Servlet implementation class StudenteController
 */
@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		RequestDispatcher rd;
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		boolean errore = false;
		
		if(nome.isEmpty()) {
			String msgErr = "Il nome è obbligatorio!";
			request.setAttribute("nomeErr", msgErr);
			errore = true;
		}
		
		if(cognome.isEmpty()) {
			String msgErr = "Il cognome è obbligatorio!";
			request.setAttribute("cognomeErr", msgErr);
			errore = true;
		}
		
		String nextPage;
		
		if(errore) {
			nextPage = "/newStudente.jsp";
		} else {
			StudenteForm studenteForm = new StudenteForm(nome, cognome);
			session.setAttribute("studenteForm", studenteForm);
			nextPage="/risposta.jsp";
		}
		
		rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/listaStudenti.jsp";
        StudenteService studenteServices = new StudenteService();
         
        if(request.getParameter("id") != null) {
            Long idStudente = Long.parseLong(request.getParameter("id"));
            Studente studente = studenteServices.getStudente(idStudente);
            request.setAttribute("studente", studente);
            nextPage = "/studente.jsp";
        }
        else {
            List<Studente> studenti = studenteServices.getListaStudenti();
            request.setAttribute("studenti", studenti);
        }
     
        ServletContext application = getServletContext();
        RequestDispatcher rd;
        rd = application.getRequestDispatcher(nextPage);
        rd.forward(request, response);
	}

}
