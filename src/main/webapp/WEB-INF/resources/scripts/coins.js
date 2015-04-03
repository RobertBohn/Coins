$( document ).ready(function() {

    function clearAll() {
        $( "#footer" ).hide();
        $( "#header" ).hide();
        $( "#both" ).hide();
    }

    $( "#footer" ).click(function( event ) {
        clearAll();
        $( "#both" ).show();
    });

    $( "#header" ).click(function( event ) {
        clearAll();
        $( "#footer" ).show();
    });

    $( "#both" ).click(function( event ) {
        clearAll();
        $( "#header" ).show();
    });

});