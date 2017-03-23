package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 */
public enum Side {
	LEFT, RIGHT;
	
	public Side getByCharacter(char c) {
		switch (Character.toUpperCase(c)) {
		case 'L': {
			return LEFT;
		} 
		case 'R': {
			return RIGHT;
		} 
		default: {
			throw new IllegalArgumentException("Invalid character to build a side: "+c);
		}
		}
	}
}
