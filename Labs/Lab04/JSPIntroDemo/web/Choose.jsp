<%-- 
    Document   : Choose
    Created on : Dec 4, 2019, 10:58:53 AM
    Author     : 610522
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Choose</title>
    </head>
    <body>
        <form method='post' action='ChooseServlet'>
            <p>Is JSP cool?</p>
            <input type='radio' value='1' name='radioJSPCool' ${ choice.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='radioJSPCool' ${ choice.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is JSF way cool?</p>
            <input type='radio' value='1' name='JSFwayCool' ${ choice.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='JSFwayCool' ${ choice.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
            <p>Is the moon made of cheese?</p>
            <input type='radio' value='1' name='moonCheese' ${ choice.yesCheck }><span>Yes</span><br/>
            <input type='radio' value='0' name='moonCheese' ${ choice.noCheck }><span>No</span><br/>
            <input type='submit' name='btnSubmit' value='Submit'/>
        </form>
    </body>
</html>
