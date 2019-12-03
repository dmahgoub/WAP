package mum.cs472;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 610522
 */
@WebServlet(urlPatterns = {"/Quiz"})
public class QuizServlet extends HttpServlet {

    private static String[] questions = {
        "3, 1, 4, 1, 5",
        "1, 1, 2, 3, 5",
        "1, 4, 9, 16, 25",
        "2, 3, 5, 7, 11",
        "1, 2, 4, 8, 16"
    };
    private static int[] answers = {9, 8, 36, 13, 32};

    private static int index = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        try {
            Quiz q = new Quiz(questions, answers);
            session.setAttribute("quiz", q);
            String answer = request.getParameter("answer");
            if (answer != null) {
                Integer parsedAnswer = Integer.parseInt(answer);

                if (!q.checkAnswer(parsedAnswer, ++index)) {
                    throw new Exception("Wrong Answer");
                }
            }
            try (PrintWriter out = response.getWriter()) {
                out.print("<!DOCTYPE html>\n"
                        + "<html>\n"
                        + "\n"
                        + "<head>\n"
                        + "    <title>Quiz Servlet</title>\n"
                        + "    <meta charset=\"UTF-8\">\n"
                        + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                        + "</head>\n"
                        + "\n"
                        + "<body>\n"
                        + "    <header>\n"
                        + "        <h1>The Number Quiz</h1>\n"
                        + "        <p>Your score is <span name=score>" + q.getScore() + "</span></p>\n"
                        + "    </header>\n"
                        + "    <div>\n"
                        + "        <form method=\"POST\" action=\"QuizServlet\">\n"
                        + "            <fieldset>\n"
                        + "                <p>Guess the number in the sequence.</p>\n"
                        + "                <p>" + q.getQuestion(index) + "</p>\n"
                        + "                <p>\n"
                        + "                    Your answer: <input type=\"text\" name=\"answer\" id=\"answer\">\n"
                        + "                </p>\n"
                        + "                <input type=\"submit\" value=\"Submit\">\n"
                        + "            </fieldset>\n"
                        + "        </form>\n"
                        + "    </div>\n"
                        + "\n"
                        + "</body>\n"
                        + "\n"
                        + "</html>");
            }
        } catch (Exception e) {
            try (PrintWriter out = response.getWriter()) {
                out.print("Try Again: " + e.getMessage());
            }
        }
    }
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
        processRequest(request, response);
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
