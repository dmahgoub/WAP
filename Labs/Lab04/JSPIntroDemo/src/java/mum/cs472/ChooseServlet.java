/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChooseServlet extends HttpServlet {

    private RadioState state = new RadioState();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("choice", state);
        String choices[] = {
            request.getParameter("radioJSPCool"),
            request.getParameter("JSFwayCool"),
            request.getParameter("moonCheese")
        };
        for (String choice : choices) {
            if (choice != null) {
                if (choice.equals("1")) {
                    state.setYesCheck("checked");
                } else {
                    state.setNoCheck("checked");
                }
                System.out.println("choice= " + choice);
                state.resetChecks();
            } else {
                
                System.out.println("No choice made");
            }
        }

        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }
}
