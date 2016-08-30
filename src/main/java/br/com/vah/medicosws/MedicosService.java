package br.com.vah.medicosws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by jairoportela on 30/08/2016.
 */
@WebService(name = "medicos.svc")
public class MedicosService {

  @WebMethod
  public String sayHello(String name) {
    return String.format("Hello, %s", name);
  }
}
