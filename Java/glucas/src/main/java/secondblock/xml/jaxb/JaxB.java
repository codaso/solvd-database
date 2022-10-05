package com.lucas.solvd.secondblock.xml.jaxb;

import com.lucas.solvd.secondblock.models.Country;
import com.lucas.solvd.secondblock.models.Player;
import com.lucas.solvd.secondblock.models.Stats;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

public class JaxB {
    private static JAXBContext context;

    public void marshaller(Object obj) throws JAXBException {
        String xmlName = obj.getClass().getSimpleName().toLowerCase();

        Marshaller marshaller = this.context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(obj, new File("src/main/resources/xml/" + xmlName + ".xml"));
    }

    public void unmarshaller(Object obj, String path) throws JAXBException {
        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new File(path));
        System.out.println("unmarshalled" + unmarshalled);
    }


    public static void main(String[] args) throws JAXBException {

        JaxB jaxB = new JaxB();


        Stats stats = new Stats();
        Country country = new Country("Argentina");
        stats.setId(1);
        stats.setGender("male");
        stats.setWeight(80.5);
        stats.setHeight(1.70);
        Date date = new Date();
        stats.setDate(date);
        Player player = new Player("Manu", "Ginobili", stats, country);
        player.setId(1);
        context = JAXBContext.newInstance(Player.class);

        jaxB.marshaller(player);
        String path = "src/main/resources/xml/player.xml";
        jaxB.unmarshaller(player, path);


        /*
        Country country = new Country("Argentina");
        Country country2 = new Country("Russia");
        Country country3 = new Country("Japan");
        country.setId(2);
        country2.setId(4);
        country3.setId(17);

        Game game = new Game();
        Game game2 = new Game();
        game.setId(1);
        game2.setId(2);
        List<Game> games = new ArrayList<>();
        games.add(game);
        games.add(game2);

         */


    }
}
