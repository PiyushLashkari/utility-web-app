<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<script type="text/javascript">
	window.onload = function(){
		
		// to make the current sub-menu look active
		$('.navigation').removeClass("active")
		$('#navDec').addClass("active")
	}
</script>

<h1>Password Decryptor</h1>
<br>
<div class="row">
<div class="col-lg-4"></div>
<div class="col-lg-4">
	<div class="panel panel-default">
		<div class="panel-body"
			style="background-color: rgba(220, 220, 220, 0.2)">
			<form method="post" action="${pageContext.request.contextPath}/result/decrypt">
				<div class="form-group">
					<label>Key</label> <input type="password" class="form-control" id="key"
						name="key" placeholder="Key" required>
				</div>
				<div class="form-group">
					<label>Encrypted Password</label> <input type="password" class="form-control"
						id="password" placeholder="Password" name="password" required>
				</div>
				<button type="button" class="btn btn-default">Clear</button>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</div>
<div class="col-lg-4"></div>
</div>