<%@ page import="techConnect.ProjectDummy" %>
<%@ page import="techConnect.ProfileDummy" %>
<%@ page import="DummyProjects.ProjectDummyBean" %>
<%@ page import="java.util.List" %>
<%@ page import="DummyProjects.ProfileDummyBean" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Projects</title>
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
            List<ProjectDummyBean> projectBean = projectDummy.getProjects();
            ProfileDummy profileDummy = new ProfileDummy();
            List<ProfileDummyBean> profileBean = profileDummy.getProfiles();
        %>
        <div class="row">
            <div class="col-md-12">
                <div class="row mb-2">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-3">
                                        <img src=<%=profileBean.get(4).getPicture().get(3)%> width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="ProjectDisplay.jsp"><h2><%=projectBean.get(0).getTitle()%> </h2></a>
                                                <p><%=projectBean.get(0).getNeed()%></p>

                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectBean.get(0).getContact()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=profileBean.get(3).getName()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%=projectBean.get(0).getDate() %>
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
                                        <img src=<%=profileBean.get(4).getPicture().get(2)%> width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="ProjectDisplay.jsp"><h2><%=projectBean.get(1).getTitle()%> </h2></a>
                                                <p><%=projectBean.get(1).getNeed()%></p>

                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectBean.get(1).getContact()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-eye"></i>
                                                            <%=profileBean.get(2).getName()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%=projectBean.get(1).getDate()%>
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
                                        <img src=<%=profileBean.get(4).getPicture().get(1)%> width=100%>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="card-body">
                                            <div class="news-content">
                                                <a href="ProjectDisplay.jsp"><h2><%=projectBean.get(2).getTitle()%></h2></a>
                                                <p><%=projectBean.get(2).getNeed()%></p>
                                            </div>
                                            <div class="news-footer">
                                                <div class="news-author">
                                                    <ul class="list-inline list-unstyled">
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-user"></i>
                                                            <%=projectBean.get(2).getContact()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-eye"></i>
                                                            <%=profileBean.get(6).getName()%>
                                                        </li>
                                                        <li class="list-inline-item text-secondary">
                                                            <i class="fa fa-calendar"></i>
                                                            <%=projectBean.get(2).getDate()%>
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
                            <li class="page-item"><a class="page-link" href="projects.jsp">Previous</a></li>
                            <li class="page-item"><a class="page-link" href="projects.jsp">1</a></li>
                            <li class="page-item"><a class="page-link" href="projects.jsp">2</a></li>
                            <li class="page-item"><a class="page-link" href="projects.jsp">3</a></li>
                            <li class="page-item"><a class="page-link" href="projects.jsp">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>