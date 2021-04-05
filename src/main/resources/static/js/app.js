(function() {
	var movieApp = angular.module("movieApp",
		["ngRoute",
			'ui.bootstrap',
			'ngTouch',
			'slickCarousel',
			'ngFitText'
			
		]);

	movieApp.config(function($routeProvider) {
		$routeProvider.when("/", {
			templateUrl: "main.html",
			controller: "MainController"
		})  
			.when("/movie/:id",{
			templateUrl: "movie.html",
			controller: "MovieController"
		})
			.otherwise({ redirectTo: "/" });
	})

}());