<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<h:form >
		<h:outputText value="view page" />
		<hr />
		<h:commandLink action="#{sessionBean.countUp}" value="countUp" />
		<h:commandLink action="#{sessionBean.countDown}" value="countDown" />
		<br />
		<h:outputText value="#{sessionBean.number}" />
		<hr />
	</h:form>
</f:view>