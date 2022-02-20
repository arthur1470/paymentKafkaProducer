package br.com.payment.producer.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.payment.PaymentBankSlip;
import br.com.payment.PaymentCreditCard;
import br.com.payment.PaymentPix;

@Component
public class PaymentProducer {

	private final String creditCardTopic;
	private final String pixTopic;
	private final String bankSlipTopic;
	private KafkaTemplate<String, PaymentPix> kafkaPaymentPixTemplate;
	private KafkaTemplate<String, PaymentCreditCard> kafkaPaymentCreditCardTemplate;
	private KafkaTemplate<String, PaymentBankSlip> kafkaPaymentBankSlipTemplate;

	public PaymentProducer(@Value("${credit.card.payment}") String creditCardTopic,
			@Value("${pix.payment}") String pixTopic,
			@Value("${bank.slip.payment}") String bankSlipTopic,
			KafkaTemplate<String, PaymentPix> kafkaPaymentPixTemplate,
			KafkaTemplate<String, PaymentCreditCard> kafkaPaymentCreditCardTemplate,
			KafkaTemplate<String, PaymentBankSlip> kafkaPaymentBankSlipTemplate) {

		this.creditCardTopic = creditCardTopic;
		this.pixTopic = pixTopic;
		this.bankSlipTopic = bankSlipTopic;
		this.kafkaPaymentPixTemplate = kafkaPaymentPixTemplate;
		this.kafkaPaymentCreditCardTemplate = kafkaPaymentCreditCardTemplate;
		this.kafkaPaymentBankSlipTemplate = kafkaPaymentBankSlipTemplate;
	}
	
	public void sendMessage(PaymentCreditCard paymentCreditCard) {
		kafkaPaymentCreditCardTemplate.send(creditCardTopic, paymentCreditCard);
	}

	public void sendMessage(PaymentPix paymentPix) {
		kafkaPaymentPixTemplate.send(pixTopic, paymentPix);
	}

	public void sendMessage(PaymentBankSlip paymentBankSlip) {
		kafkaPaymentBankSlipTemplate.send(bankSlipTopic, paymentBankSlip);
	}

}
