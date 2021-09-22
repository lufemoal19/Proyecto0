package model;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    int numero;
    String nombre;

    List<Canton> cantones = new ArrayList<>();

    public Provincia() {
    }

    public Provincia(int id,String nombre, List<Canton> cantones) {
        setNumero(id);
        setNombre(nombre);
        setCantones(cantones);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void add(Canton canton){
        cantones.add(canton);
    }

    @XmlElement(name = "cantones")
    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    @Override
    public String toString() {
        return String.format("Provincia: %d %s %n %s %n", getNumero(),getNombre(),getCantones());
    }
}