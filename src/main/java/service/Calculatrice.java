package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(endpointInterface = "service.ICalculatrice",
        serviceName = "CalculatriceWS",
        portName = "CalculatricePort",
        targetNamespace = "http://service/")
public class Calculatrice implements ICalculatrice {

    @Override
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a,
                        @WebParam(name = "b") double b) {
        return a + b;
    }
}