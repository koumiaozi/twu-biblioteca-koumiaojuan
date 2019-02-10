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
       onclick="getBooks()"
       value="List Of books" />
<br/>
<br />

<input type="button"
       onclick="invalidTip()"
       value="button" />
<script>
    function getBooks() {
        alert("1234");
        <%BibliotecaApp.printBookInformation(BibliotecaApp.getAllBooks());%>
    }
    function invalidTip() {
        alert("Please select a valid option");
    }
</script>
</body>
</html>
