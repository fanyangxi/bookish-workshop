/**
 * Created by yxfan on 6/18/16.
 */

'use strict';

angular
    .module('myapp', ['ngRoute'])
    .config(['$routeProvider', function($routeProvider) {

      $routeProvider
          .when('/', {
            templateUrl: 'partials/books.html',
            controller: 'BooksCtrl'
          })
          .when('/book-detail/:id', {
            templateUrl: 'partials/book-detail.html',
            controller: 'BookDetailCtrl'
          })
          .otherwise({
            redirectTo: '/'
          });
    }]);