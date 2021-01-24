package com.java.designpattern.bridge;

public class ComponentB extends Component {

	public ComponentB(Task task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Component B  Move");
			task.move();
	}

}
