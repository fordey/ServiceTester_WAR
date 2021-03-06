package serviceTester.core.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import serviceTester.core.domain.AbstractScenario;
import serviceTester.core.domain.xStream.ErrorNode;
import serviceTester.core.domain.xStream.MIP871Response;
import serviceTester.core.domain.xStream.MIPCalculation871;
import serviceTester.core.services.api.ResponseProcessService;

@Service
public class ResponseProcessServiceImpl implements ResponseProcessService {
	private static final Logger logger = LoggerFactory.getLogger(ResponseProcessServiceImpl.class);

	public <T> Object returnObjectFromXML(String xmlString, Class<T> responseClass) throws Exception{
		Object o = null;
		try{
	    	XStream parser = new XStream(new DomDriver());
	    	parser.processAnnotations(MIP871Response.class);
	    			
	    	o = parser.fromXML(xmlString);
	    }catch(Exception ex){
	    	logger.debug("Exception occurred marshalling response to object ...", ex);
	    	throw(ex);
	    }
		return o;
	}
	
}