<%-- 
    Document   : enterNewPost
    Created on : Jun 20, 2016, 3:32:15 AM
    Author     : Meghan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter New Post Page</title>
    </head>
    <body>
        <form method="POST" action="CreatePost">
            Enter New Post:
            <br>
            <br>
            <textarea name="txtPost" rows="4" cols="50"></textarea>
            <br>
            <input type="submit" value="Submit">
            <br>
            <br>
            <a href="./viewPosts.jsp">View Posts</a>
        </form>
    </body>
</html>
