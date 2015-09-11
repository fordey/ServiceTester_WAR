package serviceTester.core.services.api;

public interface ResponseProcessService {

	public <T> Object returnObjectFromXML(String xmlString, Class<T> responseClass) throws Exception;
}
