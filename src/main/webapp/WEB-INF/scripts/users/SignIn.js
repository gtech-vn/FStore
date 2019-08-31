$(document).ready(function() {
	//Hiển thị màn hình SignIn khi click vào menu 
	$('#app-signin').on("click", function(event) {
		$('#appsignin').css({display: "block"});
	});

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
		console.log(event.target)
	    if (event.target == document.getElementById('appsigincontent')) {
	    	$('#appsignin').css({display: "none"});
	    }
	}
})