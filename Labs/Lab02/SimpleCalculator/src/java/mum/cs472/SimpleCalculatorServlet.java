/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 610522
 */
@WebServlet(name = "SimpleCalculatorServlet", urlPatterns = {"/SimpleCalculator"})
public class SimpleCalculatorServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s1 = request.getParameter("s1");
        String s2 = request.getParameter("s2");
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        String m1 = request.getParameter("m1");
        String m2 = request.getParameter("m2");
        int mul = Integer.parseInt(m1) * Integer.parseInt(m2);
        PrintWriter out = response.getWriter();
        out.print("<html>\n"
                + "    <head>        \n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <title>Calculator</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "            <div>" + s1 + " + " + s2 + " = " + sum + "</div>"
                + "            <div>" + m1 + " * " + m2 + " = " + mul + "</div>"
                + "    </body>\n"
                + "</html>\n");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String s1 = request.getParameter("s1");
        String s2 = request.getParameter("s2");
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        String m1 = request.getParameter("m1");
        String m2 = request.getParameter("m2");
        int mul = Integer.parseInt(m1) * Integer.parseInt(m2);
        PrintWriter out = response.getWriter();
        out.print("<html>\n"
                + "    <head>        \n"
                + "        <meta charset=\"UTF-8\">\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "        <title>Calculator</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "            <div>" + s1 + " + " + s2 + " = " + sum + "</div>"
                + "            <div>" + m1 + " * " + m2 + " = " + mul + "</div>"
                + "    </body>\n"
                + "</html>\n");
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
