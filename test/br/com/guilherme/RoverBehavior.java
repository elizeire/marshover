package br.com.guilherme;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author guilherme
 *
 */
public class RoverBehavior {

	@Test
	public void shouldWalkAStepToNorth() {
		Plateau plateau = new Plateau(5, 5);
		Rover robot = new Rover().landOn(plateau).atCoordinate(1, 2).atOrientation(CardinalPoint.NORTH);
		robot.moveForward();
		Assert.assertEquals("1 3 N", robot.position());
	}
	
	@Test
	public void shouldWalkAStepToSouth() {
		Plateau plateau = new Plateau(5, 5);
		Rover robot = new Rover().landOn(plateau).atCoordinate(1, 2).atOrientation(CardinalPoint.SOUTH);
		robot.moveForward();
		Assert.assertEquals("1 1 S", robot.position());
	}
	
	@Test
	public void shouldWalkAStepToWest() {
		Plateau plateau = new Plateau(5, 5);
		Rover robot = new Rover().landOn(plateau).atCoordinate(1, 2).atOrientation(CardinalPoint.WEST);
		robot.moveForward();
		Assert.assertEquals("0 2 W", robot.position());
	}
	
	@Test
	public void shouldWalkAStepToEast() {
		Plateau plateau = new Plateau(5, 5);
		Rover robot = new Rover().landOn(plateau).atCoordinate(1, 2).atOrientation(CardinalPoint.EAST);
		robot.moveForward();
		Assert.assertEquals("2 2 E", robot.position());
	}
	
	@Test
	public void shouldPass1() {
		Plateau plateau = new Plateau(5, 5); //LMLMLMLMM
		Rover robot = new Rover().landOn(plateau).atCoordinate(1, 2).atOrientation(CardinalPoint.NORTH);
		robot.headingLeft().moveForward().headingLeft().moveForward().headingLeft().moveForward().headingLeft().moveForward().moveForward();
		Assert.assertEquals("1 3 N", robot.position());
	}
	
	@Test
	public void shouldPass2() {
		Plateau plateau = new Plateau(5, 5); //MMRMMRMRRM
		Rover robot = new Rover().landOn(plateau).atCoordinate(3, 3).atOrientation(CardinalPoint.EAST);
		robot.moveForward().moveForward().headingRight().moveForward().moveForward().headingRight().moveForward().headingRight().headingRight().moveForward();
		Assert.assertEquals("5 1 E", robot.position());
	}
	
}
