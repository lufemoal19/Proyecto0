package jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JAXBParser {

    public void marshall(Object object, String file){
        try{
            // JAXBContext instance
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            // Marshaller instance
            Marshaller marshaller = context.createMarshaller();
            // Output stream property -> XNL file format: file.xml
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object,new FileOutputStream(file));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object unmarshall(Object objectReference,String filename){
        Object object = null;
        try{
            // charging the XML file to read
            File file = new File(filename);
            // JAXBContext instance
            JAXBContext context = JAXBContext.newInstance(objectReference.getClass());
            // Unmarshall instance
            Unmarshaller unmarshaller = context.createUnmarshaller();
            // Unmarshall method
            object = unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return object;
    }
}
