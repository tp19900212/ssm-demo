<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.tp.models.entity.Cat"%>
<%@ page import="com.tp.models.entity.Bird"%>
<!DOCTYPE HTML>
<html>
    <body>
        <jsp:forward page="/login/toLogin"/>
        <h3>一访问JSP页面，HttpSession就创建了，创建好的Session的Id是：${pageContext.session.id}</h3>
            <%
                //往application域对象中添加属性
                // application.setAttribute("name", "TP");
                //替换application域对象中name属性的值
                // application.setAttribute("name", "Java");
                //移除application域对象中name属性
                // application.removeAttribute("name");

                //将javabean对象绑定到Session中
                // session.setAttribute("bean",new Cat("中国狸花猫"));
                //从Session中删除javabean对象
                // session.removeAttribute("bean");

                //javabean对象绑定到Session中
                // session.setAttribute("bean",new Bird("百灵鸟"));
            %>
    </body>
</html>
