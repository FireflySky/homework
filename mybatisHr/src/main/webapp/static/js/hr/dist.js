var $tb;
var projectName;  //项目名


$(function () {
    //加载表格
    $tb = $("#tb");
    projectName = $("body").attr("data-project");

    loadTreeView();
});

/**
 * 加载左边菜单
 */
function loadTreeView() {
    //一会从后台读过来
    /*var defaultData = [
        {
            text: '性别',
            typeId: 1
        },
        {
            text: '学历',
            typeId: 2

        }
    ];*/
    //从后台传过来的数据
    $.ajax({
        type:"get",
        url:projectName + "/directory/findall",
        dataType:"json",
        success:function(resp){
            if(resp.code==0){
                //加载数据
                $('#dictTree').treeview({
                    color: "#428bca",
                    data: resp.data
                });
            }

        }
    });

    /*//加载数据
    $('#dictTree').treeview({
        color: "#428bca",
        data: defaultData
    });
*/
    //点击事件
    $('#dictTree').on('nodeSelected', function (event, data) {
        var typeId = data.typeId;
        $("#typeName").html(data.text + "列表信息");
        //加载右边的树形节点
        console.log("typeId"+typeId);
        //先销毁表格
        $tb.bootstrapTable("destroy");
        loadTable(typeId);
    });

}

/**
 * 根据类型加载相应数据
 * @param typeId
 */
function loadTable(typeId) {
    console.log("loadTable:" + typeId);
    $tb.bootstrapTable({
        striped: true,   //隐藏变色
        method: "POST",  //请求后台的数据的方式
        url: projectName + "/disc/search",         //后台的服务器地址
        sidePagination: "server",              //从后台服务器读取
        contentType: "application/x-www-form-urlencoded",        //提交数据查询参数的格式
        queryParamsType: "limit", //分页查询类型limit(limit[取几笔]，offset[排除前几笔]， sort[排序列]，order[排序的方式 asc/desc]),//分页查询类型"page(pageSize[每页要显示几笔]，pageNumber[查询第几页]，  sortName[排序列]，sortOrder[排序的方式 asc/desc])
        queryParams: function (params) {   //自定义查询参数
            params["typeId"] = typeId;
            return params;
        },

        pagination: true,         //要显示分页条
        pageNumber: 1,            //当前第1页
        pageSize: 5,              //每页显示几笔
        pageList: [2, 5, 10, 25, 50, 100],   //每页显示的笔数列表
        clickToSelect: true,               //点击选中一行
        singleSelect: false,               //只能true单选,false多选
        columns: [
            {checkbox: true},    //checkbox显示多选框,radio显示单选框
            {field: "id", title: "编号"},
            {field: "name", title: "名称"}
        ]
    });


}