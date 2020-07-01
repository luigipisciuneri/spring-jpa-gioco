<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>New Gioco</h2>
		<form:form action="save" method="post" modelAttribute="negozioGiochi">
			<table border="0" cellpadding="5">
				<tr>
					<td>titolo: </td>
					
					
					<td><form:input path="titolo"/></td>
				</tr>
				<tr>
					<td>classificazione_PEGI: </td>
					<td><form:input path="classificazione_PEGI" /></td>
				</tr>
				<tr>
					<td>prezzo: </td>
					<td><form:input path="prezzo" /></td>
				</tr>	
					<tr>
					<td>categoria: </td>
			<!-- 	<td> <form:input path="categoria" />elenco categorie </td>  -->   
				
				<td><form:select path="categoria">
					 <form:option value="HORROR" label="HORROR" />
					 <form:option value="FANTASY" label="Non FANTASY" />
					 <form:option value="AVVENTURA" label="AVVENTURA" />
					 <form:option value="SPORT" label="SPORT" />
					 </form:select></td>
				
				<!-- 
				<td>  <select name='categoria'>
					        <option value='HORROR'>HORROR</option>
					        <option value='FANTASY'>FANTASY</option>
					        <option value='AVVENTURA'>AVVENTURA</option>
					        <option value='SPORT'>SPORT</option>					 
					    </select>  
					    </td>
				 -->
					    
				</tr>
				
			   </td>
				</tr>	
	
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>

</body>
</html>