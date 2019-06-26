<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,javax.sql.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script>
            var id=null; 
            function editRow(oTable,nRow)
            {
                var aData =oTable.row(nRow).data();
                
                var jqTds = $('>td',nRow);
                 jqTds[0].innerHTML = '<input type="hidden" name="id" value="'+id+'"/><input type="text" id="name" name="name" value="' + aData[0] + '" width="100%" required />';
                  jqTds[1].innerHTML = '<input type="text" id="batch" name="batch" value="' + aData[1] + '" width="100%" required >';
                   jqTds[2].innerHTML = '<input type="text" id="branch" name="branch" value="' + aData[2] + '" width="100%" required >';

                jqTds[3].innerHTML = '<input type="text" id="occupation" name="occupation" value="' + aData[3] + '" width="100%" required >';
                jqTds[4].innerHTML = '<input type="text" id="designation" name="designation" value="' + aData[4] + '" width="100%" required >';
                jqTds[5].innerHTML = '<input type="email" id="email" name="email" value="' + aData[5] + '" required >';
                jqTds[6].innerHTML = '<input type="text" id="phone"  name="phone" value="' + aData[6] + '" required >';
                jqTds[7].innerHTML = '<input type="text" id="address" name="address" value="' + aData[7] + '" required >';
                jqTds[8].innerHTML = '<input type="file" id="file" name="file" required >';
                jqTds[10].innerHTML = '<a class="edit"  href="'+id+'" id="save" name="save">Save</a> <a class="edit" href="'+id+'">Cancel</a></form>';
            }


            function saveRow(oTable,nRow)
            {
                var f = document.getElementById("formid");
             
		// Create an FormData object 
                var fdata = new FormData(f);
            
               var jqInputs = $('input',nRow);
                var aData =oTable.row(nRow).data();
                var jqTds = $('>td',nRow);
                var name=$("#name").val();
                var batch=$("#batch").val();
                var branch=$("#branch").val();
                var occupation=$("#occupation").val();
                var designation=$("#designation").val();
                var email=$("#email").val();
                var phone=$("#phone").val();
                var address=$("#address").val();
                var file=$("#file").val();

             // alert(fdata);
                $.ajax({
                    url:"<%=application.getContextPath()%>/SerEditForm",
                    type:"post",
                    enctype: "multipart/form-data",
                    data:fdata,
                     processData: false,
                    contentType: false,
                    cache: false,
                    timeout: 600000,
                    success: function (data, textStatus, jqXHR) {
                        jqTds[0].innerHTML =  name;
                        jqTds[1].innerHTML =  batch;
                        
                        jqTds[2].innerHTML =  branch;
                        jqTds[3].innerHTML =  occupation;
                        jqTds[4].innerHTML =  designation;
                        jqTds[5].innerHTML =  email;
                        jqTds[6].innerHTML =  phone;
                        jqTds[7].innerHTML =  address;
                        jqTds[8].innerHTML =  '<img src="'+data+'" height=60px/>';
                        jqTds[10].innerHTML = '<a class="edit"  href="'+id+'">Edit</a>';

                        var aData =oTable.row(nRow).data();
                        aData[0]=name;
                        aData[1]=batch;
                        aData[2]=branch;
                        aData[3]=occupation;
                        aData[4]=designation;
                        aData[5]=email;
                        aData[6]=phone;
                        aData[7]=address;
                        aData[8]='<img src="'+data+'" height=60px/>';
                        
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        //alert(jqXHR+ textStatus+ errorThrown);
                        jqTds[0].innerHTML =  aData[0];
                        jqTds[1].innerHTML =  aData[1];
                        jqTds[2].innerHTML =  aData[2];
                        jqTds[3].innerHTML =  aData[3];
                        jqTds[4].innerHTML =  aData[4];
                        jqTds[5].innerHTML =  aData[5];
                        jqTds[6].innerHTML =  aData[6];
                        jqTds[7].innerHTML =  aData[7];
                        jqTds[8].innerHTML =  aData[8];
                        jqTds[10].innerHTML = '<a class="edit"  href="'+id+'">Edit</a>';
                    }
                });
                
                

                
            }

            function restoreRow(oTable,nRow) {
                var aData =oTable.row(nRow).data();
                var jqTds = $('>td',nRow);
                        jqTds[0].innerHTML =  aData[0];
                        jqTds[1].innerHTML =  aData[1];
                        jqTds[2].innerHTML =  aData[2];
                        jqTds[3].innerHTML =  aData[3];
                        jqTds[4].innerHTML =  aData[4];
                        jqTds[5].innerHTML =  aData[5];
                        jqTds[6].innerHTML =  aData[6];
                        jqTds[7].innerHTML =  aData[7];
                        jqTds[8].innerHTML =  aData[8];
                        jqTds[10].innerHTML = '<a class="edit"  href="'+id+'">Edit</a>';
                
            }
            
            
            $(document).ready(function(){
                
            
                
          oTable=$('#myTable').DataTable();
           
            //----------------EDITING-----------------
                var nEditing = null;
                $(document).on('click', '#myTable a.edit', function(e) {
//                    alert("inedit");
                    e.preventDefault();
                    id=$(this).attr('href');
                    //alert("href="+id);
                    var nRow = $(this).parents('tr')[0];

                    if (nEditing !== null && nEditing != nRow ) {
                        /* Currently editing - but not this row - restore the old before continuing to edit mode */
//                        alert("inif");
                        restoreRow(oTable,nEditing);
                        editRow(oTable,nRow);
                        nEditing = nRow;
                    }
                    else if (nEditing == nRow && this.innerHTML=="Save" ) {
//                        alert(nRow);
                        /* Editing this row and want to save it */
//                        alert("inelseif");
                        saveRow(oTable,nRow);
                        nEditing = null;
                    }
                    else if (nEditing == nRow && this.innerHTML=="Cancel" ) {
//                        alert(nRow);
                        /* cancel editing and save the original data(Don't affect the original data) */
//                        alert("inelseif");
                        restoreRow(oTable,nEditing);
                        nEditing = null;
                    }
                    else {
                        /* No edit in progress - let's start one */
//                        alert("inelse");
                        editRow(oTable, nRow);
                        nEditing = nRow;
                    }
                 });
             });
             
           </script>
           <style>
               body,*
               {
                   margin: 0;
                   padding: 0;
               }
               #formid
               {
                   margin-top: 40px;
               }
               .fill
                {
                    position: relative;
                    top: 20px;
                    left: 30px;
                    padding:10px 20px;
                    border-radius: 5px;
                    background-color: dodgerblue;
                    color: white;
                }
               .fill:hover
               {
                    color: white;
                        text-decoration: none;
                }
           </style>
    </head>
    
    <body>
        <c:catch var="exp">
        <sql:setDataSource var="mydbinfo" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/form" user="root" password="java" scope="session" />
        
        <sql:query dataSource="${mydbinfo}" var="rs" sql="select * from sirform"/>
        <form id="formid">
        <table id="myTable" class="display" style="width:100%">
            <thead>
                <tr>
                    <td>Name</td>
                    <td>Batch</td>
                    <td>Branch</td>
                    <td>Occupation</td>
                    <td>Designation</td>
                    <td>Email</td>
                    <td>Phone No.</td>
                    <td>Address</td>
                    <td>Image</td>
                    <td>delete</td>
                    <td>edit</td>
               </tr>
            </thead>
            <tbody>
                    <c:forEach var="c" items="${rs.rows}">
                   <tr>
                            
                             <td>
                                 <c:out value="${c.name}"/>
                             </td>
                             <td>
                                 <c:out value="${c.batch}"/>
                             </td>
                             <td>
                                 <c:out value="${c.branch}"/>
                             </td>
                             <td>
                                 <c:out value="${c.occupation}"/>
                             </td>
                             <td>
                                 <c:out value="${c.designation}"/>
                             </td>
                             <td>
                                 <c:out value="${c.email}"/>
                             </td>
                             <td>
                                 <c:out value="${c.phone}"/>
                             </td>
                             <td>
                                 <c:out value="${c.address}"/>
                             </td>
                             <td>
                                 <img src="${c.image}" height="60px"/>
                             </td>
                             <td>
                                 <a class="delete"id="${c.citn}" href="http://localhost:8084/googleform/deleteInput?id=${c.id}">delete</a> 
                             </td>  
                             <td>
                                 <a class="edit" href="${c.id}">Edit</a>
                             </td>
                    </tr>
                    </c:forEach>
            </tbody>
        </table>
            </form>
        <a class="fill" href="http://localhost:8084/googleform/mainForm.jsp">Fill another response</a>
               </c:catch>
        <c:if test="${exp ne null}">
            <p>An exception occur ${exp}</p>
        </c:if>
    </body>
</html>

