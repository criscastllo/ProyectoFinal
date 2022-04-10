/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrera;

/**
 *
 * @author Cristian Castillo
 */
public class Cuentas extends Alumno {
   private String cuentas;

public Cuentas(){

}

public Cuentas (String _cuentas){
this.setCuentas( _cuentas);
}

public Cuentas (String _nombre, String _apellido, String _cuentas, String _estado){
    this.setNombre(_nombre);
    this.setApellido(_apellido);
    this.setCuentas(_cuentas);
    this.setEstado(_estado);
}



 
public void setCuentas (String _cuentas){
this.cuentas = _cuentas;
}

public String getCuentas(){
return this.cuentas;
} 
    
}
