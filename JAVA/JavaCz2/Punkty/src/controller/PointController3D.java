package controller;

import model.Punkt3D;

public class PointController3D extends PointController{

	public void addZ(Punkt3D punkt){
		punkt.setZ(punkt.getY()+1);
	}
	public void minusZ(Punkt3D punkt){
		punkt.setZ(punkt.getY()-1);
	}
	
}
