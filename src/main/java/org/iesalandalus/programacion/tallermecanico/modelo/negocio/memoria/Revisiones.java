package org.iesalandalus.programacion.tallermecanico.modelo.negocio.memoria;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Revision;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.time.LocalDate;

public class Revisiones {

    public Revisiones() {
    }
    public Revision get(){
        return new Revision();
    }
    public Revision get(Cliente cliente){
        return new Revision();
    }
    public Revision get(Vehiculo vehiculo){
        return new Revision();
    }
    public void insertar(Revision revision){
    }
    private Revision comprobarRevision(Cliente cliente, Vehiculo vehiculo, float precioMaterial){
        return new Revision();
    }
    public Revision añadirHoras(Revision revision, int horas){
        return new Revision();
    }
    private Revision getRevision(Revision revision){
        return new Revision();
    }
    public Revision añadirPrecioMaterial(Revision revision, float precioMaterial){
        return new Revision();
    }
    public Revision cerrar(Revision revision, LocalDate fechaFin){
        return new Revision();
    }
    public Revision buscar(Revision revision){
        return new Revision();
    }
    public void borrar(Revision revision){
    }
}
