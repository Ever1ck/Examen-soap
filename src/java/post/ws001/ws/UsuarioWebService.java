/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package post.ws001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import post.ws001.dao.UsuarioDao;
import post.ws001.daoImpl.UsuarioDaoIMpl;
import post.ws001.model.Usuario;

/**
 *
 * @author choco
 */
@WebService(serviceName = "PostWebService")
public class UsuarioWebService {

    /**
     * Web service operation
     */
    UsuarioDao usuarioDao = new UsuarioDaoIMpl();
    @WebMethod(operationName = "crear")
    public int crear(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        return usuarioDao.create(new Usuario(0,username, password));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idusuario") int idusuario, @WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        return usuarioDao.update(new Usuario(idusuario, username));
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
    public Usuario read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return escuelaDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readAll")
    public List<Usuario> readAll() {
        //TODO write your implementation code here:
        return escuelaDao.readAll();
    }

}
