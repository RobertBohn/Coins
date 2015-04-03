<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <link href="/resources/style/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>

<html>
<body>
<h1>${message}</h1>

<c:out value="Yo Bitches!"/><p>

<ul>
    <c:forEach items="${names}" var="name">
        <li>${name}</li>
    </c:forEach>
</ul>

</body>
</html>