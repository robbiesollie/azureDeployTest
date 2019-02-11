<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page import="techConnect.Login"%>
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
                <li class = "nav-item">
                    <a class = "nav-link" href="managementPage.jsp">Help</a>
                </li>
            </ul>
        </div>
    </nav>
</section>
<!-------------Slider------------->
<div id="slider">
    <div id="headerSlider" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#headerSlider" data-slide-to="0" class="active"></li>
            <li data-target="#headerSlider" data-slide-to="1"></li>
            <li data-target="#headerSlider" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="assets/joshua-rawson-harris-668614-unsplash.jpg" class="d-block img-fluid" alt="...">
                <div class="carousel-caption">
                    <h5>Connecting the world.</h5>
                </div>
            </div>
            <div class="carousel-item">
                <img src="assets/mi-pham-763590-unsplash.jpg" class="d-block img-fluid" alt="...">
                <div class="carousel-caption">
                    <h5>Help contribute.</h5>
                </div>
            </div>
            <div class="carousel-item">
                <img src="assets/dlanor-s-703975-unsplash.jpg" class="d-block img-fluid" alt="...">
                <div class="carousel-caption">
                    <h5>Utilize your skills.</h5>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#headerSlider" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#headerSlider" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>

</div>
<!-------about----->
<section id="about">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h2>About Tech Connect</h2>
                <div class="about-content">
                    The name is derived from the overarching goal to be the people that stand in the gap and connect
                    front line strategic technological needs with willing and able solution providers.
                </div>
                <form action = "about.jsp">
                    <button id="ReadMore" class="btn btn-primary" value = "button">Read More</button>
                </form>
               <!-- <button type="button" class="btn btn-primary">Read More</button>-->
            </div>
            <div class="col-md-6 skills-bar">
                <p>Project 1</p>
                <div class="progress">
                    <div class="progress-bar" style="width:80%;">80%</div>
                </div>
                <p>Project 2</p>
                <div class="progress">
                    <div class="progress-bar" style="width:70%;">70%</div>
                </div>
                <p>Project 3</p>
                <div class="progress">
                    <div class="progress-bar" style="width:60%;">60%</div>
                </div>
            </div>

        </div>
    </div>
</section>
</body>
</html>