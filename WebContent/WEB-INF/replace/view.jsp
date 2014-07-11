<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form>
	<p>viewPage@replace</p>
	<hr />
	<ul>
		<li>number : ${number }</li>
		<li>from : ${from }</li>
		<li>message : ${message }</li>
		<li>objectId : ${objectId }</li>
	</ul>
</form>
