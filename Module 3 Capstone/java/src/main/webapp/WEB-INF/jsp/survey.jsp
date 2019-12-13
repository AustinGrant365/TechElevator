<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<div class="surveyForm">

		<h2>Give us your feedback</h2>

		<form:form method="POST" action="survey" modelAttribute="survey">

			<label for="parkName">Favorite National Park:</label>

			<form:select path="parkCode">
				<option value="">Select your favorite park</option>
				<c:forEach var="parks" items="${parks}">
					<option value="${parks.parkCode}">${parks.parkName}</option>
				</c:forEach>
			</form:select>
			<form:errors style="color: red" path="parkCode" />

			<br>
			<br>
			<label for="email">Your email:</label>
			<form:input path="email" placeholder="YourEmail@site.com" />
			<form:errors style="color: red" path="email" />

			<br>
			<br>
			<label for="state">State of Residence:</label>
			<form:errors style="color: red" path="state" />
			<select id="state" name="state">
				<option value="">Select your state</option>
				<option value="Alabama">Alabama</option>
				<option value="Alaska">Alaska</option>
				<option value="Arizona">Arizona</option>
				<option value="Arkansas">Arkansas</option>
				<option value="California">California</option>
				<option value="Colorado">Colorado</option>
				<option value="Connecticut">Connecticut</option>
				<option value="Delaware">Delaware</option>
				<option value="District of Columbia">District of Columbia</option>
				<option value="Florida">Florida</option>
				<option value="Georgia">Georgia</option>
				<option value="Guam">Guam</option>
				<option value="Hawaii">Hawaii</option>
				<option value="Idaho">Idaho</option>
				<option value="Illinois">Illinois</option>
				<option value="Indiana">Indiana</option>
				<option value="Iowa">Iowa</option>
				<option value="Kansas">Kansas</option>
				<option value="Kentucky">Kentucky</option>
				<option value="Louisiana">Louisiana</option>
				<option value="Maine">Maine</option>
				<option value="Maryland">Maryland</option>
				<option value="Massachusetts">Massachusetts</option>
				<option value="Michigan">Michigan</option>
				<option value="Minnesota">Minnesota</option>
				<option value="Mississippi">Mississippi</option>
				<option value="Missouri">Missouri</option>
				<option value="Montana">Montana</option>
				<option value="Nebraska">Nebraska</option>
				<option value="Nevada">Nevada</option>
				<option value="New Hampshire">New Hampshire</option>
				<option value="New Jersey">New Jersey</option>
				<option value="New Mexico">New Mexico</option>
				<option value="New York">New York</option>
				<option value="North Carolina">North Carolina</option>
				<option value="North Dakota">North Dakota</option>
				<option value="Northern Marianas Islands">Northern Marianas
					Islands</option>
				<option value="Ohio">Ohio</option>
				<option value="Oklahoma">Oklahoma</option>
				<option value="Oregon">Oregon</option>
				<option value="Pennsylvania">Pennsylvania</option>
				<option value="Puerto Rico">Puerto Rico</option>
				<option value="Rhode Island">Rhode Island</option>
				<option value="South Carolina">South Carolina</option>
				<option value="South Dakota">South Dakota</option>
				<option value="Tennessee">Tennessee</option>
				<option value="Texas">Texas</option>
				<option value="Utah">Utah</option>
				<option value="Vermont">Vermont</option>
				<option value="Virginia">Virginia</option>
				<option value="Virgin Islands">Virgin Islands</option>
				<option value="Washington">Washington</option>
				<option value="West Virginia">West Virginia</option>
				<option value="Wisconsin">Wisconsin</option>
				<option value="Wyoming">Wyoming</option>
			</select>
			<br>
			<br>

			<label for="activityLevel">Activity Level:</label>
			<br>
			<br>
			<form:radiobutton path="activityLevel" value="extremely active" />extremely active
			<form:radiobutton path="activityLevel" value="active" />active
			<form:radiobutton path="activityLevel" value="sedentary" />sedentary
			<form:radiobutton path="activityLevel" value="inactive" />not very active
			<form:errors style="color: red" path="activityLevel" />
			<br>
			<br>

			<input class="submit" type="submit" value="Submit">

		</form:form>

	</div>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />

