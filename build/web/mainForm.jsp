<%-- 
    Document   : mainForm
    Created on : Jun 20, 2019, 4:12:35 PM
    Author     : Sher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Google Form</title>
        <style>
            body
            {
                background-color: aliceblue;
            }
            form
            {
                position: absolute;
                top: 25%;
                transform: translateX(50%);
                border-top: 8px solid greenyellow;
                background-color: white;
                width: 50%;
                padding: 40px;
            }
            form label
            {
                font-family: sans-serif;
                font-size: 20px;
            }
            .form-group
            {
                margin-top: 50px;
            }
            .form-group .form-control
            {
                border-bottom: 1px solid lightgrey;
                border-top: 0;
                border-left: 0;
                border-right: 0;
                border-radius: 0;
                width: 60%;
                padding-left: 0;
                margin-top: 10px;
            }
            .form-group .form-control:focus,
            .form-group .form-control:active
            {
                outline: 0px !important;
                outline-color: rgba(0,0,0,0);
                border: none !important;
                box-shadow: none !important;
                border-bottom: 1px solid lightgrey !important; 
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
            .view
            {
                display: block;
                width: 150px;
                position: relative;
                top: 20px;
                padding:10px 20px;
                border-radius: 5px;
                background-color: #007bff;
                color: white;
            }
            .view:hover
            {
                color: white;
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div class="bg-image"></div>
        <form action="http://localhost:8084/googleform/SerFormInput" method="post"  enctype="multipart/form-data">
            <h2>Contact Information</h2>
            <div class="form-group">
              <label for="name">Name:</label>
              <input type="text" class="form-control" name="name" id="name" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="batch">Batch:</label>
              <input type="text" class="form-control" name="batch" id="batch" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="branch">Branch:</label>
              <input type="text" class="form-control" name="branch" id="branch" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="occupation">Place of Work/Occupation</label>
              <input type="text" class="form-control" name="occupation" id="occupation" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="designation">Designation</label>
              <input type="text" class="form-control" name="designation" id="designation" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="email">Email address</label>
              <input type="email" class="form-control" name="email" id="email"  placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="phone">Phone Number:</label>
              <input type="text" class="form-control" name="phone" id="phone" placeholder="Your Answer">
            </div>
            <div class="form-group">
              <label for="address">Address:</label>
              <input type="text" class="form-control" name="address" id="address" placeholder="Your Answer">
            </div>
            <div class="form-group">
                <label for="file">Insert Image</label>
                <input type="file" class="form-control-file" style="margin-top:10px;"  id="file" name="file">
              </div>
            
            <input type="submit" id="submit" value="Submit" style="width:100px; margin-top: 20px;" class="btn btn-primary">
            <a class="view" href="http://localhost:8084/googleform/viewData.jsp">View responses</a>
          </form>
    </body>
</html>
