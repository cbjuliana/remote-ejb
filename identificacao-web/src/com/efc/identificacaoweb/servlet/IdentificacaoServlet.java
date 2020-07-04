package com.efc.identificacaoweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.efc.identificacaoejb.domain.Pessoa;
import com.efc.identificacaoejb.interfaces.IdentificacaoServiceEJBRemote;

@WebServlet( "/identificacao")
public class IdentificacaoServlet extends HttpServlet {
	
	@EJB(lookup = "java:global/identificacao-ejb-1.0/IdentificacaoService!com.efc.identificacaoejb.interfaces.IdentificacaoServiceEJBRemote")
	IdentificacaoServiceEJBRemote identificaoService;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		
		Pessoa pessoa = identificaoService.getIdentificacaoPessoal(req.getParameter("cpf"));
		
		out.println("O nome da pessoa �: " + pessoa.getNome());
		
		out.println("</body>");
		out.println("</html>");
			
	}

}
