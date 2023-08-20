package Animales;

public class Gato extends Animal{

    Boolean tieneGarras;

    public Gato(String nombre, String color, double peso, double tamanio, Boolean tieneGarras){
        super(nombre, color, peso, tamanio);
        this.tieneGarras = tieneGarras;
    }



    @Override
    public String moverse(){
        return "El gato corre";
    }


}
