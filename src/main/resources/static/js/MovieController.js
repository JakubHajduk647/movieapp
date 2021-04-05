(function(){
	var app = angular.module("movieApp");
	var MovieController = function($scope,$routeParams,$http){
		var onMovieCopmlete = function(response) {
			$scope.movie = response.data;
		};

		$http.get("movie/"+$routeParams.id)
			.then(onMovieCopmlete);
	};
	app.controller("MovieController",MovieController);
}());