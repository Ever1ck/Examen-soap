/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package post.ws001.test;

import post.ws001.config.conexion;

/**
 *
 * @author choco
 */
public class Test {
    
    public static void main(String [] args) {
        if(conexion.getConex()!=null){
        System.out.print("Conectado");
        }else{
            System.out.print("No Conectado");
        }
    }
}
