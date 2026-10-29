package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice", targetNamespace = "http://service/")
public interface ICalculatrice {

    @WebMethod(operationName = "somme")
    double somme(@WebParam(name = "a") double a,
                 @WebParam(name = "b") double b);
}