/* 
 * Carga la imagen y la coloca en una etiqueta
 */

function readURL(input){
    if (input.files && input.files[0]){
        var reader = new FileReader();
        reader.onload = function (e) {
            $('#blah')
                    .attr('src',e.target.result)
                    .height(200);
        };
        reader.readAsDataURL(input.files[0]);
    }
    
}

function addCart(formulario) {
    
    var idProducto = formulario.elements[0].value;
    var existencias = formulario.elements[1].value;
    window.alert("los parametros son "+idProducto+ " y "+ existencias);
    if (existencias > 0) {
        var url = "/carrito/agregar/"+idProducto;
        $("#resultsBlock").load(url);
    }
}