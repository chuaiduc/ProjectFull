<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Add Product</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

    </head>

    <body ng-app="myApp" ng-controller="customersCtrl">
        <div class="container">
            <form action="/list-products" method="GET">
                <table class="table table-hover">
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Image</th>
                        <th>
                            Partner
                        </th>
                        <th>Product Type</th>
                    </tr>
                    <tr>
                        <td><input type="text" ng-model="product.name"></td>
                        <td><input type="number" ng-model="product.price"></td>
                        <td><input type="number" ng-model="product.quantity"></td>
                        <td><input type="text" ng-model="product.imageUrl"></td>
                        <td>
                            <select ng-model="product.partner.id">
                                <option ng-repeat="partner in partner_list" value="{{partner.id}}">{{partner.name}}
                                </option>
                            </select>
                        </td>
                        <td><select ng-model="product.productType.id">
                                <option ng-repeat="type in type_list" value="{{type.id}}">{{type.name}}</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td><input type="submit" class="btn btn-primary" value="Add Product" ng-click="addnew()" /></td>
                    </tr>
                </table>
            </form>
        </div>
        <script>
            var app = angular.module('myApp', []);
            app.controller('customersCtrl', function ($scope, $http) {
                $scope.addnew = function () {
                    console.log($scope.product);
                    console.log('jhhhjhhhhh');
                    $http({
                        method: "POST",
                        url: '/api/product/add',
                        data: $scope.product
                    }).then(function mySuccess(response) {
                        alert('them thanh cong');
                    }, function myError(response) {
                        console.log(response.statusText);
                    });
                };
                $http({
                    method: "GET",
                    url: '/api/partner/all'
                }).then(function mySuccess(response) {
                    $scope.partner_list = response.data;
                }, function myError(response) {
                    console.log(response.statusText);
                });
                $http({
                    method: "GET",
                    url: '/api/producttype/all'
                }).then(function mySuccess(response) {
                    $scope.type_list = response.data;
                }, function myError(response) {
                    console.log(response.statusText);
                });
            });

        </script>

    </body>

    </html>