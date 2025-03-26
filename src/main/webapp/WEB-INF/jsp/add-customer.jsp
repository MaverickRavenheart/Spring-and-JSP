<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Customer</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <!-- Sidebar -->
        <div class="d-flex">
            <!-- Side Navbar -->
            <div class="sidebar bg-info text-white p-3" style="width: 250px; height: 100%">
                    <h2 class="d-flex align-items-center">
                        Lingua
                        <img src="${pageContext.request.contextPath}/img/logo.svg" class="ms-2" style="width: 120px; height: 120px;" alt="logo">
                    </h2>
            </div>

            <!-- Main content area -->
            <div class="container-fluid">
                <!-- Header -->
                <header class="bg-primary text-white text-center py-3">
                    <h1>Website Header</h1>
                </header>

                <!-- Main Content -->
                <main class="container my-4">
                    <jsp:include page="${page}"/>
                </main>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>