angular.module('csrfngcookieless', [])
.config(['$httpProvider', function($httpProvider) {
  $httpProvider.interceptors.push('APIInterceptor');
} ])
.service('APIInterceptor', [function() {
	var service = this;

	service.request = function(config) {
		var token = $("#csrfForm input").val();
		config.headers['X-CSRF-TOKEN']= token;
		return config;
	};
}])
.controller('Customer', function($scope, $http) {
  $http.get('/customer').
    then(function(response) {
      $scope.customer = response.data;
		});
		
	$scope.create = function() {
		$http.post('/customer').
			then(function(response) {
				$scope.customer = response.data;
			});
	}
});