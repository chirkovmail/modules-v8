<%@page buffer="none" session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<cms:formatter var="content" val="value" rdfa="rdfa">

<div class="<c:if test="${cms.container.type == 'content-wide'}">row </c:if>margin-bottom-30">

	<c:if test="${not cms.element.settings.hidetitle}">
		<div class="headline"><h3 ${rdfa.Title}>${value.Title}</h3></div>
	</c:if>

	<div class="panel-group acc-v2" id="accordion${cms.element.id}">
		<c:forEach var="item" items="${content.valueList.Item}" varStatus="status">
			<div class="panel panel-default">
			  <div class="panel-heading">
			  	<h4 class="panel-title">
					<a class="accordion-toggle<c:if test="${status.first}"> active</c:if>" data-toggle="collapse" data-parent="#accordion${cms.element.id}" href="#collapse${cms.element.id}-${status.count}">
					  ${item.value.Label}
					</a>
				</h4>
			  </div>
			  <div id="collapse${cms.element.id}-${status.count}" class="panel-collapse collapse<c:if test="${status.first}"> in</c:if> collapse" style="height: <c:choose><c:when test="${status.first}"> auto</c:when><c:otherwise>0px</c:otherwise></c:choose>;">
				<div class="panel-body">
				  <c:if test="${item.value.Image.isSet}"><div class="row"><div class="col-sm-3 hidden-xs"><img class="img-responsive" src="<cms:link>${item.value.Image}</cms:link>" alt="" /></div><div class="col-sm-9"></c:if>
				  <c:if test="${item.value.Headline.isSet}"><h4>${item.value.Headline}</h4></c:if>
				  <div ${item.rdfa.Text}>${item.value.Text}</div>
				  <c:if test="${item.value.Image.isSet}"></div></div></c:if>
				</div>
			  </div>
			</div><!--/accordion-group-->
		</c:forEach>	
	</div><!--/accordion-->

</div>

</cms:formatter>