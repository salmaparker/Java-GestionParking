<%-- 
    Document   : section
    Created on : 20 janv. 2022, 14:44:19
    Author     : dell
--%>

<%@page import="service.SectionService"%>
<%@page import="entities.Section"%>
<%  SectionService ss = new SectionService(); %>
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
        <title>Section</title>
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



                    <!--End Row-->

                    <div class="row">
                        <div class="col-12 col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="card-title">Section</div>
                                    <hr>

                                    <div class="form-group">
                                        <label for="input-1">Code</label>
                                        <input id="code" type="text" class="form-control"  placeholder="code">
                                    </div>
                                    <div class="form-group">
                                        <button id="add" type="submit" class="btn btn-light px-5"><i class="icon-lock"></i> Ajouter</button>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12 col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title">Liste des Sections</h5>
                                    <div class="table-responsive">
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">id</th>
                                                    <th scope="col">Code</th>
                                                    <th scope="col">Supprimer</th>
                                                    <th scope="col">Modifier</th>

                                                </tr>
                                            </thead>
                                            <tbody id="content">
                                               

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div><!--End Row-->

                    <!--End Dashboard Content-->

                    <!--start overlay-->

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
        <script src="scripts/section.js" type="text/javascript"></script>


    </body>
</html>
