/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.ws001.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author choco
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private String idpersona;
    private String idrol;
    private String fechacreacion;
    private String estado;
}
