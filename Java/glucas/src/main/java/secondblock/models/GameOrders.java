package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@JsonPropertyOrder({"id", "recordTime", "placement", "result", "game", "gameService"})
@XmlRootElement(name = "game")
@XmlType(propOrder = {"id", "recordTime", "placement", "result", "game", "gameService"})
public class GameOrders {
    @JsonProperty
    @XmlAttribute
    private long id;
    @JsonProperty
    @XmlElement(name = "recordTime")
    private String recordTime;
    @JsonProperty
    @XmlElement(name = "placement")
    private int placement;
    @JsonProperty
    @XmlElement(name = "result")
    private String result;
    @JsonProperty
    @XmlElement(name = "game")
    private Game game;
    @JsonProperty
    @XmlElement(name = "gameService")
    private GameService gameService;
}
