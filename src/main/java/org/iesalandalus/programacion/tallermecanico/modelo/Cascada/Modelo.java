package org.iesalandalus.programacion.tallermecanico.modelo.Cascada;


import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Revision;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.time.LocalDate;


public class Modelo {
    public Modelo() {
    }
    public void comenzar() {
        System.out.println("El vehículo se ha comenzado correctamente.");
    }
    public void terminar() {
    System.out.println("El vehículo se ha parado correctamente.");
    }
    public void insertar(Cliente cliente) {
        System.out.println("El cliente se ha insertado correctamente.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Vehiculo vehiculo) {
        System.out.println("El vehículo se ha insertado correctamente.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void insertar(Revision revision) {
        System.out.println("La revisión se ha insertado correctamente.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String buscar(Cliente cliente){
        System.out.println("El cliente se ha buscado correctamente.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String buscar(Vehiculo vehiculo){
        System.out.println("El vehículo se ha buscado correctamente.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Revision buscar(Revision revision){
        System.out.println("La revisión se ha buscado correctamente.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Cliente modificar(String nombre){
        System.out.println("El cliente se ha modificado correctamente.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Revision añadirHoras(Revision revision, int horas){
        System.out.println("Se han añadido " + horas + " horas a la revisión.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Revision añadirPrecioMaterial(Revision revision, float precioMaterial){
        System.out.println("Se ha añadido el material con un precio de " + precioMaterial + " euros a la revisión.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Revision cerrar(Revision revision, LocalDate fechaFin){
        System.out.println("La revisión se ha cerrado correctamente.");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String borrar(){
        System.out.println("El cliente se ha borrado correctamente.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String borrar(Vehiculo vehiculo){
        System.out.println("El vehículo se ha borrado correctamente.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void borrar(Revision revision){
        System.out.println("La revisión se ha borrado correctamente.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getClientes(){
        System.out.println("Se han obtenido los clientes correctamente.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getVehiculos(){
        System.out.println("Se han obtenido los vehículos correctamente.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getRevisiones(){
        System.out.println("Se han obtenido las revisiones correctamente.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getRevisiones(Cliente cliente){
        System.out.println("Se han obtenido las revisiones del cliente correctamente.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getRevisiones(Vehiculo vehiculo){
        System.out.println("Se han obtenido las revisiones del vehículo correctamente.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
