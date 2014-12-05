<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<div>
			<h:form>
				<h:inputText id="name" value="#{userController.user.name }"></h:inputText>
				<h:inputText id="firstName"
					value="#{userController.user.firstName }"></h:inputText>
				<h:commandLink value="add User" action="#{userController.addUser}"></h:commandLink>
			</h:form>
		</div>
	</f:view>
</body>
</html>