package com.school.servlet;

import com.school.service.impl.ResearchServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResearchsServlet extends HttpServlet {
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
        request.getSession().setAttribute("areOne",new ResearchServiceImpl().getResearchAreContent(1));
        request.getSession().setAttribute("areTwo",new ResearchServiceImpl().getResearchAreContent(2));
        request.getSession().setAttribute("areThree",new ResearchServiceImpl().getResearchAreContent(3));
    }
}
