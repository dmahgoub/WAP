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

    private RadioState[] choices = new RadioState[3];

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("choices", choices);
        String rButtons[] = {
            request.getParameter("radioJSPCool"),
            request.getParameter("JSFwayCool"),
            request.getParameter("moonCheese")
        };
        for (int i = 0; i < rButtons.length; i++) {
            String choice = rButtons[i];
            choices[i] = new RadioState();
            if (choice != null) {
                if (choice.equals("1")) {
                    choices[i].setYesCheck("checked");
                } else if(choice.equals("0")){
                    choices[i].setNoCheck("checked");
                }
                System.out.println("choice= " + choice);
            } else {
                System.out.println("No choice made");
            }
        }

        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }
}
