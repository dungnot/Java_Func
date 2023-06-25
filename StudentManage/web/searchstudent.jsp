<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : searchstudent
    Created on : Mar 1, 2023, 9:59:40 PM
    Author     : Dũng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SearchStudent" method="post">
            name <input type="text" name="name" value="${param["name"]}"> <br>
            dob <input type="date" name="dob" value="${param["dob"]}"><br><!-- comment -->
            <input type="submit" value="search">
        </form>
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Dob</th>
                        <th>class</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="c" items="${list}">
                    <tr>
                        <td>${c.id}</td>
                        <td>${c.name}</td>
                        <td>${c.gender}</td>
                        <td>${c.dob}</td>
                        <td>${c.classId}</td>
                    </tr>
                </c:forEach>            
                    
                </tbody>
            </table>

    </body>
</html>
