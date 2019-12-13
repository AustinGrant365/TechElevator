<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<div id="surveyResults">
	<div class="top-content">
		<h2>Your Favorite Parks</h2>
		
	</div>

	<c:forEach var="surveys" items="${surveys}">
	<div class="parks">
		<p>${surveys.parkCode}</p>
		
		
	</div>
	</c:forEach>
	
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />







