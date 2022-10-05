package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "name", "sportType"})
@XmlRootElement(name = "sport")
@XmlType(propOrder = {"id", "name", "sportType"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Sport {
    @JsonProperty
    @XmlAttribute
    private long id;
    @JsonProperty
    @XmlElement(name = "name")
    private String name;

    @JsonProperty
    @XmlElement(name = "sportType")
    private SportType sportType;

    public Sport() {
    }

    public Sport(String name, String season) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
