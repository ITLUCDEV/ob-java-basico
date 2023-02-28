package com.openbootcamp.Interfaces;

import com.openbootcamp.Coche;
import com.openbootcamp.CocheElectrico;
import com.openbootcamp.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clasico");
    }

}
