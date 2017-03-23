<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String metaTitle = "Student Notification";
	String metaDescription = "";
	List<String> moreCss = new LinkedList<String>();

	//mock Data
	String categories = "{\"categories\":[{\"id\":1,\"name\":\"University\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":999},{\"id\":2,\"name\":\"Principle\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":998},{\"id\":3,\"name\":\"H.O.D.\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":997},{\"id\":4,\"name\":\"Staffs\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":996},{\"id\":5,\"name\":\"Jobs\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":995},{\"id\":6,\"name\":\"Seminars\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":994},{\"id\":7,\"name\":\"Sports\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":993},{\"id\":8,\"name\":\"Symposium\",\"backgroundImage\":\"../resources/assets/categories/default/university.jpg\",\"priorityWeight\":992}]}";
	//Object obj=JSONValue.parse(s); 
%>
<!DOCTYPE html>
<html>
<%@include file="header.jspf"%>
<body>
	<%@include file="nav.jspf"%>
	<div class="container">
		<div class="text-center">
			<h1>Categories</h1>
		</div>
		<div class="row">
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories">
					<img src="../resources/assets/categories/default/university.jpg"
						alt="Default University">
					<div class="categories-container">
						<div class="categories-title">University</div>
						<div class="categories-content">
							<p class="time">
								02<br />Mar
							</p>
							<p class="sender">Ashok, COE</p>
							<p class="subject">Examination Time Table</p>
							<p class="message">The Examination Time Table for the
								Semester Nov, 17 has been announced. Please refer to it.</p>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-12">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
			<div class="col-md-3 col-sm-4 col-xs-6">
				<div class="categories"></div>
			</div>
		</div>
	</div>
	<!--scripts loaded here -->
	<script src="../resources/js/jquery.min.js"></script>
	<script src="../resources/js/bootstrap.min.js"></script>
	<script src="../resources/js/categories.js"></script>
	<script src="../resources/js/jquery.easing.min.js"></script>
	<script src="../resources/js/wow.js"></script>
	<script
		src="../resources/bootstrapValidator/js/bootstrapValidator.min.js"></script>
</body>
</html>