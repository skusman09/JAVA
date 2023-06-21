package product;

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
public class Product {
	@Id
	@Column(name = "Product_Id", length = 20)
	private String p_Id;

	@Column(name = "Product_Name", length = 20)
	private String p_Name;

	@Column(length = 50)
	private String specifications;

	@Column(name = "Product_Price")
	private long p_Price;
}
