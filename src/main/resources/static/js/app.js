(function () {
	var movieApp = angular.module("movieApp",
		["ngRoute",
			'ui.bootstrap',
			'ngTouch',
			'slickCarousel',
			'ngFitText',
			'ngAnimate',
			'ngSanitize'

		]);

	movieApp.config(function ($routeProvider) {
		$routeProvider.when("/", {
			templateUrl: "main.html",
			controller: "MainController"
		})
			.when("/movie/:id", {
				templateUrl: "templates/movie/movie.html",
				controller: "MovieController"
			})
			.otherwise({ redirectTo: "/" });
	})
	movieApp.filter('runtime', ['$filter',
		function ($filter) {
			return function (input) {
				var inp = new Date(0, 0, 0, 0, input, 0); // assumes minutes as an input
				var m = inp.getMinutes();
				var h = inp.getHours();


				return h + 'h ' + m + 'm ';
			}
		}
	]);
	movieApp.filter('kilo', ['$filter',
		function ($filter) {
			return function (value) {
				if (value >= 1e6) return (value / 1e6).toFixed(1) + 'M'
				if (value >= 1e3) return (value / 1e3).toFixed(1) + 'K'
				return value;
			}
		}
	]);
	movieApp.directive('backImg', function () {
		return function (scope, element, attrs) {
			var url = attrs.backImg;
			element.css({
				'background-image': 'linear-gradient(rgba(255,255,255,.5), rgba(255,255,255,.5)),url( ' + url + ' )',
				'background-size': 'cover'
			});
		};
	});
}());