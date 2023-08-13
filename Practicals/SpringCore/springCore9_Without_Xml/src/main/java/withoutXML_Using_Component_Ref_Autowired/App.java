package withoutXML_Using_Component_Ref_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(SpringConfig4.class);
		Building bldgObj = apc.getBean("bldg", Building.class);
		bldgObj.showBuilding();

		Wing wingObj = apc.getBean("wng", Wing.class);
		wingObj.showWing();

		Flats flatObj = apc.getBean("flts", Flats.class);
//		flatObj.setNumOfFlat("2BHK OR 3BHk");
		flatObj.showFlats();

		((AbstractApplicationContext) apc).close();
	}
}
