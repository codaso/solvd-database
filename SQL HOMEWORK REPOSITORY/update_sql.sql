
UPDATE game SET sport_id=(SELECT id FROM sport WHERE name="Snowboard") WHERE game.game_code=12.9;
UPDATE game SET sport_id=(SELECT id FROM sport WHERE name="Skating") WHERE game.game_code=2;
UPDATE game SET sport_id=(SELECT id FROM sport WHERE name="Artistic gymnast") WHERE game.game_code=14.5;
UPDATE game SET sport_id=(SELECT id FROM sport WHERE name="Trampoline jumper") WHERE game.game_code=9.8;
UPDATE game SET sport_id=(SELECT id FROM sport WHERE name="Ice skating") WHERE game.game_code=2.1;

UPDATE city SET country_id=(SELECT id FROM country WHERE name="Argentina") WHERE city.name="Buenos Aires";
UPDATE city SET country_id=(SELECT id FROM country WHERE name="Russia") WHERE city.name="Moscow";
UPDATE city SET country_id=(SELECT id FROM country WHERE name="Japan") WHERE city.name="Tokyo";
UPDATE city SET country_id=(SELECT id FROM country WHERE name="Mexico") WHERE city.name="Monterrey";
UPDATE city SET country_id=(SELECT id FROM country WHERE name="USA") WHERE city.name="Detroit";