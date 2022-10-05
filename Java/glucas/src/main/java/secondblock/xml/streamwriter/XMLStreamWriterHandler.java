package com.lucas.solvd.secondblock.xml.streamwriter;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLStreamWriterHandler {
    String[][] tutorial = {{"factory method", "abstract factory"}, {"introduction to JMS", "point to point"}};

    public void writeXML(XMLStreamWriter xmlSW) throws XMLStreamException {
        //method that creates the start and end element, and also populates
        //in between, using a 2 dimensional array (or matrix), in this example is a 2x2 matrix,
        //using the method -> populateTopic(XMLStreamWriter, String, String[])
        xmlSW.writeStartDocument("1.0");
        //
        xmlSW.writeStartElement("channel");
        xmlSW.writeAttribute("name", "someAttribute");
        //populateTopic
        populateTopic(xmlSW, "Object Oriented Design Patterns", tutorial[0]);
        populateTopic(xmlSW, "Java Message Service", tutorial[1]);
        xmlSW.writeEndElement();
        //
        xmlSW.writeEndDocument();
        xmlSW.flush();
    }

    public void populateTopic(XMLStreamWriter xmlSW, String topic, String[] tutorial) throws XMLStreamException {
        xmlSW.writeStartElement("topic");
        xmlSW.writeAttribute("name", topic);
        int i = 0;
        while (i < tutorial.length) {
            xmlSW.writeStartElement("tutorial");
            xmlSW.writeCharacters(tutorial[i++]);
            xmlSW.writeEndElement();
        }
        xmlSW.writeEndElement();
    }
}
