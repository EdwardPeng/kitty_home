<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
	<div class="container center">
		<form>
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
			<div class="form-group">
      			<div class="col-sm-9">
        			<button type="button" class="btn btn-primary pull-right">查詢</button>
        			<button type="button" class="btn btn-info pull-right">新增</button>
        			<button type="button" class="btn btn-success pull-right">修改</button>
      			</div>
    		</div>
		</form>
	</div>
</body>
</html>