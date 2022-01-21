/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {


    var id;
    $.ajax({
        url: "PLaceController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
            // alert(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });
    $.ajax({
        url: "PLaceController",
        data: {op: "loadSection"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplirSection(data);

        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });

    $("#add").click(function () {
        var numero = $("#numero").val();
        var etat = $("#etat").val();
        var type = $("#type").val();
        var section = $("#section").val();
        console.log(numero);
        console.log(etat);
        console.log(type);
        console.log(section);
        $.ajax({
            url: "SectionController",
            data: {numero: numero,
                etat: etat,
                type: type,
                section: section},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
                //alert(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });


    $("#content").on("click", ".delete", function () {
        var id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op: "delete", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    $("#content").on("click", ".update", function () {

        $("#hiddenBtn").show();

        var numero = $("#numero").val();

        $("#numero").val($(this).closest("tr").find("td").eq(1).text());
        $("#etat").val($(this).closest("tr").find("td").eq(2).text());
        $("#type").val($(this).closest("tr").find("td").eq(3).text());
        $("#section").val($(this).closest("tr").find("td").eq(4).text());

    });
    $("#mod").click(function () {
        var numero = $("#numero").val();
        var etat = $("#etat").val();
        var type = $("#type").val();
        var section = $("#section").val();

        $.ajax({
            url: "PLaceController",
            data: {op: "update", id: id, numero: numero, etat: etat, type: type, section:section},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    $("#content").on("click", ".liberer", function () {

        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PLaceController",
            data: {op: "liberer", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });
    $("#content").on("click", ".occupe", function () {

        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PLaceController",
            data: {op: "occupe", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    function remplir(data) {
        var ligne = "";
        console.log(data);
        data.forEach(function (e) {
            var etat;
            if (e.etat === true) {
                etat = "Occupée";
            } else if (e.etat === false) {
                etat = "Libre";
            }
            ligne += "<tr><td>" + e.id + "</td><td>" + e.numero + "</td><td>" + e.etat + "</td><td>" + e.type + "</td><td>" + e.section + "</td><td><button class='btn btn-primary delete'>Supprimer</button></td><td><button class=' btn btn-primary update'>Modifier</button></td><td><button class='btn btn-primary liberer'>Libre</button></td><td><button class='btn btn-primary occupe'>Occupee</button></td></tr>";
        });
        $("#content").html(ligne);
    }

    function remplirSection(data) {
        var ligne = "";
        console.log(data);
        //alert("..");
        data.forEach(function (e) {
            ligne += "<option value='" + e.section + "'>" + e.section + "</option>";
        });
        $("#section").html(ligne);
    }

});


