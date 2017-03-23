package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 */
public enum CardinalPoint {
	NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');

	private char c;
	private CardinalPoint(char c) {
		this.c = c;
	}
	
	public static CardinalPoint getByCharacter(char c) {
		switch (Character.toUpperCase(c)) {
		case 'N': {
			return NORTH;
		} 
		case 'S': {
			return SOUTH;
		} 
		case 'E': {
			return EAST;
		}
		case 'W': {
			return WEST;
		}
		default: {
			throw new IllegalArgumentException("Invalid character to build a cardinal direction: "+c);
		}
		}
	}

	public char getAsChar() {
		return c;
	}
}
