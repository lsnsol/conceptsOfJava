var simpleController = function ($scope)
{
    // Initialize the model variables
    $scope.firstName = "Abc";
    $scope.lastName = "Xyz";

    // Define utility functions
    $scope.getFullName = function ()
    {
        return $scope.firstName + " " + $scope.lastName;
    };
};