package br.com.payment.producer.controller.dto;

import java.time.LocalDateTime;

public class CreditCardDTO {

	private String cardNumber;
	private long cardExpirationDate;
	private String cardOwnerName;
	private String cardOwnerCpf;
	private LocalDateTime datePayment;
	private Double totalAmount;
	private Integer installments;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(long cardExpirationDate) {
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

	public LocalDateTime getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(LocalDateTime datePayment) {
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

	private Double installmentsAmount;
}
