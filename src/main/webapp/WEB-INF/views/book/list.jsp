<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookList</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h3>SSH</h3>
        </div>
        <a href="/book/new" class="btn btn-success pull-right">添加新书籍</a>
        <table class="table">
            <thead>
            <tr>
                <td>书名</td>
                <td>作者</td>
                <td>价格</td>
                <td>数量</td>
                <td>出版社</td>
                <td>分类</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${bookList}" var="book">
                <tr>
                    <td>${book.bookname}</td>
                    <td>${book.bookauthor}</td>
                    <td>${book.bookprice}</td>
                    <td>${book.booknum}</td>
                    <td>${book.publisher.pubname}</td>
                    <td>${book.bookType.booktype}</td>
                    <td>
                        <a href="/book/${book.id}/edit">修改</a>
                        <a href="/book/${book.id}/del">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


</body>
</html>
