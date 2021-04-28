package fr.smileandpay.shop.product.model;

import fr.smileandpay.shop.merchant.model.Merchant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	@Column
	private int idProduct;

	@Column (name= "create_date")
	private Instant createDate;

	@Column(name= "label")
	private String label;

	@Column(name= "unit_price")
	private double unitPrice;

	@Column(name= "currency")
	private Currency currency;

	@Column(name= "weight")
	private double weight;

	@Column(name= "height")
	private double height;

	@ManyToMany
	@JoinTable( name = "product_merchant_association",
			joinColumns = @JoinColumn( name = "idProduct" ),
			inverseJoinColumns = @JoinColumn( name = "idMerchant" ) )
	private List<Merchant> merchants = new ArrayList<>();
}
