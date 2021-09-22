package model;

public class Distrito {
    int numero;
    String nombre;

    public Distrito() {
    }

    public Distrito(int numero, String nombre) {
        setNumero(numero);
        setNombre(nombre);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Distrito: %d \t %s", getNumero(), getNombre());
    }
}