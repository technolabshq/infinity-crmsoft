<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lumino - Forms</title>

<link
	href='<c:url value="/web-resources/lumino/css/bootstrap.min.css"/>'
	rel="stylesheet">
<link href='<c:url value="/web-resources/lumino/css/datepicker3.css"/>'
	rel="stylesheet">
<link href='<c:url value="/web-resources/lumino/css/styles.css"/>'
	rel="stylesheet">

<!--Icons-->
<script src='<c:url value="/web-resources/lumino/js/lumino.glyphs.js"/>'></script>

<!--[if lt IE 9]>
	<script src='<c:url value="/web-resources/lumino/js/html5shiv.js"/>'></script>
	<script src='<c:url value="/web-resources/lumino/js/respond.min.js"/>'></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Lumino</span>Admin</a>
				<ul class="user-menu">
					<li class="dropdown pull-right"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"><svg
								class="glyph stroked male-user">
								<use xlink:href="#stroked-male-user"></use></svg> User <span
							class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user">
										<use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear">
										<use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="#"><svg class="glyph stroked cancel">
										<use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul></li>
				</ul>
			</div>

		</div>
		<!-- /.container-fluid -->
	</nav>

	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="index"><svg
						class="glyph stroked dashboard-dial">
						<use xlink:href="#stroked-dashboard-dial"></use></svg> Dashboard</a></li>
			<li><a href="widgets"><svg class="glyph stroked calendar">
						<use xlink:href="#stroked-calendar"></use></svg> Widgets</a></li>
			<li><a href="charts"><svg class="glyph stroked line-graph">
						<use xlink:href="#stroked-line-graph"></use></svg> Charts</a></li>
			<li><a href="tables"><svg class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg> Tables</a></li>
			<li><a href="/crmsoft/campaign?type=campaign"><svg class="glyph stroked hourglass"><use xlink:href="#stroked-hourglass"/></svg> campaign</a></li>
			<li><a href="/crmsoft/companies?type=companies"><svg class="glyph stroked chain"><use xlink:href="#stroked-chain"/></svg> companies</a></li>
			<li><a href="/crmsoft/edmessagemanager?type=email&amp"><svg class="glyph stroked email"><use xlink:href="#stroked-email"></use></svg> Email</a></li>
			<li><a href="/crmsoft/edmessagemanager?type=sms&amp"><svg class="glyph stroked two messages"><use xlink:href="#stroked-two-messages"/></svg> SMS</a></li>			
			<li class="active"><a href="forms"><svg
						class="glyph stroked pencil">
						<use xlink:href="#stroked-pencil"></use></svg> Forms</a></li>
			<li><a href="panels"><svg class="glyph stroked app-window">
						<use xlink:href="#stroked-app-window"></use></svg> Alerts &amp; Panels</a></li>
			<li><a href="icons"><svg class="glyph stroked star">
						<use xlink:href="#stroked-star"></use></svg> Icons</a></li>
			<li class="parent "><a href="#"> <span
					data-toggle="collapse" href="#sub-item-1"><svg
							class="glyph stroked chevron-down">
							<use xlink:href="#stroked-chevron-down"></use></svg></span> Dropdown
			</a>
				<ul class="children collapse" id="sub-item-1">
					<li><a class="" href="#"> <svg
								class="glyph stroked chevron-right">
								<use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 1
					</a></li>
					<li><a class="" href="#"> <svg
								class="glyph stroked chevron-right">
								<use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 2
					</a></li>
					<li><a class="" href="#"> <svg
								class="glyph stroked chevron-right">
								<use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 3
					</a></li>
				</ul></li>
			<li role="presentation" class="divider"></li>
			<li><a href="login"><svg class="glyph stroked male-user">
						<use xlink:href="#stroked-male-user"></use></svg> Login Page</a></li>
		</ul>

	</div>
	<!--/.sidebar-->

	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<!--/.row-->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-body">
						<div>test</div>
					</div>
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->
	</div>
	
	
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main" id="adm">
		<!--/.row-->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
				<div class="panel-heading">
						<div class="row table">
							<div class="col-md-3">Adminmail</div>						
						</div>						
					</div>
					<div class="panel-body">
						<div class="row table">
								<div class="col-md-3"><strong>Sender</strong></div>
								<div class="col-md-3"><input type="text" name="Sender" class="form-control" placeholder="Sender"></div>
								<div class="col-md-3"><strong>Receiver</strong></div>
								<div class="col-md-3"><input type="text" name="Receiver" class="form-control" placeholder="Receiver"></div>
								</div>
							
							<div class="row table">
								<div class="col-md-3"><strong>Subject</strong></div>
								<div class="col-md-3"><input type="text" name="Subject" class="form-control" placeholder="Subject"></div>
								<div class="col-md-3"><strong>UserId</strong></div>
								<div class="col-md-3"><input type="text" name="UserId" class="form-control" placeholder="UserId"></div>
								</div>
							
	
							<div class="row table">
								<div class="col-md-3"><strong>content(body)</strong></div>
								<textarea  name="content" class="form-control" style="margin-left: 12px;" placeholder="body"></textarea>
							</div>								
						
						    <div class="checkbox">
						      <label><input type="checkbox">Scheduled</label>
						    </div>
						
                            <button type="submit" id="sbtn" class="btn btn-primary">Save</button>					
					</div>
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->
	</div>
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	<!--/.main-->

	<script
		src='<c:url value="/web-resources/lumino/js/jquery-1.11.1.min.js"/>'></script>
	<script
		src='<c:url value="/web-resources/lumino/js/bootstrap.min.js"/>'></script>
	<script src='<c:url value="/web-resources/lumino/js/chart.min.js"/>'></script>
	<script src='<c:url value="/web-resources/lumino/js/chart-data.js"/>'></script>
	<script src='<c:url value="/web-resources/lumino/js/easypiechart.js"/>'></script>
	<script
		src='<c:url value="/web-resources/lumino/js/easypiechart-data.js"/>'></script>
	<script
		src='<c:url value="/web-resources/lumino/js/bootstrap-datepicker.js"/>'></script>
	<script src='<c:url value="/web-resources/lumino/js/main.js"/>'></script>
	<script>
	   
	var adminmail={};
       $("#sbtn").on("click",function(event){
    	   adminmail["Sender"]=$("#adm [name='Sender']").val();
    	   adminmail["Receiver"]=$("#adm [name='Receiver']").val();
    	   adminmail["Subject"]=$("#adm [name='Subject']").val();
    	   adminmail["UserId"]=$("#adm [name='UserId']").val();
    	   adminmail["content"]=$("#adm [name='content']").val();
    	   console.log(adminmail);
       })	
	
	
	
	
	
		$("form").on("click", function(event){
			event.preventDefault();
			var value = $(this).serialize();
			
			/* $.ajax({
				url : "http://localhost:9090/crmsoft/contentdata/update",
				method:"post",
				data : value,
				success : function(dt){
					console.log(dt);
				}				
			}); */
			
			console.log(value);	
		});
		
	
	</script>
	
	
</body>

</html>