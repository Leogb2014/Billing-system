package entities;

import entities.services.TaxService;

public class Invoice {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	private TaxService taxService;
	
	public Invoice() {
		
	}

	public Invoice(String name, Double price, Integer quantity, TaxService taxService) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.taxService = taxService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public Double totalPayment() {
		double basicPayment = price * quantity;
		double basicPaymentFee = taxService.paymentFee(basicPayment);
		return basicPayment + basicPaymentFee;
		
	}
	
	public String toString() {
		return "Product name: "
				+name
				+"\nPrice: "
				+String.format("%.2f", price)
				+"\nQuantity: "
				+quantity
				+"\nTotal payment: "
				+String.format("%.2f", totalPayment());
	}

}
