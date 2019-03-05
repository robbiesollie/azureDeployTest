<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
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
                <a href="https://www.skype.com/en/"><img src="assets/PMLinks/Computers_Skype.jpg" alt="SkypeLogo.png"
                                                         width="1600" height="900"></a>
                <div class="carousel-caption">
                    <h5>Make calls around the world.</h5>
                </div>
            </div>
            <div class="carousel-item">
                <a href="https://trello.com/"><img src="assets/PMLinks/trello.png" alt="TrelloLogo.png" width="1600"
                                                   height="900"></a>
                <div class="carousel-caption">
                    <h5>Keep track of things to do!</h5>
                </div>
            </div>
            <div class="carousel-item">
                <a href="https://github.com/"><img src="assets/PMLinks/githubcat.jpg" alt="github.png" width="1600"
                                                   height="900"> </a>
                <div class="carousel-caption">
                    <h5>Connect your files everywhere.</h5>
                </div>
            </div>
            <div class="carousel-item">
                <a href="https://slack.com/"><img src="assets/PMLinks/slackRobot.png" alt="SlackLogo.png" width="1600"
                                                  height="900"> </a>
                <div class="carousel-caption">
                    <h5>Talk to people anywhere, anytime.</h5>
                </div>
            </div>
            <div class="carousel-item">
                <a href="https://drive.google.com/"><img src="assets/PMLinks/Google-Drive.jpg" alt="driveLogo.png"
                                                         width="1600" height="900"> </a>
                <div class="carousel-caption">
                    <h5></h5>
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

    <section id="projectLinks">
        <form>
            <div>
                <a href="https://www.skype.com/en/"><img src="assets/PMLinks/skype.gif" alt="SkypeLogo.gif" width="254"
                                                         height="254"></a>
                <a href="https://trello.com/"><img src="assets/PMLinks/taco-preloader.gif" alt="TrelloLogo.gif"
                                                   width="254" height="254"></a>
                <a href="https://github.com/"><img src="assets/PMLinks/trelloCat.gif" alt=Github.gif" width="254"
                                                   height="254"> </a>
                <a href="https://slack.com/"><img src="assets/PMLinks/slack.gif" alt="SlackLogo.gif" width="254"
                                                  height="254"> </a>
                <a href="https://www.google.com/drive/"><img src="assets/PMLinks/google.gif" alt="GoogleDriveLogo.gif"
                                                             width="500" height="500"></a>

            </div>
        </form>
    </section>

</div>
<!-------about----->
<section id="about">
    <div class="container">
        <div class="about-content">
            <h5>Project Management is essential to reach the targeted goal.  Click on any of the links above to find excellent resources.<h5>
        </div>
    </div>
</section>
</body>
</html>