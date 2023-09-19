package com.letan.servlet;

import com.letan.form.SurveyForm;
import com.letan.model.User;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String url = "/index.html";

        String action = request.getParameter("action");

        if (action == null)
            action="join";

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")){
            String lastName = request.getParameter("lastName");
            String firstName = request.getParameter("firstName");
            String email = request.getParameter("email");
            String wayPeopleKnow = request.getParameter("wayPeopleKnow");
            String isReceiveNotification = "on".equals(request.getParameter("isReceiveNotification")) ? "YES" : "NO";
            String contactType = request.getParameter("contactType");
            User user = new User(lastName, firstName, email);

            SurveyForm surveyForm = new SurveyForm(user, wayPeopleKnow, isReceiveNotification, contactType);

            request.setAttribute("surveyForm", surveyForm);
            url = "/thanks.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }
}
