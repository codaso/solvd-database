
SELECT game.id, game.game_code, sport.id
FROM game
INNER JOIN sport
WHERE game.sport_id=sport.id;


SELECT game.id, game.game_code, sport.id
FROM game
LEFT JOIN sport
ON game.sport_id=sport.id;

SELECT game.id, game.game_code, sport.id
FROM game
RIGHT JOIN sport
ON game.sport_id=sport.id;

SELECT city.name,city.id, country.name
FROM city
LEFT JOIN country
ON city.country_id=country.id;

