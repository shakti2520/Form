<%-- 
    Document   : thanks
    Created on : Jun 20, 2019, 8:10:05 PM
    Author     : Sher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thanks Page</title>
        <style>
            body
            {
                background-color: aliceblue;
            }
            .bg-image
            {
                width: 100%;
                height: 300px;
                background-image: url("images/Contact-Us-Background.jpg");
                background-origin: border-box;
                background-position: bottom;
                background-repeat: no-repeat;
                background-size: cover;
            }
            .message
            {
                background-color: white;
                width: 50%;
                height: 200px;
                position: absolute;
                top:30%;
                transform: translateX(50%);
                padding: 20px;
                border-left: 8px solid greenyellow;
                
            }
            .thanks
            {
                font-size: 30px;
                display: block;
            }
            .msg
            {
                font-size: 18px;
                display: block;
                margin-top: 10px;
                margin-bottom: 10px;
            }
            .message  a:last-child
            {
                
                margin-left: 30px;
            }
        </style>
    </head>
    <body>
        <div class="bg-image"></div>
        <div class="message">
            <span class="thanks">Thanks</span>
            <span class="msg">Your response is recorded.</span>
            <a href="http://localhost:8084/googleform/mainForm.jsp">Fill another response</a>
            <a href="http://localhost:8084/googleform/viewData.jsp">View all responses</a>
        </div>
    </body>
</html>
