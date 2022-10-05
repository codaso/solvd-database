package com.lucas.solvd.secondblock.xml.staxparser;

import javax.xml.stream.XMLStreamException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;

public class DriverStaXHandler {
    public static final String FILE_PATH = "src/main/resources/xml/player.xml";

    public static String indentationXML(int indentation, String rawxml) throws TransformerException {
        //this method indents the raw xml taken from StaXHandler class
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute("indent-number", indentation);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StreamResult streamResult = new StreamResult(new StringWriter());
        transformer.transform(new StreamSource(new StringReader(rawxml)), streamResult);

        return streamResult.getWriter().toString();
    }

    public static void main(String[] args) throws XMLStreamException, FileNotFoundException, TransformerException {
        System.out.println(indentationXML(4, new StaXHandler().processXMLFile(new File(FILE_PATH)).toString()));
    }
}
