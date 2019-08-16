<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>H+ 后台主题UI框架 - 主页</title>

    <meta name="keywords" content="">
    <meta name="description" content="">


    <link href="${ctx}/static/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx}/static/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/static/css/animate.css" rel="stylesheet">


    <!-- bootstrap-table -->
    <link href="${ctx}/static/js/plugins/bootstrap-table/bootstrap-table.css" rel="stylesheet">
    <!-- bootstrap-treeview -->
    <link href="${ctx}/static/css/plugins/treeview/bootstrap-treeview.css" rel="stylesheet">

    <!-- bootstrap-validator验证 -->
    <link href="${ctx}/static/js/plugins/validator/css/bootstrapValidator.css" rel="stylesheet">


    <link href="${ctx}/static/css/style.css?v=4.1.0" rel="stylesheet">

</head>


<body data-project="${ctx}">


<div class="wrapper wrapper-content animated fadeInRight">


    <!--左边显示树形节点，右边显示表格 -->
    <div class="row">
        <div class="col-md-4">
            <h3>字典列表</h3>
            <div id="dictTree" class=""></div>
        </div>

        <div class="col-md-8">
            <h3 id="typeName"></h3>
            <table id="tb" class="table table-bordered  table-hover"></table>

        </div>
    </div>


</div>


<!-- 全局js -->
<script src="${ctx }/static/js/jquery.min.js?v=2.1.4"></script>
<script src="${ctx }/static/js/bootstrap.min.js?v=3.3.6"></script>

<!-- bootstrap-table -->
<script src="${ctx }/static/js/plugins/bootstrap-table/bootstrap-table.js?v=1.14.2"></script>
<script src="${ctx }/static/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.js?v=1.14.2"></script>

<!-- bootstrap-treeview -->
<script src="${ctx }/static/js/plugins/treeview/bootstrap-treeview.js"></script>

<!-- Peity -->
<script src="${ctx }/static/js/plugins/peity/jquery.peity.min.js"></script>

<!-- bootstrap-validator验证 -->
<script src="${ctx }/static/js/plugins/validator/js/bootstrapValidator.js"></script>
<script src="${ctx }/static/js/plugins/validator/js/language/zh_CN.js"></script>


<!-- h+框架写的自定义js -->
<script src="${ctx }/static/js/content.js?v=1.0.0"></script>

<!-- 我们自己写的 role.js -->
<script src="${ctx }/static/js/hr/dist.js?v=1.0.0"></script>

</body>

</html>
    
    