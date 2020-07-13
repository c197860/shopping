<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!doctype html>
<html>

<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>商品详情信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css"/>

    <style>
        body {
            margin-top: 20px;
            margin: 0 auto;
        }

        .carousel-inner .item img {
            width: 100%;
            height: 300px;
        }
    </style>
</head>

<body>


<!--
    描述：菜单栏
-->
<%@include file="header.jsp" %>

<div class="container">
    <div class="row">
        <div style="border: 1px solid #e4e4e4;width:930px;margin-bottom:10px;margin:0 auto;padding:10px;margin-bottom:10px;">
            <a href="${pageContext.request.contextPath}/list">首页&nbsp;&nbsp;&gt;</a>
        </div>

        <div style="margin:0 auto;width:950px;">
            <div class="col-md-6">
                <img style="opacity: 1;width:400px;height:350px;" title="" class="medium"
                     src="${pageContext.request.contextPath}/${product.pimage}">
            </div>
            <form id="myForm" action="${pageContext.request.contextPath}/CartServlet?method=addCartItemToCart"
                  method="post">
                <div class="col-md-6">
                    <div><strong>${product.pname}</strong></div>
                    <div style="border-bottom: 1px dotted #dddddd;width:350px;margin:10px 0 10px 0;">
                        <div>编号：${product.pid}</div>
                    </div>

                    <div style="margin:10px 0 10px 0;">商城价: <strong
                            style="color:#ef0101;">￥：${product.marketPrice}元/份</strong> 市 场 价：
                        <del>￥${product.shopPrice}元/份</del>
                    </div>

                    <div style="margin:10px 0 10px 0;">促销: <a target="_blank" title="限时抢购 (2014-07-30 ~ 2015-01-01)"
                                                              style="background-color: #f07373;">限时抢购</a></div>

                    <div style="padding:10px;border:1px solid #e7dbb1;width:330px;margin:15px 0 10px 0;;background-color: #fffee6;">
                        <div style="margin:5px 0 10px 0;">白色</div>

                        <div style="border-bottom: 1px solid #faeac7;margin-top:20px;padding-left: 10px;">购买数量:
                            <%--向服务端发送购买数量--%>
                            <input id="quantity" name="quantity" value="1" maxlength="4" size="10" type="text"></div>
                        <%--向服务端发送购买商品id--%>
                        <input type="hidden" name="pid" value="${product.pid}">
                        <div style="margin:20px 0 10px 0;;text-align: center;">
                            <%--加入到购物车 --%>
                            <%--取消链接的默认行为--%>
                            <a href="javascript:void(0)">
                                <input id="btnId"
                                       style="background: url('${pageContext.request.contextPath}/img/product.gif') no-repeat scroll 0 -600px rgba(0, 0, 0, 0);height:36px;width:127px;"
                                       value="加入购物车" type="button">
                            </a> &nbsp;收藏商品
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="clear"></div>
        <div style="width:950px;margin:0 auto;">
            <div style="background-color:#d3d3d3;width:930px;padding:10px 10px;margin:10px 0 10px 0;">
                <strong>商品介绍</strong>
                <h3>${product.pdesc}</h3>
            </div>
        </div>

    </div>
</div>
<div id="page">
    <main class="bg_gray">
        <div class="tabs_product bg_white version_2">
            <div class="container">
                <ul class="nav nav-tabs" role="tablist">
                    <li class="nav-item">
                        <a id="tab-A" href="#pane-A" class="nav-link active" data-toggle="tab"
                           role="tab">Description</a>
                    </li>
                    <li class="nav-item">
                        <a id="tab-B" href="#pane-B" class="nav-link" data-toggle="tab" role="tab">Reviews</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="tab_content_wrapper">
            <div class="container">
                <div class="tab-content" role="tablist">
                    <div id="pane-A" class="card tab-pane fade active show" role="tabpanel" aria-labelledby="tab-A">
                        <div class="card-header" role="tab" id="heading-A">
                            <h5 class="mb-0">

                            </h5>
                        </div>

                        <div id="collapse-A" class="collapse" role="tabpanel" aria-labelledby="heading-A">
                            <div class="card-body">

                            </div>
                        </div>
                    </div>
                    <!-- /TAB A -->

                    <div id="pane-B" class="card tab-pane fade" role="tabpanel" aria-labelledby="tab-B">
                        <div class="card-header" role="tab" id="heading-B">
                            <h5 class="mb-0">
                                <a class="collapsed" data-toggle="collapse" href="#collapse-B" aria-expanded="false"
                                   aria-controls="collapse-B">
                                    Reviews
                                </a>
                            </h5>
                        </div>

                        <div id="collapse-B" class="collapse" role="tabpanel" aria-labelledby="heading-B">
                            <div class="card-body">
                                <div class="row justify-content-between">
                                    <div class="col-lg-5">
                                        <div class="review_content">
                                            <div class="clearfix add_bottom_10">
                                                <span class="rating"><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><em>5.0/5.0</em></span>
                                                <em>Published 54 minutes ago</em>
                                            </div>
                                            <h4>"Commpletely satisfied"</h4>
                                            <p>Eos tollit ancillae ea, lorem consulatu qui ne, eu eros eirmod scaevola
                                                sea. Et nec tantas accusamus salutatus, sit commodo veritus te, erat
                                                legere fabulas has ut. Rebum laudem cum ea, ius essent fuisset ut.
                                                Viderer petentium cu his.</p>
                                        </div>
                                    </div>
                                    <div class="col-lg-5">
                                        <div class="review_content">
                                            <div class="clearfix add_bottom_10">
                                                <span class="rating"><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><i
                                                        class="icon-star empty"></i><i class="icon-star empty"></i><em>4.0/5.0</em></span>
                                                <em>Published 1 day ago</em>
                                            </div>
                                            <h4>"Always the best"</h4>
                                            <p>Et nec tantas accusamus salutatus, sit commodo veritus te, erat legere
                                                fabulas has ut. Rebum laudem cum ea, ius essent fuisset ut. Viderer
                                                petentium cu his.</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="row justify-content-between">
                                    <div class="col-lg-5">
                                        <div class="review_content">
                                            <div class="clearfix add_bottom_10">
                                                <span class="rating"><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><i
                                                        class="icon-star"></i><i
                                                        class="icon-star empty"></i><em>4.5/5.0</em></span>
                                                <em>Published 3 days ago</em>
                                            </div>
                                            <h4>"Outstanding"</h4>
                                            <p>Eos tollit ancillae ea, lorem consulatu qui ne, eu eros eirmod scaevola
                                                sea. Et nec tantas accusamus salutatus, sit commodo veritus te, erat
                                                legere fabulas has ut. Rebum laudem cum ea, ius essent fuisset ut.
                                                Viderer petentium cu his.</p>
                                        </div>
                                    </div>
                                    <div class="col-lg-5">
                                        <div class="review_content">
                                            <div class="clearfix add_bottom_10">
                                                <span class="rating"><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><i
                                                        class="icon-star"></i><i class="icon-star"></i><em>5.0/5.0</em></span>
                                                <em>Published 4 days ago</em>
                                            </div>
                                            <h4>"Excellent"</h4>
                                            <p>Sit commodo veritus te, erat legere fabulas has ut. Rebum laudem cum ea,
                                                ius essent fuisset ut. Viderer petentium cu his.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>


                </div>
            </div>

        </div>


    </main>
    <div id="page">
        <form action="${pageContext.request.contextPath}/leave" method="post"></form>
        <main>
            <div class="container margin_60_35">

                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <div class="write_review">
                            <div class="form-group">
                                <label>评论标题</label>
                                <input class="form-control" type="text" placeholder="请填写你的标题" id="heade">
                            </div>
                            <div class="form-group">
                                <label>评论</label>
                                <textarea class="form-control" style="height: 180px;" placeholder="内容"
                                          id="content"></textarea>
                            </div>
                            <input type="button" id="comment" value="提交">
                        </div>
                    </div>
                </div>
            </div>
        </main>

    </div>
    <div id="toTop"></div><!-- Back to top button -->
    <script src="${pageContext.request.contextPath}/js/common_scripts.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
    <%@include file="footer.jsp" %>
</body>
<script>
    $(function () {
        $("#btnId").click(function () {
            var formObj = document.getElementById("myForm");
            formObj.submit();
        })
    })
    $("#comment").click(function () {
        var hea = $("#heade").val();
        var commen = $("#content").val();
        var page = $("#page").val();
        if (hea == null || hea == "") {
            alert("标题不能为空");
            return false
        } else if (commen == null || commen == "") {
            alert("内容不能为空");
            return false
        } else {
            $.ajax({
                "url": "${pageContext.request.contextPath}/leave",
                "type": "post",
                "dataType": "json",
                "data": {"hea": hea, "commen": commen, "page": page},
                "success": function (result) {
                    if (result.result) {
                        alert("评论成功")
                    } else {
                        alert("评论失败")
                    }
                },
                "error": function () {

                }
            })
            return true;
        }

    })

</script>

</html>