/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heitormaffra
 */
@WebServlet(name = "Juros", urlPatterns = {"/juros.jsp"})
public class Juros extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if(request.getParameter("txtValorInicial") == null) {
                response.sendRedirect("index.jsp");
            }
            if(request.getParameter("txtTaxaJuros") == null) {
                response.sendRedirect("index.jsp");
            }
            if(request.getParameter("txtMeses") == null){
                response.sendRedirect("index.jsp");
            }
            else{
                double valorInicial = Double.parseDouble(request.getParameter("txtValorInicial"));
                double taxaJuros = Double.parseDouble(request.getParameter("txtTaxaJuros"));
                double meses = Double.parseDouble(request.getParameter("txtMeses"));
                //$juros = $valor*(pow(1 + ($taxa/100), $meses));
                double juros = valorInicial * Math.pow(1+(taxaJuros/100), meses);
                
                out.println("<p>Para um investimento inicial de: R$" + valorInicial);
                out.println(" a uma taxa de juros compostos de " + juros + "% ao mês,");
                out.println(" você terá R$"+ juros + "ao final de " + meses);
            }
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}