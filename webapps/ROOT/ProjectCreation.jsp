<%--
  Created by IntelliJ IDEA.
  User: wiish
  Date: 2/18/2019
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Project Creation</title>
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
<section>
    <!-- https://www.tutorialspoint.com/jsp/jsp_file_uploading.htm -->
    <div class="form-group">
        <label for="file"> If you would like to upload an any media to be displayed, please upload
            here: </label> <br>
        Select media to upload: <br>
        <form action="UploadServlet" method="post" enctype="multipart/form-data">
            <input type="file" class="form-control" id="file" size="50"/><br>
            <input type="submit" value="Upload File"/>
        </form>
    </div>
    <form>
        <div class="form-group">
            <label for = "ProjectName"> Project Name: </label>
            <input type="text" class="form-control" id="ProjectName" placeholder="Enter Project Name">
        </div>
        <div class="form-group">
            <label for = "ProjectProvider"> Contact: </label>
            <input type="text" class="form-control" id="ProjectProvider" placeholder="Enter Primary Contact">
        </div>
        <div class="form-group">
            <label for="need">What do you need? </label>
            <textarea id = "need" rows="6" cols="78" placeholder="Describe the project">Please type a short description of what the need is.</textarea>
        </div>
        <div class="form-group">
            <label for="who">Who is going to use it and how? </label>
            <textarea id = "who" rows="6" cols="78" placeholder="Describe the project">Please answer here.</textarea>
        </div>
        <div class="form-group">
            <label for="language">What languages do they speak? </label>
            <textarea id = "language" rows="6" cols="78" placeholder="Describe the project">Please place languages here.</textarea>
        </div>
        <div class="form-group">
            <label for="extra">Anything else? </label>
            <textarea id = "extra" rows="6" cols="78" placeholder="Describe the project">Please place anything else you would like to note.</textarea>
        </div>
    </form>
    <form action="Profile.jsp">
        <button id="done" class="btn btn-primary" value="next">Done!</button>
    </form>
</section>
</body>
</html>

