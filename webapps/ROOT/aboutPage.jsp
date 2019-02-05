<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
    <title>Bootstrap Theme Simply Me</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <style>
        body {
            font: 20px Montserrat, sans-serif;
            line-height: 1.8;
            color: #f5f6f7;
        }
        p {font-size: 16px;}
        .margin {margin-bottom: 45px;}
        .bg-1 {
            background-color: #1abc9c; /* Green */
            color: #ffffff;
        }
        .bg-2 {
            background-color: #474e5d; /* Dark Blue */
            color: #ffffff;
        }
        .bg-3 {
            background-color: #ffffff; /* White */
            color: #555555;
        }
        .bg-4 {
            background-color: #2f2f2f; /* Black Gray */
            color: #fff;
        }
        .container-fluid {
            padding-top: 70px;
            padding-bottom: 70px;
        }
        .navbar {
            padding-top: 15px;
            padding-bottom: 15px;
            border: 0;
            border-radius: 0;
            margin-bottom: 0;
            font-size: 12px;
            letter-spacing: 5px;
        }
        .navbar-nav  li a:hover {
            color: #1abc9c !important;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Me</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">WHO</a></li>
                <li><a href="#">WHAT</a></li>
                <li><a href="#">WHERE</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- First Container -->
<div class="container-fluid bg-1 text-center">
    <h3 class="margin">What is TechConnect?</h3>
    <img src="techConnectLogo.JPG" class="img-responsive img-circle margin" style="display:inline" alt="logo" width="350" height="350">
    <h3>
        TechConnect is an application designed to link technological needs of front line mission teams and organizations with
        volunteers from other organizations such as churches, like-minded universities, and other organizations.  People with
        the resources and desire to help meet the needs of others can now access problems from around the world.  The website
        creates easy access to projects in order to meet the variety of technical needs regularly unmet due to varying circumstances
        Connecting front line mission teams to technically related individuals allow both users to utilize skills and offer services
        with a common goal in mind.
    </h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center">
    <h3 class="margin">Why did we do this?</h3>
    <p>><q>Matthew 28: 19-20</br>"Therefore go and make disciples of all nations, baptizing them in the name of
        the Father and of the Son and of the Holy Spirit, and teaching them to obey everything I have commanded you. And surely I
        am with you always, to the very end of the age."</q> </p>
    <a href="#" class="btn btn-default btn-lg">
        <span class="glyphicon glyphicon-search"></span> Search
    </a>
</div>

<!-- Third Container (Grid) -->
<div class="container-fluid bg-3 text-center">
    <h3 class="margin">Where did the idea come from?</h3><br>
    <p>
        Technology has been ingrained into society and becoming a vital resource. People around the world have the
        opportunity to have a technological  presence wherever they desire. Due to the changes through technology,
        there are significant strategic opportunities to provide solutions to peoples problems.National partnerships
        can be formed to produce purposefully integrated technology based solutions and new relationships. GTS
        resources are limited and must remain focused on “global” priorities. Technological needs limited to a specific
        unit, team, cluster or language/target entity cannot typically be met by personnel or teams within GTS. This means
        that strategic technological needs of front line workers regularly go unmet unless they have a connection to
        “outside” resources that can meet their needs. In cases where the needs are met, the solutions are rarely available
        to other users that might benefit and the long-term support of the solution may or may not be adequate for future
        use of those solutions.

        However, there are experts within the Body of Christ (i.e., attending partner churches, working with like-minded
        organizations, etc.) that are looking to maximize the use of their gifts and abilities for the sake of the Kingdom
        of God. This initiative will create opportunities to cast organizational vision with like-minded churches and invite
        them to be directly and significantly involved in reaching the nations with the Gospel. The establishment of a team
        focused on leveraging the expertise of volunteers within partner churches and like-minded organizations
        (i.e., “partners”) to meet the technological needs of front line workers would allow GTS to remain focused on global
        priorities while simultaneously working to meet the strategic technological needs of affinities, clusters, teams,
        individual units or specific people groups. The combined efforts of multiple teams can help meet many needs of the
        world.
    </p>
</div>

<div class="container-fluid bg-2 text-center">
    <h3 class="margin">Who are we?</h3>
    <p>>
        A professor from California Baptist University presented TechConnect to a capstone team who were eager to work on the
        project.  The group of
    </p>
    <a href="#" class="btn btn-default btn-lg">
        <span class="glyphicon glyphicon-search"></span> Search
    </a>
</div>

<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
    <p>Bootstrap Theme Made By <a href="https://www.w3schools.com">www.w3schools.com</a></p>
</footer>

</body>
</html>
