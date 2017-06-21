<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>會員資料</title>
</head>
<body>
	<ul class="breadcrumb">
		<li><a href="#">Home</a></li>
		<li><a href="#" data-url="queryUserProfile">會員資料</a></li>
		<li class="active">查詢</li>
	</ul>
	<div class="porlet">
		<div class="porlet-body">
			<form id="form">
				<div class="form-group">
					<label class="col-xs-2 col-form-label text-right">電話</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" id="example-text-input">
					</div>
				</div>
				<div class="form-group">
					<label class="col-xs-2 col-form-label text-right">姓名</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" id="example-text-input">
					</div>
				</div>
				<div class="form-action">
					<div class="col-sm-11">
						<button type="button" class="btn btn-primary pull-right" onclick="query()">查詢</button>
						<button type="button" class="btn btn-info pull-right" onclick="submitForm($('#form'),'addShowUserProfile')">新增</button>
					</div>
				</div>
			</form>
		</div>
		<div>
			<table id='grid'></table>
			<div id='pager'></div>
		</div>
	</div>
</body>
</html>
<script type='text/javascript'>
	function query() {
		$("#grid").jqGrid({
			"viewrecords":true,
			"gridview":true,
			"url":"queryUserProfileAjax",
			"mtype": "POST",
			"datatype":"json",
			"colNames":['會員編號','會員姓名','性別','電話'],
			"colModel":[
				{name:'userId',index:'userId', width:55},
				{name:'userName',index:'userName', width:55},
				{name:'gender',index:'gender', width:55},
				{name:'phone',index:'phone', width:55},
			],
			"rowNum":10,
		   	"rowList":[10,20,30],
			"loadonce": true,
			"autowidth":true,
			"pager":"#pager"
		});
	}
</script>