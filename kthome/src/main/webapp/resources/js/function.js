function submitForm(form, action) {
	alert(form);
	$.ajax({
		url : action,
		type : "POST",
		dataType : "html",
		success : function(data) {
			$(".main").html(data);
		}
	});
}