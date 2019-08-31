$(document).ready(function() {
	
	
	
	$('#signbtn').on("click", function(evebt){
		signInValidate();
		var postData = {
			username: $("input[name='username']").val(),
			password: $("input[name='password']").val(),
		};
	});
	
	//Hiển thị màn hình SignIn khi click vào menu 
	$('#app-signin').on("click", function(event) {
		$('#appsignin').css({display: "block"});
	});

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == document.getElementById('appsigincontent')) {
	    	$('#appsignin').css({display: "none"});
	    }
	}
	
	function signInValidate() {
		 var pristine = new Pristine($("#appsigincontent form")[0]);
		 console.log(pristine.validate())
	}

})