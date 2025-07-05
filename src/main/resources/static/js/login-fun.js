function submit(userName, password) {
	var result = "";
	$.ajax({
		url: "http://localhost:8080/logincontroller/submit",
		data: {
			"userName": userName,
			"password": password
		},
		async: false,
		type: "POST",
		success: function(data) {
			if (data != undefined && data != null) {
				result = JSON.parse(data);
			}
		}
		/*error() {

		}*/
	})
	return result;
}