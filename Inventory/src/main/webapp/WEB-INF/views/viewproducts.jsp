<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="/css/bootstrap.css"      rel="stylesheet">
	<link href="/css/custom.css"      rel="stylesheet">
	<link href="/css/main.css"      rel="stylesheet">
</head>
<body>
<h1 align="center">Inventory List</h1>
<table id="t02"  cellpadding="2">
<tr>
<th>
<a  href="/enroll"><h2>Home: Inventory Entry</h2></a>

</th>

<th>

<a  align ="right" href="/delete"><h2>Delete All Inventory</h2></a>
</th>
</tr>
</table>
<table >
<tr>


  <th>Page No : 
<c:forEach var="count" items="${pageCount}"  varStatus="theCount"> 
<a align="right" href="/viewproducts/${theCount.count}">${theCount.count}</a>   
</c:forEach>  
</th>

</tr>

</table>
   
<form:form  class="form-horizontal" >
<table id="t01" border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Entity Name</th><th>Quantity</th></tr>  

   <c:forEach var="student" items="${list}"> 
   <tr>  
   <td>${student.id}</td>  
   <td>${student.firstName}</td> 
   <td>${student.quantity}</td>   
   </tr>  
   </c:forEach> 
   
   
   </table>  
   <br/>
   
  
   </form:form>
</body>
</html>