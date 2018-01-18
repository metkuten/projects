"use strict";

var moduleName = "helloWorld";

function helloWorldCtrl ($scope) {
    $scope.browserName = 'nishikant';
};


angular.module(moduleName,[])
    .controller("HelloWorldCtrl",[
        "$scope",
        helloWorldCtrl]
    );