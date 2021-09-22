package model;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class distritos {

    List<Distrito> list;

    public distritos(){
        list = new ArrayList<>();
    }

    public distritos(List<Distrito> list) {
        this.list = list;
    }

    public void add(Distrito distrito){
        list.add(distrito);
    }

    @XmlElement(name = "distrito")
    public List<Distrito> getList() {
        return list;
    }

    public void setList(List<Distrito> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DistritoList{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}