<%-- 
    Document   : filter
    Created on : Feb 26, 2023, 10:08:11 PM
    Author     : Dũng
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FilterStudent" method="get">
             Search by name: <input type="text" name="name"><br>
             Gender: <input type="radio" value="" name="gender"> All <input type="radio" value="1" name="gender"> Male <input type="radio" value="0" name="gender"> Female
             <button type="submit">Search</button>
        </form>
       
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>classId</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${list}">
                    <tr>
                        <td>${s.id}</td>
                        <td>${s.name}</td>
                        <td>
                            <c:if test="${s.gender}">  <!-- neu s.gender(true) thi xuat ra hinh con trai -->
                                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Mars_symbol.svg/220px-Mars_symbol.svg.png" width="30px">
                            </c:if>   
                                <c:if test="${!s.gender}">  <!-- false thi ra hinh con gai -->
                                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Venus_symbol.svg/800px-Venus_symbol.svg.png" width="30px">
                            </c:if>  
                                
                                <!-- checkbox dung toan tu 3 ngoi -->
<!--                                <input type="checkbox" ${s.gender==true?"checked":""} >-->
                        </td>
                        <td>${s.dob}</td>
                        <td>${s.classId}</td>
                    </tr>
                </c:forEach>           

            </tbody>
        </table>
    </body>
</html>
