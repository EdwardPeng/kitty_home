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
		<li class="active">新增</li>
	</ul>
	<div class="porlet">
		<div class="porlet-body">
			<form>
				<table class="table">
					<tr>
						<th>會員姓名</th>
						<td>
							<input class="form-control" type="text" name="userName" />
						</td>
					</tr>
					<tr>
						<th>性別</th>
						<td>
							<label class="radio-inline"><input type="radio" name="gender" value="M" />男</label>
							<label class="radio-inline"><input type="radio" name="gender" value="F" />女</label>
						</td>
					</tr>
					<tr>
						<th>電話</th>
						<td>
							<input class="form-control" type="text" placeholder="手機 EX:0912123123" name="phone">
						</td>
					</tr>
					<tr>
						<th>地址</th>
						<td>
							<div class="form-inline">
								<input class="form-control" type="text" placeholder="郵遞區號" name="zip" size="5"/>
								<input class="form-control" type="text" placeholder="地址" name="address" size="116"/>
							</div>
						</td>
					</tr>
					<tr>
						<th>LINE</th>
						<td>
							<input class="form-control" type="text" name="line">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="button" class="btn btn-primary pull-right" onclick="">存檔</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>