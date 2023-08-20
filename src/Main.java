import Animales.Delfin;
import Animales.Gato;


import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //METODO PRINCIPAL
        /* String nombre = "Lara";
        int edad = 25;
        final double ALTURA = 1.75;

        String dias [] = new String[7];

        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miércoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sábado";


       // System.out.println(dias[3]);

        //for (int i = 0; i < dias.length; i++){
            //if(i % 2!=0) System.out.println(dias[i]);

        //}
        int i = 0;
        while (i < dias.length){
            if(i % 2!=0) System.out.println(dias[i]);
                i++;

        }



        //System.out.println("Hola, me llamo " + nombre + ", tengo " + edad +
        //" años, y mido " + ALTURA);

         */

        //Creación de animales
        Gato gatito = new Gato("Ema", "blanco", 3.25, 0.30, false);
        Delfin delf = new Delfin("Luis", "gris", 30, 0.75);

        System.out.println("Mi gata se llama " + gatito.getNombre());
        System.out.println(gatito.moverse());


        System.out.println("El delfin se llama " + delf.getNombre() + ", y es de color " + delf.getColor());
        System.out.println(delf.moverse());
    }
}