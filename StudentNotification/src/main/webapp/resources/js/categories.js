$(document).ready(function(){
	resizeCategories();
});

$(window).on('resize',function(){
	resizeCategories();
});

function resizeCategories(){
	$('.categories').each(function(){
		$(this).css('height',$(this).width());
	});
}