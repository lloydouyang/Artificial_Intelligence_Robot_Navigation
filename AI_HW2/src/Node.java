import java.awt.*;
import java.util.List;
import java.util.PriorityQueue;

public class Node {
	private double weight;
	private Node parent;
	private Point self;
	private int steps;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Point getSelf() {
		return self;
	}

	public void setSelf(Point self) {
		this.self = self;
	}
	
	public Node() {
		
	}
}
