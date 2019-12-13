<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>National Park Geek</title>
<link href="https://fonts.googleapis.com/css?family=Roboto&display=swap"
	rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=Amatic+SC&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Martel+Sans&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/4feb6f591c.js" crossorigin="anonymous"></script>
	
<c:url var="cssUrl" value="/css/styles.css" />

<link rel="stylesheet" href="${cssUrl}" />

</head>

<body>

	<header>
	<c:url var="nphome" value="/" />
	
	
	<nav>
		<ul>
			<c:url var="nphome" value="/" />
			<c:url var="npsurvey" value="/survey" />
			<c:url var="npfaves" value="/parkVotes" />
			<li><h1><a href="${nphome}">National Park Fan</a></h1></li>
			<li><a href="${nphome}">Home</a></li>
			<li><a href="${npsurvey}">Survey</a></li>
			<!-- <li><a href="${npfaves}">Park Favorites</a>  -->
		</ul>
	</nav>
	</header>

	<main>