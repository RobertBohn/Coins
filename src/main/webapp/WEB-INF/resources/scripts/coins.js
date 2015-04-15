(function(){

    var app = angular.module('coins', []);

    app.controller('PageController', function($scope, $http) {

        // manage coin list

        this.coins = [];

        this.init = function() {
            $http.get('list').success(function(data, status, headers, config) {
                $scope.page.coins = data;
            });
        };

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
