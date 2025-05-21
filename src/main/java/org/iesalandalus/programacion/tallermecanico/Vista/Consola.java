package org.iesalandalus.programacion.tallermecanico.Vista;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Revision;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Consola {
    private String CADENA_FORMATO_FECHA;

    private Consola(){
        CADENA_FORMATO_FECHA = "dd/MM/yyyy HH:mm:ss";
    }
    public void mostrarCabecera(String mensaje){
        System.out.println("-------------------------------------------------");
        System.out.println(mensaje);
        System.out.println("-------------------------------------------------");
    }
    public void mostrarMenu(){
        System.out.println("1. Añadir vehículo");
        System.out.println("2. Listar vehículos");
        System.out.println("3. Buscar vehículo");
        System.out.println("4. Modificar vehículo");
        System.out.println("5. Borrar vehículo");
        System.out.println("6. Salir");
    }
    public Opcion elegirOpcion(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();
        return Opcion.valueOf(String.valueOf(opcion));
    }
    private int leerEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }
    private float leerReal(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextFloat();
    }
    private String leerCadena(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextLine();
    }
    private String leerFecha(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextLine();
    }
    public Cliente leerCliente(){
        String nombre = leerCadena("Nombre: ");
        String direccion = leerCadena("Dirección: ");
        String telefono = leerCadena("Teléfono: ");
        return new Cliente(leerCliente());
    }
    public Cliente leerClienteDni(){
        String dni = leerCadena("DNI: ");
        return new Cliente(leerClienteDni());
    }
    public String leerNuevoNombre(){
        return leerCadena("Nuevo nombre: ");
    }
    public String leerNuevoTelefono(){
        return leerCadena("Nuevo teléfono: ");
    }
    public Vehiculo leerVehiculo(){
        String matricula = leerCadena("Matrícula: ");
        String marca = leerCadena("Marca: ");
        String modelo = leerCadena("Modelo: ");
        String color = leerCadena("Color: ");
        float precio = leerReal("Precio: ");
        Cliente cliente = leerClienteDni();
        return new Vehiculo(matricula,marca,modelo);
    }
    public Vehiculo leerVehiculoMatricula(){
        String matricula = leerCadena("Matrícula: ");
        return new Vehiculo(CADENA_FORMATO_FECHA);
    }
    public Revision leerRevision(){
        String fecha = leerFecha("Fecha (dd/MM/yyyy HH:mm:ss): ");
        String descripcion = leerCadena("Descripción: ");
        float kilometraje = leerReal("Kilometraje: ");
        return new Revision(leerRevision());
    }
    public int leerHoras(){
        return leerEntero("Horas: ");
    }
    public float leerPrecioMaterial(){
        return leerReal("Precio del material: ");
    }
    public LocalDate leerFechaCierre(){
        return LocalDate.parse(leerFecha("Fecha de cierre (dd/MM/yyyy): "), DateTimeFormatter.ofPattern(CADENA_FORMATO_FECHA));
    }
}
