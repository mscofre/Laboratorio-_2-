/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    //atributos
    
    private String marca, modelo, estado ;
    private int anio_fab;
    private boolean matriculado;

    public Vehiculo(String marca, String modelo, String estado, int anio_fab) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.anio_fab = anio_fab;
        this.matriculado = false;
    }
    
    //Getter and Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAnio_fab() {
        return anio_fab;
    }

    public void setAnio_fab(int anio_fab) {
        this.anio_fab = anio_fab;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    
    
    
    
    //metodos
    
    public void revisionVehicular(){
        if(anio_fab < 1996){
            estado = "usado malo";
        }else if(anio_fab < 2016){
            estado = "usado bueno";
        }else if (anio_fab < 2026 || (anio_fab < 2026 && estado.equalsIgnoreCase("nuevo"))){
            estado = "semi nuevo";
        }else {
            estado = "nuevo";
        }
    }
    
    public void matricular(){
        if (!estado.equalsIgnoreCase("usado malo")){
            matriculado = true;
            System.out.println("Vehiculo Matriculado!!");
        }else{
            System.out.println("No se puede matricular el vehiculo!!");
        }
    }
    
    public void mostrarDatos(){
        System.out.println("==DATOS DE MATRICULACION==");
        System.out.println("Marca: "+ marca );
        System.out.println("Modelo: "+ modelo);
        System.out.println("Estado: "+ estado);
        System.out.println("anio: "+ anio_fab);
        System.out.println("Matriculado: "+ (matriculado ? "Si ": "No"));
    }
    
}
