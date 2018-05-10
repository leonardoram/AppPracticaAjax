package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Numeros;

/**
 * Servlet implementation class Suma2numeros
 */
@WebServlet("/Suma2numeros")
public class Suma2numeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suma2numeros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(request, response);
		response.getWriter().append("ya estamos en el response");
		
		Numeros numero = new Numeros();
		String sNumero1="";
		String sNumero2="";
		
		sNumero1 = request.getParameter("num1");
		sNumero2 = request.getParameter("num2");
		
		
		
		response.getWriter().append("\nel numero 1 es "+sNumero1);
		response.getWriter().append("\nel numero 2 es "+sNumero2);
		
		numero.setNumero1(Double.parseDouble(request.getParameter("num1")));
		numero.setNumero2(Double.parseDouble(request.getParameter("num2")));
		
		response.getWriter().append("la suma es de : "+numero.getSuma());

	}

}
