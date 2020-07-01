<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

	<h2>Gestione Negozio Giochi</h2>
	
	 
	
		<form method="get" action="search">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form>
	
	 
	
	
	<h3><a href="new">Inserisci Gioco</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>titolo</th>
			<th>classificazione_PEGI</th>
			<th>prezzo</th>
			<th>categoria</th>
			
		</tr>
		<c:forEach items="${listNegozio}" var="negozio">
		<tr>
			<td>${negozio.id}</td>
			<td>${negozio.titolo}</td>
			<td>${negozio.classificazione_PEGI}</td>
			<td>${negozio.prezzo }</td>
			<td>${negozio.categoria }</td>
			
			
			<td>
				<a href="edit?id=${negozio.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${negozio.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<br><br>

<form method="post" action="ordinamento">
<INPUT TYPE="radio" name="command" value="0"/>Ordina per titolo
<INPUT TYPE="radio" name="command" VALUE="1"/>Ordina per PEGI  
<INPUT TYPE="radio" name="command" VALUE="2"/> Ordina per categoria
<INPUT TYPE="submit" VALUE="Ordina!" />
</form>

<!--  
	<form action="testChiamata" method="post">
		<input type="text" name="testo" placeholder="Inserisci richiesta">
		<input type="submit" value="Invio">
	</form>
-->
 
</div>
</body>
</html>