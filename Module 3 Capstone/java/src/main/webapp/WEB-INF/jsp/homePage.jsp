<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<link href='https://fonts.googleapis.com/css?family=Capriola'
	rel='stylesheet'>

<section class="parks-main">

	<h2>Our Parks</h2>

	<div id="main-content">

		<c:forEach var="park" items="${parks}">
			<div class="parks">

				<c:url var="parkDetail" value="/parkDetail?id=${park.parkCode}">
					<c:param name="parkCode" value="${park.parkCode}">
					</c:param>
				</c:url>
				<c:url var="pictureImg"
					value="img/parks/${park.parkCode.toLowerCase() }.jpg" />
				<a href="${parkDetail}"> <img src="${pictureImg }" /></a>

				<div class="description">
					<h3>
						<a href="${parkDetail}">${park.parkName }</a>
					</h3>
					<p id="park-description">${park.parkDescription}</p>
				</div>

			</div>
		</c:forEach>

	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />










