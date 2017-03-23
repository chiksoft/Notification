<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Student Notification</title>
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="./resources/css/animate.min.css" />
<link rel="stylesheet" href="./resources/css/ionicons.min.css" />
<link rel="stylesheet" href="./resources/css/home.styles.css" />
<link rel="stylesheet"
	href="./resources/bootstrapValidator/css/bootstrapValidator.min.css" />
</head>
<body>
	<nav id="topNav" class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand page-scroll" href="#first"><img
					src="./resources/assets/Logomakr_2GGKsn.png" /><span
					class="hidden-sm hidden-xs">Student Notification</span></a>
			</div>
			<div class="navbar-collapse collapse" id="bs-navbar">
				<ul class="nav navbar-nav">
					<li><a class="page-scroll" href="#first">Home</a></li>
					<li><a class="page-scroll" href="#four">How it works</a></li>
					<li><a class="page-scroll" href="#asideaside">Mobile App</a></li>
					<li><a class="page-scroll" href="#one">About</a></li>
					<li><a class="page-scroll" href="#last">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a class="page-scroll btn btn-navbar"
						title="A free Bootstrap video landing theme"
						href="./views/categories.jsp">Test Application Login</a></li>
					<li><a class="page-scroll btn btn-navbar"
						title="A free Bootstrap video landing theme" href="#">Staff
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<header id="first">
		<div class="header-content">
			<div class="inner">
				<h1 class="cursive">Student Notification</h1>
				<h4>Academic, Jobs and Interests Updates</h4>
				<hr>
				<a href="#authenticateModal" class="btn btn-primary btn-xl">Sign
					In / Sign Up</a>
			</div>
		</div>
		<video autoplay loop class="fillWidth fadeIn wow collapse in"
			data-wow-delay="0.5s"
			poster="./resources/assets/post-it-notes-1284667_640.jpg"
			id="video-background">
			<source src="./resources/assets/sohp-video-20170109-winter.mp4">
		</video>
	</header>
	<section class="container-fluid" id="four">
		<div class="row">
			<div
				class="col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
				<h2 class="text-center text-primary">How It Works</h2>
				<hr>
				<div class="media wow fadeInRight">
					<h3>Get the Application</h3>
					<div class="media-body media-middle">
						<p>Install our Android and IOS applications from PlayStore and
							AppStore.</p>
					</div>
					<div class="media-right">
						<a href="#alertModal" data-toggle="modal" class="special-ion-link">
							<i class="icon-lg ion-ios-cloud-download-outline"></i>
						</a>
					</div>
				</div>
				<hr>
				<div class="media wow fadeIn">
					<h3>Register</h3>
					<div class="media-left">
						<i class="icon-lg ion-log-in"></i>
					</div>
					<div class="media-body media-middle">
						<p>Provide your profile and contact details to enter into the
							application.</p>
					</div>
				</div>
				<hr>
				<div class="media wow fadeInRight">
					<h3>Configure</h3>
					<div class="media-body media-middle">
						<p>Provide your Academic and Interested topic details into the
							application to streamline the Notifications you get.</p>
					</div>
					<div class="media-right">
						<i class="icon-lg ion-android-options"></i>
					</div>
				</div>
				<hr>
				<div class="media wow fadeIn">
					<h3>And There!</h3>
					<div class="media-left">
						<i class="icon-lg ion-arrow-graph-down-left"></i>
					</div>
					<div class="media-body media-middle">
						<p>Now sit back and get notified about anything that goes on
							over the world related you.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<aside class="bg-light" id="asideaside">
		<div class="container text-center">
			<div class="call-to-action">
				<h2 class="text-primary">Mobile App</h2>
				<a href="#alertModal" data-toggle="modal"
					class="btn btn-info btn-lg wow flipInX">Free Download</a>
			</div>
			<br>
			<hr style="border-color: #333; opacity: 1;" />
			<br>
			<div class="row">
				<div
					class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2">
					<div class="row">
						<div class="carousel slide" id="mobile-app-carousel"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#mobile-app-carousel" data-slide-to="0"
									class="active"></li>
								<li data-target="#mobile-app-carousel" data-slide-to="1"
									class=""></li>
								<li data-target="#mobile-app-carousel" data-slide-to="2"
									class=""></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="item active">
									<img alt="Login"
										data-src="holder.js/900x500/auto/#555:#333/text:Third slide"
										src="./resources/assets/1-0_screen1.png"
										data-holder-rendered="true"
										style="width: 100%; border: 1px solid #000" />
									<div class="carousel-caption">Register</div>
								</div>
								<div class="item">
									<img alt="Registration"
										data-src="holder.js/900x500/auto/#555:#333/text:Third slide"
										src="./resources/assets/2-0_Screen2.png"
										data-holder-rendered="true"
										style="width: 100%; border: 1px solid #000" />
									<div class="carousel-caption">Login</div>
								</div>
								<div class="item">
									<img alt="Categories"
										data-src="holder.js/900x500/auto/#555:#333/text:Third slide"
										src="./resources/assets/3-0_Screen4.png"
										data-holder-rendered="true"
										style="width: 100%; border: 1px solid #000" />
									<div class="carousel-caption">Categorize</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</aside>
	<section class="bg-primary" id="one">
		<div class="container">
			<div class="row">
				<div
					class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 text-center">
					<h2 class="margin-top-0 text-primary">About Us</h2>
					<br>
					<p class="text-faded">Bootstrap's responsive grid comes in 4
						sizes or "breakpoints": tiny (xs), small(sm), medium(md) and
						large(lg). These 4 grid sizes enable you create responsive layouts
						that behave accordingly on different devices.</p>
					<a href="#" class="btn btn-default btn-xl page-scroll">Learn
						More</a>
				</div>
			</div>
		</div>
	</section>
	<section id="last">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="margin-top-0 wow fadeIn">Get in Touch</h2>
					<hr class="primary">
					<p>We love feedback. Fill out the form below and we'll get back
						to you as soon as possible.</p>
				</div>
				<div class="col-lg-10 col-lg-offset-1 text-center">
					<form class="contact-form row">
						<div class="col-md-4">
							<label></label> <input type="text" class="form-control"
								placeholder="Name">
						</div>
						<div class="col-md-4">
							<label></label> <input type="text" class="form-control"
								placeholder="Email">
						</div>
						<div class="col-md-4">
							<label></label> <input type="text" class="form-control"
								placeholder="Phone">
						</div>
						<div class="col-md-12">
							<label></label>
							<textarea class="form-control" rows="9"
								placeholder="Your message here.."></textarea>
						</div>
						<div class="col-md-4 col-md-offset-4">
							<label></label>
							<button type="button" class="btn btn-primary btn-block btn-lg">
								Send <i class="ion-android-arrow-forward"></i>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<footer id="footer">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-6 col-sm-3 column">
					<h4>Information</h4>
					<ul class="list-unstyled">
						<li><a href="">Products</a></li>
						<li><a href="">Services</a></li>
						<li><a href="">Benefits</a></li>
						<li><a href="">Developers</a></li>
					</ul>
				</div>
				<div class="col-xs-6 col-sm-3 column">
					<h4>About</h4>
					<ul class="list-unstyled">
						<li><a href="#">Contact Us</a></li>
						<li><a href="#">Delivery Information</a></li>
						<li><a href="#">Privacy Policy</a></li>
						<li><a href="#">Terms &amp; Conditions</a></li>
					</ul>
				</div>
				<div class="col-xs-12 col-sm-3 column">
					<h4>Stay Posted</h4>
					<form>
						<div class="form-group">
							<input type="text" class="form-control"
								title="No spam, we promise!" placeholder="Tell us your email">
						</div>
						<div class="form-group">
							<button class="btn btn-primary" data-toggle="modal"
								data-target="#alertModal" type="button">Subscribe for
								updates</button>
						</div>
					</form>
				</div>
				<div class="col-xs-12 col-sm-3 text-right">
					<h4>Follow</h4>
					<ul class="list-inline">
						<li><a rel="nofollow" href="" title="Twitter"><i
								class="icon-lg ion-social-twitter-outline"></i></a>&nbsp;</li>
						<li><a rel="nofollow" href="" title="Facebook"><i
								class="icon-lg ion-social-facebook-outline"></i></a>&nbsp;</li>
					</ul>
				</div>
			</div>
		</div>
	</footer>
	<div id="authenticateModal" class="modal fade" tabindex="-1"
		role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<div class="carousel slide" id="authenticate-carousel"
								data-ride="" data-interval=false>
								<div class="carousel-inner" role="listbox">
									<div class="item active">
										<form class="row" id="login-form">
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="mobile_number" class="form-control"
													placeholder="Mobile Number">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 password form-group">
												<input type="password" name="password" class="form-control"
													placeholder="Password"> <i class="ion-eye-disabled"></i>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-6 col-md-offset-3">
												<button type="submit"
													class="btn btn-primary btn-block btn-md">
													Sign In <i class="ion-android-arrow-forward"></i>
												</button>
											</div>
											<div class="clearfix"></div>
											<br />
											<div class="col-md-12 col-md-offset-0 text-center">
												<a href="#authenticate-carousel" data-slide-to="3"
													class="label label-warning">Forgot Password?</a>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-12 col-md-offset-0 text-center">
												<p class="authenticate-carousel-cta-text">
													<small>Don't have an account?</small> <a
														href="#authenticate-carousel" data-slide-to="1"
														class="btn btn-info">Sign Up</a>
												</p>
											</div>
										</form>
									</div>
									<div class="item">
										<form class="row" id="register-form">
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="first_name" class="form-control"
													placeholder="First Name">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="last_name" class="form-control"
													placeholder="Last Name">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-3 col-md-offset-1 col-xs-4 form-group">
												<select name="phone_prefix" class="form-control empty">
													<option>+91</option>
												</select>
											</div>
											<div class="col-md-7 col-md-offset-0 col-xs-8 form-group">
												<input type="text" name="mobile_number" class="form-control"
													placeholder="Mobile Number">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="password" name="password" class="form-control"
													placeholder="Password">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="password" name="confirm_password"
													class="form-control" placeholder="Re-type Password">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-6 col-md-offset-3">
												<button type="submit"
													class="btn btn-primary btn-block btn-md">
													Sign Up <i class="ion-android-arrow-forward"></i>
												</button>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-12 col-md-offset-0 text-center">
												<p class="authenticate-carousel-cta-text">
													<small>Already have an account?</small> <a
														href="#authenticate-carousel" data-slide-to="0"
														class="btn btn-info">Sign In</a>
												</p>
											</div>
										</form>
									</div>
									<div class="item">
										<form class="row" id="register-otp-form">
											<div class="col-md-10 col-md-offset-1">
												<p class="bg-success">Thank you for Registering! Verify
													your account.</p>
											</div>
											<div class="col-md-10 col-md-offset-1">
												<p class="bg-success">OTP has been sent to 98XXXXXX10.</p>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="register_otp" class="form-control"
													placeholder="Enter your OTP">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-6 col-md-offset-3">
												<button type="submit"
													class="btn btn-primary btn-block btn-md">
													Verify <i class="ion-android-arrow-forward"></i>
												</button>
											</div>
										</form>
									</div>
									<div class="item">
										<form class="row" id="forgot-password-form">
											<div class="col-md-10 col-md-offset-1">
												<p class="bg-success">Enter your Mobile Number to get
													OTP.</p>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="mobile_number" class="form-control"
													placeholder="Mobile Number">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-6 col-md-offset-3">
												<button type="submit"
													class="btn btn-primary btn-block btn-md">
													Send OTP <i class="ion-android-arrow-forward"></i>
												</button>
											</div>
											<div class="col-md-12 col-md-offset-0 text-center">
												<br /> <a href="#authenticate-carousel" data-slide-to="0"
													class="label label-info">Go back to Login.</a>
											</div>
											<div class="clearfix"></div>
										</form>
									</div>
									<div class="item">
										<form class="row" id="reset-password-form">
											<div class="col-md-10 col-md-offset-1">
												<p class="bg-success">Enter your Mobile Number to get
													OTP.</p>
											</div>
											<div class="clearfix"></div>
											<div class="col-md-10 col-md-offset-1 form-group">
												<input type="text" name="mobile_number" class="form-control"
													placeholder="Mobile Number">
											</div>
											<div class="clearfix"></div>
											<div class="col-md-6 col-md-offset-3">
												<button type="submit"
													class="btn btn-primary btn-block btn-md">
													Send OTP <i class="ion-android-arrow-forward"></i>
												</button>
											</div>
											<div class="clearfix"></div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="alertModal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-body">
					<h2 class="text-center">Great Choice!</h2>
					<p class="text-center">Pick one for your mobile OS.</p>
					<p class="text-center">
						<a class="btn btn-primary btn-lg center-block" href="#"><i
							class="ion-android-playstore"></i> PlayStore</a>
					</p>
					<p class="text-center">
						<a class="btn btn-primary btn-lg center-block" href="#"><i
							class="ion-social-apple"></i> AppStore</a>
					</p>
					<br />
					<button class="btn btn-default btn-lg center-block"
						data-dismiss="modal" aria-hidden="true">
						Close <i class="ion-android-close"></i>
					</button>
				</div>
			</div>
		</div>
	</div>
	<!--scripts loaded here -->
	<script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<script src="./resources/js/jquery.easing.min.js"></script>
	<script src="./resources/js/wow.js"></script>
	<script src="./resources/js/home.scripts.js"></script>
	<script
		src="./resources/bootstrapValidator/js/bootstrapValidator.min.js"></script>
</body>
</html>