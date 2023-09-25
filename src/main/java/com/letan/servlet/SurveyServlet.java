package com.letan.servlet;
import com.letan.model.User;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            String receiveAnnouncements ="";
            String hearAboutUs = request.getParameter("HearAboutUs");

            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            String _receiveAnnouncements = request.getParameter("yesILikeThat");
            String contact = request.getParameter("contactMethod");

            if(_receiveAnnouncements!=null)
            {
                receiveAnnouncements = "Yes";
            }
            else
            {
                receiveAnnouncements = "No";
            }

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email,hearAboutUs,receiveAnnouncements,contact);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
