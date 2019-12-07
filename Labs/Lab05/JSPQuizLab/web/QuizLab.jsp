<%-- 
    Document   : QuizLab
    Created on : Dec 6, 2019, 7:30:43 PM
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
        <%! String[] questions = {
                "3, 1, 4, 1, 5",
                "1, 1, 2, 3, 5",
                "1, 4, 9, 16, 25",
                "2, 3, 5, 7, 11",
                "1, 2, 4, 8, 16"
            };
            int[] answers = {9, 8, 36, 13, 32};
            int index = -1;
            int age = -1;
            Quiz q = new Quiz(questions, answers);
            String wrongAnswer = "";
        %>

        <%
            session.setAttribute("quiz", q);

            String answer = request.getParameter("answer");
            try {
                if (answer != null && !answer.isEmpty()) {

                    if (q.checkAnswer(Integer.parseInt(answer), index)) {
                        index++;
                    } else {
                        wrongAnswer = "Try Again!";
                    }

                } else if (answer == null || answer.isEmpty()) {
                    wrongAnswer = "Answer is required!";
                }
            } catch (NumberFormatException e) {
                wrongAnswer = e.getMessage();
            }

        %>
        <header>
            <h1>The Number Quiz</h1>
            <p><% if (age == -1) {%>
                <%= "Your age? "%><input type="text" name="age" id="age">
                <% age = Integer.parseInt(request.getParameter("age"));
                    }
                    if (age < 4 || age > 100) {%>
                <%= "Please enter a number between 4 and 100!"%>
                <% } else {%>
                <%=  "Age: " + age%>
                <% }%></p>
               <p> Your score is ${ q.score }</p>
        </header>
        <form method="POST" action="QuizLab">
            <fieldset>
                <p>Guess the number in the sequence.</p>

                <p><%= q.getQuestion(index)%></p>
                <p>
                    Your answer: <input type="text" name="answer" id="answer">
                </p>
                <input type="submit" value="Submit">
                <p><%= wrongAnswer%></p>
            </fieldset>
        </form>
    </body>
</html>
