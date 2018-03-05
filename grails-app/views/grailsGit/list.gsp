<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'site.label', default: 'Site')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<div id="list-site" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]" /></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>


    <div>
        <table>
            <thead>
            <td><strong>Site</strong></td>
            </thead>
            <tbody>
            <g:each in="${siteList}" var="p">
                <tr>
                    <td style="color:${p.active?"green":"red"};">${p.idSite}</td>
                    <td style="color:${p.active?"green":"red"};">${p.name}</td>
                    <td style="color:${p.active?"green":"red"};">${p.active}</td>
                </tr>
            </g:each>
            </tbody>
        </table>
    </div>

    <div class="pagination">
        <g:paginate total="${siteCount ?: 0}" />
    </div>
</div>
</body>
</html>