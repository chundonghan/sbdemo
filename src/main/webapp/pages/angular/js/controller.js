var app2 = angular.module('myApp2',[]);
app2.controller('personListCtrl',function($scope){
	$.ajax({
		url: global_params.context_root+'/rest/getNames.do',
        type: 'GET',
        data: {
        },
        async:false,
        success: function(data) {
        	$scope.names = data
        }
	})
	
});


angular.bootstrap(document.getElementById("myApp2"), ['myApp2']);