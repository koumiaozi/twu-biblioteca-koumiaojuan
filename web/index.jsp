<%@ page import="com.twu.biblioteca.BibliotecaApp" %>
<%@ page import="java.util.*" pageEncoding="UTF-8" %>
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
<input type="button" onclick="getBooks()" value="List Of books"/>
<input type="button" onclick="invalidTip()" value="button"/>
<input type="button" onclick="window.close()" value="quit"/>
<br/>
<br/>
<input type="button" onclick="checkOutBook()" value="Check Out Book"/>
<br/>
<br/>


<input type="button" onclick="returnBook()" value="Return Book"/>
<br/>
<br/>
<%
    String res;
    Book returnBook = BibliotecaApp.checkOutBook("Amy");
    res = "That is not a valid book to return";
%>
<input type="text" id="book" style="visibility: hidden; width: 300px; height: 50px;" value="<%=res%>"/>

<%
    String information = "";
    Book book = BibliotecaApp.checkOutBook("Amy");
    if (null != book) {
        information = "Thank you!Enjoy your book";
    } else {
        information = "Sorry,that book is not avaliable";
    }
%>
<input type="text" id="information" style="visibility: hidden; width: 300px; height: 50px;" value="<%=information%>"/>

<%
    String result = "";
    for (Book book1 : BibliotecaApp.getAllBooks()) {
        result += BibliotecaApp.getBookInformation(book1);
    }
%>

<input type="text" id="result" style="visibility: hidden; width: 300px; height: 100px; overflow: hidden" ;
       value="<%=result%>"/>

<script>
    function getBooks() {
        document.getElementById("result").style.visibility = "visible";
    }

    function invalidTip() {
        alert("Please select a valid option");
    }

    function checkOutBook() {
        document.getElementById("information").style.visibility = "visible";
    }
    function returnBook() {
        document.getElementById("book").style.visibility = "visible";
    }
</script>
</body>
</html>