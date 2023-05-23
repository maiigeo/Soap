/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    ArrayList<Usuarios> lisUsuarios = new ArrayList<>();

    Usuarios usuarios;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroADolar")
    public Double euroADolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros * 1.15;
    }

    @WebMethod(operationName = "Ingresar")
    public String ingresar(@WebParam(name = "usuario") String user, @WebParam(name = "contrase") String password) {

        String mensaje = null;
        usuarios = new Usuarios("Marilyn", "maii");
        lisUsuarios.add(usuarios);
        for (int i = 0; i < lisUsuarios.size(); i++) {
            if (lisUsuarios.get(i).getUsuario().equals(user)) {
                if (lisUsuarios.get(i).getUsuario().equals(user) && lisUsuarios.get(i).getPassword().equals(password)) {
                    mensaje = "Inicio sesión correctamente";
                } else {
                    mensaje = "Contraseña no coincide con su registro ";
                }
            } else {
                mensaje = "Este usuario no existe";
            }

        }
        return mensaje;

    }

    @WebMethod(operationName = "Sumar")
    public int Sumar(@WebParam(name = "Dato1") int dato1, @WebParam(name = "Dato2") int dato2) {
        return dato1 + dato2;

    }

    @WebMethod(operationName = "Restar")
    public int Restar(@WebParam(name = "Dato1") int dato1, @WebParam(name = "Dato2") int dato2) {
        return dato1 - dato2;

    }

    @WebMethod(operationName = "Multiplicar")
    public int Multiplicar(@WebParam(name = "Dato1") int dato1, @WebParam(name = "Dato2") int dato2) {
        return dato1 * dato2;

    }

    @WebMethod(operationName = "Dividir")
    public int Dividir(@WebParam(name = "Dato1") int dato1, @WebParam(name = "Dato2") int dato2) {
        return dato1 / dato2;

    }

    @WebMethod(operationName = "AreaC")
    public int AreaC(@WebParam(name = "Base") int base, @WebParam(name = "Altura") int altura) {
        return (base * altura) / 2;

    }

    @WebMethod(operationName = "GradosCaF")
    public int GradosCaF(@WebParam(name = "Grados") int grados) {
        return (grados * 9 / 5) + 32;

    }

    @WebMethod(operationName = "TeoremaPitagoras")
    public double TeoremaPitagoras(@WebParam(name = "Catetoa") int catetoa,@WebParam(name = "Catetob") int catetob){
        //double operacion=Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2));
        return Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2));

    }
}
