package org.iesalandalus.programacion.tallermecanico.Controlador;

import org.iesalandalus.programacion.tallermecanico.Vista.eventos.Evento;
import org.iesalandalus.programacion.tallermecanico.vista.eventos.ReceptorEventos;

public interface IControlador extends ReceptorEventos {
    void comenzar();

    void terminar();

    void actualizar(Evento evento);
}
