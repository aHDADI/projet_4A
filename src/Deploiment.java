import javax.xml.ws.Endpoint;

public class Deploiment {
public static void main(String[] args) {
	String url = "http://localhost:9090/";
	Endpoint.publish(url, new serviceWeb());
	System.out.println("http://localhost:9090/?wsdl");
}
}
