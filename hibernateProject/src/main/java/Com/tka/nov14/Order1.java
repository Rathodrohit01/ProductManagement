package Com.tka.nov14;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String nm;
	private int Price;

	public Order1() {
		super();
	}

	public Order1(String nm, int price) {
		super();

		this.nm = nm;
		Price = price;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
