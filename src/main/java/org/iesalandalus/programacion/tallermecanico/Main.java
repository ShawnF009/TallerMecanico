package org.iesalandalus.programacion.tallermecanico;

import org.iesalandalus.programacion.tallermecanico.Controlador.Controlador;
import org.iesalandalus.programacion.tallermecanico.Controlador.IControlador;
import org.iesalandalus.programacion.tallermecanico.modelo.FabricaModelo;
import org.iesalandalus.programacion.tallermecanico.modelo.negocio.FabricaFuenteDatos;
import org.iesalandalus.programacion.tallermecanico.vista.FabricaVista;

public class Main {
    public static void main(String[] args) {
        IControlador controlador = new Controlador(FabricaModelo.CASCADA, FabricaFuenteDatos.FICHEROS, FabricaVista.TEXTO);
        controlador.comenzar();
    }
}
