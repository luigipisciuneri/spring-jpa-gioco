<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Ordinamento per attacco</h3>
					<table border="1" cellpadding="5">
						<tr>
							
			<th>ID</th>
			<th>titolo</th>
			<th>classificazione_PEGI</th>
			<th>prezzo</th>
			<th>categoria</th>
							
						</tr>
						<c:forEach items="${lista}" var="negozio">
							<tr>
								
		<td>${negozio.id}</td>
			<td>${negozio.titolo}</td>
			<td>${negozio.classificazione_PEGI}</td>
			<td>${negozio.prezzo }</td>
			<td>${negozio.categoria }</td>
								

							</tr>
						</c:forEach>
					</table>

</body>
</html>