<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>
        <title>Application</title>
        <style type="text/css">
            .error {
                border: 1px solid red
                }
            .errorMessage {
            font-color:red;
            }
    </style>
</head>
<body>

<h1> ${message} ${name}. <3 </h1>

<img src="product.jpg">

<br>

<form:form action="/add" modelAttribute="book">
    <form:input path="title" placeholder="title" cssErrorClass="error"/>
    <form:errors path="title" cssClass="errorMessage"/>
    <form:input path="author" placeholder="author" cssErrorClass="error"/>
    <form:errors path="author" cssClass="errorMessage"/>
    <input type="submit" value="Add Book">
</form:form>

<c:forEach items="${books}" var="book">
    <i>${book.title}</i> by ${book.author}<br>
    </c:forEach>

</body>
</html>