<%@ page language="java" contentType="text/comma-separated-values;charset=UTF-8" session="false"
%><%@ taglib uri="http://www.anotheria.net/ano-tags" prefix="ano"
%><%--
--%><ano:iterate type="net.anotheria.moskito.webui.shared.bean.ProducerDecoratorBean" id="decorator" name="decorators"><%--
--%><ano:write name="decorator" property="name"/>;Producer Id;Category;Subsystem<%--
--%><ano:iterate name="decorator" property="captions" type="net.anotheria.moskito.core.decorators.value.StatCaptionBean" id="caption" indexId="ind"><%--
--%>;<ano:write name="caption" property="caption"/><%--
--%></ano:iterate><%--
--%>;class<%--
--%> 
<%--
--%><ano:iterate name="decorator" property="producers" id="producer" type="net.anotheria.moskito.webui.producers.api.ProducerAO"><%--
--%>"";<ano:write name="producer" property="producerId"/>;<ano:write name="producer" property="category"/>;<ano:write name="producer" property="subsystem"/><%--
--%><ano:iterate name="producer" property="firstStatsValues" id="value" type="net.anotheria.moskito.core.decorators.value.StatValueAO"><%--
--%>;<ano:write name="value" property="value"/><%--
--%></ano:iterate><%--
--%>;<ano:write name="producer" property="producerClassName"/><%--
--%> 
<%--
--%></ano:iterate><%--
--%> 
<%--
--%></ano:iterate><%--
--%>

"Generated at <ano:write name="timestampAsDate"/>, timestamp: <ano:write name="timestamp"/>"