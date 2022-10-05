package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "name", "country"})
@XmlRootElement(name = "city")
@XmlType(propOrder = {"id", "name", "country"})
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
    @JsonProperty
    @XmlAttribute
    private long id;
    @JsonProperty
    @XmlElement(name = "name")
    private String name;
    @JsonProperty
    @XmlElement(name = "country")
    private Country country;

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public City() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}

