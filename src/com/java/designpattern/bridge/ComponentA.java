package com.java.designpattern.bridge;

public class ComponentA extends Component {

	public ComponentA(Task task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Component A  Move");
			task.move();
	}

}
