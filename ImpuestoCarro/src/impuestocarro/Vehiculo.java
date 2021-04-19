/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestocarro;

/**
 *
 * @author User
 */
public class Vehiculo {
    private String marca, linea, modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static Vehiculo crearVehiculo(String marca, String linea, String modelo){
        return new Vehiculo(marca,linea,modelo);
    }
    public Vehiculo(){
    }
    public Vehiculo(String marca, String linea, String modelo){
    this.marca = marca;
    this.linea = linea;
    this.modelo = modelo;   
    }
}

