package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Google Form</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color: aliceblue;\n");
      out.write("            }\n");
      out.write("            form\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 25%;\n");
      out.write("                transform: translateX(50%);\n");
      out.write("                border-top: 8px solid greenyellow;\n");
      out.write("                background-color: white;\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 40px;\n");
      out.write("            }\n");
      out.write("            form label\n");
      out.write("            {\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .form-group\n");
      out.write("            {\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            .form-group .form-control\n");
      out.write("            {\n");
      out.write("                border-bottom: 1px solid lightgrey;\n");
      out.write("                border-top: 0;\n");
      out.write("                border-left: 0;\n");
      out.write("                border-right: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("                width: 60%;\n");
      out.write("                padding-left: 0;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .form-group .form-control:focus,\n");
      out.write("            .form-group .form-control:active\n");
      out.write("            {\n");
      out.write("                outline: 0px !important;\n");
      out.write("                outline-color: rgba(0,0,0,0);\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                border-bottom: 1px solid lightgrey !important; \n");
      out.write("            }\n");
      out.write("            .bg-image\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 300px;\n");
      out.write("                background-image: url(\"images/Contact-Us-Background.jpg\");\n");
      out.write("                background-origin: border-box;\n");
      out.write("                background-position: bottom;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg-image\"></div>\n");
      out.write("        <form action=\"http://localhost:8084/googleform/SerFormInput\" method=\"post\"  enctype=\"multipart/form-data\">\n");
      out.write("            <h2>Contact Information</h2>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"name\">Name:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"batch\">Batch:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"batch\" id=\"batch\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"branch\">Branch:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"branch\" id=\"branch\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"occupation\">Place of Work/Occupation</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"occupation\" id=\"occupation\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"designation\">Designation</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"designation\" id=\"designation\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"email\">Email address</label>\n");
      out.write("              <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"phone\">Phone Number:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"address\">Address:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\" placeholder=\"Your Answer\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"file\">Insert Image</label>\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" style=\"margin-top:10px;\"  id=\"file\" name=\"file\">\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Submit\" style=\"width:100px; margin-top: 20px;\" class=\"btn btn-primary\">\n");
      out.write("          </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
