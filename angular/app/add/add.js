class addCtrl {
    constructor($scope) {
        this.welcome = "nishikant";
    }

    addNumber() {
        this.number3 = Number(this.number1) + Number(this.number2);
    }
}

angular.module("addValue", [])
    .controller("AddCtrl", [
        "$scope",
        addCtrl
    ]);