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

        this.headings = [];

        this.getHeadings = function() {
            var current = "";
            for (i=0; i<this.coins.length; i++) {
                if (current != this.coins[i].type) {
                    this.headings.push(this.coins[i].type);
                    current = this.coins[i].type;
                }
            }
            return this.headings;
        };

        // current coin

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

        // current view

        this.view = 'none';

        this.setView = function(newValue) {
            this.view = newValue;
        };

        this.isSet = function(viewName) {
            return this.view === viewName;
        };

    });

})();
