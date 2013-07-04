<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
	<head>
		<title>Portal EG</title>
		<link href="<c:url value="/goodbuy.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/javascripts/jquery.autocomplete.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<script type="text/javascript" src="<c:url value="/javascripts/jquery-1.3.2.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.validate.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.autocomplete.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.puts.js"/>"></script>
		<fmt:setLocale value="pt_br"/>
	</head>
	
<body>
	<div id="header">
		<c:import url="eg.html" />
	</div>
	<div id="erros">
		<ul>
		</ul>
	</div>
	<div id="body">
		<div id="menu">
			<ul>
			</ul>
		</div>
		<div id="content">
		</div>
	</div>
		
