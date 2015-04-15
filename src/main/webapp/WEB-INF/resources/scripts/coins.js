(function(){

    var app = angular.module('coins', []);

    app.controller('PageController', function($scope, $http) {

        // coin list

        this.coins = [];

        this.init = function() {
            $http.get('list').success(function(data, status, headers, config) {
                $scope.page.coins = data;
            });
        };

        // headings

        this.headings = ["World Coins", "US Coins", "Ancients"];

        // manage which coin

        this.coin = {};

        this.setCoin = function(id) {
            for (i=0; i<this.coins.length; i++) {
                if (id == this.coins[i].id) {
                    this.coin = this.coins[i];
                    this.view = 'basic';
                    break;
                }
            }
        };

        // manage which view

        this.view = 'none';

        this.setView = function(newValue) {
            this.view = newValue;
        };

        this.isSet = function(viewName) {
            return this.view === viewName;
        };

    });

})();
