<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="park-detail">

	<h2>${parkDetail.parkName }, ${parkDetail.state }</h2>
	<h3>Founded in ${parkDetail.yearFounded }</h3>

	<div class="detail-content">
		
		
		<c:url var="pictureImg"
			value="img/parks/${parkDetail.parkCode.toLowerCase()}.jpg" />
		<img src="${pictureImg }" />

		<p class="detail-desc">${parkDetail.parkDescription }</p>

		<div class="quote-box">
			<p class="quote">
				<i class="fas fa-quote-left"></i> &nbsp;${parkDetail.quote}&nbsp;<i
					class="fas fa-quote-right"></i><br> <i>-
					${parkDetail.quoteSource}</i>
			</p>
		</div>
		
		<div class="stats">
			<div class="detail-left">
				<p>${parkDetail.acreage}&nbsp;acres</p>
				<p>${parkDetail.elevationFeet}&nbsp;foot&nbsp;elevation</p>
				<p>${parkDetail.milesOfTrail}&nbsp;miles</p>
				<p>${parkDetail.numOfCampsites}&nbsp;campsites</p>
			</div>
			<div class="detail-right">
				<p>${parkDetail.climate}&nbsp;climate</p>
				<p>${parkDetail.annualVisitorCount}&nbsp;annual&nbsp;visitors</p>
				<p>${parkDetail.entryFee}&nbsp;entrance&nbsp;fee</p>
				<p>${parkDetail.numOfAnimalSpecies}&nbsp;animal&nbsp;species</p>
			</div>
		</div>

		<div class="forecast-link">
			<c:url var="forecast" value="/forecast">
				<c:param name="weatherParkCode" value="${parkDetail.parkCode}" />
			</c:url>
			<h3>
				<a href="${forecast}">View the 5-day Forecast</a>
			</h3>
		</div>


	</div>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />
