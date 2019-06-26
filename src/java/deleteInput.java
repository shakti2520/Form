import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;
import operation.DropBoxOperation;


public class deleteInput extends HttpServlet
{
    Connection con=null;
    ServletContext ctx;
    Statement stmt=null;
    String driver="com.mysql.jdbc.Driver";
    String un="root", pass="java", url="jdbc:mysql://localhost:3306/form";
    String kn, kp, sql;
    private static final String SAVE_DIR = "uploadFiles";
    ResultSet rs=null;
    int id;

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
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String appPath = request.getServletContext().getRealPath("");   
        
         id=Integer.parseInt(request.getParameter("id"));
        
        //p.delete();
        try
        {
            sql="select filename from sirform where id="+id;
            rs=stmt.executeQuery(sql);
            rs.next();
            String img=rs.getString("filename");
            DropBoxOperation dbo=new DropBoxOperation("RfP9_nqK2oAAAAAAAAAADu2rEL2PdYEV8BdB2ULc8ih15kCubEUSOEconOaMV7xS");
            dbo.deleteFile(img);
        }
        catch(SQLException sqle)
        {
            out.println(sqle.getMessage());
        }
        
        try
        {
            
            sql="delete from sirform where id="+id;
            stmt.executeUpdate(sql);
            response.sendRedirect("http://localhost:8084/googleform/viewData.jsp");
        }
        catch(SQLException sqle)
        {
            out.println(sqle.getMessage());
        }
        
            
        
    }   
}
