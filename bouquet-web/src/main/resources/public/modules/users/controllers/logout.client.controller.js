'use strict';


angular.module('users').controller('LogoutController', ['$scope', '$cookies', '$location', 'Authentication', 
	function($scope, $cookies, $location, Authentication) {
		//$scope.allCookies = $cookies.getAll();
		$scope.logout = function(){
			Authentication.removeUserObject();
			$location.path('/login');
		};
		//logout();
	}
]);