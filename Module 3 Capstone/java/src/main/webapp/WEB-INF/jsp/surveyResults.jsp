<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<div id="surveyResults">
		<div class="top-parks">
			<h2>Survey Results</h2>
			<h3>See how visitors have rated our parks!</h3>
		</div>
	</div>

	<c:forEach var="surveys" items="${surveys}">

	<div class="results">
		<div>
			<c:url var="parkDetail" value="/parkDetail?id=${surveys.parkCode}" />
			<c:url var="pictureImg" value="img/parks/${surveys.parkCode.toLowerCase()}.jpg" />
	
			<a href="${parkDetail}"><img src="${pictureImg }" /></a>
		</div>
		
		<div>
			<h3>${surveys.parkName}</h3>
			<div>
				<div class="votes">
					<p>${surveys.voteCount}<br>votes</p>
				</div>
				<p class="survey-desc">${surveys.parkDescription}</p>
				<p id="read-more"><a href="${parkDetail}">Read more... </a>
			</div>
		</div>
	</div>
	
	</c:forEach>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />


