<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="bootstrap-4.0.0-dist/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-grid.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-grid.min.css" />
    <link rel="stylesheet" type="text/css"  href="bootstrap-4.0.0-dist/css/bootstrap-reboot.css"/>
    <link rel="stylesheet" href="bootstrap-4.0.0-dist/css/styles.css" type="text/css">
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

                    <li class="list-group-item">
                        <a href="/form">
                            Form
                            <i class="material-icons"><span>&#8594;</span></i>
                        </a>
                    </li>

                    <li class="list-group-item active">
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
                <div class="col-sm-8">
                    <div class="card-group">
                        <div class="card">
                            <img class="card-img-top" src="bootstrap-4.0.0-dist/img/product.jpg" alt="add image">
                            <div class="card-body">
                                <h5 class="card-title">${drank.name}</h5>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 breathe">
                    <table class="table table-bordered table-dark">
                        <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Name</th>
                            <th scope="col">Price</th>
                            <th scope="col">Brand</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">${drank.id}</th>
                            <td>${drank.name}</td>
                            <td>${drank.price}</td>
                            <td>${drank.brand}</td>
                        </tr>
                        </tbody>
                    </table>
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