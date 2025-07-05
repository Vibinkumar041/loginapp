$(document).on("click", ".submit", function(e) {
	var userName = $("#username").val();
	var password = $("#password").val();
	var result = submit(userName, password);
	var outputString = "Login Failed!!!";
	if (result.status) {
		outputString = userName + " Login Successfully!!!"
	}
	$("#result").text(outputString);
})