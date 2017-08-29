var app = angular.module('test', [ 'ngRoute']).config(function($routeProvider) {

    $routeProvider.when('/test', {
        templateUrl : 'test.html',
        controller : 'test',
        controllerAs: 'test'
    }).when('/', {
        templateUrl : 'home.html',
        controller : 'home',
        controllerAs: 'home'
    }).when('/recruitment', {
        templateUrl : 'recruitment.html',
        controller : 'recruitment',
        controllerAs: 'recruitment'
    }).when('/users', {
        templateUrl : 'users.html',
        controller : 'user',
        controllerAs: 'user'
    });

});

app.controller('test', function($http,$scope,$location,$rootScope) {

    $scope.peoples = [];

    $http.get("../rest/people")
        .then(function(response) {
            $scope.peoples = response.data;
            console.log(response.data);
        });

    $scope.logout = function () {
        $location.path("/");
    }
});

app.controller('user', function($http,$scope,$location,$rootScope) {

    $scope.peoples = [];

    $http.get("../rest/user")
        .then(function(response) {
            $scope.users = response.data;
            console.log(response.data);
        });
});

app.controller('recruitment', function($http,$scope,$location,$rootScope) {

    $scope.createUser = function () {


        if($scope.password == $scope.password_conf)
        {
            var user = { "usr": $scope.username, "password": $scope.password, peoples:{ "usr_name":$scope.name, "user_age": $scope.age}};
            $http.post('../rest/updateUserAndPeoples', user);
            alert("You create new user: " + $scope.username);

        }else{
            alert("password and password_conf must be the same");
        }
    }
    $scope.goLogin = function(){
        $location.path("/");
    }
});


app.controller('home', function($http,$scope,$location,$rootScope) {

    $scope.submit = function()
    {
        console.log("usr: "+ $scope.username + " password: "+ $scope.password)
        var login = {"usr": $scope.username, "password": $scope.password};
        $http.post('../loginU/loginU',login).then(function (response) {

            if(response.data == true){
                $location.path("/test");
            }else
            {
                alert("wrong login or password");
            }

        });
    }

    $scope.goDb = function(){
        $location.path("/test");
    }
    $scope.goRecruitment = function(){
        $location.path("/recruitment");
    }

});
