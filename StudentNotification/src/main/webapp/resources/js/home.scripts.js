var slideAuthenticateCarousel = 0;
(function($) {
	"use strict";

	$('body').scrollspy({
		target : '.navbar-fixed-top',
		offset : 100
	});

	$('#topNav').affix({
		offset : {
			top : 200
		}
	});

	new WOW().init();

	$('a.page-scroll').bind('click', function(event) {
		var $ele = $(this);
		$('html, body').stop().animate({
			scrollTop : ($($ele.attr('href')).offset().top - 60)
		}, 1450, 'easeInOutExpo');
		event.preventDefault();
	});

	$('.navbar-collapse ul li a').click(function() {
		/* always close responsive nav after click */
		$('.navbar-toggle:visible').click();
	});

	$('.modal').on('shown.bs.modal', function() {
		resetModalMargin(this,slideAuthenticateCarousel);
	});

	$('#authenticateModal').on('hide.bs.modal', function() {
		$('#login-form').bootstrapValidator('resetForm', true);
		$('#register-form').bootstrapValidator('resetForm', true);
		$('#register-otp-form').bootstrapValidator('resetForm', true);
		$('#forgot-password-form').bootstrapValidator('resetForm', true);
		$('#authenticateModal form').each(function(){
			console.log(this);
		});
	});

	$('#authenticate-carousel').on('slid.bs.carousel', function() {
		resetModalMargin($('#authenticate-carousel').closest('.modal'),slideAuthenticateCarousel);
	});

	$('.password i').click(function() {
		if ($(this).hasClass('ion-eye-disabled')) {
			$(this).removeClass('ion-eye-disabled');
			$(this).addClass('ion-eye');
			$(this).siblings('[type=password]').attr('type', 'text');
		} else {
			$(this).removeClass('ion-eye');
			$(this).addClass('ion-eye-disabled');
			$(this).siblings('[type=text]').attr('type', 'password');
		}
	});

})(jQuery);

function resetModalMargin(element,timeInterval) {
	var resetHeight = ($(window).height() - $(element).find('.modal-dialog')
			.outerHeight(false)) / 2;
	if (parseInt(resetHeight) > 0) {
		$(element).find('.modal-dialog').animate({
			marginTop : resetHeight
		}, timeInterval);
	} else {
		$(element).find('.modal-dialog').animate({
			marginTop : 10,
			marginBottom : 10
		}, timeInterval);
	}
}

$(document)
		.ready(				
				function() {
					$('[href="#authenticateModal"]').on('click',function(event){
						event.preventDefault();
						$('#authenticate-carousel').carousel(0);
						$('#authenticateModal').modal('show');
					});
					$('#login-form')
							.bootstrapValidator(
									{
										message : 'This value is not valid',
										excluded: [':disabled'],
										fields : {
											mobile_number : {
												message : 'Mobile Number is not valid',
												validators : {
													notEmpty : {
														message : 'Mobile Number is required and can\'t be empty'
													},
													regexp : {
														regexp : /^((\+){0,1}91(\s){0,1}(\-){0,1}(\s){0,1}){0,1}98(\s){0,1}(\-){0,1}(\s){0,1}[1-9]{1}[0-9]{7}$/,
														message : 'Invalid Mobile Number'
													}
												}
											},
											password : {
												validators : {
													notEmpty : {
														message : 'Password is required and can\'t be empty'
													}
												}
											}
										}
									}).on(
									'success.form.bv',
									function(e) {
										// Prevent form submission
										e.preventDefault();

										// Get the form instance
										var $form = $(e.target);

										// Get the BootstrapValidator instance
										var bv = $form
												.data('bootstrapValidator');

										// Use Ajax to submit form data
										$.post($form.attr('action'), $form
												.serialize(), function(result) {
											console.log(result);
										}, 'json');
										
										// if login failure
										$form.bootstrapValidator(
												'disableSubmitButtons', false) // Enable the submit buttons
										// display errors
												
										// if login success
										// window.href.location = 
									});
					$('#register-form')
							.bootstrapValidator(
									{
										message : 'This value is not valid',
										excluded: [':disabled'],
										fields : {
											first_name : {
												message : 'First Name is not valid',
												validators : {
													notEmpty : {
														message : 'First Name is required and can\'t be empty'
													},
													stringLength : {
														max : 32,
														message : 'First Name must be less than 32 characters long'
													},
													regexp : {
														regexp : /^[A-Z\s]+$/i,
														message : 'First Name can only consist of alphabetical characters and spaces'
													}
												}
											},
											last_name : {
												message : 'Last Name is not valid',
												validators : {
													notEmpty : {
														message : 'Last Name is required and can\'t be empty'
													},
													stringLength : {
														max : 32,
														message : 'Last Name must be less than 32 characters long'
													},
													regexp : {
														regexp : /^[A-Z\s]+$/i,
														message : 'Last Name can only consist of alphabetical characters and spaces'
													}
												}
											},
											mobile_number : {
												message : 'The Mobile Number is not valid',
												validators : {
													notEmpty : {
														message : 'The Mobile Number is required and can\'t be empty'
													},
													regexp : {
														regexp : /^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$/,
														message : 'Invalid Mobile Number'
													}
												}
											},
											password : {
												validators : {
													notEmpty : {
														message : 'Password is required and can\'t be empty'
													},
								                    identical: {
								                        field: 'confirm_password',
								                        message: 'Passwords donot match'
								                    },
													stringLength : {
														min : 8,
														max : 32,
														message : 'Password must be more than 8 and less than 32 characters long'
													}
												}
											},
											confirm_password : {
												validators : {
								                    identical: {
								                        field: 'password',
								                        message: 'Passwords donot match'
								                    }
												}
											}
										}
									}).on(
									'success.form.bv',
									function(e) {
										// Prevent form submission
										e.preventDefault();

										// Get the form instance
										var $form = $(e.target);

										// Get the BootstrapValidator instance
										var bv = $form
												.data('bootstrapValidator');

										// Use Ajax to submit form data
										$.post($form.attr('action'), $form
												.serialize(), function(result) {
											console.log(result);
											console.log('registered');
										}, 'json');
										
										//if register failure or success
										$form.bootstrapValidator(
												'disableSubmitButtons', false) // Enable the submit buttons
												
										//if register failure
										// display errors
										
										//if register success
										console.log('registered');										
										$('#authenticate-carousel').carousel(2);
									});
				});