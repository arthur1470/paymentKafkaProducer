package br.com.payment.producer.controller.dto;

import java.time.LocalDateTime;

public class PixDTO {

	private String cpf;
	private String name;
	private String paymentPix;
	private String payerPix;
	private LocalDateTime paymentDate;
	private Double totalAmount;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentPix() {
		return paymentPix;
	}

	public void setPaymentPix(String paymentPix) {
		this.paymentPix = paymentPix;
	}

	public String getPayerPix() {
		return payerPix;
	}

	public void setPayerPix(String payerPix) {
		this.payerPix = payerPix;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
