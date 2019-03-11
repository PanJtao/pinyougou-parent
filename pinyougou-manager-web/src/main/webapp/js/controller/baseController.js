app.controller("baseController",function ($scope) {
    //分頁控制 currentPage:當前頁。 totalItems:縂記錄數。itemsPerPage:每條記錄數
    //perPageOptions:分頁選項。onChange:頁碼變更是觸發的方法
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [5, 10, 15, 20, 50],
        onChange: function () {
            $scope.reloadList();
        }
    };

    $scope.reloadList = function () {
        $scope.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    };

    $scope.selectIds = [];

    /* $event 事件代表 <> 摸個標簽    */
    $scope.updateSelection = function ($event, id) {
        /*   $event 事件根據標簽，復選標簽的話有喲個是否選擇的屬性 target.checked*/
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        } else {
            /*複選框去除時i，需要得到數組對應的下標 indexOf(id) */
            var index = $scope.selectIds.indexOf(id);
            /*splice(index, 1) 方法去除下標的往後一個參數量的數據*/
            $scope.selectIds.splice(index, 1);
        }

    };
});