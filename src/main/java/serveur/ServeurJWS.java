package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8081/calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("Service publié : " + url + "?wsdl");
    }
}