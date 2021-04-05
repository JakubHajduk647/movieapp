(function() {
	var app = angular.module("movieApp");
	var MoviesPopularController = function($scope, $location, $http) {

		var onMoviePopularCopmlete = function(response) {
			$scope.movies = response.data['results'];
		};

		$http.get("movie/popular")
			.then(onMoviePopularCopmlete);
		
		$scope.responsiveConfig = {
            enabled: true,
            autoplay: true,
            draggable: false,
            autoplaySpeed: 3000,
            method: {},
            dots: false,
            infinite: false,
            speed: 300,
            slidesToShow: 5,
            slidesToScroll: 5,
            event: {
                beforeChange: function (event, slick, currentSlide, nextSlide) {
                },
                afterChange: function (event, slick, currentSlide, nextSlide) {
                }
            }
            }

	};



	app.controller("MoviesPopularController", MoviesPopularController);
}());