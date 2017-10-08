import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Node {
	private double weight;
	private Node parent;
	private Point self;
	private int steps;
	
	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

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
	
	public Node(Point p, Node n, double w, int s) {
		this.parent=n;
		this.self=p;
		this.weight=w;
		this.steps=s;
		
	}
	
	public boolean inopen(PriorityQueue<Node> queue) {
		boolean val = false;
		for(Node e: queue) {
			if (this.getSelf().equals(e.getSelf())) {
				val = true;
			}
		}
		return val;
	}
	
	public boolean invisited(ArrayList<Node> array) {
		boolean val = false;
		for(Node e: array) {
			if (this.getSelf().equals(e.getSelf())) {
				val = true;
			}
		}
		return val;
	}
}
