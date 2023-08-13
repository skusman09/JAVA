package withoutXml_Using_Bean;

import org.springframework.context.annotation.Bean;

//@Configuration // No Need To Write This When Using Bean
//@ComponentScan(basePackages = "withoutXml_Using_Bean") // No Need To Write This When Using Bean
public class SpringConfig2 {

	@Bean(name = { "cov", "covr", "cvr" })
	public Cover cover() {
		return new Cover();
	}

	@Bean(name = { "sm", "sims" })
	public Sim sim() {
		return new Sim();
	}

	@Bean({ "mob", "mbl", "mobl" }) // We Can Also Write Like This
	public Mobile mobile() {
		return new Mobile();
	}
}
