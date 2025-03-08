<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"  href="css/addpage.css">

<title>add page</title>
</head>
<body>


<jsp:include page="navbar.jsp"></jsp:include> <br> <br> 


<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="" alt=""/>
                        <h2 class="font">Welcome</h2>
                        <p class="font1">Their are Different types Product</p>
                    </div>
                    <div class="col-md-9 register-right">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Add Product Details here</h3>
                                <form action="insert-product" method="post">
                                <div class="row register-form">
                                    <div class="col-md-6 offset-md-3">
                                        <div class="form-group">
                                            <input type="text" name="name" class="form-control" placeholder="Product Name *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="price" class="form-control" placeholder=" Product Price *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="qty" class="form-control" placeholder=" Product Quantity *" value="" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="category" class="form-control"  placeholder=" Product Category *" value="" />
                                        </div>
                                        <button type="submit" class="btn btn-success"> Save Record </button>
                                    </div>
                                </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
</body>
