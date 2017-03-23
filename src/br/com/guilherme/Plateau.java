package br.com.guilherme;

/**
 * 
 * @author guilherme
 *
 */
public class Plateau {
	private int x;
	private int y;

	private Coordinate [][] positions;

	private void initPositions() {
		this.positions = new Coordinate[x+1][y+1]; //increment 1 because 0,0 address is valid in this problem.
		//build the grid
		for (int x = 0; x < positions.length; x++) {
			for (int y = 0; y < positions[x].length; y++) {
				positions[x][y] = new Coordinate(x, y);
			}
		}
	}

	public Plateau(int x, int y) {
		this.x = x;
		this.y = y;
		this.initPositions();
	}

	public Coordinate coordinateOf(int x, int y) {
		if (x > this.x || x < 0) {
			throw new IllegalArgumentException("Cannot move out of the plateau! Position X is out of bound: "+x);
		}
		if (y > this.y || y < 0) {
			throw new IllegalArgumentException("Cannot move out of the plateau! Position Y is out of bound: "+y);
		}
		return positions[x][y];
	}
//	   w
//  s	  n
//     e
	/**
	 * Perform the next point from the current point in the specified direction.
	 */
	public Coordinate next(Coordinate current, CardinalPoint direction) {
		switch (direction) {
		case EAST: {
			return coordinateOf(current.getX()+1, current.getY());
		}
		case NORTH: {
			return coordinateOf(current.getX(), current.getY()+1); //;-)
		} 
		case SOUTH: {
			return coordinateOf(current.getX(), current.getY()-1);
		}
		case WEST: {
			return coordinateOf(current.getX()-1, current.getY());
		}
		}
		return null;
	}

}
