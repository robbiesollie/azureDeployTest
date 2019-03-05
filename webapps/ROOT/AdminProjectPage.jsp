<%@ page import="java.util.Date" %>
<%@ page import="techConnect.ProjectDummy" %>
<%@ page import="techConnect.ProfileDummy" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tech Connect</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet"
          integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">

</head>
<body>
<!----nav bar---->
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
                <li class="nav-item">
                    <a class="nav-link" href="managementPage.jsp">Help</a>
                </li>
            </ul>
        </div>
    </nav>
</section>
<section>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h2>List of Private Projects</h2>
            </div>
        </div>
        <%
            ProjectDummy projectDummy = new ProjectDummy();
            ProfileDummy profileDummy = new ProfileDummy();
        %>
        <div class="row">
            <div class="col-md-12">
                <div class="row mb-2">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-3">
                                        <img src=<%=profileDummy.setProfilePic().get(4)%> width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="#"><h2><%=projectDummy.setProjectTitle().get(0)%> </h2></a>
                                                <p><%=projectDummy.setNeed()%></p>

                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectDummy.setContact().get(0)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=profileDummy.setName().get(3)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%= projectDummy.setProjectDate().get(0) %>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row mb-2">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-3">
                                        <img src=<%=profileDummy.setProfilePic().get(2)%>width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="#"><h2><%=projectDummy.setProjectTitle().get(1)%> </h2></a>
                                                <p><%=projectDummy.setNeed().get(1)%></p>

                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectDummy.setContact().get(1)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-eye"></i>
                                                            <%=profileDummy.setName().get(2)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%=projectDummy.setProjectDate().get(1)%>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row mb-2">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-3">
                                        <img src=<%=profileDummy.setProfilePic().get(6)%>width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="#"><h2><%=projectDummy.setProjectTitle().get(2)%></h2></a>
                                                <p><%=projectDummy.setNeed().get(2)%></p>

                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectDummy.setContact().get(2)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-eye"></i>
                                                            <%=profileDummy.setName().get(6)%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%=projectDummy.setProjectDate().get(2)%>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row mb-2">
                    <div class="col-md-12">
                        <ul class="pagination">
                            <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>