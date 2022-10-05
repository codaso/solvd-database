SELECT city.name,city.id, country.name
FROM city
LEFT JOIN country
ON city.country_id=country.id
GROUP BY country.id
HAVING city.id>1;

SELECT city.name, stadium.id
FROM city
RIGHT JOIN country
ON stadium.id=city.id
GROUP BY city.id
HAVING stadium.id<100;

SELECT Sport.name,sport_type.season
from sport
LEFT JOIN sport_type
ON Sport.id=36
GROUP BY sport.id
HAVING sport_type.season="Summer";

SELECT stadium.name,City.name
from stadium
LEFT JOIN City
ON stadium.total_players=80000
GROUP BY stadium.id
HAVING stadium.id>1;


SELECT game.game_code,game_service.game_code
FROM game
RIGHT JOIN game_service
ON game.game_code=game_service.game_code
GROUP BY game.id;

SELECT Player.name,Player.id
FROM player
GROUP BY player.lastname;

SELECT player.name
FROM player
RIGHT JOIN Country
ON player.id=country.id
GROUP BY player.name;

