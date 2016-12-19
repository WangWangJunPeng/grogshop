<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>QK酒店 - 后台管理系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp">QK酒店 - 后台管理系统</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${sessionScope.employee["username"]} <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="personal-info.action"><i class="fa fa-fw fa-user"></i>个人信息</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="login.jsp"><i class="fa fa-fw fa-power-off"></i>退出登陆</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                        <a href="personal-info.action"><i class="fa fa-fw fa-table"></i>个人信息</a>
                    </li>
                    <li>
                        <a href="password.action"><i class="fa fa-fw fa-table"></i>修改密码</a>
                    </li>
                    <li>
                        <a href="employee.action"><i class="fa fa-fw fa-table"></i>员工管理</a>
                    </li>
                    <li>
                        <a href="shops.action"><i class="fa fa-fw fa-table"></i>商家管理</a>
                    </li>
                    <li>
                        <a href="users.action"><i class="fa fa-fw fa-table"></i>消费者管理</a>
                    </li>
                    <li>
                        <a href="orders.action"><i class="fa fa-fw fa-table"></i>订单管理</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            员工管理
                        </h1>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                            <table class="table table-bordered table-striped">
                                <thead>
                                    <tr>
                                        <th class="eID">员工ID</th>
                                        <th class="eName">姓名</th>
                                        <th class="phoneNum">电话</th>
                                        <th class="email">邮箱</th>
                                        <th class="permission">员工权限</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${employeeLimtList }" var="employeeLimtList" >
                                <tr>
                                	<td class="eID">${employeeLimtList.key.id }</td>
                                	<td class="eName">${employeeLimtList.key.username }</td>
                                	<td class="phoneNum">${employeeLimtList.key.phone }</td>
                                	<td class="email">${employeeLimtList.key.email }</td>
                                	<td class="permission">${employeeLimtList.value.code }</td>
                                	<td>
                                	 <a href="#" class="employee-modify">修改</a>
                                     <a href="deleteEmployee.action?id=${employeeLimtList.key.id }" style="float:right;color:red;">删除</a>
                                    </td>
                                 </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <a type="submit" id="create-employee" class="btn btn-default float-r">创建员工</a>
                    </div>
                    <div class="col-lg-1"></div>
                    <div class="col-lg-4">
                        <form id="employee-form">

                            <div class="form-group">
                                <label>员工ID</label>
                                <input class="form-control form-eID" name="id">
                            </div>

                            <div class="form-group">
                                <label>姓名</label>
                                <input class="form-control form-eName" name="username">
                            </div>

                            <div class="form-group">
                                <label>电话</label>
                                <input class="form-control form-phoneNum" name="phone">
                            </div>

                            <div class="form-group">
                                <label>邮箱</label>
                                <input class="form-control form-email" name="email">
                            </div>

                            <div class="form-group">
                                <label>员工权限</label>
                                <input class="form-control form-permission" name="empLimitId">
                            </div>
                            
                            <a type="submit" class="btn btn-default" id="update">保存修改</a>
                            <a type="submit" class="btn btn-default" id="insert">保存添加</a>

                        </form>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/admin.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function(){
    		$("#update").click(function(){
    			$.post("changeEmployee.action", 
    				{
    					id : $("[name='id']").val(),
    					username : $("[name='username']").val(),
    					phone : $("[name='phone']").val(),
    					email : $("[name='email']").val(),
    					code : $("[name='empLimitId']").val()
    				},
    				function() {
    					window.location.href="employee.action";
    				}
    			);
    			return false;
    		});
    	});
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
    $(document).ready(function(){
    		$("#insert").click(function(){
    			$.post("insertEmployee.action", 
    				{
    					id : $("[name='id']").val(),
    					username : $("[name='username']").val(),
    					phone : $("[name='phone']").val(),
    					email : $("[name='email']").val(),
    					code : $("[name='empLimitId']").val()
    				},
    				function() {
    					window.location.href="employee.action";
    				}
    			);
    			return false;
    		});
    	});
	</script>
	<script>
		$(document).ready(function(){
		  $(".employee-modify").click(function(){
		    $("#insert").hide();
		    $("#update").show();
		  });
		  
		  $("#create-employee").click(function(){
			   $("#update").hide();
			   $("#insert").show();
			});
		});
	</script>
</body>

</html>
