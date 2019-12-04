<%-- 
    Document   : Choose
    Created on : Dec 4, 2019, 10:58:53 AM
    Author     : 610522
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Collections"%>
<%@page import="mum.cs472.RadioState"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Choose</title>
    </head>
    <body>
        <form method='post' action='ChooseServlet'>
            <p>Is JSP cool?</p>
            <%! int i = 0;%>
            <%
                
            %>

            <input type='radio' value='1' name='radioJSPCool' ${ choices.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='radioJSPCool' ${ choices.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <% i++; %>
            <p>Is JSF way cool?</p>
            <input type='radio' value='1' name='JSFwayCool' ${ choices.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='JSFwayCool' ${ choices.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <% i++;%>
            <p>Is the moon made of cheese?</p>
            <input type='radio' value='1' name='moonCheese' ${ choices.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='moonCheese' ${ choices.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
        </form>
    </body>
</html>
