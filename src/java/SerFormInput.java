import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.*;
import operation.DropBoxOperation;
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
                 maxFileSize=1024*1024*10,      // 10MB
                 maxRequestSize=1024*1024*50)   // 50MB

public class SerFormInput extends HttpServlet {
 private static final String SAVE_DIR = "uploadFiles";
      Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String url="jdbc:mysql://localhost:3306/form";
    String un="root",pswd="java",sql;
    
    public void init(ServletConfig sc) throws ServletException
    {
        super.init(sc);
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("------Driver Loaded---------");
           con=DriverManager.getConnection(url,un,pswd);
           System.out.println("------connected---------");
           st=con.createStatement();
           System.out.println("------Wraapper Created------");
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        catch(ClassNotFoundException cnfe )
        {
            System.out.println(cnfe.getMessage());
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
       
        DropBoxOperation dbo=new DropBoxOperation("RfP9_nqK2oAAAAAAAAAADu2rEL2PdYEV8BdB2ULc8ih15kCubEUSOEconOaMV7xS");
//        String appPath = request.getServletContext().getRealPath("");
        String name=request.getParameter("name");
           String batch=request.getParameter("batch");
           String branch=request.getParameter("branch");
           String occupation=request.getParameter("occupation");
           String designation=request.getParameter("designation");
           String email=request.getParameter("email");
           String phone=request.getParameter("phone");
           String address=request.getParameter("address");
           Part partfile=request.getPart("file");
            InputStream is= partfile.getInputStream();
        
        String filename= extractFileName(partfile);
        filename="googleForm/"+filename;
        System.out.println(filename);
        String path=dbo.uploadFile(filename, is);
        System.out.println("path"+path);
        try
        {
            System.out.println("sql--------------------------------------------");
           sql="insert into sirform(name,batch,branch,occupation,designation,email,phone,address,image,filename) values ('"+name+"','"+batch+"','"+branch+"','"+occupation+"','"+designation+"','"+email+"','"+phone+"','"+address+"','"+path+"','"+filename+"')"; 
           st.executeUpdate(sql);
        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
     }
        response.sendRedirect("http://localhost:8084/googleform/thanks.jsp");
           
    }

     private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }

}
