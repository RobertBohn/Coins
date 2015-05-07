(function(){

    var app = angular.module('coins', []);

    app.controller('PageController', function($scope, $http) {

        // coin list

        this.headings = [];

        this.coins = [];

        this.init = function() {
            $http.get('list').success(function(data) {
                var current = "";
                var types = [];
                for (var i=0; i<data.length; i++) {
                    if (current != data[i].type) {
                        types.push(data[i].type);
                        current = data[i].type;
                    }
                }
                $scope.page.coins = data;
                $scope.page.headings = types;
            });
        };

        // current coin

        this.coin = {};

        this.setCoin = function(id) {
            for (var i=0; i<this.coins.length; i++) {
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
