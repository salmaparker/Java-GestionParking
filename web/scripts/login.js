/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
   
     $('#login').click(function(){
         var user = $("#user").val();
     var password = $("#pass").val();
    $.ajax({
        url: "LoginController",
        data: {user : user ,password: password},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            location.href="http://localhost:37947/Java-GestionParking/index1.jsp";
            
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });
     });
    
    
});

