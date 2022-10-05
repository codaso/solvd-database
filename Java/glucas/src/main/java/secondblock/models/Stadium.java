package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "name", "total_players", "city", "game"})
@XmlRootElement(name = "stadium")
@XmlType(propOrder = {"id", "name", "total_players", "city", "game"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Stadium {
    @JsonProperty
    @XmlAttribute(name = "id")
    private long id;
    @JsonProperty
    @XmlElement(name = "name")
    private String name;
    @JsonProperty
    @XmlElement(name = "total_players")
    private int totalPlayers;
    @JsonProperty
    @XmlElement(name = "city")
    private City city;
    @JsonProperty
    @XmlElement(name = "game")
    private Game game;

}
