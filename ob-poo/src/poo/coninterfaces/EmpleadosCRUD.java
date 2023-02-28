package poo.coninterfaces;

import poo.sininterfaces.Empleado;
import java.util.List;

/**
 * Se declaran los métodos, no se implementan
 *
 * Funciona como un contrato, dice lo que hay que hacer pero no lo hace
 */
public interface EmpleadosCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
