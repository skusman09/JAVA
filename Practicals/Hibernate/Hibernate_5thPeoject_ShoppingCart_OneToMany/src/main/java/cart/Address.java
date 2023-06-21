package cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@Column(name = "country_Id", length = 10)
	private String cnrty_Id;

	@Column(length = 20)
	private String country;

	@Column(length = 20)
	private String state;

	@Column(length = 20)
	private String city;
}
