package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "sport", "gamecode"})
@XmlRootElement(name = "game")
@XmlType(propOrder = {"id", "sport", "gamecode"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Game {
    @JsonProperty
    @XmlAttribute
    private long id = 0;
    @JsonProperty
    @XmlElement(name = "sport")
    private Sport sport;
    @JsonProperty
    @XmlElement(name = "gamecode")
    private float gamecode;


    public Game() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public float getGamecode() {
        return gamecode;
    }

    public void setGamecode(float gamecode) {
        this.gamecode = gamecode;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", sport=" + sport +
                ", gamecode=" + gamecode +
                '}';
    }
}
