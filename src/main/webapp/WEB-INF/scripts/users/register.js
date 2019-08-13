$(document).ready(function() {
	$(".registerbtn").click(function(event){
		var ctx = "${pageContext.request.contextPath}";
		console.log(999, ctx)
		var data = {
				email: $("input[name='email']").val(),
				password: $("input[name='psw']").val(),
		};
		clientRequest.post("/api/user/signup", data);
	})
})