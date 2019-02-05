<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
<!--    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>-->

</head>
<body>
<!----nav bar---->
<section id="nav-bar">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp"><img src="assets/icon.png"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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
            </ul>
        </div>
    </nav>
</section>
<section id="login-forms">
    <h1>Welcome! Please register below.</h1>

    <form action = "NewUserRegistration.jsp" method="post">
        <div class = "form-group">
            <!-- AQL
            hopefully able to connect this to a different registration page that takes into consideration differences between users
            Currently it is getting redirected to the NewUserRegistration.jsp which is still all the necessary attributes to make up a person
            -->

            <label for = "type">
                We first would like to know if you are a solution provider or a project provider? <br>
                A solution provider is someone who would like to volunteer on the large variety of projects we have <br>
                A project provider is someone who would like to post a project for people to work on <br>
            </label>
            <select name="memberType" id="type">
                <option value= "Select">Select</option>
                <option value= "ProjectProvider">Project Provider</option>
                <option value = "SolutionProvider">Solution Provider</option>
                <option value = "both"> Both</option>
            </select>
        </div>
        <div class="form-group">
            <label for="first-name">First name: </label>
            <input type="text" name="fName" class="form-control" id="first-name" aria-describedby="name" placeholder="First name">
        </div>
        <div class="form-group">
            <label for="last-name">Last name: </label>
            <input type="text" class="form-control" id="last-name" aria-describedby="name" placeholder="Last name">
        </div>

        <div class="form-group">
            <label for="exampleInputEmail1">Email address: </label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password: </label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <!-- AQL added another password box for password verification -->
        <div class = "form-group">
            <label for = "passwordVerification"> Enter your password again: </label>
            <input type= "password" class = "form-control" id = "passwordVerification" placeholder= "Password Verification">
        </div>

        <!--
        AQL added a button that when it hits the button it redirects to the rest of the registration requirements
        Below was originally JB's button
        <button type="submit" class="btn btn-primary">Submit</button>
        -->

        <button id="submit" class="btn btn-primary" value = "next">Next</button>
    </form>
        <!--AQL I took this out because at this point it isn't necessary
        <div class="alert alert-primary" role="alert">
            Already have an account? Login <a href="login.jsp" class="alert-link">here</a>.
        </div>
        -->
</section>
</body>
</html>