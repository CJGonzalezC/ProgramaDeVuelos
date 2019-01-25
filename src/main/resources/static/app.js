// var s = $.parseJSON(dataResult.responseText);
//      var obj = JSON.parse(dataResult);      
//var obj = $.parseJSON( dataResult);

$(document).ready(() => {


    //Consultar JSON
    $.ajax({
        url: "/vuelo",
        type: "GET",
        dataType: "json"
    }).done(function (dataResult) {

        console.log(dataResult);

    }).fail(function () {
        alert("no se arma compa");
    });


    $.getJSON("/vuelo", function (dataset) {
        console.log(dataset);
        var vuelosResult;
        $.each(dataset, function (key, value) {
            vuelosResult += '<tr>';
            vuelosResult += '<td scope = "row">' + value.idVuelo + '</td>';
            vuelosResult += '<td scope = "row">' + value.aeropuerto + '</td>';
            vuelosResult += '<td scope = "row">' + value.aerolinea + '</td>';
            vuelosResult += '<td scope = "row">' + value.ruta + '</td>';
            vuelosResult += '</tr>';
        });
        
        $("#tablita").append(vuelosResult);
    });




    $('#postVuelo').on('click', function () {
        var var1 = $("#aeropuerto").val();
        var var2 = $("#aerolinea").val();
        var var3 = $("#ruta").val();

        console.log(var1 +" " +var2 +" " + var3);
        var obj = JSON.parse(`{ "aeropuerto":"${var1}", "aerolinea":"${var2}", "ruta":"${var3}"}`);

        console.log(obj);
        
        
        $.ajax({
            url: ("/vuelo"), //.attr( "action"),
            data: JSON.stringify(obj),
            type: "POST",
            beforeSend: function (xhr) {
                //xhr.setRequestHeader("Accept", "application/json");
                xhr.setRequestHeader("Content-Type", "application/json");
            },
            success: function (resp) {
                var respContent = resp;
                console.log(respContent);
            }
        });




        //        console.log(obj);
        //        $.ajax({
        //                  url: "/vuelo",
        //                  type: "POST",
        //		  data: obj,	
        //                  dataType: "json"
        //                }).done(function (dataResult) {
        //            }).fail(function () {
        //                  alert("no se arma compa");
        //                }); 
        //        
        //        
        //        

        /*
            $.ajax({
                      type: "POST",
                      url: "/vuelo",
                      data: obj,
                      success: success,
                      dataType: dataType
              });
*/
        //            $.post( "test.php", { name: "John", time: "2pm" } );

        //                    $.post( "/vuelo", obj );




        //    $("#testJS").html(dataResult);


        //        

        //
        //          $.post('/vuelo', {
        //              "aeropuerto": var1,
        //              "aerolinea": var2,
        //              "ruta": var3
        //            },function(data) {
        //              console.log('procesamiento finalizado', data);
        //          });
    })

});