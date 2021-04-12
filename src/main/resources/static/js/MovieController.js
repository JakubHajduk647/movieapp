(function () {
	var app = angular.module("movieApp");
	var MovieController = function ($scope, $routeParams, $http,$timeout) {
		var onMovieCopmlete = function (response) {
			$scope.movie = response.data;

		};

		var onCreditsCopmlete = function (response) {
			$scope.credits = response.data;

		};
		var onReviewsCopmlete = function (response) {
			$scope.reviews = response.data;

		};



		$http.get("movie/" + $routeParams.id)
			.then(onMovieCopmlete);
		$http.get("movie/" + $routeParams.id + "/credits")
			.then(onCreditsCopmlete);
		$http.get("movie/" + $routeParams.id + "/reviews")
			.then(onReviewsCopmlete);
		
		
		$scope.responsiveConfig2 = {
			enabled: true,
			autoplay: false,
			draggable: false,
			autoplaySpeed: 3000,
			method: {},
			dots: false,
			infinite: false,
			speed: 300,
			slidesToShow: 5,
			slidesToScroll: 5,
			responsive: [
				{
					breakpoint: 1024,
					settings: {
						slidesToShow: 3,
						slidesToScroll: 3,
						infinite: true,
						dots: true
					}
				},
				{
					breakpoint: 600,
					settings: {
						slidesToShow: 2,
						slidesToScroll: 2
					}
				},
				{
					breakpoint: 480,
					settings: {
						slidesToShow: 1,
						slidesToScroll: 1
					}
				}
			],
			event: {
				beforeChange: function (event, slick, currentSlide, nextSlide) {
				},
				afterChange: function (event, slick, currentSlide, nextSlide) {
				}
			}
		}
	}

	app.controller("MovieController", MovieController);
}());