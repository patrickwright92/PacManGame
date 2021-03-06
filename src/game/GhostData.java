package game;

import java.io.Serializable;

import aStarAlgorithm.Node;
import game.Enumeration.Direction;

public class GhostData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private Direction direction = Direction.NO_DIRECTION;
	
	public GhostData(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setPos(Node node) {
		y = node.getRow();
		x = node.getCol();
	}
}