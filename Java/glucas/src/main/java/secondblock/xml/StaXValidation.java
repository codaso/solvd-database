package com.lucas.solvd.secondblock.xml;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;

public class StaXValidation {

    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        String pathXML = "src/main/resources/xml/validation/stats.xml";
        String pathXSD = "src/main/resources/xml/validation/stats.xsd";
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathXML));
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema xsd = factory.newSchema(new File(pathXSD));
            Validator validator = xsd.newValidator();
            validator.validate(new StAXSource(reader));
            System.out.println("stats.xml & stats.xsd ---> validated!");


            String pathXML2 = "src/main/resources/xml/validation/player.xml";
            String pathXSD2 = "src/main/resources/xml/validation/player.xsd";
            reader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathXML));
            factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            xsd = factory.newSchema(new File(pathXSD));
            validator = xsd.newValidator();
            validator.validate(new StAXSource(reader));
            System.out.println("player.xml & player.xsd ---> validated!");


            String pathXML3 = "src/main/resources/xml/validation/country.xml";
            String pathXSD3 = "src/main/resources/xml/validation/country.xsd";
            reader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathXML));
            factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            xsd = factory.newSchema(new File(pathXSD));
            validator = xsd.newValidator();
            validator.validate(new StAXSource(reader));
            System.out.println("country.xml & country.xsd ---> validated!");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
