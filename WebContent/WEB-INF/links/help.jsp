<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="x"%>
<%@ page
	import="org.apache.myfaces.custom.tree.DefaultMutableTreeNode,
                 org.apache.myfaces.custom.tree.model.DefaultTreeModel"%>
<%
	if (pageContext
			.getAttribute("treeModel", pageContext.SESSION_SCOPE) == null) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("XY");
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		root.insert(a);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		root.insert(b);
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
		root.insert(c);

		DefaultMutableTreeNode node = new DefaultMutableTreeNode("a1");
		a.insert(node);
		node = new DefaultMutableTreeNode("a2 ");
		a.insert(node);
		node = new DefaultMutableTreeNode("b ");
		b.insert(node);

		a = node;
		node = new DefaultMutableTreeNode("x1");
		a.insert(node);
		node = new DefaultMutableTreeNode("x2");
		a.insert(node);

		pageContext.setAttribute("treeModel",
				new DefaultTreeModel(root), pageContext.SESSION_SCOPE);
	}
%>

<f:view>
	<f:verbatim>
		<h2>Here is a tree example.</h2>
	</f:verbatim>

	<h:form id='tree1form'>
		<x:tree id="tree" value="#{treeModel}" styleClass="tree"
			nodeClass="treenode" selectedNodeClass="treenodeSelected"
			expandRoot="true">
		</x:tree>
		<f:verbatim>
			<br>
		</f:verbatim>

		<h:commandLink id="goHome" action="guessGameStartFromTree">
			<h:outputText value="Return to Guess Game" />
		</h:commandLink>
	</h:form>

</f:view>