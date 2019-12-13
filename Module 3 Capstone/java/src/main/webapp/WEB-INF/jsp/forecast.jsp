<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="forecast">

	<h1>${parkDetail.parkName }</h1>
	
	<h2>5-Day Forecast</h2>

	<div class="forecast">

		<c:forEach var="weather" items="${weather}">
		
			<div class="days">
			
			<c:choose>
				<c:when test = "${weather.fiveDayForecast == 1}" >
				
				<h3>
				
				<fmt:setLocale value="en-US"/>  <jsp:useBean id="today" class="java.util.Date"/> 
				<fmt:formatDate value="${today}"/></h3>
				
				<c:url var="weatherImg" value="img/weather/${weather.forecast}.png">
					<c:param name="forecast" value="${weather.forecast}">
					</c:param>
				</c:url>

				<img src="${weatherImg}" width="70px" />

				<p>High: ${weather.highTemp} F</p>
				<p>Low: ${weather.lowTemp} F</p>
				</c:when>
				
				
				<c:when test = "${weather.fiveDayForecast == 2}" >
				<h3>Day: ${weather.fiveDayForecast}<br></h3>
				
				<c:url var="weatherImg" value="img/weather/${weather.forecast}.png">
					<c:param name="forecast" value="${weather.forecast}">
					</c:param>
				</c:url>

				<img src="${weatherImg}" width="70px" />

				<p>High: ${weather.highTemp} F</p>
				<p>Low: ${weather.lowTemp} F</p>
				</c:when>
				
				
				<c:when test = "${weather.fiveDayForecast == 3}" >
				<h3>Day: ${weather.fiveDayForecast}<br></h3>
				
				<c:url var="weatherImg" value="img/weather/${weather.forecast}.png">
					<c:param name="forecast" value="${weather.forecast}">
					</c:param>
				</c:url>

				<img src="${weatherImg}" width="70px" />

				<p>High: ${weather.highTemp} F</p>
				<p>Low: ${weather.lowTemp} F</p>
				</c:when>
				
				
				<c:when test = "${weather.fiveDayForecast == 4}" >
				<h3>Day: ${weather.fiveDayForecast}<br></h3>
				
				<c:url var="weatherImg" value="img/weather/${weather.forecast}.png">
					<c:param name="forecast" value="${weather.forecast}">
					</c:param>
				</c:url>

				<img src="${weatherImg}" width="70px" />

				<p>High: ${weather.highTemp} F</p>
				<p>Low: ${weather.lowTemp} F</p>
				</c:when>
				
				
				<c:when test = "${weather.fiveDayForecast == 5}" >
				<h3>Day: ${weather.fiveDayForecast}<br></h3>
				
				<c:url var="weatherImg" value="img/weather/${weather.forecast}.png">
					<c:param name="forecast" value="${weather.forecast}">
					</c:param>
				</c:url>

				<img src="${weatherImg}" width="70px" />

				<p>High: ${weather.highTemp} F</p>
				<p>Low: ${weather.lowTemp} F</p>
				</c:when>
				
			</c:choose>
			</div>
			
			
			
		</c:forEach>

	</div>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />




