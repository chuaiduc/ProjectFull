<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Index Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    </head>

    <body ng-app="myApp" ng-controller="customersCtrl">
        <h1 class="text-center">THIS IS PRODUCT INFORMATIONS TEST FROM API</h1>
        <div class="container">
            <table class="table table-striped">
                <tr style="background-color:chocolate;">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Partner</th>
                    <th>Product Type</th>
                </tr>
                <tr ng-repeat="x in datafromAPI">
                    <td>{{ x.id }}</td>
                    <td>{{ x.name }}</td>
                    <td>{{ x.price}}</td>
                    <td>{{ x.quantity }}</td>
                    <td>{{x.partner.name}}</td>
                    <td>{{x.productType.name}}</td>
                </tr>
            </table>
        </div>
    </body>

    </html>
    <script>

        var app = angular.module('myApp', []);
        app.controller('customersCtrl', function ($scope, $http) {
            $http({
                method: 'GET',
                url: '/api/product/all'
            }).then(function successCallback(response) {
                $scope.datafromAPI = response.data;
            }, function errorCallback(response) {
                console.log(response.status);
            });
        });
    </script>