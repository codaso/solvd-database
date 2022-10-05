DELETE FROM Player WHERE id>1 AND id<100;

DELETE FROM City WHERE name="Buenos Aires";

DELETE FROM Country WHERE name="Argentina";

DELETE FROM Medals WHERE gold<1;

DELETE FROM Sport_type WHERE is_single_player=false;

DELETE FROM Stadium WHERE total_players<20000;

DELETE FROM Game WHERE id=1;

DELETE FROM Orders_game WHERE placement=3;

DELETE FROM Player_has_game WHERE id>5;

DELETE FROM Stats WHERE gender="female";