<%@ page import="DummyProjects.ProjectDummyBean" %>
<%@ page import="java.util.List" %>
<%@ page import="techConnect.beans.UIProjectBean" %>
<%@ page import="techConnect.servlets.ProjectSelection" %>
<%@ page import="techConnect.ProjectDummy" %><%--
  Created by IntelliJ IDEA.
  User: wiish
  Date: 4/7/2019
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {

            $('#myCarousel').carousel({
                interval: 5000
            });

            //Handles the carousel thumbnails
            $('[id^=carousel-selector-]').click(function() {
                var id_selector = $(this).attr("id");
                try {
                    var id = /-(\d+)$/.exec(id_selector)[1];
                    console.log(id_selector, id);
                    jQuery('#myCarousel').carousel(parseInt(id));
                } catch (e) {
                    console.log('Regex failed!', e);
                }
            });
            // When the carousel slides, auto update the text
            $('#myCarousel').on('slid.bs.carousel', function (e) {
                var id = $('.item.active').data('slide-number');
                $('#carousel-text').html($('#slide-content-'+id).html());
            });
        });
    </script>

    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">





    <title>Project</title>

    <style>
        nav > .nav.nav-tabs{

            border: none;
            color:#fff;
            background:#272e38;
            border-radius:0;

        }
        nav > div a.nav-item.nav-link,
        nav > div a.nav-item.nav-link.active
        {
            border: none;
            padding: 18px 25px;
            color:#fff;
            background:#272e38;
            border-radius:0;
        }

        nav > div a.nav-item.nav-link.active:after
        {
            content: "";
            position: relative;
            bottom: -60px;
            left: -10%;
            border: 15px solid transparent;
            border-top-color: #e74c3c ;
        }
        .tab-content{
            background: #fdfdfd;
            line-height: 25px;
            border: 1px solid #ddd;
            border-top:5px solid #e74c3c;
            border-bottom:5px solid #e74c3c;
            padding:30px 25px;
            font-size: 15;
        }

        nav > div a.nav-item.nav-link:hover,
        nav > div a.nav-item.nav-link:focus
        {
            border: none;
            background: #e74c3c;
            color:#fff;
            border-radius:0;
            transition:background 0.20s linear;
        }
        .hide-bullets {
            list-style:none;
            margin-left: -15px;
            margin-top: 20px;
        }

        .thumbnail {
            padding: 0px;
        }

        .carousel-inner>.item>img, .carousel-inner>.item>a>img {
            width: 100%;
            height: 50%;

        }

        .carousel {
            margin-right: -15px;
        }
    </style>


</head>
<body>
<section id="nav-bar">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp"><img src="assets/icon.png"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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
                <li class = "nav-item">
                    <a class = "nav-link" href="managementPage.jsp">Help</a>
                </li>
            </ul>
        </div>
    </nav>
</section>
<%

    ProjectDummy projectDummy = new ProjectDummy();
    List<ProjectDummyBean> beanQueuen = projectDummy.getProjects();
    System.out.println(request.getParameter("projectID"));
    UIProjectBean bean = ProjectSelection.getProject(request.getParameter("projectID"));
    System.out.println(bean);
    System.out.println(bean.getNeed());
    if (bean==null || request.getParameter("projectID") == null) {
        response.sendRedirect("projects.jsp");
        return;
    }
%>
<h1><center><%=beanQueuen.get(2).getTitle()%></center></h1>
<div class="container">
    <div class="row">
        <div class="col-12 ">
            <iframe width="1110" height="600"
                    src="https://www.youtube.com/embed/<%="pRhjWdr-LAA"%>"
                    frameborder="0" allow="accelerometer;
                                        autoplay; encrypted-media; gyroscope; picture-in-picture"
                    allowfullscreen>
            </iframe>

            <nav>
                <div class="nav nav-tabs nav-fill" id="nav-tab" role="tablist">
                    <a class="nav-item nav-link " id="nav-need-tab" data-toggle="tab" href="#nav-need" role="tab" aria-controls="nav-need" aria-selected="true">Need</a>
                    <a class="nav-item nav-link " id="nav-who-tab" data-toggle="tab" href="#nav-who" role="tab" aria-controls="nav-who" aria-selected="false">Who</a>
                    <a class="nav-item nav-link " id="nav-language-tab" data-toggle="tab" href="#nav-language" role="tab" aria-controls="nav-language" aria-selected="false">Languages</a>
                    <a class="nav-item nav-link " id="nav-info-tab" data-toggle="tab" href="#nav-info" role="tab" aria-controls="nav-info" aria-selected="false">more Info</a>
                    <a class="nav-item nav-link " id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Contact</a>

                </div>
            </nav>
            <div class="tab-content py-3 px-3 px-sm-0" id="nav-tabContent">
                <div class="tab-pane active" id="nav-need" role="tabpanel" aria-labelledby="nav-need-tab">
                    <h1>What do you need?</h1>
                    <p><%=beanQueuen.get(2).getRequest()%></p>
                </div>

                <div class="tab-pane fade " id="nav-who" role="tabpanel" aria-labelledby="nav-who-tab">
                    <h1>Who is going to use this and how?</h1>
                    <p><%=beanQueuen.get(2).getWho()%></p>
                </div>

                <div class="tab-pane " id="nav-language" role="tabpanel" aria-labelledby="nav-language-tab">
                    <h1>What language(s) do they speak?</h1>
                    <p><%=beanQueuen.get(2).getLanguage()%></p>
                </div>

                <div class="tab-pane " id="nav-info" role="tabpanel" aria-labelledby="nav-info-tab">
                    <h1>Anything else volunteers should know?</h1>
                    <p><%=beanQueuen.get(2).getExtra()%></p>
                </div>

                <div class="tab-pane " id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                    <h1>Contact Information: </h1>
                    <p><%=beanQueuen.get(2).getContact()%></p>
                    <h1>Date Posted: </h1>
                    <p><%=beanQueuen.get(2).getDate()%></p>
                </div>
            </div>

        </div>
    </div>
</div>
<div class="container">
    <div id="main_area">
        <!-- Slider -->
        <div class="row">
            <div class="col-sm-8" id="slider-thumbs">
                <!-- Bottom switcher of slider -->
                <ul class="hide-bullets">
                    <li class="col-sm-3">
                        <a class="thumbnail" id="carousel-selector-0">
                            <img src=<%=beanQueuen.get(1).getPicture()%>>
                        </a>
                    </li>
                    <%
                        for(int i =0; i < 7; i++){

                    %>
                    <li class="col-sm-3">
                        <a class="thumbnail" id="carousel-selector-<%=i%>"><img src=<%= beanQueuen.get(i).getPicture()%>></a>
                    </li>
                    <%
                        }
                    %>
                </ul>
            </div>
            <div class="col-sm-4">
                <div class="col-xs-12" id="slider">
                    <!-- Top part of the slider -->
                    <div class="row">
                        <div class="col-sm-12" id="carousel-bounding-box">
                            <div class="carousel slide" id="myCarousel">
                                <!-- Carousel items -->
                                <div class="carousel-inner">

                                    <div class="item active" data-slide-number="0">
                                        <img src=<%=beanQueuen.get(0).getPicture()%>></div>
                                    <div class="item" data-slide-number="1">
                                        <img src=<%=beanQueuen.get(1).getPicture()%>></div>
                                    <div class="item" data-slide-number="2">
                                        <img src=<%=beanQueuen.get(2).getPicture()%>></div>
                                    <div class="item" data-slide-number="3">
                                        <img src=<%=beanQueuen.get(3).getPicture()%>></div>
                                    <div class="item" data-slide-number="4">
                                        <img src=<%=beanQueuen.get(4).getPicture()%>></div>
                                    <div class="item" data-slide-number="5">
                                        <img src=<%=beanQueuen.get(5).getPicture()%>></div>
                                    <div class="item" data-slide-number="6">
                                        <img src=<%=beanQueuen.get(6).getPicture()%>></div>
                                </div>
                                <!-- Carousel nav -->
                                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                    <span class="glyphicon glyphicon-chevron-left"></span>
                                </a>
                                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                    <span class="glyphicon glyphicon-chevron-right"></span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>


</body>
</html>
