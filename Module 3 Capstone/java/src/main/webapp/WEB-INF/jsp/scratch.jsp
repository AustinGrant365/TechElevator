<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="formAction" value="/forecast" />
    		<form method="POST" action="${formAction}">
        		<div class="temp-btn">
            	<input type="hidden" name="temp" value="Fahrenheit" /> 
            	<input type="hidden" name="parkCode" value="${park.parkCode}" /> 
                <input type="submit" name="false" value="Fahrenheit" />
        		</div>
    		</form>
    		
    		<form method="POST" action="${formAction}">
        		<div class="temp-btn">
           		<input type="hidden" name="temp" value="Celsius" /> 
           		<input type="hidden" name="parkCode" value="${park.parkCode}" /> 
                <input type="submit" name="true" value="Celsius" />
        		</div>
    		</form>

</body>
</html>