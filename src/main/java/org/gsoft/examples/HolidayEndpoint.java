package org.gsoft.examples;

import javax.xml.xpath.XPath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.Namespace;

@Endpoint
public class HolidayEndpoint {
	private static final String NAMESPACE_URI = "https://www.laertessoft.biz/examples/schemas";
	
	private XPath startDateExpression;
	
	private XPath endDateExpression;
	
	private XPath nameExpression;
	
	private HumanResourceService humanResourceService;
	
	@Autowired
	public HolidayEndpoint(HumanResourceService humanResourceService) throws JDOMException{
		this.humanResourceService = humanResourceService;
		
		Namespace namespace = Namespace.getNamespace("hr", NAMESPACE_URI);
		
		startDateExpression = XPath.newInstance("//hr:StartDate");
		
	}
	
	
}
