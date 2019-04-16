<%@ page import="java.util.Date" %>
<%@ page import="techConnect.ProjectDummy" %>
<%@ page import="DummyProjects.ProjectDummyBean" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!-- https://bootsnipp.com/snippets/mMBqZ -->
<head>
    <title>Projects</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
          integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
    <style>
        .social-card-header i {
            font-size: 32px;
            color: #FFF;
        }

        body, html {
            height: 100%;
            width: 100%;
            margin: 0;
            padding: 0;
        }

        .searchbar {
            margin-bottom: auto;
            margin-top: auto;
            height: 60px;
            background-color: #353b48;
            border-radius: 30px;
            padding: 10px;
        }

        .search_input {
            color: white;
            border: 0;
            outline: 0;
            background: none;
            width: 0;
            caret-color: transparent;
            line-height: 40px;
            transition: width 0.4s linear;
        }

        .searchbar:hover > .search_input {
            padding: 0 10px;
            width: 450px;
            caret-color: red;
            transition: width 0.4s linear;
        }

        .searchbar:hover > .search_icon {
            background: white;
            color: #e74c3c;
        }

        .search_icon {
            height: 40px;
            width: 40px;
            float: right;
            display: flex;
            justify-content: center;
            align-items: center;
            border-radius: 50%;
            color: white;
        }

    </style>

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

<div class="container">
    <h1 class="pb-3 mb-4 font-italic border-bottom">
        Projects
    </h1>
    <div class="container">
        <div class="container h-40">
            <div class="d-flex h-20">
                <form action="projects.jsp">
                    <div class="searchbar">
                        <form action="/projects.jsp" target="_blank">
                            <input class="search_input" type="text" name="search" placeholder="Search...">
                            <a href="#" class="search_icon"><i class="fas fa-search"></i></a>
                        </form>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <div class="row">
        <%
            String search = request.getParameter("search");
            ProjectDummy projectDummy = new ProjectDummy();
            List<ProjectDummyBean> beanQueuen = projectDummy.getProjects();
            for (int i = 0; i < beanQueuen.size()-1; i++) {
        %>
        <div class="col-md-6">
            <div class="card flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-primary"><%= beanQueuen.get(i).getTitle()%>
                    </strong>
                    <h6 class="mb-0">
                        <a class="text-dark" href="ProjectDisplay.jsp"><%= beanQueuen.get(i).getNeed()%>
                        </a>
                    </h6>
                    <div class="mb-1 text-muted small"><%=beanQueuen.get(i).getDate()%>
                    </div>
                    <p class="card-text mb-auto"><%=beanQueuen.get(i).getContact()%>
                    </p>
                    <a class="btn btn-outline-primary btn-sm" role="button" href="ProjectDisplay.jsp">Continue
                        reading</a>
                </div>
                <figure></figure>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x200]" style="height: 200px; width: 200px"
                     src= <%=beanQueuen.get(i).getPicture()%>>
                </figure>
            </div>
        </div>
        <%
            }
        %>
    </div>
    <div class="row">
        <%
            for (int i = 0; i < beanQueuen.size()-1; i++) {
        %>
        <div class="col-md-4">
            <div class="card mb-4">
                <img class="card-img-top" alt="Card image cap" style="height: 200px; width: 200px" src=<%=beanQueuen.get(i).getPicture()%> >
                <div class="card-body">
                    <h5 class="card-title"><%= beanQueuen.get(i).getTitle()%>
                    </h5>
                    <p class="card-text"><%=beanQueuen.get(i).getDate() + "\n" + beanQueuen.get(i).getNeed()%>
                    </p>
                    <a href="ProjectDisplay.jsp" class="btn btn-outline-dark btn-sm">Go somewhere</a>
                </div>
            </div>
        </div>
        <%
            }
        %>

    </div>
    <h3 class="mt-3 pb-3 mb-4 font-italic border-bottom">
        Image overlays
    </h3>
    <div class="row">
        <%
            for (int i = 0; i < beanQueuen.size()-1; i++) {
        %>
        <div class="col-md-12">
            <div class="card mb-4 bg-dark text-white">
                <img class="card-img" alt="Card image"  style="height: 200px; width: 200px" src=<%=beanQueuen.get(i).getPicture()%> >
                <div class="card-img-overlay">
                    <h5 class="card-title"><%= beanQueuen.get(i).getTitle()%></h5>
                    <p class="card-text"><%=beanQueuen.get(i).getNeed()%></p>
                    <p class="card-text"><%=beanQueuen.get(i).getDate()%></p>
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>

    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item">
                <a class="page-link" href="projects.jsp" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                    <span class="sr-only">Previous</span>
                </a>
            </li>
            <%
                int count = 1;
                for(int i = 0; i < 4; i++){
            %>
            <li class="page-item"><a class="page-link" href="projects.jsp"><%=count++%></a></li>
            <%}%>
            <li class="page-item">
                <a class="page-link" href="projects.jsp" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                    <span class="sr-only">Next</span>
                </a>
            </li>
        </ul>
    </nav>
</div>
</body>
</html>
