/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrera;

/**
 *
 * @author Cristian Castillo
 */
public class Alumno {
    private String nombre;
private String apellido;
private String estado;

public Alumno(){
}
public Alumno(String _nombre, String _apellido, String _estado){
this.setNombre(_nombre);
this.setApellido(_apellido);
this.setEstado(_estado);
}

public void setNombre (String _nombre){
	this.nombre = _nombre;
}

public void setApellido (String _apellido){
this.apellido = _apellido;
}
public void setEstado (String _estado){
this.estado = _estado;
}

public String getNombre(){
return this.nombre;
}

public String getApellido(){
return this.apellido;
}

public String getEstado(){
    return this.estado;
}
}
