var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.onClick = function(event){
        $scope.clicked = "Clicked On X: "+event.clientX +" and Y: "+event.clientY;
    };
});