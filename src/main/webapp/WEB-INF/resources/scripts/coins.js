$( document ).ready(function() {

    function selectView( view ) {
        $( "#both" ).hide();
        $( "#obverse" ).hide();
        $( "#reverse" ).hide();
        $( "#obverse_slab" ).hide();
        $( "#reverse_slab" ).hide();
        $( view ).show();
    }

    $( "#small_obv" ).click(function( event ) {
        selectView("#obverse");
    });

    $( "#small_rev" ).click(function( event ) {
        selectView("#reverse");
    });

    $( "#obverse" ).click(function( event ) {
        selectView("#reverse");
    });

    $( "#reverse" ).click(function( event ) {
        selectView("#both");
    });

    $( "#ngc" ).click(function( event ) {
        selectView("#obverse_slab");
    });

    $( "#obverse_slab" ).click(function( event ) {
        selectView("#reverse_slab");
    });

    $( "#reverse_slab" ).click(function( event ) {
        selectView("#both");
    });









    $( "#wsm890" ).click(function( event ) {
        $( "#main_title" ).html('Seleucid Kingdom - Seleucus I Nicator (312-281 BC)');
        $( "#main_description" ).html('AR tetradrachm (17.08 gm). Seleuceia in Pieria, ca. 300-290 BC. Head of Herakles right wearing lion skin headdress / BA&Sigma;I&Lambda;E&Omega;&Sigma; &Sigma;E&Lambda;EYKOY Zeus enthroned left, holding Nike bearing wreath and scepter, monogram in left field and KP under throne. WSM 890. SC 29.1b. Toned Very Fine.');
        $( "#small_obv" ).attr('src','resources/images/ancient/wsm890_obverse.png');
        $( "#small_rev" ).attr('src','resources/images/ancient/wsm890_reverse.png');
        $( "#obverse" ).attr('src','resources/images/ancient/wsm890_obverse.png');
        $( "#reverse" ).attr('src','resources/images/ancient/wsm890_reverse.png');
        selectView("#both");
    });






});