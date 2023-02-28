package com.openbootcamp.Interfaces;

import com.openbootcamp.Coche;
import com.openbootcamp.CocheHibrido;
import com.openbootcamp.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche deportivo");
    }

}
