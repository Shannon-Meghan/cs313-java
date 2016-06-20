<%-- 
    Document   : viewPosts
    Created on : Jun 20, 2016, 3:32:27 AM
    Author     : Meghan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Below is the core library set to the prefix c-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts Page</title>
    </head>
    <body>
        Posts:
            <br><br>
            <!--grabs the scriptures attribute from the showList.jsp and loops through it-->
            <!--forEach tag is from the core library, EL syntax is used for the request attribute and the iterator-->
            <c:forEach var="post" items="${posts}">

                <strong>${post}<br />

            </c:forEach>
            <br>
    </body>
</html>
