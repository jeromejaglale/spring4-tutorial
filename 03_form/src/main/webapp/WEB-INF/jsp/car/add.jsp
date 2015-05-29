<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

	<h1>Add a car</h1>

	<form:form method="POST">
		<p>
			Name:
			<input type="text" name="name" />
		</p>
		<p>
			Price:
			<input type="text" name="price" />
		</p>

		<input type="submit" />
	</form:form>

</body>
</html>