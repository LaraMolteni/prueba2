package Animales;

public class Delfin extends Animal{

    public Delfin (String nombre, String color, double peso, double tamanio){
        super(nombre, color, peso, tamanio);

    }

    @Override
    public String moverse(){
        return "El delfin nada";
    }


}