package main;

import jaxb.JAXBParser;
import model.*;

public class Main {
    public static void main(String[] args) {



        ProvinciasList provinciasList = new ProvinciasList();
        JAXBParser parser = new JAXBParser();
        provinciasList = (ProvinciasList) parser.unmarshall(new ProvinciasList(), "ProvinciasAnidadas.xml");

        //parser.marshall(provinciasList,"test.xml");

        System.out.println(provinciasList);
    }
}
