/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.pe.ws001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.pe.ws001.dao.EscuelaDao;
import pe.edu.pe.ws001.daoImpl.EscuelaDaoIMpl;
import pe.edu.pe.ws001.model.Escuela;

/**
 *
 * @author choco
 */
@WebService(serviceName = "EscuelaWebService")
public class EscuelaWebService {

    /**
     * Web service operation
     */
    EscuelaDao escuelaDao = new EscuelaDaoIMpl();
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return escuelaDao.create(new Escuela(0,nombre));
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idescuela") int idescuela, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return escuelaDao.update(new Escuela(idescuela, nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuelaDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Escuela read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuelaDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reaAll")
    public List<Escuela> readAll() {
        //TODO write your implementation code here:
        return escuelaDao.readAll();
    }
}
