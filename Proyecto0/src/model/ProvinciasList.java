package model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "data")
public class ProvinciasList {

    List<Provincia> list;

    public ProvinciasList() {
        list = new ArrayList<>();
    }

    public ProvinciasList(List<Provincia> provinciaList) {
        setList(provinciaList);
    }

    public void add(Provincia provincia) {
        list.add(provincia);
    }

    @XmlElement(name = "provincias")
    public List<Provincia> getList() {
        return list;
    }

    public void setList(List<Provincia> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ProvinciasList{" +
                "list=" + list +
                '}';
    }
}