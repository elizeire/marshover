package br.com.guilherme;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author guilherme
 * 
 * It is called Compass, it work almost as a compass but it isnt a compass :)
 */
public class Compass {

	private static  Map<CardinalPoint, CardinalPair> hashDirections = new HashMap<CardinalPoint, CardinalPair>();

	/*
	 * if i know the right and left's side of each direction, i know everything to solve it!
	 */
	static {
		hashDirections.put(CardinalPoint.NORTH, new CardinalPair(CardinalPoint.WEST, CardinalPoint.EAST));
		hashDirections.put(CardinalPoint.WEST, new CardinalPair(CardinalPoint.SOUTH, CardinalPoint.NORTH));
		hashDirections.put(CardinalPoint.SOUTH, new CardinalPair(CardinalPoint.EAST, CardinalPoint.WEST));
		hashDirections.put(CardinalPoint.EAST, new CardinalPair(CardinalPoint.NORTH, CardinalPoint.SOUTH));
	}


	private CardinalPoint direction;

	public Compass(CardinalPoint direction) {
		this.direction = direction;
	}

	public CardinalPoint getDirection() {
		return direction;
	}

	public Compass moveTo(Side side) {
		this.direction = hashDirections.get(this.getDirection()).at(side).getDirection();
		return this;
	}

	public Compass right() {
		return moveTo(Side.RIGHT);
	}
	
	public Compass left() {
		return moveTo(Side.LEFT);
	}


	private static class CardinalPair {

		private CardinalPoint leftDirection;
		private CardinalPoint rightDirection;

		public CardinalPair(CardinalPoint leftDirection, CardinalPoint rightDirection) {
			this.leftDirection = leftDirection;
			this.rightDirection = rightDirection;
		}

		public Compass at(Side side) {
			if (side == Side.LEFT) {
				return left();
			} else if (side == Side.RIGHT) {
				return right();
			}
			return null;
		}

		public Compass right() {
			return new Compass(this.rightDirection);
		}

		public Compass left() {
			return new Compass(this.leftDirection);
		}


	}

}
