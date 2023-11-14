package com.mycompany.jakarta;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BooksMain {

    public static void main(String[] args) {
        try {
            JAXBContext contexto = JAXBContext.newInstance(     Catalog.class);
            Unmarshaller unmarshaller=contexto.createUnmarshaller();
            Catalog books=(Catalog)unmarshaller.unmarshal(new File("books.xml"));
            
            for (Book book : books.getBook()) {
                System.out.println(book.getId());
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor());
                System.out.println(book.getGenre());
                System.out.println(book.getPrice());
                System.out.println(book.getPublish_date());
                System.out.println(book.getDescription());
                
            }
        } catch (PropertyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException ex) {
            Logger.getLogger(BooksMain.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
