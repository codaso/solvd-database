package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.lucas.solvd.secondblock.xml.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@JsonPropertyOrder({"id", "gender", "birthdate", "height", "weight"})
@XmlRootElement(name = "stats")
@XmlType(propOrder = {"id", "gender", "birthdate", "height", "weight"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Stats {
    @JsonProperty
    @XmlAttribute
    private long id;
    @JsonProperty
    @XmlElement(name = "gender")
    private String gender = null;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement(name = "birthdate")
    private Date birthdate;
    @JsonProperty
    @XmlElement(name = "height")
    private double height = 00.00;
    @JsonProperty
    @XmlElement(name = "weight")
    private double weight = 00.00;

    public Stats() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return birthdate;
    }

    public void setDate(Date date) {
        this.birthdate = date;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
