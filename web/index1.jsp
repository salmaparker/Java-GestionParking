<%-- 
    Document   : index1
    Created on : 20 janv. 2022, 14:53:08
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <meta name="description" content=""/>
        <meta name="author" content=""/>
        <title>Parking</title>
        <%@ include file="/include/css.jsp" %> 
        <script src="scripts/jquery-3.3.1.min.js"></script>
    </head>
    <body class="bg-theme bg-theme1">

        <!-- Start wrapper-->
        <div id="wrapper">

            <%@ include file="/include/sidebar.jsp" %> 
            <!--Start topbar header-->
            <%@ include file="/include/header.jsp" %> 
            <!--End topbar header-->

            <div class="clearfix"></div>

            <div class="content-wrapper">
                <div class="container-fluid">

                    <!--Start Dashboard Content-->

                    <div class="card mt-3">
                        <div class="card-content">

                        </div>
                    </div>  

                    <div class="row">
                        <div class="col-12 col-lg-8 col-xl-8">
                            <div class="card">
                                <div class="card-header">
                                    <div class="card-action">
                                        <div class="dropdown">
                                            <a href="javascript:void();" class="dropdown-toggle dropdown-toggle-nocaret" data-toggle="dropdown">
                                                <i class="icon-options"></i>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right">
                                                <a class="dropdown-item" href="javascript:void();">Action</a>
                                                <a class="dropdown-item" href="javascript:void();">Another action</a>
                                                <a class="dropdown-item" href="javascript:void();">Something else here</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="javascript:void();">Separated link</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <ul class="list-inline">
                                        <li class="list-inline-item"><i class="fa fa-circle mr-2 text-white"></i>Nombre des stationement</li>
                                       
                                    </ul>
                                    <div class="chart-container-1">
                                        <canvas id="chart1"></canvas>
                                    </div>
                                </div>



                            </div>
                        </div>

                        <div class="col-12 col-lg-4 col-xl-4">

                        </div>
                    </div><!--End Row-->

                    <div class="row">
                        <div class="col-12 col-lg-12">

                        </div>
                    </div><!--End Row-->

                    <!--End Dashboard Content-->

                    <!--start overlay-->
                    <div class="overlay toggle-menu"></div>
                    <!--end overlay-->

                </div>
                <!-- End container-fluid-->

            </div><!--End content-wrapper-->
            <!--Start Back To Top Button-->
            <a href="javaScript:void();" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
            <!--End Back To Top Button-->

            <!--Start footer-->
            <%@ include file="/include/footer.jsp" %>
            <!--End footer-->

            <!--start color switcher-->
            <div class="right-sidebar">
                <div class="switcher-icon">
                    <i class="zmdi zmdi-settings zmdi-hc-spin"></i>
                </div>
                <div class="right-sidebar-content">

                    <p class="mb-0">Gaussion Texture</p>
                    <hr>

                    <ul class="switcher">
                        <li id="theme1"></li>
                        <li id="theme2"></li>
                        <li id="theme3"></li>
                        <li id="theme4"></li>
                        <li id="theme5"></li>
                        <li id="theme6"></li>
                    </ul>

                    <p class="mb-0">Gradient Background</p>
                    <hr>

                    <ul class="switcher">
                        <li id="theme7"></li>
                        <li id="theme8"></li>
                        <li id="theme9"></li>
                        <li id="theme10"></li>
                        <li id="theme11"></li>
                        <li id="theme12"></li>
                        <li id="theme13"></li>
                        <li id="theme14"></li>
                        <li id="theme15"></li>
                    </ul>

                </div>
            </div>
            <!--end color switcher-->

        </div><!--End wrapper-->

        <!-- Bootstrap core JavaScript-->
        <%@ include file="/include/js.jsp" %> 


    </body>
</html>
