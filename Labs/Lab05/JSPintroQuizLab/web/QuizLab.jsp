<%-- 
    Document   : QuizLab
    Created on : Dec 4, 2019, 10:55:22 AM
    Author     : 610522
--%>

<%@page import="mum.cs472.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Quiz</title>
    </head>
    <body>
        <%!
            static private String[] questions = {
                "3, 1, 4, 1, 5",
                "1, 1, 2, 3, 5",
                "1, 4, 9, 16, 25",
                "2, 3, 5, 7, 11",
                "1, 2, 4, 8, 16"
            };
            static private int[] answers = {9, 8, 36, 13, 32};
            static private int index = 0;
            static private Quiz q = new Quiz(questions, answers);%>

        <%
            session.setAttribute("quiz", q);
            String answer = request.getParameter("answer");
            String wrongAnswer = "";
            if (answer != null && !answer.isEmpty()) {
                if (q.checkAnswer(Integer.parseInt(answer), index)) {
                    index++;
                } else {
                    wrongAnswer = "Try Again";
                }
            }
        %>
        <header>
            <h1>The Number Quiz</h1>
            <p>Your score is ${ q.score() }</p>
        </header>
        <form method="POST" action="QuizLab_jsp">
            <fieldset>
                <p>Guess the number in the sequence.</p>
                <p>${ q.question(index) }</p>
                <p>
                    Your answer: <input type="text" name="answer" id="answer">
                    <input type="button" value="Hint">
                </p>
                <input type="submit" value="Submit">
                <p>${ wrongAnswer }</p>
            </fieldset>
        </form>
    </body>
</html>
