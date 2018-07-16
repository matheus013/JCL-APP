<%@ page language="java" contentType="application/json;charset=UTF-8" session="true"
%><%@ taglib uri="http://www.anotheria.net/ano-tags" prefix="ano"
%>{
<ano:present name="data">
	"data":  [<ano:iterate name="data" id="value" indexId="i"><ano:notEqual name="i" value="0">,</ano:notEqual><ano:write name="value"/></ano:iterate>];
	"accNames": [<ano:iterate name="accNames" type="java.lang.String" id="name" indexId="i"><ano:notEqual name="i" value="0">,</ano:notEqual>"<ano:write name="name"/>"</ano:iterate>], 
</ano:present>
	
	"accumulators": [
		<ano:iterate name="accumulators" type="net.anotheria.moskito.webui.accumulators.api.AccumulatorDefinitionAO" id="accumulator" indexId="index">
		<ano:notEqual name="index" value="0">,</ano:notEqual>
		{
		"id": "${accumulator.id}",
		"name": "${accumulator.name}",
		"path": "${accumulator.path}",
		"values": "${accumulator.numberOfValues}",
		"lasttimestamp": "${accumulator.lastValueTimestamp}"
		}
		</ano:iterate>]
}