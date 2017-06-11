package view;
import model.Punkt;
import controller.PointController;
public class PointApplication {

	
	public static void main(String[] args){
		Punkt po = new Punkt(45,67);
		PointController controller = new PointController();
		controller.addX(po);
		System.out.println(po.getX());
		controller.addY(po);
		System.out.println(po.getY());
		controller.minusX(po);
		System.out.println(po.getX());
		controller.minusY(po);
		System.out.println(po.getY());
	}
}
