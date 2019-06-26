package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class viewData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_catch_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_catch_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_catch_var.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.release();
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody.release();
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
      out.write("        \n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var id=null; \n");
      out.write("            function editRow(oTable,nRow)\n");
      out.write("            {\n");
      out.write("                var aData =oTable.row(nRow).data();\n");
      out.write("                \n");
      out.write("                var jqTds = $('>td',nRow);\n");
      out.write("                 jqTds[0].innerHTML = '<input type=\"hidden\" name=\"id\" value=\"'+id+'\"/><input type=\"text\" id=\"name\" name=\"name\" value=\"' + aData[0] + '\" width=\"100%\" required />';\n");
      out.write("                  jqTds[1].innerHTML = '<input type=\"text\" id=\"batch\" name=\"batch\" value=\"' + aData[1] + '\" width=\"100%\" required >';\n");
      out.write("                   jqTds[2].innerHTML = '<input type=\"text\" id=\"branch\" name=\"branch\" value=\"' + aData[2] + '\" width=\"100%\" required >';\n");
      out.write("\n");
      out.write("                jqTds[3].innerHTML = '<input type=\"text\" id=\"occupation\" name=\"occupation\" value=\"' + aData[3] + '\" width=\"100%\" required >';\n");
      out.write("                jqTds[4].innerHTML = '<input type=\"text\" id=\"designation\" name=\"designation\" value=\"' + aData[4] + '\" width=\"100%\" required >';\n");
      out.write("                jqTds[5].innerHTML = '<input type=\"email\" id=\"email\" name=\"email\" value=\"' + aData[5] + '\" required >';\n");
      out.write("                jqTds[6].innerHTML = '<input type=\"text\" id=\"phone\"  name=\"phone\" value=\"' + aData[6] + '\" required >';\n");
      out.write("                jqTds[7].innerHTML = '<input type=\"text\" id=\"address\" name=\"address\" value=\"' + aData[7] + '\" required >';\n");
      out.write("                jqTds[8].innerHTML = '<input type=\"file\" id=\"file\" name=\"file\" required >';\n");
      out.write("                jqTds[10].innerHTML = '<a class=\"edit\"  href=\"'+id+'\" id=\"save\" name=\"save\">Save</a> <a class=\"edit\" href=\"'+id+'\">Cancel</a></form>';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function saveRow(oTable,nRow)\n");
      out.write("            {\n");
      out.write("                var f = document.getElementById(\"formid\");\n");
      out.write("             \n");
      out.write("\t\t// Create an FormData object \n");
      out.write("                var fdata = new FormData(f);\n");
      out.write("            \n");
      out.write("               var jqInputs = $('input',nRow);\n");
      out.write("                var aData =oTable.row(nRow).data();\n");
      out.write("                var jqTds = $('>td',nRow);\n");
      out.write("                var name=$(\"#name\").val();\n");
      out.write("                var batch=$(\"#batch\").val();\n");
      out.write("                var branch=$(\"#branch\").val();\n");
      out.write("                var occupation=$(\"#occupation\").val();\n");
      out.write("                var designation=$(\"#designation\").val();\n");
      out.write("                var email=$(\"#email\").val();\n");
      out.write("                var phone=$(\"#phone\").val();\n");
      out.write("                var address=$(\"#address\").val();\n");
      out.write("                var file=$(\"#file\").val();\n");
      out.write("\n");
      out.write("             // alert(fdata);\n");
      out.write("                $.ajax({\n");
      out.write("                    url:\"");
      out.print(application.getContextPath());
      out.write("/SerEditForm\",\n");
      out.write("                    type:\"post\",\n");
      out.write("                    enctype: \"multipart/form-data\",\n");
      out.write("                    data:fdata,\n");
      out.write("                     processData: false,\n");
      out.write("                    contentType: false,\n");
      out.write("                    cache: false,\n");
      out.write("                    timeout: 600000,\n");
      out.write("                    success: function (data, textStatus, jqXHR) {\n");
      out.write("                        jqTds[0].innerHTML =  name;\n");
      out.write("                        jqTds[1].innerHTML =  batch;\n");
      out.write("                        \n");
      out.write("                        jqTds[2].innerHTML =  branch;\n");
      out.write("                        jqTds[3].innerHTML =  occupation;\n");
      out.write("                        jqTds[4].innerHTML =  designation;\n");
      out.write("                        jqTds[5].innerHTML =  email;\n");
      out.write("                        jqTds[6].innerHTML =  phone;\n");
      out.write("                        jqTds[7].innerHTML =  address;\n");
      out.write("                        jqTds[8].innerHTML =  '<img src=\"'+data+'\" height=60px/>';\n");
      out.write("                        jqTds[10].innerHTML = '<a class=\"edit\"  href=\"'+id+'\">Edit</a>';\n");
      out.write("\n");
      out.write("                        var aData =oTable.row(nRow).data();\n");
      out.write("                        aData[0]=name;\n");
      out.write("                        aData[1]=batch;\n");
      out.write("                        aData[2]=branch;\n");
      out.write("                        aData[3]=occupation;\n");
      out.write("                        aData[4]=designation;\n");
      out.write("                        aData[5]=email;\n");
      out.write("                        aData[6]=phone;\n");
      out.write("                        aData[7]=address;\n");
      out.write("                        aData[8]='<img src=\"'+data+'\" height=60px/>';\n");
      out.write("                        \n");
      out.write("                    },\n");
      out.write("                    error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                        alert(jqXHR+ textStatus+ errorThrown);\n");
      out.write("                        jqTds[0].innerHTML =  aData[0];\n");
      out.write("                        jqTds[1].innerHTML =  aData[1];\n");
      out.write("                        jqTds[2].innerHTML =  aData[2];\n");
      out.write("                        jqTds[3].innerHTML =  aData[3];\n");
      out.write("                        jqTds[4].innerHTML =  aData[4];\n");
      out.write("                        jqTds[5].innerHTML =  aData[5];\n");
      out.write("                        jqTds[6].innerHTML =  aData[6];\n");
      out.write("                        jqTds[7].innerHTML =  aData[7];\n");
      out.write("                        jqTds[8].innerHTML =  aData[8];\n");
      out.write("                        jqTds[10].innerHTML = '<a class=\"edit\"  href=\"'+id+'\">Edit</a>';\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function restoreRow(oTable,nRow) {\n");
      out.write("                var aData =oTable.row(nRow).data();\n");
      out.write("                var jqTds = $('>td',nRow);\n");
      out.write("                        jqTds[0].innerHTML =  aData[0];\n");
      out.write("                        jqTds[1].innerHTML =  aData[1];\n");
      out.write("                        jqTds[2].innerHTML =  aData[2];\n");
      out.write("                        jqTds[3].innerHTML =  aData[3];\n");
      out.write("                        jqTds[4].innerHTML =  aData[4];\n");
      out.write("                        jqTds[5].innerHTML =  aData[5];\n");
      out.write("                        jqTds[6].innerHTML =  aData[6];\n");
      out.write("                        jqTds[7].innerHTML =  aData[7];\n");
      out.write("                        jqTds[8].innerHTML =  aData[8];\n");
      out.write("                        jqTds[10].innerHTML = '<a class=\"edit\"  href=\"'+id+'\">Edit</a>';\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                \n");
      out.write("          oTable=$('#myTable').DataTable();\n");
      out.write("           \n");
      out.write("            //----------------EDITING-----------------\n");
      out.write("                var nEditing = null;\n");
      out.write("                $(document).on('click', '#myTable a.edit', function(e) {\n");
      out.write("//                    alert(\"inedit\");\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    id=$(this).attr('href');\n");
      out.write("                    alert(\"href=\"+id);\n");
      out.write("                    var nRow = $(this).parents('tr')[0];\n");
      out.write("\n");
      out.write("                    if (nEditing !== null && nEditing != nRow ) {\n");
      out.write("                        /* Currently editing - but not this row - restore the old before continuing to edit mode */\n");
      out.write("//                        alert(\"inif\");\n");
      out.write("                        restoreRow(oTable,nEditing);\n");
      out.write("                        editRow(oTable,nRow);\n");
      out.write("                        nEditing = nRow;\n");
      out.write("                    }\n");
      out.write("                    else if (nEditing == nRow && this.innerHTML==\"Save\" ) {\n");
      out.write("//                        alert(nRow);\n");
      out.write("                        /* Editing this row and want to save it */\n");
      out.write("//                        alert(\"inelseif\");\n");
      out.write("                        saveRow(oTable,nRow);\n");
      out.write("                        nEditing = null;\n");
      out.write("                    }\n");
      out.write("                    else if (nEditing == nRow && this.innerHTML==\"Cancel\" ) {\n");
      out.write("//                        alert(nRow);\n");
      out.write("                        /* cancel editing and save the original data(Don't affect the original data) */\n");
      out.write("//                        alert(\"inelseif\");\n");
      out.write("                        restoreRow(oTable,nEditing);\n");
      out.write("                        nEditing = null;\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        /* No edit in progress - let's start one */\n");
      out.write("//                        alert(\"inelse\");\n");
      out.write("                        editRow(oTable, nRow);\n");
      out.write("                        nEditing = nRow;\n");
      out.write("                    }\n");
      out.write("                 });\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("           </script>\n");
      out.write("           <style>\n");
      out.write("               body,*\n");
      out.write("               {\n");
      out.write("                   margin: 0;\n");
      out.write("                   padding: 0;\n");
      out.write("               }\n");
      out.write("           </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_catch_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_catch_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:catch
    org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_catch_0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _jspx_tagPool_c_catch_var.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
    _jspx_th_c_catch_0.setPageContext(_jspx_page_context);
    _jspx_th_c_catch_0.setParent(null);
    _jspx_th_c_catch_0.setVar("exp");
    int[] _jspx_push_body_count_c_catch_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_catch_0 = _jspx_th_c_catch_0.doStartTag();
      if (_jspx_eval_c_catch_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_sql_setDataSource_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
            return true;
          out.write("\n");
          out.write("        \n");
          out.write("        ");
          if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
            return true;
          out.write("\n");
          out.write("        <form id=\"formid\">\n");
          out.write("        <table id=\"myTable\" class=\"display\" style=\"width:100%\">\n");
          out.write("            <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <td>Name</td>\n");
          out.write("                    <td>Batch</td>\n");
          out.write("                    <td>Branch</td>\n");
          out.write("                    <td>Occupation</td>\n");
          out.write("                    <td>Designation</td>\n");
          out.write("                    <td>Email</td>\n");
          out.write("                    <td>Phone No.</td>\n");
          out.write("                    <td>Address</td>\n");
          out.write("                    <td>Image</td>\n");
          out.write("                    <td>delete</td>\n");
          out.write("                    <td>edit</td>\n");
          out.write("               </tr>\n");
          out.write("            </thead>\n");
          out.write("            <tbody>\n");
          out.write("                    ");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
            return true;
          out.write("\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("            </form>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_catch_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_catch_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_catch_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_catch_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_catch_0.doFinally();
      _jspx_tagPool_c_catch_var.reuse(_jspx_th_c_catch_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_sql_setDataSource_0.setVar("mydbinfo");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/form");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("java");
    _jspx_th_sql_setDataSource_0.setScope("session");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_scope_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mydbinfo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("rs");
    _jspx_th_sql_query_0.setSql("select * from sirform");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                   <tr>\n");
          out.write("                            \n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 ");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"60px\"/>\n");
          out.write("                             </td>\n");
          out.write("                             <td>\n");
          out.write("                                 <a class=\"delete\"id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.citn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"http://localhost:8084/googleform/deleteInput?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">delete</a> \n");
          out.write("                             </td>  \n");
          out.write("                             <td>\n");
          out.write("                                 <a class=\"edit\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a>\n");
          out.write("                             </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.batch}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.branch}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.occupation}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.designation}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.phone}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.address}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exp ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <p>An exception occur ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
