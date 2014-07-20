<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>

<f:view>
	<f:verbatim>
		<h2>自分用リンク集</h2>
	</f:verbatim>

	<h:form id='tree1form'>
		<t:tree id="tree" value="#{linksBean.treeModel}" styleClass="tree"
			nodeClass="treenode" selectedNodeClass="treenodeSelected"
			expandRoot="true">
		</t:tree>
		<f:verbatim>
			<br>
		</f:verbatim>

		<h:commandLink id="addLink" action="addLink">
			<h:outputText value="追加登録" />
		</h:commandLink>
	</h:form>

</f:view>