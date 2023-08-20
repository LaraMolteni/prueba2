package Animales;

public class Animal {
    //Caracteristicas de un animal
    String nombre;
    String color;
    double peso;
    double tamanio;

    //Definimos los metodos constructores

    public Animal(){

    }

    public Animal(String nombre, String color, double peso, double tamanio) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamanio = tamanio;
    }

    //Metodos getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
//Comportamientos de un animal

    //comer
    //dormir
    //moverse
    public String moverse(){
        return "El animal se esta moviendo";
    }
}

