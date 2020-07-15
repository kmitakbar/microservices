
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetLoans_QNAME = new QName("http://soapproducer/", "getLoans");
    private final static QName _GetLoansResponse_QNAME = new QName("http://soapproducer/", "getLoansResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoans }
     * 
     */
    public GetLoans createGetLoans() {
        return new GetLoans();
    }

    /**
     * Create an instance of {@link GetLoansResponse }
     * 
     */
    public GetLoansResponse createGetLoansResponse() {
        return new GetLoansResponse();
    }

    /**
     * Create an instance of {@link PersonalLaon }
     * 
     */
    public PersonalLaon createPersonalLaon() {
        return new PersonalLaon();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoans }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLoans }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapproducer/", name = "getLoans")
    public JAXBElement<GetLoans> createGetLoans(GetLoans value) {
        return new JAXBElement<GetLoans>(_GetLoans_QNAME, GetLoans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoansResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLoansResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapproducer/", name = "getLoansResponse")
    public JAXBElement<GetLoansResponse> createGetLoansResponse(GetLoansResponse value) {
        return new JAXBElement<GetLoansResponse>(_GetLoansResponse_QNAME, GetLoansResponse.class, null, value);
    }

}
