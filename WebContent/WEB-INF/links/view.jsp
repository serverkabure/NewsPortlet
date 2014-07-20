<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>

<f:view>
	<f:verbatim>
		<h2>自分用リンク集</h2>
	</f:verbatim>

	<h:form>
		<t:tree id="tree" value="#{linksBean.treeModel}" var="treeItem"
			styleClass="tree" nodeClass="treenode" headerClass="treeHeader"
			footerClass="treeFooter" rowClasses="a, b" columnClasses="col1, col2"
			selectedNodeClass="treenodeSelected" expandRoot="true">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Header 1" />
				</f:facet>
				<h:outputText value="#{treeItem.isoCode}" />
			</h:column>
			<t:treeColumn>
				<f:facet name="header">
					<h:outputText value="Header 2" />
				</f:facet>
				<h:outputText value="#{treeItem.name}" />
			</t:treeColumn>
			<h:column>
				<f:facet name="header">
					<h:outputText value="Header 3" />
				</f:facet>
				<h:outputText value="#{treeItem.description}" />
			</h:column>
			<f:facet name="footer">
				<h:outputText value="Footer" />
			</f:facet>
		</t:tree>
	</h:form>

	<%-- 	<h:form id='tree1form'> --%>
	<%-- 		<t:tree id="tree" value="#{linksBean.treeModel}" styleClass="tree" --%>
	<%-- 			nodeClass="treenode" selectedNodeClass="treenodeSelected" --%>
	<%-- 			expandRoot="true"> --%>
	<%-- 		</t:tree> --%>
	<%-- 		<f:verbatim> --%>
	<!-- 			<br> -->
	<%-- 		</f:verbatim> --%>

	<%-- 		<h:commandLink id="addLink" action="addLink"> --%>
	<%-- 			<h:outputText value="追加登録" /> --%>
	<%-- 		</h:commandLink> --%>
	<%-- 	</h:form> --%>

</f:view>