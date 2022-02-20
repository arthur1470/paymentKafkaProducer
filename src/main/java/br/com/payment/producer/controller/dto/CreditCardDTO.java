package br.com.payment.producer.controller.dto;

public class CreditCardDTO {

	private String cardNumber;
	private String cardExpirationDate;
	private String cardOwnerName;
	private String cardOwnerCpf;
	private String datePayment;
	private Double totalAmount;
	private Integer installments;
	private Double installmentsAmount;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	public String getCardOwnerName() {
		return cardOwnerName;
	}

	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	public String getCardOwnerCpf() {
		return cardOwnerCpf;
	}

	public void setCardOwnerCpf(String cardOwnerCpf) {
		this.cardOwnerCpf = cardOwnerCpf;
	}

	public String getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(String datePayment) {
		this.datePayment = datePayment;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public Double getInstallmentsAmount() {
		return installmentsAmount;
	}

	public void setInstallmentsAmount(Double installmentsAmount) {
		this.installmentsAmount = installmentsAmount;
	}

}
