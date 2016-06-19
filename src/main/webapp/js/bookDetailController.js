/**
 * Created by yxfan on 6/18/16.
 */

var app = angular.module('myapp');

app.controller('BookDetailCtrl', ['$scope', '$location', '$http', '$routeParams',
  function($scope, $location, $http, $routeParams) {
    $scope.ServerBaseURL = "http://localhost:8080";
    var bookId = $routeParams.id;
    $http.get($scope.ServerBaseURL + '/bookish/get-book-detail/' + bookId)
        .then(function(e) {
          $scope.currentBook = e.data;
        })
  }]);