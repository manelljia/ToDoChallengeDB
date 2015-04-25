<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	
		html, body{
			height:100%;
			width:100%;
			margin:0px;
		}
		
		div, p{
			margin:0px;
			color:#1D1E1E;
			font-size:30px;
		}
		
		#add{
			float:left;
			height: 100%;
			width: 10%;
			background-color:#EB4B55;
		}
			
		.nav{
			background-color:#F4B6AC;
			width:100%;
			height:15%;
		}
		
		#up p, #down p{
			position:relative;
			top:45%;
			right:50%:
		}
		
		#content p{
			position:relative;
			top:45%;
			left:20%;
		}
		
		#add p{
			position:relative;
			top:45%;
			left:45%;
			color:#FFF7F3;
		}
		
		#content{
			background-color:#FFF7F3;
			width:100%;
			height:70%;
		}
	
</style>
</head>
<body>
	<div id="add">
		<center><a href="addNote.jsp"><button> + </button></a></center>
	</div>
	<div class="nav" id="up">
		<center><a href=""><button> Previous </button></a></center>
	</div>
	<div id="content">
		<p> Finish MC </p>
	</div>
	<div class="nav" id="down">
		<center><a href=""><button> Next </button></a></center>
	</div>
</body>
</html>