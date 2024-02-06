package entities.services;

public class BrazilTaxService implements TaxService{

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.01;
	}
	

}
