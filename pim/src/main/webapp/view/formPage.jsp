<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="bootstrap-4.0.0-dist/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-grid.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-grid.min.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-reboot.css"/>
    <link rel="stylesheet" href="bootstrap-4.0.0-dist/css/styles.css" type="text/css">
    <style type="text/css">
            .error {
                border: 1px solid red
                }
            .errorMessage {
            font-color:red;
            }
    </style>
</head>
<body>
<div id="wrapper" class="container-fluid">
    <div class="row">
        <div id="left-side" class="col-sm-2">
            <nav class="sidebar">
                <div id="logo">
                    <img  src="bootstrap-4.0.0-dist/img/RocketShip.png" alt="my logo"/>
                </div>
                <div class="intro">
                    <h2> Inventory Manager</h2>
                </div>
                <h1>Menu</h1>

                <ul class="list-group">
                    <li class="list-group-item">
                        <a href="/home">
                            Home
                            <i class="material-icons"><span>&#8594;</span></i>
                        </a>
                    </li>

                    <li class="list-group-item active">
                        <a href="/form">
                            Form
                            <i class="material-icons"><span>&#8594;</span></i>
                        </a>
                    </li>

                    <li class="list-group-item">
                        <a href="/product">
                            Product
                            <i class="material-icons"><span>&#8594;</span></i>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <div id="right-side" class="col-sm-9 top-bar">
            <div class="row justify-content-end">
                <div class="col-4">
                    <section class="search">
                        <button type="button" class="btn btn-outline-dark btn-sm">Login</button>
                        <img class="right login" src="bootstrap-4.0.0-dist/img/loginpng.png" />
                        <form action="">
                            <div class="p-1 bg-light rounded rounded-pill shadow-sm mb-4">
                                <div class="input-group">
                                    <input type="search" placeholder="What're you searching for?" aria-describedby="button-addon1" class="form-control border-0 bg-light">
                                    <div class="input-group-append">
                                        <button id="button-addon1" type="submit" class="btn btn-link text-primary"><i class="fa fa-search"></i></button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>
            </div>
            <div class="row breathe">
                <div class="col-sm-9">
                    <section class="search">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Input Form</h5>
                                <p class="card-text">Welcome to the item information input form. Please fill out the form.</p>
                                <form:form action="/add" modelAttribute="drank">
                                    <div class="form-group">
                                        <label for="ID">ID</label>
                                        <form:input type="ID" class="form-control" placeholder="ID" path="id" cssErrorClass="error"/>
                                        <form:errors path="id" cssClass="errorMessage"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="Name">Name</label>
                                        <form:input type="Name" class="form-control" placeholder="Enter item name" path="name" cssErrorClass="error"/>
                                        <form:errors path="name" cssClass="errorMessage"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="SKU">Price</label>
                                        <form:input type="Price" class="form-control" placeholder="Price" path="price" cssErrorClass="error"/>
                                        <form:errors path="price" cssClass="errorMessage"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="Brand">Manufacturer/Brand</label>
                                        <form:input type="Name" class="form-control" placeholder="Brand" path="brand" cssErrorClass="error"/>
                                        <form:errors path="brand" cssClass="errorMessage"/>
                                    </div>

                                    <div class="form-check">
                                        <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                        <label class="form-check-label" for="exampleCheck1">Check if no longer in active production</label>
                                    </div>
                                    <button type="submit" class="btn btn-primary" value="Add drank">Submit</button>
                                </form:form>
                            </div>
                        </div>
                </div>
                </section>
                <div class="col">
                    <div class="card-group">
                        <div class="card">
                            <img class="card-img-top" src="bootstrap-4.0.0-dist/img/addphoto.png" alt="add image">
                            <div class="card-body">
                                <h5 class="card-title">Add Image</h5>
                                <p class="card-text">Click to browse or drag image to upload photo of product.</p>
                                <button type="submit" class="btn btn-primary">Upload</button>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <script src="bootstrap-4.0.0-dist/js/bootstrap.js" ></script>
    <script src="bootstrap-4.0.0-dist/js/bootstrap.bundle.js" ></script>
    <script src="bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</body>
</html>