package br.com.guilherme;


/**
 * 
 * @author guilherme
 *
 * Fluent: new Rover().landOn(plateau).atCoordinate(x,y).atOrientation(CardinalPoint.NORTH).moveForward().position();
 * 
 * 
 */
public class Rover {
	private Plateau plateau;
	private Coordinate currentCoordinate;
	private Compass compass;
	
	public Rover landOn(Plateau plateau) {
		this.plateau = plateau;
		return this;
	}

	public Rover atCoordinate(int x, int y) {
		this.currentCoordinate = plateau.coordinateOf(x, y);
		return this;
	}
	
	public Rover atOrientation(CardinalPoint orientation) {
		compass = new Compass(orientation);
		return this;
	}

	public Rover moveForward() {
		currentCoordinate = plateau.next(currentCoordinate, compass.getDirection());
		return this;
	}
	
	public void headingTo(Side side) {
		compass = compass.moveTo(side);
	}
	
	public Rover headingLeft() {
		headingTo(Side.LEFT);
		return this;
	}
	
	public Rover headingRight() {
		headingTo(Side.RIGHT);
		return this;
	}
	
	public Rover processInstructions(Instructions instructions) {
		for (Instruction instruction: instructions.getInstructions()) {
			instruction.bind(this);
			instruction.execute();
		}
		return this;
	}
	
	public String position() {
		return currentCoordinate.toString() + " " + String.valueOf(compass.getDirection().getAsChar());
	}
	
	public void printPosition() {
		System.out.println(position());
	}

}
