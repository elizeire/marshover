package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 */
public class UpperRightCoordinate {
	public UpperRightCoordinate(String upperRightCoordinate) {
		String[] split = upperRightCoordinate.split(" ");
		this.x = Integer.parseInt(split[0]);
		this.y = Integer.parseInt(split[1]);
	}

	private int x;
	private int y;


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
