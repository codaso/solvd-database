package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "player", "gold", "silver", "bronze", "totalpoints"})
@XmlRootElement(name = "medals")
@XmlType(propOrder = {"id", "player", "gold", "silver", "bronze", "totalpoints"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Medals {
    @JsonProperty
    @XmlAttribute
    private long id = 0;
    @JsonProperty
    @XmlElement(name = "player")
    private Player player;
    @JsonProperty
    @XmlElement(name = "gold")
    private int gold = 0;
    @JsonProperty
    @XmlElement(name = "silver")
    private int silver = 0;
    @JsonProperty
    @XmlElement(name = "bronze")
    private int bronze = 0;
    @JsonProperty
    @XmlElement(name = "totalpoints")
    private int totalPoints = 0;

    public Medals(int gold, int silver, int bronze) {
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public Medals() {
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    @Override
    public String toString() {
        return "Medals{" +
                "id=" + id +
                ", player=" + player +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", totalPoints=" + totalPoints +
                '}';
    }
}
