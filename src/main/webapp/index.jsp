<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <body>
        <jsp:forward page="/login/toLogin"/>
        <h3>一访问JSP页面，HttpSession就创建了，创建好的Session的Id是：${pageContext.session.id}</h3>
    </body>
</html>
