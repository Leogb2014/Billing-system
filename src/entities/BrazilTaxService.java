package entities;

public class BrazilTaxService implements Tax{

	@Override
	public Double totalPayment(Double amount) {
		return amount * 0.01;
	}
	

}
