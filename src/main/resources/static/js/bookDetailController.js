/**
 * Created by yxfan on 6/18/16.
 */

var app = angular.module('myapp');

app.controller('BookDetailCtrl', ['$scope', '$location', '$http', '$routeParams',
  function($scope, $location, $http, $routeParams) {
    var bookId = $routeParams.id;
    $http.get('http://localhost:8080/bookish/get-book-detail/' + bookId)
        .then(function(e) {
          $scope.currentBook = e.data;
        })
  }]);