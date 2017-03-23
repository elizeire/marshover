package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 */
public class Position {

	public Position(String position) {
		String[] split = position.split(" ");
		this.x = Integer.parseInt(split[0]);
		this.y = Integer.parseInt(split[1]);
		this.cardinalPoint = CardinalPoint.getByCharacter(split[2].charAt(0));
	}

	private int x;
	private int y;
	private CardinalPoint cardinalPoint;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public CardinalPoint getCardinalPoint() {
		return cardinalPoint;
	}


}
