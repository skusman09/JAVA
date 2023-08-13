package withoutXml_Using_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(SpringConfig2.class);
		Sim sim1 = apc.getBean("sm", Sim.class);
		sim1.showSim();

		Mobile mob1 = apc.getBean("mbl", Mobile.class);
		mob1.showMobile();

		Cover cov1 = apc.getBean("cov", Cover.class);
		cov1.showCover();

		((AnnotationConfigApplicationContext) apc).close();
	}
}
