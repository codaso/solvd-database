package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonPropertyOrder({"id", "gamecode"})
@XmlRootElement(name = "game")
@XmlType(propOrder = {"id", "gamecode"})

public class GameService {
    @JsonProperty
    @XmlAttribute
    private int id;
    @JsonProperty
    @XmlElement(name = "gamecode")
    private float gamecode;
}
