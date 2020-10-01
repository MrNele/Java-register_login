<%-- 
    Document   : register
    Created on : Jun 21, 2019, 8:25:22 PM
    Author     : student1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>You need to fill registration form</h1>

        <form action="../action/register" method="POST">
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
                        <td>Firstname:</td>
                        <td><input type="text" name="firstname" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Lastname:</td>
                        <td><input type="text" name="lastname" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" value="" size="50"/></td>
                    </tr>
                    
                    <tr>
                        <td><input type="submit" value="Register" /></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
