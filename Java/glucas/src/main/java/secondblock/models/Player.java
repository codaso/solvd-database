package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "name", "lastname", "stats", "country"})
@XmlRootElement(name = "player")
@XmlType(propOrder = {"id", "name", "lastname", "stats", "country"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Player {
    @JsonProperty
    @XmlAttribute
    private long id = 0;
    @JsonProperty
    @XmlElement(name = "name")
    private String name;
    @JsonProperty
    @XmlElement(name = "lastname")
    private String lastname;
    @JsonProperty
    @XmlElement(name = "stats")
    private Stats stats;
    @JsonProperty
    @XmlElement(name = "country")
    private Country country;

    public Player(String name, String lastname, Stats stats, Country country) {
        this.name = name;
        this.lastname = lastname;
        this.stats = stats;
        this.country = country;
    }

    public Player() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }


    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", stats=" + stats +
                ", country=" + country +
                '}';
    }
}
