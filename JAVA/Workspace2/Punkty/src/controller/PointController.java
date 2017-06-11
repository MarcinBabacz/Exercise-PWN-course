package controller;

import model.Punkt;

public class PointController {

	public void addX(Punkt punkt){
		punkt.setX(punkt.getX()+1);
	}
	public void minusX(Punkt punkt){
		punkt.setX(punkt.getX()-1);
	}
	public void addY(Punkt punkt){
		punkt.setY(punkt.getY()+1);
	}
	public void minusY(Punkt punkt){
		punkt.setY(punkt.getY()-1);
	}
}
