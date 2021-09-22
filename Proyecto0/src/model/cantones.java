package model;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class cantones {

    List<Canton> list;

    public cantones(){
        list = new ArrayList<>();
    }

    public cantones(List<Canton> list) {
        setList(list);
    }

    public void add(Canton canton){
        list.add(canton);
    }

    @XmlElement(name = "canton")
    public List<Canton> getList() {
        return list;
    }

    public void setList(List<Canton> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CantonList{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}