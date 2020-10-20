import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.WebMethod;

@WebService(targetNamespace="http://www.polytech.fr")
public class serviceWeb {
	public String afficher() {
		return "bonjour";
	}
	@WebMethod(operationName="Convertir")
	public double somme(double a,double b) {
		return a+b;
	
	}
}
