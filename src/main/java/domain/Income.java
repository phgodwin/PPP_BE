package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Income {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private float takeHomePay;
	
	private float additioanlIncome;

	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTakeHomePay() {
		return takeHomePay;
	}

	public void setTakeHomePay(float takeHomePay) {
		this.takeHomePay = takeHomePay;
	}

	public float getAdditioanlIncome() {
		return additioanlIncome;
	}

	public void setAdditioanlIncome(float additioanlIncome) {
		this.additioanlIncome = additioanlIncome;
	}
	
	
	
	
}
	