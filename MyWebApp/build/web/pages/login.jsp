<%-- 
    Document   : login
    Created on : Jun 21, 2019, 8:24:43 PM
    Author     : student1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please enter email and password</h1>
        <form action="../action/login" method="POST">
            <%
                if (request.getAttribute("error") != null) {
            %>
                <div>
                    error: <%= request.getAttribute("error").toString()%>
                </div>
            <%
                }
            %>
            <table border="0">
                <tbody>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" value="" size="50"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><a href="../action/registerView">Register</a></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
