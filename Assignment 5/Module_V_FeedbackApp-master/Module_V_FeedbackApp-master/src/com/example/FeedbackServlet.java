package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedbackType = request.getParameter("feedbackType");
        String comments = request.getParameter("comments");

        String currentDateTime = LocalDateTime.now().format(
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        );

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><meta charset='UTF-8'><title>Feedback Submitted</title></head><body>");
            out.println("<h2>Thank you, " + escapeHtml(name) + " for your feedback!</h2>");
            out.println("<p><strong>Email:</strong> " + escapeHtml(email) + "</p>");
            out.println("<p><strong>Feedback Type:</strong> " + escapeHtml(feedbackType) + "</p>");
            out.println("<p><strong>Comments:</strong> " + escapeHtml(comments) + "</p>");
            out.println("<p><strong>Date and Time:</strong> " + currentDateTime + "</p>");
            out.println("<p><a href='feedback.html'>Submit another response</a></p>");
            out.println("</body></html>");
        }
    }

    // Escape user-provided text before inserting it into HTML.
    private String escapeHtml(String value) {
        if (value == null) return "";
        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#x27;");
    }
}
