$(document).ready(function() {

	var canPlay = true;

	$('#cartesJoueur tr td img').bind('mouseover', function(event) {
		$(this).stop();
		$(this).animate({
			"top" : -30
		}, 250, "easeOutBack");
	});

	$('#cartesJoueur tr td img').bind('mouseout', function(event) {
		$(this).stop();
		$(this).animate({
			"top" : 0
		}, 250, "easeOutBack");
	});

	$('#cartesJoueur tr td img').bind('click', function(event) {
		if (!canPlay)
			return;

		canPlay = false;
		$(this).unbind('mouseover');
		$(this).unbind('mouseout');
		$(this).fadeOut(700, function() {
			$(this).appendTo('#cartes');
			$(this).fadeIn(700);

			$.post("ajax.do", {
				joueur : "John",
				carte : "as"
			}, function(data) {
				alert(data);
			});

		});
	});

});