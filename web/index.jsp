<%@ page import="com.twu.biblioteca.BibliotecaApp" %><%--
  Created by IntelliJ IDEA.
  User: mjkou
  Date: 10/02/2019
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$books$</title>
</head>
<body>
<input type="button"
       onclick="<%BibliotecaApp.printBookInformation(BibliotecaApp.getAllBooks());%>;"
       value="List Of books" />
<br/>

</body>
</html>
