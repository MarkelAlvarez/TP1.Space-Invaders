package pr2.game.GameObjects.objects;

/*
* Juan Pablo Corella y Markel Alvarez (2ºB)
*/

import pr2.game.Game;
import pr2.game.GameObjects.*;

public class RegularShip extends AlienShip {

	public static String icono = "C";
	public static int life = 3;
	public static int puntos = 5;

	/*Inicializa los atributos de la clase*/
	public RegularShip (Game game, int x, int y) {

		super(game, x, y, life, puntos);
	}
	
	public RegularShip(Game game, int x, int y, int live, int cycles) {
		super(game, x, y, live, cycles);
	}

	@Override
	public boolean receiveMissileAttack(int damage) {

		getDamage(damage);
		return true;
	}

	@Override
	public boolean receiveShockWaveAttack(int damage) {

		getDamage(damage);
		return true;
	}
	
	/*
	@Override
	public void computerAction() {
		if(IExecuteRandomActions.canGenerateExplosiveShip(game)) {
			game.addObject(new ExplosiveShip(game, x, y, super.live, super.cyclesToMove));
			getDamage(super.live);
		}
	}
	*/
	
	/*GETS y SETS*/

	@Override
	public String toString() {

		return RegularShip.icono + super.toString();
	}

	public String getIcono() {

		return icono;
	}

	public void setIcono(String icono) {

		RegularShip.icono = icono;
	}
}