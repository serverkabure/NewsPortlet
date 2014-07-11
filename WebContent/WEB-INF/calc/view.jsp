<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<h:form>
		<h:outputText value="viewPage@calc" />
		<hr ./>
		<h:panelGrid columns="2">
				<h:outputText value="number" />
				<h:outputText value="#{sessionBean.sharedBean.number}" />
				
				<h:outputText value="from" />
				<h:outputText value="#{sessionBean.sharedBean.from}" />
				
				<h:outputText value="message" />
				<h:outputText value="#{sessionBean.sharedBean.message}" />
				
				<h:outputText value="objectId" />
				<h:outputText value="#{sessionBean.sharedBean.objectId}" />
		</h:panelGrid>

	</h:form>
</f:view>