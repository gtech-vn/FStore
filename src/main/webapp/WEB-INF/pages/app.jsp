<%@ page language="java" contentType="text/html; charset = UTF-8"%>
<script src="js/libs/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="js/request.js" type="text/javascript"></script>
<form:form>
	<script>
			document.ctx = "${pageContext.request.contextPath}"
		</script>
</form:form>
<jsp:include page='/WEB-INF/pages/defaults/NavigationHeader.jsp'></jsp:include>
<jsp:include page='/WEB-INF/pages/users/SignIn.jsp'></jsp:include>