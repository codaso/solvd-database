use olympic_games;

INSERT INTO Country (name) VALUES ("Argentina"),("Russia"),("Japan"),("Mexico"),("USA");

INSERT INTO City (name) VALUES ("Buenos Aires"),("Moscow"),("Tokyo"),("Monterrey"),("Detroit");

INSERT INTO Game (game_code) VALUES (12.9),(14.5),(9.8),(2.0),(2.1);

INSERT INTO Game_Service (game_code) VALUES (2.0),(2.1),(12.9),(14.5),(9.8);

INSERT INTO Medals (gold,silver,bronze,total_points) VALUES (0,2,1,3),(0,2,2,4),(2,3,0,5),(1,0,0,1),(2,2,2,6);

INSERT INTO Orders_Game (record_time,placement,result) VALUES ("15'20''",2,"2nd"),("14'59''",1,"1st"),("17'17''",3,"3rd");

INSERT INTO Player (name,lastname) VALUES ("Shaun","White"),("Michelle","Kwan"),("Gabrielle","Douglas"),("Thomas", "Daley"),("Yuna","Kim");

INSERT INTO Sport (name) VALUES ("Snowboard"),("Skating"),("Artistic gymnast"),("Trampoline jumper"),("Ice skating");

INSERT INTO Sport_type (season,is_single_player,female_only,mix_genders) VALUES ("Winter",true,false,true),("Summer",true,false,true)
,("Summer",true,true,false);

INSERT INTO Stadium (name,total_players) VALUES ("Panathinaiko Stadium",80000),("Louis Francis Field",19000),("Stockholm Olympic Stadium",33000);