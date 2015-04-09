<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <title>Coins</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" media="all and (min-device-width: 992px)" href="resources/style/desktop.css">
    <link rel="stylesheet" media="all and (min-device-width: 481px) and (max-device-width: 1024px)" href="resources/style/ipad.css">
</head>
<body>

<div id="container2">
    <div id="content">
        <div id="container1">



            <div id="col1">
                <!-- Column one start -->


                <div id="text_menu">
                    <h1>World Coins</h1>
                    <ul>
                        <li><a href="#">Russia &bull; Nicholas II &bull; 15 Roubles</a></li>
                        <li><a href="#">Great Britain &bull; Victoria &bull; 5 Sovereign</a></li>
                        <li><a href="#">Great Britian &bull; George V &bull; 1 Sovereign</a></li>
                        <li><a id="km806" href="#">Great Britian &bull; Edward VII &bull; 2 Pounds</a></li>
                        <li><a href="#">Australia &bull; Victoria &bull; 1 Sovereign</a></li>
                        <li><a id="km602" href="#">German States &bull; Hamburg &bull; 20 Mark</a></li>
                        <li><a href="#">USSR &bull; Chervonetz &bull; 10 Roubles</a></li>
                        <li><a href="#">France &bull; Napoleon &bull; 20 Francs</a></li>
                        <li><a href="#">France &bull; Napoleon &bull; 40 Francs</a></li>
                        <li><a href="#">France &bull; Rooster &bull; 20 Francs</a></li>
                        <li><a href="#">Swiss &bull; Helvetia &bull; 20 Francs</a></li>
                        <li><a href="#">Belgium &bull; Albert I &bull; 20 Francs</a></li>
                    </ul>

                    <h1>US Coins</h1>
                    <ul>
                        <li><a id="morgan" href="#">1882-S Morgan Silver Dollar</a></li>
                        <li><a href="#">$2&frac12; Classic Head Quarter Eagle</a></li>
                        <li><a href="#">$2&frac12; Indian Quarter Eagle</a></li>
                        <li><a href="#">$5 Classic Head Half Eagle</a></li>
                        <li><a href="#">$5 Liberty Half Eagle</a></li>
                        <li><a href="#">$5 Indian Half Eagle</a></li>
                        <li><a href="#">$10 Liberty Eagle</a></li>
                        <li><a href="#">$10 Indian Head Eagle</a></li>
                        <li><a href="#">$20 Liberty Double Eagle</a></li>
                        <li><a href="#">$20 St Gaudens Double Eagle</a></li>
                    </ul>

                    <h1>Ancients</h1>
                    <ul>
                        <li><a href="#">Attica &bull; Athens</a></li>
                        <li><a href="#">Macedonian Kingdom &bull; Philip II</a></li>
                        <li><a href="#">Thracian Kingdom &bull; Lysimachus</a></li>
                        <li><a href="#">Ptolemaic Egypt &bull; Ptolemy I Soter</a></li>
                        <li><a href="#">Pergamene Kingdom &bull; Philetairos</a></li>
                        <li><a id="wsm890" href="#">Seleucid Kingdom &bull; Seleucus I Nicator</a></li>
                        <li><a id="wsm1137" href="#">Seleucid Kingdom &bull; Antiochus II Theos</a></li>

                        <c:forEach items="${coins}" var="coin">
                            <li>${coin.menu}</li>
                        </c:forEach>


                    </ul>
                </div> <!-- text_menu -->


                <div class="filler"></div>



                <!-- Column one end -->
            </div>

            <div id="col2">
                <!-- Column two start -->



                <div id="both">
                    <img id="small_obv" src="" />
                    <img id="small_rev" src="" />

                    <h2 id="main_title">1882-S Morgan Silver Dollar</h2>

                    <p id="main_description"></p>

                    <p id="main_notes"></p>

                    <a id="ngc" href="#"></a>

                    <div id="prices">
                        <p id="purchase">9/10/12 $1880 Purchased on Ebay</p>
                        <p>3/30/15 $1425 Sold on Ebay</p>
                    </div>
                </div> <!-- both -->


                <img id="obverse" />
                <img id="reverse" />
                <img id="obverse_slab" />
                <img id="reverse_slab" />


                <div class="filler" />




                <!-- Column two end -->
            </div>


        </div> <!-- container1 -->
    </div> <!-- content -->
</div> <!-- container2 -->










<script src="resources/scripts/jquery-1.8.3.min.js"></script>
<script src="resources/scripts/coins.js"></script>
</body>
</html>