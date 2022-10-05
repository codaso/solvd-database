package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;

@JsonPropertyOrder({"id", "season", "is_single_player", "female_only", "mix_genders"})
@XmlRootElement(name = "sport_type")
@XmlType(propOrder = {"id", "season", "is_single_player", "female_only", "mix_genders"})
@XmlAccessorType(XmlAccessType.FIELD)
public class SportType {
    @JsonProperty
    @XmlAttribute
    private long id;
    @JsonProperty
    @XmlElement(name = "season")
    private String season;
    @JsonProperty
    @XmlElement(name = "is_single_player")
    private boolean isSinglePlayer;
    @JsonProperty
    @XmlElement(name = "female_only")
    private boolean femaleOnly;
    @JsonProperty
    @XmlElement(name = "mix_genders")
    private boolean mixGenders;

    public SportType(String season, boolean isSinglePlayer, boolean femaleOnly, boolean mixGenders) {
        this.season = season;
        this.isSinglePlayer = isSinglePlayer;
        this.femaleOnly = femaleOnly;
        this.mixGenders = mixGenders;
    }

    public SportType() {
    }

    public long getId() {
        return id;
    }

    public String getSeason() {
        return season;
    }

    public boolean isSinglePlayer() {
        return isSinglePlayer;
    }

    public boolean isFemaleOnly() {
        return femaleOnly;
    }

    public boolean isMixGenders() {
        return mixGenders;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setSinglePlayer(boolean singlePlayer) {
        isSinglePlayer = singlePlayer;
    }

    public void setFemaleOnly(boolean femaleOnly) {
        this.femaleOnly = femaleOnly;
    }

    public void setMixGenders(boolean mixGenders) {
        this.mixGenders = mixGenders;
    }


    @Override
    public String toString() {
        return "SportType{" +
                "id=" + id +
                ", season='" + season + '\'' +
                ", isSinglePlayer=" + isSinglePlayer +
                ", femaleOnly=" + femaleOnly +
                ", mixGenders=" + mixGenders +
                '}';
    }
}
