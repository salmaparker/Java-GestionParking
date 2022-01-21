$(document).ready(function() {
   
	$.ajax({
		url: "SectionController",
		data: { op: "load" },
		type: 'POST',
		success: function(data, textStatus, jqXHR) {
			remplir(data);
                        
		},
	
		error: function(jqXHR, textStatus, errorThrown) {
			console.log(textStatus);
		}
	});
	$("#add").click(function() {
		
		var code = $("#code").val();
		$.ajax({
			url: "SectionController",
			data: {  code: code },
			type: 'POST',
			success: function(data, textStatus, jqXHR) {
				remplir(data);
			
			},
			error: function(jqXHR, textStatus, errorThrown) {
				console.log(textStatus);
			}
		});
	});


	$("#content").on("click", ".delete", function() {
		var id = $(this).closest("tr").find("td").eq(0).text();
		$.ajax({
			url: "SectionController",
			data: { op: "delete", id: id},
			type: 'POST',
			success: function(data, textStatus, jqXHR) {
				remplir(data);
			},
			error: function(jqXHR, textStatus, errorThrown) {
				console.log(textStatus);
			}
		});

	});

	$("#content").on("click", ".update", function() {
		var id = $(this).closest("tr").find("td").eq(0).text();
		$.ajax({
			url: "SectionController",
			data: { op: "update", id: id},
			type: 'POST',
			success: function(data, textStatus, jqXHR) {
				remplir(data);
			},
			error: function(jqXHR, textStatus, errorThrown) {
				console.log(textStatus);
			}
		});

	});

	function remplir(data) {
		var ligne = "";
		data.forEach(function(e) {
			ligne += "<tr><td>" + e.id + "</td><td>" + e.code + "</td><td><button class='delete'>Supprimer</button></td><td><button class='update'>Modifier</button></td></tr>";
		});
		$("#content").html(ligne);
	}
});