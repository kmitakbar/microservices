package soapproducer;

import javax.xml.ws.Endpoint;

public class PublishService {

	public static void main(String[] args) {
		Endpoint endpoint=Endpoint.publish("http://localhost:9999/service/loans", new Loan());
		System.out.println("service published!");
	}
}
