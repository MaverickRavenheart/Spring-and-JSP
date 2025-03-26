<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    <a href="/app/customer/add" class="btn btn-success">Add Customer</a>
</div>
<table class="table table-striped">
       <thead>
             <tr>
                 <th>Action</th>
                 <th>Name</th>
                 <th>Email</th>
             </tr>
       </thead>
       <tbody>
             <c:forEach items="${customers}" var="customer">
                 <tr>
                     <td>
                        <div style="display: flex; gap: 5px;">
                             <a href="/app/customer/update/${customer.idCustomer}" class="btn btn-primary">Update</a>
                             <form action="/app/customer/delete/${customer.idCustomer}" method="post">
                                 <button type="submit" class="btn btn-danger">Delete</button>
                             </form>
                         </div>
                     </td>
                     <td>${customer.fullName}</td>
                     <td>${customer.email}</td>
                 </tr>
             </c:forEach>
       </tbody>
</table>