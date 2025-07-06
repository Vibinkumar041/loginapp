function submit(userName, password) {
	var result = "";
	$.ajax({
		url: window.location.origin + "/logincontroller/submit",
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