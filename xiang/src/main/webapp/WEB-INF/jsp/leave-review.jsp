<%--
  Created by IntelliJ IDEA.
  User: suxia
  Date: 2020/7/11
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
<%--    <link href="${pageContext.request.contextPath}/css/bootstrap.custom.min.css" rel="stylesheet">--%>
<%--    <link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet">--%>
<%--    <link href="${pageContext.request.contextPath}/css/leave_review.css" rel="stylesheet">--%>

</head>
<body>
<div id="page">
    <main>
        <div class="container margin_60_35">

            <div class="row justify-content-center">
                <div class="col-lg-8">
                    <div class="write_review">
                        <div class="form-group">
                            <label>评论标题</label>
                            <input class="form-control" type="text" placeholder="If you could say it in one sentence, what would you say?">
                        </div>
                        <div class="form-group">
                            <label>评论</label>
                            <textarea class="form-control" style="height: 180px;" placeholder="Write your review to help others learn about this online business"></textarea>
                        </div>
                        <div class="form-group">
                            <label>上传的图片可选</label>
                            <div class="fileupload"><input type="file" name="fileupload" accept="image/*"></div>
                        </div>
                        <a href="" class="btn_1">提交</a>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>
<div id="toTop"></div><!-- Back to top button -->
<script src="${pageContext.request.contextPath}/js/common_scripts.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>
