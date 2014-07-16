<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Form Validation Study</h1>

		<form action="FormValidationServlet">
			User Name <input type="text" name="username"><br> Age<input
				type="text" name="age"><br> <input type="submit"
				value="Validate">
		</form>

		<%
			ArrayList<String> obtainedErrorsList=(ArrayList<String>)request.getAttribute("ERRORS_LIST");
			
			if(obtainedErrorsList!=null){
				for( String s  :  obtainedErrorsList){
					out.println("<br>"+s);
				}
			}
		%>

	</center>
</body>
</html>