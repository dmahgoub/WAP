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
@WebServlet(name = "CalculatorServlet", urlPatterns = {"/Calculator"})
public class CalculatorServlet extends HttpServlet {

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
 try {
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
                    + "        <form method=\"POST\" action=\"Calculator\">\n"
                    + "            <div class=\"sum\">\n"
                    + "                <input type=\"text\" name=\"s1\" value=\"" + s1 + "\" /> + \n"
                    + "                <input type=\"text\" name=\"s2\" value=\"" + s2 + "\" /> = \n"
                    + "                <input type=\"text\" name=\"sum\" value=\"" + sum + "\" />\n"
                    + "            </div>\n"
                    + "            <div class=\"multi\">\n"
                    + "                <input type=\"text\" name=\"m1\" value=\"" + m1 + "\" /> * \n"
                    + "                <input type=\"text\" name=\"m2\" value=\"" + m2 + "\" /> = \n"
                    + "                <input type=\"text\" name=\"mul\" value=\"" + mul + "\" />\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                <input type=\"submit\" value=\"Calculate\">\n"
                    + "            </div>\n"
                    + "        </form>\n"
                    + "    </body>\n"
                    + "</html>\n");

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print("<html>\n"
                    + "    <head>        \n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <title>Calculator</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <form method=\"POST\" action=\"Calculator\">\n"
                    + "            <div class=\"sum\">\n"
                    + "                <input type=\"text\" name=\"s1\" value=\"\" /> + \n"
                    + "                <input type=\"text\" name=\"s2\" value=\"\" /> = \n"
                    + "                <input type=\"text\" name=\"sum\" value=\"\" />\n"
                    + "            </div>\n"
                    + "            <div class=\"multi\">\n"
                    + "                <input type=\"text\" name=\"m1\" value=\"\" /> * \n"
                    + "                <input type=\"text\" name=\"m2\" value=\"\" /> = \n"
                    + "                <input type=\"text\" name=\"mul\" value=\"\" />\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                <input type=\"submit\" value=\"Calculate\">\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                Error: " + e.getMessage() + "\n"
                    + "            </div>\n"
                    + "        </form>\n"
                    + "    </body>\n"
                    + "</html>");
        }

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
        try {
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
                    + "        <form method=\"POST\" action=\"Calculator\">\n"
                    + "            <div class=\"sum\">\n"
                    + "                <input type=\"text\" name=\"s1\" value=\"" + s1 + "\" /> + \n"
                    + "                <input type=\"text\" name=\"s2\" value=\"" + s2 + "\" /> = \n"
                    + "                <input type=\"text\" name=\"sum\" value=\"" + sum + "\" />\n"
                    + "            </div>\n"
                    + "            <div class=\"multi\">\n"
                    + "                <input type=\"text\" name=\"m1\" value=\"" + m1 + "\" /> * \n"
                    + "                <input type=\"text\" name=\"m2\" value=\"" + m2 + "\" /> = \n"
                    + "                <input type=\"text\" name=\"mul\" value=\"" + mul + "\" />\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                <input type=\"submit\" value=\"Calculate\">\n"
                    + "            </div>\n"
                    + "        </form>\n"
                    + "    </body>\n"
                    + "</html>\n");

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.print("<html>\n"
                    + "    <head>        \n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <title>Calculator</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <form method=\"POST\" action=\"Calculator\">\n"
                    + "            <div class=\"sum\">\n"
                    + "                <input type=\"text\" name=\"s1\" value=\"\" /> + \n"
                    + "                <input type=\"text\" name=\"s2\" value=\"\" /> = \n"
                    + "                <input type=\"text\" name=\"sum\" value=\"\" />\n"
                    + "            </div>\n"
                    + "            <div class=\"multi\">\n"
                    + "                <input type=\"text\" name=\"m1\" value=\"\" /> * \n"
                    + "                <input type=\"text\" name=\"m2\" value=\"\" /> = \n"
                    + "                <input type=\"text\" name=\"mul\" value=\"\" />\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                <input type=\"submit\" value=\"Calculate\">\n"
                    + "            </div>\n"
                    + "            <div>\n"
                    + "                Error: " + e.getMessage() + "\n"
                    + "            </div>\n"
                    + "        </form>\n"
                    + "    </body>\n"
                    + "</html>");
        }

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
