package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "name"})
@XmlRootElement(name = "country")
@XmlType(propOrder = {"id", "name"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Country {
    @JsonProperty
    @XmlAttribute
    private long id = 0;
    @JsonProperty
    @XmlElement
    private String name;

    public Country() {
    }

    public Country(String name) {
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
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
