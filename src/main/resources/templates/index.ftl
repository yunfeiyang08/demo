<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="${base}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/css/bootstrap-table.min.css">
    <script src="${base}/js/jquery.min.js"></script>
    <script src="${base}/js/bootstrap.min.js"></script>
    <script src="${base}/js/bootstrap-table.min.js"></script>
    <script src="${base}/js/bootstrap-table-zh-CN.min.js"></script>
    <script src="${base}/js/popper.min.js"></script>
</head>
<div class="container">
    <h1>我的第一个 Bootstrap 页面</h1>
    <p>这是一些文本。</p>
    <!-- toolbar-->
    <div id="toolbar" class="btn-group">
        <button type="button" class="btn btn-default" id="save">
            <i class="glyphicon glyphicon-plus">保存</i>
        </button>
        <button type="button" class="btn btn-default">
            <i class="glyphicon glyphicon-trash">删除</i>
        </button>
    </div>
    <table data-toggle="table"
           data-url="city"
           data-pagination="true"
           data-page-number="1"
           data-page-size="5"
           data-page-list="[5,10,20]"
           data-search="true"
           data-show-refresh="true"
           data-toolbar="#toolbar">
        <thead>
        <tr>
            <th data-field="provinceId">省份</th>
            <th data-field="cityName">城市</th>
        </tr>
        </thead>
    </table>
</div>
</html>