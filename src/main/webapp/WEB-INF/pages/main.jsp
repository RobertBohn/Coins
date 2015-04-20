<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html ng-app="coins">
<head>
    <title>Coins</title>
    <link rel="stylesheet" media="all and (min-device-width: 992px)" href="resources/style/desktop.css">
    <link rel="stylesheet" media="all and (min-device-width: 481px) and (max-device-width: 1024px)" href="resources/style/ipad.css">
</head>
<body ng-controller="PageController as page" ng-init="page.init()">

<div id="container2">
    <div id="content">
        <div id="container1">

            <div id="col1"> <!-- Column one start -->

                <div id="menu">
                    <div ng-repeat="heading in page.headings">
                        <h1>{{heading}}</h1>
                        <ul ng-repeat="coin in page.coins | filter: { type: heading }">
                            <li><a href="" ng-click="page.setCoin(coin.id)">{{coin.menu}}</a></li>
                        </ul>
                    </div>
                </div>

                <div class="filler"></div>

            </div> <!-- Column one end -->

            <div id="col2"> <!-- Column two start -->

                <div id="basic" ng-show="page.isSet('basic')">
                    <img id="small_obv" ng-src="{{page.coin.obverse}}" ng-click="page.setView('obverse')" />
                    <img id="small_rev" ng-src="{{page.coin.reverse}}" ng-click="page.setView('reverse')" />
                    <h2 id="title">{{page.coin.title}}</h2>
                    <p id="description">{{page.coin.description}}</p>
                    <p id="notes">{{page.coin.notes}}</p>
                    <a id="certified" href="" ng-click="page.setView('obverse_slab')">{{page.coin.certified}}</a>

                    <div id="prices">
                        <p id="purchase">12/19/13 $3300 Purchased, Heritage Auctions</p>
                        <p>9/8/14 $4400 Heritage Auctions</p>
                        <p>1/4/14 $4935 Heritage Auctions</p>
                        <p>1/8/15 $4000 Heritage Auctions</p>
                    </div>
                </div>

                <img id="obverse" ng-src="{{page.coin.obverse}}" ng-show="page.isSet('obverse')" ng-click="page.setView('basic')" />
                <img id="reverse" ng-src="{{page.coin.reverse}}" ng-show="page.isSet('reverse')" ng-click="page.setView('basic')" />
                <img id="obverse_slab" ng-src="{{page.coin.slab_obverse}}" ng-show="page.isSet('obverse_slab')" ng-click="page.setView('reverse_slab')" />
                <img id="reverse_slab" ng-src="{{page.coin.slab_reverse}}" ng-show="page.isSet('reverse_slab')" ng-click="page.setView('basic')" />

                <div class="filler" />

            </div> <!-- Column two end -->

        </div> <!-- container1 -->
    </div> <!-- content -->
</div> <!-- container2 -->

<script src="resources/scripts/angular.min.js"></script>
<script src="resources/scripts/coins.js"></script>
</body>
</html>