package br.com.payment.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.payment.PaymentBankSlip;
import br.com.payment.PaymentCreditCard;
import br.com.payment.PaymentPix;
import br.com.payment.producer.controller.dto.BankSlipDTO;
import br.com.payment.producer.controller.dto.CreditCardDTO;
import br.com.payment.producer.controller.dto.PixDTO;
import br.com.payment.producer.producer.PaymentProducer;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private PaymentProducer paymentProducer;
	
	public PaymentController(PaymentProducer paymentProducer) {
		this.paymentProducer = paymentProducer;
	}	
	
	@PostMapping("/pix")
	public ResponseEntity<PixDTO> send(@RequestBody PixDTO pix) {
		PaymentPix payment = PaymentPix.newBuilder()
								.setCpf(pix.getCpf())
								.setName(pix.getName())
								.setPayerPix(pix.getPayerPix())
								.setPaymentDate(pix.getPaymentDate())
								.setPaymentPix(pix.getPaymentPix())
								.setTotalAmount(pix.getTotalAmount()).build();
		
		paymentProducer.sendMessage(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PostMapping("/bankslip")
	public ResponseEntity<PixDTO> send(@RequestBody BankSlipDTO bankSlip) {
		PaymentBankSlip payment = PaymentBankSlip.newBuilder()
										.setSlipCode(bankSlip.getSlipCode())
										.setPayerName(bankSlip.getPayerName())
										.setCreatedDate(bankSlip.getCreatedDate())
										.setExpirationDate(bankSlip.getExpirationDate())
										.setTotalAmount(bankSlip.getTotalAmount()).build();
		
		paymentProducer.sendMessage(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PostMapping("/creditcard")
	public ResponseEntity<PixDTO> send(@RequestBody CreditCardDTO creditCard) {
		PaymentCreditCard payment = PaymentCreditCard.newBuilder()
										.setCardOwnerCpf(creditCard.getCardOwnerCpf())
										.setCardOwnerName(creditCard.getCardOwnerName())
										.setCardNumber(creditCard.getCardNumber())
										.setDatePayment(creditCard.getDatePayment())
										.setCardExpirationDate(creditCard.getCardExpirationDate())
										.setInstallments(creditCard.getInstallments())
										.setInstallmentsAmount(creditCard.getInstallmentsAmount())
										.setTotalAmount(creditCard.getTotalAmount()).build();
		
		paymentProducer.sendMessage(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
