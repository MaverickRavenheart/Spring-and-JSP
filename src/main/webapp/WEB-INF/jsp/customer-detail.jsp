<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div>object customer ${customer.fullName}</div>
<c:url var="add_customer_url" value="/app/customer"/>
<form:form action="${add_customer_url}" method="post" modelAttribute="customer" class="form-horizontal">
    <!-- Hidden input for idCustomer -->


    <form:hidden path="idCustomer" id="id" class="form-control" />
    <div class="form-group">
        <!-- Corrected form:label syntax (use 'for' instead of 'path') -->
        <label for="fullName" class="col-sm-2 control-label">Full Name:</label>
        <div class="col-sm-10">
            <form:input path="fullName" id="fullName" class="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <!-- Corrected form:label syntax (use 'for' instead of 'path') -->
        <label for="email" class="col-sm-2 control-label">Email:</label>
        <div class="col-sm-10">
            <form:input path="email" id="email" class="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" value="Submit" />
        </div>
    </div>
</form:form >
