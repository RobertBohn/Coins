(function(){

    var app = angular.module('coins', []);

    app.controller('PageController', function($scope, $http) {

        this.init = function() {
            alert('initing');
        };



        this.coin = {};

        this.setCoin = function(id){
            $http.get(id).success(function(data, status, headers, config) {
                $scope.page.coin = data;
                $scope.page.setView('basic');
            });
        };

        this.view = 'none';

        this.setView = function(newValue) {
            this.view = newValue;
        };

        this.isSet = function(viewName) {
            return this.view === viewName;
        };

    });

})();
