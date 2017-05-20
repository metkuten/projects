angular.module("calculatorCtrlApp",[])
    .controller("CalculatorCtrl",["$scope",CalculatorCtrl]);

function CalculatorCtrl($scope){


    $scope.setOperator = function(opr){
        $scope.operation = opr;
    };

    $scope.finalResult = function (){
        switch ($scope.operation){
            case "+": $scope.result = parseInt($scope.num1) + parseInt($scope.num2);
                break;
            case "-": $scope.result = $scope.num1 - $scope.num2;
                break;
        }
    }
}