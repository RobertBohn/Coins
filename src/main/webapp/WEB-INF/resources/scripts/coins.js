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
        $( "#small_obv" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm890_obverse.png');
        $( "#small_rev" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm890_reverse.png');
        $( "#obverse" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm890_obverse.png');
        $( "#reverse" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm890_reverse.png');
        $( "#main_notes" ).hide();
        $( "#ngc" ).hide();
        selectView("#both");
    });


    $( "#km602" ).click(function( event ) {
        $( "#main_title" ).html('German States &bull; Hamburg &bull; 1877-J &bull; 20 Mark');
        $( "#main_description" ).html('German States: Free and Hanseatic City of Hamburg. 20 Mark 1877-J. Helmeted arms with lion supporters / Crowned imperial eagle, type II. KM602, AGW 0.2305, XF/AU.');
        $( "#small_obv" ).attr('src','http://www.barzutti.com/coins/images/world/km602_obverse.png');
        $( "#small_rev" ).attr('src','http://www.barzutti.com/coins/images/world/km602_reverse.png');
        $( "#obverse" ).attr('src','http://www.barzutti.com/coins/images/world/km602_obverse.png');
        $( "#reverse" ).attr('src','http://www.barzutti.com/coins/images/world/km602_reverse.png');
        $( "#main_notes" ).hide();
        $( "#ngc" ).hide();
        selectView("#both");
    });


    $( "#morgan" ).click(function( event ) {
        $( "#main_title" ).html('1882-S Morgan Silver Dollar');
        $( "#main_description" ).html('1882-S Morgan Silver Dollar. MS67 NGC. CAC. NGC Census: (1646/92). PCGS Population (736/43). (Registry values: P1, N991) (NGC ID# 254F, PCGS# 7140, <a href="http://secure.numismaster.com/ta/Coins.admin?rnd=KITTCIHZ&@impl=coins.ui.ucatalog.flat.coin.UiControl_ViewPriceGuideDetail&@prms=4b7261757365436f696e49643d3635322653656172636849643d33373833323834&@windowId=BISDM&Ext=login" target="_blank">KM#110</a>)');
        $( "#small_obv" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_obv.png');
        $( "#small_rev" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_rev.png');
        $( "#obverse" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_obv.png');
        $( "#reverse" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_rev.png');
        $( "#ngc" ).html('NGC 3517588-005');
        $( "#ngc" ).show();
        $( "#main_notes" ).hide();
        $( "#obverse_slab" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_slab_obv.png');
        $( "#reverse_slab" ).attr('src','http://www.barzutti.com/coins/images/us/1882s_1dollar_slab_rev.png');
        selectView("#both");
    });

    $( "#wsm1137" ).click(function( event ) {
        $( "#main_title" ).html('Seleucid Kingdom - Antiochus II Theos (261-246 BC)');
        $( "#main_description" ).html('AR tetradrachm (26mm, 16.88 gm, 11h). Northern Mesopotamia. ca. 261-252 BC. Diademed head of Antiochus II right / BA&Sigma;I&Lambda;E&Omega;&Sigma; ANTIOXOY Apollo seated left on omphalos, examining arrow and resting hand on grounded bow, monograms in outer left and right fields. WSM 1137; SC 580.4; HGC 9. Boldly struck in choice metal from an obverse die of exceptional style and relief. NGC AU 5/5 - 4/5.');
        $( "#small_obv" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_obverse.png');
        $( "#small_rev" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_reverse.png');
        $( "#obverse" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_obverse.png');
        $( "#reverse" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_reverse.png');
        $( "#ngc" ).html('NGC 2021971-029');
        $( "#ngc" ).show();
        $( "#main_notes" ).html('In considering this issue, Newell noted the stylistic dependence on Antioch and settled on nearby Apamea as the probable mint. However, Le Rider (Antioche de Syrie) demonstrated a more plausible origin in Northern Mesopotamia, based on hoard evidence. Houghton and Lorber catalogue the origin as Uncertain Mint 30, probably in Northern Mesopotamia.');
        $( "#main_notes" ).show();
        $( "#obverse_slab" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_slab_obverse.png');
        $( "#reverse_slab" ).attr('src','http://www.barzutti.com/coins/images/ancient/wsm1137_slab_reverse.png');
        selectView("#both");
    });




});