<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" style="width:300px">
    
    <c:forEach var="alien" items="${aliens}">
     <tr>
      <td>${alien.aid}</td>
      <td>${alien.aname}</td>
      <td>${alien.tech}</td>
     </tr>
    </c:forEach>
    
</table>
</body>
</html>