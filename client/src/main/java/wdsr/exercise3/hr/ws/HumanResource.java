package wdsr.exercise3.hr.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-04-18T16:58:09.899+01:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://exercise3.wdsr/hr/definitions", name = "HumanResource")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HumanResource {

    @WebResult(name = "HolidayResponse", targetNamespace = "http://exercise3.wdsr/hr/schemas", partName = "HolidayResponse")
    @WebMethod(operationName = "Holiday", action = "http://exercise3.wdsr/RequestHoliday")
    public HolidayResponse holiday(
        @WebParam(partName = "HolidayRequest", name = "HolidayRequest", targetNamespace = "http://exercise3.wdsr/hr/schemas")
        HolidayRequest holidayRequest
    );
}
