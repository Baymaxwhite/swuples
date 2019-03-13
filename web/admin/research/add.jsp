<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/13
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="/admin/base/header.jsp"></jsp:include>
<jsp:include page="/admin/base/nav.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/ueditor/themes/default/css/ueditor.css">
<script type="text/javascript" charset="utf-8"  src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>



<div id="page-wrapper">
    <div id="page-inner">

        <%-- 编写数据增加表单 --%>
        <form class="form-horizontal" id="insertForm" >
            <%-- 管理员账号 --%>
            <div class="form-group">
                <label for="news" class="col-md-3 control-label">栏目选择</label>
                <div class="col-md-6">
                    <select  type="text" name="news" id="news" class="form-control input-sm">
                        <option value="1">研究基地</option>
                        <option value="2">学术专题</option>
                        <option value="3">科研管理系统</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="news_title" class="col-md-3 control-label">新闻标题</label>
                <div class="col-md-6">
                    <input type="text" name="news_title" id="news_title" class="form-control input-sm"/>
                </div>
            </div>
            <div class="form-group">
                <label for="news_image" class="col-md-3 control-label">是否有图片</label>
                <div class="col-md-6">
                    <select class="news_image" id="news_image">
                        <option value="1" onclick="Yesimages()">是</option>
                        <option value="0" onclick="Noimages()">否</option>
                    </select>
                </div>
            </div>
                <div class="form-group" id="imagess">
                    <label for="editor" class="col-md-3 control-label">新闻内容</label>
                    <div class="col-md-6">
                        <textarea id="editor" name="editor" type="text/plain"></textarea>
                    </div>
                </div>
            <div class="form-group">
                <label for="news_author" class="col-md-3 control-label">发布作者</label>
                <div class="col-md-6">
                    <input type="text" name="news_author" id="news_author" class="form-control input-sm">
                </div>
            </div>
            <div class="from-group">
                <div class="col-md-5 col-md-offset-3">
                    <button type="button" class="btn btn-success c" onclick="save()">提交</button>
                    <button type="reset" class="btn btn-success">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>


<script type="text/javascript">
    var ue = UE.getEditor('editor');


    function  save() {
        var news=$("#news").val();//栏目
        var title=$("#news_title").val();//标题
        var conctent=ue.getContent();//内容
        var Flagimage=$("#news_image").val();//是否有图片
        var author=$("#news_author").val();//发布作者
        $.ajax({
            url:"/SchoolManagerSystem/admin/ResearchServlet/add", //提交地址 servlet
            type:"post", //提交方式 post/get
            data:{news:news,title:title,conctent:conctent,Flagimage:Flagimage,author:author},//{参数名称1:‘值1’,参数名称2:‘值2’,....}
            dataType:"json",//提交数据类型 如果跨域提交用jsonp
            async:true,
            success:function(data){ //提交成功后返回数据执行
                console.log(data.msg);
                if (data.flag) {
                    location.href=data.url;
                }else {
                    alert(data.msg);
                    location.reload();
                }
            },
            eerror:function(err){//提交失败返回的 err错误信息
                //错误信息
                console.log('错误');
            }
        })
    }


</script>



<jsp:include page="/admin/base/footer.jsp"></jsp:include>
