package model;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

public class Canton {
    int numero;
    String nombre;
    List<Distrito> distritos = new ArrayList<>();

    public Canton() {
    }

    public Canton(int numero, String nombre, List<Distrito> distritos) {
        setNumero(numero);
        setNombre(nombre);
        setDistritos(distritos);
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

    public void add(Distrito distrito){
        distritos.add(distrito);
    }

    @XmlElement(name = "distritos")
    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }

    @Override
    public String toString() {
        return String.format("Canton: %d %s %n %s %n", getNumero(), getNombre(),getDistritos());
    }
}