<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : classlist
    Created on : Feb 24, 2023, 11:00:28 PM
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
        <h1>Class list!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Room</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="c" items="${list}">
                  <tr>
                    <th>${c.id}</th>
                    <th><a href="StudentList?cid=${c.id}">${c.name}</a></th>
                    <th>${c.code}</th>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </body>
</html>
