<%-- 
    Document   : index
    Created on : Feb 24, 2018, 8:35:08 AM
    Author     : charlie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/myStyles.css"/>
        <script src="js/myJs.js"></script>
        <title>Login Charlie</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="Validation" method="post">
                <p><input type="text" name="user"  id="user"/></p>
                <p><input type="password" name="pass"  id="pass"/></p>
                <p><input type="submit" name="Enter"  id="Enter" value="Enter"/></p>
            </form>
            
            <p><input type="button" onclick="greet()" value="Say Hi"/></p>
        </div>
    </body>
</html>
