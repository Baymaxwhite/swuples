package com.school.servlet;

import com.school.entity.News;
import com.school.service.impl.AdminServiceImpl;
import com.school.service.impl.NewsServiceImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response );
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String status = request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
        switch (status){
            case "add":try {
                add(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
                break;
            case "index" :
                try {
                    index(request,response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "del":del(request,response);break;
        }
    }




    private void add(HttpServletRequest request, HttpServletResponse response) throws Exception{
        JSONObject jsonObject=new JSONObject();//创建返回的josn对象
        int loginFlag=0;//登录标志,默认0,登录失败,验证用户名密码成功之后设为1
        String news=request.getParameter("news");
        String desc=request.getParameter("desc");
        String title=request.getParameter("title");
        String conctent=request.getParameter("conctent");
        String Flagimage=request.getParameter("Flagimage");
        String author=request.getParameter("author");
        String content =request.getParameter("conctent");
        //存入数据库
        News news1=new News();
        news1.setNewsArea(Integer.parseInt(news));
        news1.setDescrib(desc);
        news1.setNewsTitle(title);
        news1.setNewsType(title);
        news1.setContent(conctent);
        news1.setIsBackground(Short.parseShort(Flagimage));
        news1.setAuthor(author);
        if (conctent.contains("src")){
            String url = content.split("src=")[1].split("\"")[1];
            news1.setNewsImage(url);
            if (new NewsServiceImpl().insert(news1)) {
                loginFlag = 1;
                request.getSession().setAttribute("title",title);//标题
                request.getSession().setAttribute("news",news);//栏目
                request.getSession().setAttribute("desc",desc);//拽要
                request.getSession().setAttribute("url",url);//内容
                jsonObject.put("url","/SchoolManagerSystem/admin/news/add.jsp");
            }else{
                jsonObject.put("msg","内容不能为空");
            }
        }else{
            news1.setNewsImage("null");
            if (new NewsServiceImpl().insert(news1)) {
                loginFlag = 1;
                request.getSession().setAttribute("title",title);//标题
                request.getSession().setAttribute("news",news);//栏目
                request.getSession().setAttribute("desc",desc);//拽要
                request.getSession().setAttribute("conctent",conctent);//内容
                jsonObject.put("url","/SchoolManagerSystem/admin/news/add.jsp");
            }else{
                jsonObject.put("msg","内容不能为空");
            }
        }
        jsonObject.put("flag",loginFlag);
        response.getWriter().print(jsonObject.toString());
    }

    private void index(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Integer currentPage = Integer.parseInt(request.getParameter("cp") == null ? "1" : request.getParameter("cp"));
        Integer lineSize = Integer.parseInt(request.getParameter("ls") == null ? "5" : request.getParameter("ls"));
        String keyWord = request.getParameter("key")==null?"":request.getParameter("key");
        String column = request.getParameter("col")==null?"newsType":request.getParameter("col");
        Map<String,Object> map = new NewsServiceImpl().listBySplit(column, keyWord, currentPage, lineSize);
        request.setAttribute("news", map.get("news"));
        request.setAttribute("allRecorders", map.get("recordSize"));
        request.setAttribute("url", "admin/UploadServlet/index");
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("lineSize", lineSize);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("keyWord", keyWord);
        request.getRequestDispatcher("/admin/news/index.jsp").forward(request,response);
    }

    private void del(HttpServletRequest request, HttpServletResponse response) {
        int status=0;
        Integer id=Integer.parseInt(request.getParameter("id"));
        JSONObject jsonObject=new JSONObject();
        try {
            if(new NewsServiceImpl().delById(id)){
                jsonObject.put("url","/SchoolManagerSystem/admin/news/index.jsp");
                jsonObject.put("msg","删除成功");
                status=1;
            }else {
                jsonObject.put("msg","删除失败");
            }
            jsonObject.put("status",status);
            System.out.println(status);
            response.getWriter().print(jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
