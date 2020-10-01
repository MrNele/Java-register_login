<%-- 
    Document   : welcome
    Created on : Jun 21, 2019, 8:26:49 PM
    Author     : student1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to application</title>
    </head>
    <body>
        <h1>Welcome to application</h1>
        <div>
            User <%=((domen.User)session.getAttribute("user").getFirstName()%>,
            <%=((domen.User)session.getAttribute("user")).getLastname() %>
                    
        </div>
            
            <div>
                <a href="../action/newUser"<>New user</a>
            </div>
            <div>
                <a href="#"<>List users</a>
            </div>
    </body>
</html>
