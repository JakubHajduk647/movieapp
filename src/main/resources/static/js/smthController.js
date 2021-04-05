var movieApp = angular.module('movieApp', ['ui.bootstrap']);
movieApp.controller('popularMoviesCtrl', function($scope, $http) {


	function getPopularMovies() {
		$http.get('movie/popular')
			.then(function success(response) {
				$scope.movies = response.data['results'];
			}, function error(response) {
				console.log('API error ' + response.status);
			});
	}
	getPopularMovies();
});
function CarouselDemoCtrl($scope) {
	$scope.myInterval = 5000;
	$scope.noWrapSlides = false;
	$scope.active = 0;
	$scope.slides = $scope.movies;
	var currIndex = 0;
}

