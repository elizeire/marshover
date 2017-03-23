package br.com.guilherme;

import org.junit.Test;

/**
 * 
 * @author guilherme
 *
 */
public class PlateauBehavior {

	@Test(expected=IllegalArgumentException.class)
	public void shouldGotAnIllegalArgumentExceptionGoingOutOfBoundX() {
		Plateau plateau = new Plateau(5, 5);
		plateau.coordinateOf(6, 5);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldGotAnIllegalArgumentExceptionGoingOutOfBoundY() {
		Plateau plateau = new Plateau(5, 5);
		plateau.coordinateOf(5, 7);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldGotAnIllegalArgumentExceptionGoingOutOfBoundBoth() {
		Plateau plateau = new Plateau(5, 5);
		plateau.coordinateOf(6, 7);
	}
}
