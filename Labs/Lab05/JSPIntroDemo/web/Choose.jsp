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
            <input type='radio' value='1' name='radioJSPCool' ${ radioJSPCool.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='radioJSPCool' ${ radioJSPCool.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is JSF way cool?</p>
            <input type='radio' value='1' name='JSFwayCool' ${ JSFwayCool.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='JSFwayCool' ${ JSFwayCool.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is the moon made of cheese?</p>
            <input type='radio' value='1' name='moonCheese' ${ moonCheese.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='moonCheese' ${ moonCheese.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
        </form>
    </body>
</html>
