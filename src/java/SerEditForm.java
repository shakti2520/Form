import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
import operation.DropBoxOperation;
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
                 maxFileSize=1024*1024*10,      // 10MB
                 maxRequestSize=1024*1024*50)   // 50MB

public class SerEditForm extends HttpServlet
{
    Connection con=null;
    ServletContext ctx;
    Statement stmt=null;
    private static final String SAVE_DIR = "uploadFiles";
    String driver="com.mysql.jdbc.Driver";
    String un="root", pass="java", url="jdbc:mysql://localhost:3306/form";
    String kn, kp, sql;
    ResultSet rs=null;
    String pid;

    public void init(ServletConfig sc)throws ServletException
    {
        super.init(sc);
        try
        {
            Class.forName(driver);
            System.out.println("driver loaded");
            con=DriverManager.getConnection(url,un,pass);
            System.out.println("connected");
            stmt=con.createStatement();
            System.out.println("wrapper created");
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("class not found"+cnfe.getMessage());
        }
        catch(SQLException sqle)
        {
            System.out.println("not connected"+sqle.getMessage());
        }
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        doPost(req,res);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {System.out.println("post");
         PrintWriter out=response.getWriter();
         DropBoxOperation dbo=new DropBoxOperation("RfP9_nqK2oAAAAAAAAAADu2rEL2PdYEV8BdB2ULc8ih15kCubEUSOEconOaMV7xS");
        String name=request.getParameter("name");
           String batch=request.getParameter("batch");
           String branch=request.getParameter("branch");
           String occupation=request.getParameter("occupation");
           String designation=request.getParameter("designation");
           String email=request.getParameter("email");
           String phone=request.getParameter("phone");
           String address=request.getParameter("address");
           String file=request.getParameter("file");
           String id=request.getParameter("id");
           
        
       
          //delete image
        try
        {
            sql="select filename from sirform where id="+id;
            rs=stmt.executeQuery(sql);
            rs.next();
            String img=rs.getString("filename");
            
            dbo.deleteFile(img);
        }
        catch(SQLException sqle)
        {
            out.println(sqle.getMessage());
        }
           
        
        Part partfile=request.getPart("file");
        InputStream is= partfile.getInputStream();
        String filename= extractFileName(partfile);
        filename="googleForm/"+filename;
        System.out.println(filename);
        String path=dbo.uploadFile(filename, is);
        System.out.println("path="+path);
           
        try
        {
           sql="update sirform set name='"+name+"',batch='"+batch+"',branch='"+branch+"',occupation='"+occupation+"',designation='"+designation+"',email='"+email+"',phone='"+phone+"',address='"+address+"',image='"+path+"',filename='"+filename+"' where id="+id;
           stmt.executeUpdate(sql);
            System.out.println("updated");
        } 
        catch (SQLException ex) {
            System.out.println("error"+ex.getMessage());
     }
           out.println(path);
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
