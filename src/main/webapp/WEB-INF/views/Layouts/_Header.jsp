<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-inverse navbar-static-top">
	<div class="container-fluid">
		<div class="col-lg-5 col-md-5 hidden-sm hidden-xs navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/">
				SecureVault
			</a>
		</div>
		<div class="col-lg-7 col-md-7 col-sm-12 col-xs-12 navbar-header">
			<a class="navbar-brand pull-right" style="padding: 7px;" href="${pageContext.request.contextPath}/"> 
				
			</a>
		</div>
	</div>
	<!--/.container -->
</nav>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
          	<span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
    	</button>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li id="navEnc" class="navigation" class="active"><a href="${pageContext.request.contextPath}/encryption">Encryption</a></li>
				<li id="navDec" class="navigation"><a href="${pageContext.request.contextPath}/decryption">Decryption</a></li>
			</ul>
		</div>
  </div>
</nav>