<%-- 
    Document   : layout
    Created on : May 31, 2022, 1:04:13 PM
    Author     : SE150886 Phan Hong Long
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainControler">
            Search <input type="text" name="search"/>
            <input type="submit" name="action" value="Search"/></br>
        </form>
        <form action="MainController">
            Show List Event<input type="submit" name="action" value="ShowListEvent"/>
        </form>
        <form action="MainControler">
            Search By Company <input type="text" name="searchByCompany"/>
            <input type="submit" name="action" value="SearchByCompany"/></br>
        </form>
        <form action="MainControler">
            Search By Teacher <input type="text" name="searchByTeacher"/>
            <input type="submit" name="action" value="SearchByTeacher"/></br>
        </form>
    </body>
</html>
