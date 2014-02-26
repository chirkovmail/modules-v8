<%@page buffer="none" session="false" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms"%>
<cms:include file="%(link.weak:/system/modules/ru.itdt.opencms.bootstrap.formatters/search/context.js:22476a2f-996c-11e3-b8c6-001a4d467669)"/>
<script type="text/javascript" src="<cms:link>%(link.weak:/system/modules/ru.itdt.opencms.bootstrap.formatters/search/dictionary.js:224c2523-996c-11e3-b8c6-001a4d467669)</cms:link>?__locale=${cms.locale}"></script>
<script type="text/javascript" src="<cms:link>%(link.weak:/system/modules/ru.itdt.opencms.bootstrap.formatters/search/configuration.js:2242af3b-996c-11e3-b8c6-001a4d467669)</cms:link>?__locale=${cms.locale}"></script>
<%= org.opencms.gwt.CmsGwtActionElement.createNoCacheScript("search", "9.0.0") %>