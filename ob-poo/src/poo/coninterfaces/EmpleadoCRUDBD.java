package poo.coninterfaces;

import poo.sininterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDBD implements EmpleadosCRUD{


    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
