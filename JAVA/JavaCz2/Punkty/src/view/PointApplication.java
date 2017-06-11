package view;
import controller.PointController;
import controller.PointController3D;
import model.Punkt;
import model.Punkt3D;
public class PointApplication {

	
	public static void main(String[] args){
		Punkt po = new Punkt(45,67);
		Punkt3D p3D = new Punkt3D();
		PointController controller = new PointController();
		PointController3D controller3D = new PointController3D();
		controller.addX(po);
		System.out.println(po.getX());
		controller.addY(po);
		System.out.println(po.getY());
		controller.minusX(po);
		System.out.println(po.getX());
		controller.minusY(po);
		System.out.println(po.getY());
		controller3D.addX(p3D);
		controller3D.addX(po);
		
		
	}
}
