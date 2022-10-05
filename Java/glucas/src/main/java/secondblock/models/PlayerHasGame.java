package com.lucas.solvd.secondblock.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;
import java.util.List;

@JsonPropertyOrder({"id", "playerList", "gameList"})
@XmlRootElement(name = "city")
@XmlType(propOrder = {"id", "playerList", "gameList"})
@XmlAccessorType(XmlAccessType.FIELD)
public class PlayerHasGame {
    @XmlAttribute
    @JsonProperty
    private long id;

    @XmlElementWrapper
    @XmlElementRef(name = "player", type = Player.class)
    @JsonProperty
    List<Player> playerList;
    @XmlElementWrapper
    @XmlElementRef(name = "game", type = Game.class)
    @JsonProperty
    List<Game> gameList;
}
