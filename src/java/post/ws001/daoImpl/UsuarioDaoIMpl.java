/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.ws001.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import post.ws001.config.conexion;
import post.ws001.model.Usuario;
import post.ws001.dao.UsuarioDao;

/**
 *
 * @author choco
 */
public class UsuarioDaoIMpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Usuario esc) {
        String SQL = "INSERT INTO usuarios(username) VALUES(?, ?)";
        int x = 0;
        try {
            cx = conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getUsername());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;       
    }

    @Override
    public int update(Usuario esc) {
        String SQL = "UPDATE usuarios SET username=? WHERE idusuario=?";
        int x = 0;
        try {
            cx = conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, esc.getUsername());
            ps.setInt(2, esc.getIdusuario());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL = "DELETE FROM usuarios WHERE idusuario=?";
        int x = 0;
        try {
            cx = conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }
    @Override
    public Usuario read(int id) {
        String SQL = "SELECT *FROM usuarios WHERE idusuario=?";
        Usuario esc = new Usuario();
        try {
            cx = conexion.getConex();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                esc.setIdusuario(rs.getInt("idusuario"));
                esc.setUsername(rs.getString("username"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return esc;
    }

    @Override
    public List<Usuario> readAll() {
        String SQL = "SELECT *FROM usuarios";
        List<Usuario> lista = new ArrayList<>();
        try {
            cx = conexion.getConex();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Usuario esc = new Usuario();
                esc.setIdusuario(rs.getInt("idusuario"));
                esc.setUsername(rs.getString("username"));
                lista.add(esc);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
