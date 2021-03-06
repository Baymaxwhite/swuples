package com.school.servlet;

import com.school.service.NewsService;
import com.school.service.impl.NewsServiceImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getRequestURI().substring(request.getRequestURI().lastIndexOf("/")+1);
        switch (action){
            case "index.jsp":index(request,response);break;
        }




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("areOne",new NewsServiceImpl().getNewsAreContent(1));
        request.getSession().setAttribute("areTwo",new NewsServiceImpl().getNewsAreContent(2));
        request.getSession().setAttribute("areThree",new NewsServiceImpl().getNewsAreContent(3));
        request.getSession().setAttribute("areFour",new NewsServiceImpl().getNewsAreContent(4));
        request.getSession().setAttribute("areFive",new NewsServiceImpl().getNewsAreContent(5));
        request.getSession().setAttribute("areSix",new NewsServiceImpl().getNewsTitleContent("新浪微博"));
        request.getSession().setAttribute("areSix2",new NewsServiceImpl().getNewsTitleContent("新浪微信"));
        request.getSession().setAttribute("areSix1",new NewsServiceImpl().getNewsTitleContent("微博频道"));
        System.out.println(new NewsServiceImpl().getNewsAreContent(6));
        request.getSession().setAttribute("areSeven",new NewsServiceImpl().getNewsAreContent(7));
        request.getSession().setAttribute("areEight",new NewsServiceImpl().getNewsAreContent(8));
        request.getSession().setAttribute("areNine",new NewsServiceImpl().getNewsAreContent(9));
        request.getSession().setAttribute("areTen",new NewsServiceImpl().getNewsAreContent(10));
        request.getSession().setAttribute("areEleven",new NewsServiceImpl().getNewsAreContent(11));
        request.getSession().setAttribute("areTwelve",new NewsServiceImpl().getNewsAreContent(12));
        request.getRequestDispatcher("/webs/news/news_home.jsp").forward(request,response);

    }
}
