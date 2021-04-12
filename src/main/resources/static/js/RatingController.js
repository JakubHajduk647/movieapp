(function() {
	var app = angular.module("movieApp");
	var RatingController = function($scope) {
		$scope.rate = 7;
		$scope.max = 10;
		$scope.isReadonly = false;

		$scope.hoveringOver = function(value) {
			$scope.overStar = value;
			$scope.percent = 100 * (value / $scope.max);
		};

		$scope.ratingStates = [
			
			{ stateOn: 'glyphicon-star yellow', stateOff: 'glyphicon-star-empty' }
			
		];}
		app.controller("RatingController", RatingController);
	}());


