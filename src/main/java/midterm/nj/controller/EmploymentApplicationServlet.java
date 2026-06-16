package midterm.nj.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import midterm.nj.model.EmploymentApplication;

/*
 * Name: Nitin John
 * Student ID: 200582109
 * Purpose: Servlet for server side validation
 * This has not been implemented here, however we receive the FE object in Servlet to maintain structure
 */

@WebServlet("/EmploymentApplicationServlet")
public class EmploymentApplicationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public EmploymentApplicationServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String fullName = request.getParameter("fullName");
        String currentAddress = request.getParameter("currentAddress");
        String contactNumber = request.getParameter("contactNumber");
        String emailAddress = request.getParameter("emailAddress");
        String education = request.getParameter("education");
        String gender = request.getParameter("gender");
        String dateAvailable = request.getParameter("dateAvailable");
        String desiredPosition = request.getParameter("desiredPosition");
        String desiredSalary = request.getParameter("desiredSalary");
        String legallyAuthorized =
                request.getParameter("legallyAuthorized");
        String relativesInCompany =
                request.getParameter("relativesInCompany");
        String relativesExplanation =
                request.getParameter("relativesExplanation");

        EmploymentApplication application =
                new EmploymentApplication(
                        fullName,
                        currentAddress,
                        contactNumber,
                        emailAddress,
                        education,
                        gender,
                        dateAvailable,
                        desiredPosition,
                        desiredSalary,
                        legallyAuthorized,
                        relativesInCompany,
                        relativesExplanation
                );

        request.setAttribute("application", application);

        request.getRequestDispatcher("/result.jsp")
               .forward(request, response);
    }
}