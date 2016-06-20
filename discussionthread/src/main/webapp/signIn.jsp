<%-- 
    Document   : signin
    Created on : Jun 20, 2016, 3:30:43 AM
    Author     : Meghan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In Page</title>
    </head>
    <body>
        <form method="POST" action="SignIn">
            User Name: <input type="text" name="txtUserName" /><br />
            Password <input type="password" name="txtPassword" /><br />
            <br />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
