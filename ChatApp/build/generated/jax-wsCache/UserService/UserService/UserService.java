
package UserService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://UserService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param password
     * @param loginId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginOperation", targetNamespace = "http://UserService/", className = "UserService.LoginOperation")
    @ResponseWrapper(localName = "loginOperationResponse", targetNamespace = "http://UserService/", className = "UserService.LoginOperationResponse")
    @Action(input = "http://UserService/UserService/loginOperationRequest", output = "http://UserService/UserService/loginOperationResponse")
    public boolean loginOperation(
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param password
     * @param loginId
     * @param nickName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrationOperation", targetNamespace = "http://UserService/", className = "UserService.RegistrationOperation")
    @ResponseWrapper(localName = "registrationOperationResponse", targetNamespace = "http://UserService/", className = "UserService.RegistrationOperationResponse")
    @Action(input = "http://UserService/UserService/registrationOperationRequest", output = "http://UserService/UserService/registrationOperationResponse")
    public String registrationOperation(
        @WebParam(name = "nickName", targetNamespace = "")
        String nickName,
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param loginId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendNickName", targetNamespace = "http://UserService/", className = "UserService.SendNickName")
    @ResponseWrapper(localName = "sendNickNameResponse", targetNamespace = "http://UserService/", className = "UserService.SendNickNameResponse")
    @Action(input = "http://UserService/UserService/sendNickNameRequest", output = "http://UserService/UserService/sendNickNameResponse")
    public String sendNickName(
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId);

}
