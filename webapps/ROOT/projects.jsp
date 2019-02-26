<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!-- https://bootsnipp.com/snippets/mMBqZ -->
<head>
    <title>Register</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
    <style>
        .social-card-header{
            position: relative;
            display: -ms-flexbox;
            display: flex;
            -ms-flex-align: center;
            align-items: center;
            -ms-flex-pack: center;
            justify-content: center;
            height: 96px;
        }
        .social-card-header i {
            font-size: 32px;
            color:#FFF;
        }
        .bg-facebook {
            background-color:#3b5998;
        }
        .text-facebook {
            color:#3b5998;
        }
        .bg-google-plus{
            background-color:#dd4b39;
        }
        .text-google-plus {
            color:#dd4b39;
        }
        .bg-twitter {
            background-color:#1da1f2;
        }
        .text-twitter {
            color:#1da1f2;
        }
        .bg-pinterest {
            background-color:#bd081c;
        }
        .text-pinterest {
            color:#bd081c;
        }
        .share:hover {
            text-decoration: none;
            opacity: 0.8;
        }
    </style>

</head>
<body>
<!----nav bar---->
<section id="nav-bar">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.jsp"><img src="assets/icon.png"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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

<div class="container">
    <h3 class="pb-3 mb-4 font-italic border-bottom">
        Card Styles
    </h3>
    <div class="row">
        <div class="col-md-6">
            <div class="card flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-primary">World</strong>
                    <h6 class="mb-0">
                        <a class="text-dark" href="#">40 Percent of People Can’t Afford Basics</a>
                    </h6>
                    <div class="mb-1 text-muted small">Nov 12</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-primary btn-sm" role="button" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/arch" style="width: 200px; height: 250px;">
            </div>
        </div>
        <div class="col-md-6">
            <div class="card flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-success">Health</strong>
                    <h6 class="mb-0">
                        <a class="text-dark" href="#">Food for Thought: Diet and Brain Health</a>
                    </h6>
                    <div class="mb-1 text-muted small">Nov 11</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-success btn-sm" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/nature" style="width: 200px; height: 250px;">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="card border-primary flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-primary">World</strong>
                    <h6 class="mb-0">
                        <a class="text-dark" href="#">40 Percent of People Can’t Afford Basics</a>
                    </h6>
                    <div class="mb-1 text-muted small">Nov 12</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-primary btn-sm" role="button" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/arch" style="width: 200px; height: 250px;">
            </div>
        </div>
        <div class="col-md-6">
            <div class="card border-success flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-success">Health</strong>
                    <h6 class="mb-0">
                        <a class="text-dark" href="#">Food for Thought: Diet and Brain Health</a>
                    </h6>
                    <div class="mb-1 text-muted small">Nov 11</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-success btn-sm" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/nature" style="width: 200px; height: 250px;">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="card text-white bg-primary flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-white">World</strong>
                    <h6 class="mb-0">
                        <a class="text-white" href="#">40 Percent of People Can’t Afford Basics</a>
                    </h6>
                    <div class="mb-1 text-white-50 small">Nov 12</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-light btn-sm" role="button" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/arch" style="width: 200px; height: 250px;">
            </div>
        </div>
        <div class="col-md-6">
            <div class="card text-white bg-success flex-md-row mb-4 shadow-sm h-md-250">
                <div class="card-body d-flex flex-column align-items-start">
                    <strong class="d-inline-block mb-2 text-white">Health</strong>
                    <h6 class="mb-0">
                        <a class="text-white" href="#">Food for Thought: Diet and Brain Health</a>
                    </h6>
                    <div class="mb-1 text-white-50 small">Nov 11</div>
                    <p class="card-text mb-auto">This is a wider card with supporting text below as a natural lead-in to additional content.</p>
                    <a class="btn btn-outline-light btn-sm" href="http://www.jquery2dotnet.com/">Continue reading</a>
                </div>
                <img class="card-img-right flex-auto d-none d-lg-block" alt="Thumbnail [200x250]" src="//placeimg.com/250/250/nature" style="width: 200px; height: 250px;">
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <div class="card mb-4">
                <img class="card-img-top" src="//placeimg.com/290/180/any" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="http://www.jquery2dotnet.com/" class="btn btn-outline-dark btn-sm">Go somewhere</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card mb-4 border-dark">
                <img class="card-img-top" src="//placeimg.com/290/180/any" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="http://www.jquery2dotnet.com/" class="btn btn-dark btn-sm">Go somewhere</a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card mb-4 text-white bg-dark">
                <img class="card-img-top" src="//placeimg.com/290/180/any" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="http://www.jquery2dotnet.com/" class="btn btn-outline-light btn-sm">Go somewhere</a>
                </div>
            </div>
        </div>
    </div>
    <h3 class="mt-3 pb-3 mb-4 font-italic border-bottom">
        Image overlays
    </h3>
    <div class="row">
        <div class="col-md-8">
            <div class="card mb-4 bg-dark text-white">
                <img class="card-img" src="//placeimg.com/780/270/any" alt="Card image">
                <div class="card-img-overlay">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    <p class="card-text">Last updated 3 mins ago</p>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card mb-4 bg-dark text-white">
                <img class="card-img" src="//placeimg.com/250/180/any" alt="Card image">
                <div class="card-img-overlay">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    <p class="card-text">Last updated 3 mins ago</p>
                </div>
            </div>
        </div>
    </div>
    <h3 class="mt-3 pb-3 mb-4 font-italic border-bottom">
        More Cards
    </h3>
    <div class="row">
        <div class="col-md-4">
            <div class="card">
                <img class="card-img-top" src="//placeimg.com/280/180/tech" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title border-bottom pb-3">Card title <a href="#" class="float-right d-inline-flex share"><i class="fas fa-share-alt text-primary"></i></a></h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="float-right">Read more <i class="fas fa-angle-double-right"></i></a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card">
                <img class="card-img-top" src="//placeimg.com/280/180/tech" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title border-bottom pb-3">Card title <a href="#" class="float-right btn btn-sm btn-info d-inline-flex share"><i class="fas fa-share-alt"></i></a></h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-sm btn-info float-right">Read more <i class="fas fa-angle-double-right"></i></a>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card bg-light">
                <img class="card-img-top" src="//placeimg.com/280/180/tech" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title border-bottom pb-3">Card title <a href="#" class="float-right btn btn-sm btn-info d-inline-flex share"><i class="fas fa-share-alt"></i></a></h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-sm btn-info float-right">Read more <i class="fas fa-angle-double-right"></i></a>
                </div>
            </div>
        </div>
    </div>
    <hr>
    <a href="http://www.jquery2dotnet.com/" class="mx-auto pb-3 text-center">
        <img alt="jQuery 2 DotNet" class="rounded mx-auto d-block" height="52px;" src="http://1.bp.blogspot.com/-z27K-NYYSi4/Vsg9Mdl1A_I/AAAAAAAAEbo/SbDbMENIiVQ/s1600-r/jQuery2DotNet.png" style="display: block" width="208px; ">
    </a>
</div>
</body>
</html>
