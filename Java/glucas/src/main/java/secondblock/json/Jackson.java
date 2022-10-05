package com.lucas.solvd.secondblock.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucas.solvd.secondblock.models.*;

import java.io.File;

public class Jackson {


    public static void main(String[] args) {


        //JSON parsing using jackson
        ObjectMapper om = new ObjectMapper();
        try {
            Player player = (Player) om.readValue(new File("src/main/resources/json/player.json"), Player.class);
            Country country = (Country) om.readValue(new File("src/main/resources/json/country.json"), Country.class);
            Medals medals = (Medals) om.readValue(new File("src/main/resources/json/medals.json"), Medals.class);
            Sport sport = (Sport) om.readValue(new File("src/main/resources/json/sport.json"), Sport.class);
            Stats stats = (Stats) om.readValue(new File("src/main/resources/json/stats.json"), Stats.class);
            System.out.println(player);
            System.out.println(country);
            System.out.println(medals);
            System.out.println(sport);
            System.out.println(stats);
            SportType sportType = om.readValue(new File("src/main/resources/json/sport_type.json"), SportType.class);
            System.out.println(sportType);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
