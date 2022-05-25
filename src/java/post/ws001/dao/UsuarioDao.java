/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.ws001.dao;
import java.util.List;
import post.ws001.model.Usuario;

/**
 *
 * @author choco
 */
public interface UsuarioDao {
    int create(Usuario esc);
    int update(Usuario esc);
    int delete(int id);
    Usuario read(int id);
    List<Usuario> readAll();
}
