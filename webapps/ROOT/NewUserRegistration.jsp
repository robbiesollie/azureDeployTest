<%--
  Created by IntelliJ IDEA.
  User: wiish
  Date: 1/31/2019
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <title>Register</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
</head>
<body>
<section id="nav-bar">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp"><img src="assets/icon.png"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only"></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="projects.jsp">Projects</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Sign In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="about.jsp">About</a>
                </li>
                <li class = "nav-item">
                    <a class = "nav-link" href="managementPage.jsp">Help</a>
                </li>
            </ul>
        </div>
    </nav>
</section>
<h1>Welcome to TechConnect!</h1>
<h2>
    <center><b>We are excited to have another member join our community! </b></center>
</h2>
<p>
<center>
    <b>Please enter the following information so we can get to know you better!</b> <br>
</center>
</p>
<!-- AQL this section is designed to grab the necessary elements the database needs for creating a person -->
<!-- AQL doesn't take into consideration the different qualities of solution providers over project providers-->
<!-- AQL might need another one for admin but not sure -->
<section id="login-forms">
    <form>
        <div class="form-group">
            <label> Are you representing a group?</label> <br>
            <input type="radio" name="group" value="yes">yes <br>
            <input type="radio" name="group" value="no"> no <br>
        </div>
        <div class="form-group">
            <label> Are you the primary contact? </label> <br>
            <input type="radio" name="primary" value="yes">yes <br>
            <input type="radio" name="primary" value="no"> no <br>
        </div>

        <div class="form-group">
            <label for="primaryEmail">Primary email for communication: </label> <br>
            <input type="text" class=form-control" id="primaryEmail" placeholder="primary Email">
        </div>

        <div class="form-group">
            <label for="affiliation"> Affiliation: </label>
            <input type="text" class="form-control" id="affiliation" placeholder="Affiliation">
        </div>

        <div class="form-group">
            <label for="Location"> Location: </label>
            <input type="text" class="form-control" id="Location" placeholder="Location">
        </div>
        <!-- https://www.tutorialspoint.com/jsp/jsp_file_uploading.htm -->
        <div class="form-group">
            <label for="file"> If you would like to upload an introduction of yourself or a resume please upload
                here: </label> <br>
            Select a file to upload: <br>
            <form action="UploadServlet" method="post" enctype="multipart/form-data">
                <input type="file" class="form-control" id="file" size="50"/><br>
                <input type="submit" value="Upload File"/>
            </form>
        </div>
    </form>
    <form action="Profile.jsp">
        <button id="submit" class="btn btn-primary" value="next">Done!</button>
    </form>


</section>
</body>
</html>
