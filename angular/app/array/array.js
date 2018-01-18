"use strict";

var moduleNAme = "arrayEx";

function arrayEx($scope){
    $scope.names = ['Nishikant Metkute' , 'Shatakshi Metkte' , 'Neha Metkute'];
};

angular.module(moduleNAme,[])
.controller("ArrayEx",[
"$scope",
    arrayEx
]);