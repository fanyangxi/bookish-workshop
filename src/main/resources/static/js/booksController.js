/**
 * Created by yxfan on 6/18/16.
 */

var app = angular.module('myapp');

app.controller('BooksCtrl', ['$scope', '$location', '$http',
  function($scope, $location, $http) {
    $http.get('http://localhost:8080/bookish/books')
        .then(function(data) {
          $scope.resultBooks = data.data;
        });
  }]);