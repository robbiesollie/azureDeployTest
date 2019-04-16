<%--
  Created by IntelliJ IDEA.
  User: wiish
  Date: 1/31/2019
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Profile</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
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
                    <a class="nav-link" href="index.jsp">Home <span class="sr-only"></span></a>
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
                <li class="nav-item">
                    <a class="nav-link" href="managementPage.jsp">Help</a>
                </li>
            </ul>
        </div>
    </nav>
</section>
<h1>Welcome to TechConnect!</h1>
<h2><b>Please enter the following information so we can create your profile!</b></h2>

<section id="login-forms">
    <form>
        <div class="form-group">
            <label for="occupation"> Occupation?</label> <br>
            <input type="text" class=form-control" id="occupation" placeholder="Adventurer">
        </div>
        <div class="form-group">
            <label for="work"> Where do you work? </label> <br>
            <input type="text" class=form-control" id="work" placeholder="Github">
        </div>

        <div class="form-group">
            <label for="phone">phone number? </label> <br>
            <input type="text" class=form-control" id="phone" placeholder="341-214-2342">
        </div>

        <div class="form-group">
            <label for="email"> Email? </label>
            <input type="text" class="form-control" id="email" placeholder="email.gmail.com">
        </div>

        <div class="form-group">
            <label for="github"> Github account? </label>
            <input type="text" class="form-control" id="github" placeholder="github.com">
        </div>
        <div class="form-group">
            <label for="linkedin"> LinkedIn? </label>
            <input type="text" class="form-control" id="linkedin" placeholder="linkedin.com">
        </div>
        <div class="form-group">
            <label for="need">Summary of yourself? </label>
            <textarea id="need" rows="6" cols="78" placeholder="Describe the project">Please type a short description of who you are.</textarea>
        </div>
        <div class="form-group">
            <label for="who">Research Interests? </label>
            <textarea id="who" rows="6" cols="78" placeholder="Research Interests">Please tell us about your research interest.</textarea>
        </div>
        <div class="form-group">
            <label for="language">Prior Experience? </label>
            <textarea id="language" rows="6" cols="78" placeholder="Experiences">Please tell us about your prior experience.</textarea>
        </div>
        <form action="Profile.jsp">
            <button id="add" class="btn btn-primary" value="next">Add another</button>
        </form>
        <div class="form-group">
            <label for="extra">Key Expertise? </label>
            <textarea id="extra" rows="6" cols="78" placeholder="Expertise">Please tell us your key expertise.</textarea>
        </div>
        <form action="Profile.jsp">
            <button id="addAnother" class="btn btn-primary" value="next">Add another</button>
        </form>
    </form>

    <form action="Profile.jsp">
        <button id="submit" class="btn btn-primary" value="next">Done!</button>
    </form>


</section>
</body>
</html>