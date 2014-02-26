<%@page buffer="none" session="false" taglibs="c,cms"%><%--
--%><%@page import="org.opencms.json.JSONObject"%><%--
--%><% org.opencms.util.CmsRequestUtil.setNoCacheHeaders(response); %><%--
--%><c:set var="locale"><cms:info property="opencms.request.locale" /></c:set><%--
--%>var GWTsearchUIDictionary = <%--

--%><%java.util.Locale locale = new java.util.Locale((String)pageContext.getAttribute("locale"));

    org.opencms.relations.CmsCategoryService srv = org.opencms.relations.CmsCategoryService.getInstance();
    org.opencms.jsp.CmsJspActionElement jae = new org.opencms.jsp.CmsJspActionElement(pageContext, request, response);
    org.opencms.file.CmsObject cmsO = jae.getCmsObject();
    String siteRoot = cmsO.getRequestContext().getSiteRoot() + "/";
    java.util.List<String> reps = srv.getCategoryRepositories(cmsO, siteRoot + "/_categories/");
    java.util.List<org.opencms.relations.CmsCategory> cats = srv.readCategoriesForRepositories(cmsO, "/", true, reps);

    final JSONObject resultJSON = new JSONObject();
    for (org.opencms.relations.CmsCategory cat : cats) {
        resultJSON.put(cat.getPath(), cat.getTitle());
    }

    java.util.List<org.opencms.workplace.explorer.CmsExplorerTypeSettings> settings = org.opencms.main.OpenCms.getWorkplaceManager().getExplorerTypeSettings();
    for (org.opencms.workplace.explorer.CmsExplorerTypeSettings setting : settings) {
        String title = org.opencms.workplace.CmsWorkplaceMessages.getResourceTypeName(locale, setting.getName());
        if (title == null) {
            title = setting.getName();
        }
        resultJSON.put(setting.getName(), title);
    }

    java.util.ResourceBundle bundle = org.opencms.i18n.CmsResourceBundleLoader.getBundle("ru.itdt.opencms.bootstrap.formatters.messages", locale);
    for (String key : bundle.keySet()) {
        String value = bundle.getString(key);
        resultJSON.put(key, value);
    }
    resultJSON.put("locale", locale.toString());

    out.println(resultJSON.toString()); %><%--
--%>;