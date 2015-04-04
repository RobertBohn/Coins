$( document ).ready(function() {

    function clearAll() {
        $( "#both" ).hide();
        $( "#obverse" ).hide();
        $( "#reverse" ).hide();
        $( "#obverse_slab" ).hide();
        $( "#reverse_slab" ).hide();
    }

    $( "#small_obv" ).click(function( event ) {
        clearAll();
        $( "#obverse" ).show();
    });

    $( "#small_rev" ).click(function( event ) {
        clearAll();
        $( "#reverse" ).show();
    });

    $( "#obverse" ).click(function( event ) {
        clearAll();
        $( "#reverse" ).show();
    });

    $( "#reverse" ).click(function( event ) {
        clearAll();
        $( "#both" ).show();
    });

    $( "#ngc" ).click(function( event ) {
        clearAll();
        $( "#obverse_slab" ).show();
    });

    $( "#obverse_slab" ).click(function( event ) {
        clearAll();
        $( "#reverse_slab" ).show();
    });

    $( "#reverse_slab" ).click(function( event ) {
        clearAll();
        $( "#both" ).show();
    });

});