<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

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
            </ul>
        </div>
    </nav>
</section>
<h1>Who is TechConnect</h1>
<!--AQL want to just add a verse in there-->
<h2>
    <center><q>Matthew 28: 19-20 states, 'Therefore go and make disciples of all nations, baptizing them in the name of
        the Father
        and of the Son and of the Holy Spirit, and teaching them to obey everything I have commanded you. And surely I
        am with you always, to the very end of the
        age.</q></center>
</h2>
<!--AQL Went through and edited the about paragraph.  Need to switch language a bit since we are not using missionary and volunteer terms anymore-->
<!--AQL Left what was there and my changes are in the comments above it-->
<!--AQL Might want to give an explanation of the site as well beyond just reason it is being made -->
<p>
    <!--
            Technology has been ingrained into society and becoming a vital resource. People around the world have the opportunity to have a technological
        presence wherever they desire. Due to the changes through technology, there are significant strategic opportunities to provide solutions to
        peoples problems. (What is gccs and GTS?) National partnerships can be formed to produce purposefully integrated technology based solutions and new
        relationships. GTS resources are limited and must remain focused on “global” priorities. Technological needs limited to a specific
        unit, team, cluster or language/target entity cannot typically be met by personnel or teams within GTS. This means that strategic technological needs
        of front line workers regularly go unmet unless they have a connection to “outside” resources that can meet their needs.  In cases where the needs are met,
        the solutions are rarely available to other users that might benefit and the long-term support of the solution may or may not be adequate for future use of
        those solutions.

            However, there are experts within the Body of Christ (i.e., attending partner churches, working with like-minded organizations, etc.) that are looking
        to maximize the use of their gifts and abilities for the sake of the Kingdom of God. This initiative will create opportunities to cast organizational
        vision with like-minded churches and invite them to be directly and significantly involved in reaching the nations with the Gospel. The establishment
        of a team focused on leveraging the expertise of volunteers within partner churches and like-minded organizations (i.e., “partners”) to meet the
        technological needs of front line workers would allow GTS to remain focused on global priorities while simultaneously working to meet the strategic
        technological needs of affinities, clusters, teams, individual units or specific people groups. The combined efforts of multiple teams can help meet
        many needs of the world.

    -->
    Technology is playing a greater and greater role in mission strategies worldwide. Technology is becoming
    increasingly
    common even among the impoverished. There are significant strategic opportunities to multiply the impact of
    personnel by providing them, gccs and national partners with reproducible technology solutions that purposefully
    integrate with front line strategy. Because GTS resources are limited and, as such, must remain focused on “global”
    priorities, technological needs limited to a specific unit, team, cluster or language/target entity cannot typically
    be met by personnel or teams within GTS. This means that strategic technological needs of front line workers
    regularly go unmet unless they have a connection to “outside” resources that can meet those needs or have the
    expertise to meet their own needs. In cases where the needs are met, the solutions are rarely available to other
    users that might benefit and the long-term support of the solution may or may not be adequate for future use of
    those solutions.
    However, there are experts within the Body of Christ (i.e., attending partner churches, working with like-minded
    organizations, etc.) that are looking to maximize the use of their gifts and abilities for the sake of the Kingdom
    of God. This initiative will create opportunities to cast organizational vision with like-minded churches and invite
    them to be directly and significantly involved in reaching the nations with the Gospel.
    The establishment of a team focused on leveraging the expertise of volunteers within partner churches and
    like-minded organizations (i.e., “partners”) to meet the technological needs of front line workers would allow GTS
    to remain focused on global priorities while simultaneously working to meet the strategic technological needs of
    affinities, clusters, teams, individual units or specific people groups.
</p>
<!--AQL
    So I wasn't sure how to do this but I added some project management links but we might want to put this as a separate link
    If we made it a separate link it might take more time but should be fine.  I put the images/gif in the asses folder in ROOT
-->
<h3>Need some help getting started?</h3>
<p>Here are some excellent resources to aid in any project management necessary for projects!</p>
<section id="projectLinks">
    <form>
        <div>
            <a href="https://www.skype.com/en/"><img src="assets/PMLinks/skype.gif" alt="SkypeLogo.gif" width="200" height="200"></a>
            <a href="https://trello.com/"><img src="assets/PMLinks/taco-preloader.gif" alt="TrelloLogo.gif" width="200" height="200"></a>
            <a href="https://slack.com/"><img src="assets/PMLinks/slack.gif" alt="SlackLogo.gif" width="200" height="200"> </a>
            <a href="https://www.google.com/drive/"><img src="assets/PMLinks/google.gif" alt="GoogleDriveLogo.gif" width="=300" height="300"></a>
            <a href="https://github.com/"><img src="assets/PMLinks/header-animation-short-loop.gif" alt=Github.gif" width="200" height="200"> </a>
        </div>
    </form>
</section>

</body>
</html>
