<%@ page import="com.twu.biblioteca.BibliotecaApp" %>
<%@ page import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.twu.biblioteca.Book" %>

<%--
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
<input type="button" onclick="getBooks()" value="List Of books" />
<input type="button" onclick="invalidTip()" value="button" />
<input type="button" onclick="window.close()" value="quit" />
<br/>
<br/>
<%
    String result = "";
   for (Book book : BibliotecaApp.getAllBooks()) {
        result += BibliotecaApp.getBookInformation(book);
   }
%>

<input type="text" id="result" style="visibility: hidden; width: 300px; height: 100px; overflow: hidden";
       value="<%=result%>"/>

<script>
    function getBooks() {
        document.getElementById("result").style.visibility = "visible";
    }
    function invalidTip() {
        alert("Please select a valid option");
    }
</script>
</body>
</html>