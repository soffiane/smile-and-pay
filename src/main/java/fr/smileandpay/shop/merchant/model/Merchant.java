package fr.smileandpay.shop.merchant.model;

import fr.smileandpay.shop.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {

	@Id
	@GeneratedValue
	@Column
	private int idMerchant;

	@Temporal(TemporalType.TIMESTAMP)
	@Column (name= "create_date")
	private Instant createDate;

	@Column(name= "name")
	private String name;

	@Column(name= "lastname")
	private String lastName;

	@Column(name= "birthdate")
	private LocalDate birthDate;

	@ManyToMany
	@JoinTable( name = "product_merchant_association",
			joinColumns = @JoinColumn( name = "idMerchant" ),
			inverseJoinColumns = @JoinColumn( name = "idProduct" ) )
	private List<Product> products = new ArrayList<>();
}
