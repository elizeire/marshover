package br.com.guilherme;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author guilherme
 *
 */
public class CompassBehavior {

	@Test
	public void shouldChangeCardinalDirection() {
		Compass compass = new Compass(CardinalPoint.NORTH);
		compass.left().left().left().left();
		Assert.assertEquals(CardinalPoint.NORTH, compass.getDirection());
		
		Compass compass2 = new Compass(CardinalPoint.EAST);
		compass2.right().right().right().right();
		Assert.assertEquals(CardinalPoint.EAST, compass2.getDirection());

	}
}
