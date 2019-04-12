<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<head>
    <title>About</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="style.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
            integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
            crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"
            integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
            crossorigin="anonymous"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style>
        .home-main{
            background: #ffffff;
            color:#fff;
            padding: 13%;
            text-align: center;
        }
        .blinker{
            animation: blinker 1.5s linear infinite;
        }
        @keyframes blinker {
            50% {
                opacity: 0;
            }
        }
        .home-main button{
            background: #fff;
            color: #5812c5;
            border-radius: 0;
            font-weight: 700;
            width: 16%;
            height: 50px;
            top: 4%;
            margin-top: 3%;
        }
        .home-main button:hover{
            transition: 1s ease;
            color:#5812c5;
            width: 19%;
        }
        .content1-left{
            padding:9%;
        }
        .content1-right{
            padding:9%;
            background:#e4e4e4;
        }
        .home-content2{
            background: #adb5bd;
            padding: 1.4%;
            text-align: center;
        }
        .home-content2 p{
            font-size: 18px;
            line-height: 50px;
        }
        .home-content2 p span{
            font-weight: 500;
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

    <div class="container-fluid">
        <div class="container-fluid home-main">
            <h2><center><img src="assets/techConnectLogo.JPG" class="img" alt="logo" width="1200" height="600"></center><span
                    class="blinker">.</span></h2>
        </div>
        <div class="container-fluid home-content1">
            <div class="row">
                <div class="col-md-6 content1-left">
                    <h3>Why TechConnect <span class="blinker">?</span></h3>
                    <h5>This application is designed to connect missionaries experiencing problems in the field to volunteers
                        who are able to help them. Problems displayed on our app should have a focus on project solutions
                        solved through technical experience. Volunteers consist of any individuals who have a desire to serve
                        the mission and the cause of Christ. Tech Connect provides a gateway of communication with missionaries
                        and volunteers, providing a medium in which communication is unambiguous. Additional needs include motivating
                        volunteers through an understanding of the project’s background, a safe and user friendly environment,
                        and connecting people with projects suitable to their skills and talents. God has given us skills to utilize for
                        his call and this application is designed to provide another platform to serve.</h5>

                    <!-- <div class="content1-left"></div> -->
                </div>
                <div class="col-md-6 content1-right">
                    <h3>Matthew 28: 19-20</h3>
                    <h5>Therefore go and make disciples of all nations, baptizing them in the name of the Father and of
                        the Son and of the Holy Spirit, and teaching them to obey everything I have commanded you. And
                        surely I am with you always, to the very end of the age.</h5>
                </div>
            </div>
        </div>
        <div class="container-fluid home-content2">
            <h3>Need some help getting started?</h3>
            <p>click <a href="managementPage.jsp"> HERE </a> for some excellent resources to aid in any project management necessary
                for projects!</p>
        </div>
    </div>
</section>
</body>
</html>
