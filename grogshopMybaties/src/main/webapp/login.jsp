<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<body class="grey login">
<h3 class="col-lg-10">QK酒店后台管理系统</h3>
    <div id="">
        <div id="login-form" class="">
            <form method="post">
                <table>
                    <tr class="form-group">
                        <td><label>用户ID</label></td>
                        <td><input class="form-control" name="username"></td>
                        <td rowspan="2">
                            <a >
                                <i class="fa fa-chevron-circle-right login-button" id="loginA"></i>
                            </a>
                        </td>
                    </tr>
                    <tr class="form-group">
                        <td>密码</td>
                        <td><input class="form-control" type="password" name="password"></td>
                    </tr>
                </table>
                    
            </form>
        </div>
        <div class="col-lg-4"></div>
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/admin.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
		$(document).ready(function(){
			$("#loginA").click(function(){
				$.post("login.action",
				{
					username:$("[name='username']").val(),
					password:$("[name='password']").val()
				},
				function(data, status) {
					//alert("数据:" + data + "\n状态:" + status);
					if(data == "ERROR"){
						alert("用户名或密码错误");
						//return false;
					}else {
						window.location.href="index.action";
					}
				});
			});
		});
	</script>
</body>
</html>
