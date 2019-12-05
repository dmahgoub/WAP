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
		
        String choices[] = { "radioJSPCool", "JSFwayCool", "moonCheese" };
        for(String choice : choices) {
            String choiceValue = request.getParameter(choice);
            RadioState radioState = new RadioState();
            if (choiceValue != null) {
                if (choiceValue.equals("1")) {
                    radioState.setYesCheck("checked");
                } else {
                    radioState.setNoCheck("checked");
                }
				session.setAttribute(choice, radioState);
                System.out.println("choice= " + choiceValue);
            } else {
				s.removeAttribute(choice);
                System.out.println("No choice made");
            }
        }

        RequestDispatcher dispatch = request.getRequestDispatcher("Choose.jsp");
        dispatch.forward(request, response);
    }
}
