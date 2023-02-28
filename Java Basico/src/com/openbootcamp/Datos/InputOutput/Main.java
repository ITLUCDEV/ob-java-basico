package com.openbootcamp.Datos.InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("D:\\LUCDEV\\openbootcamp");
            try{
                byte []datos = fichero.readAllBytes();
                for(byte dato : datos){
                    System.out.println((char) dato);
                }
            }catch(IOException e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("Oye, que el programa da error: " + e.getMessage());
        }
    }

}
