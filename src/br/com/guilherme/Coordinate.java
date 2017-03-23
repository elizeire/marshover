package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 * A simple point
 */
public class Coordinate {
	
	private int x;
	private int y;

	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
