function submitForm(form, action) {
	$.ajax({
		url : action,
		type : "POST",
		dataType : "html",
		success : function(data) {
			$(".main").html(data);
		}
	});
}