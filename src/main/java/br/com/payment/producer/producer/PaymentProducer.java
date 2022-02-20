package br.com.payment.producer.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.payment.PaymentBankSlip;
import br.com.payment.PaymentCreditCard;
import br.com.payment.PaymentPix;

@Component
public class PaymentProducer {

	private final String topicName;
	private KafkaTemplate<String, PaymentPix> kafkaPaymentPixTemplate;
	private KafkaTemplate<String, PaymentCreditCard> kafkaPaymentCreditCardTemplate;
	private KafkaTemplate<String, PaymentBankSlip> kafkaPaymentBankSlipTemplate;

	public PaymentProducer(@Value("${topic.name}") String topicName,
			KafkaTemplate<String, PaymentPix> kafkaPaymentPixTemplate,
			KafkaTemplate<String, PaymentCreditCard> kafkaPaymentCreditCardTemplate,
			KafkaTemplate<String, PaymentBankSlip> kafkaPaymentBankSlipTemplate) {

		this.topicName = topicName;
		this.kafkaPaymentPixTemplate = kafkaPaymentPixTemplate;
		this.kafkaPaymentCreditCardTemplate = kafkaPaymentCreditCardTemplate;
		this.kafkaPaymentBankSlipTemplate = kafkaPaymentBankSlipTemplate;
	}

	public void sendMessage(PaymentPix paymentPix) {
		kafkaPaymentPixTemplate.send(topicName, paymentPix);
	}

	public void sendMessage(PaymentCreditCard paymentCreditCard) {
		kafkaPaymentCreditCardTemplate.send(topicName, paymentCreditCard);
	}

	public void sendMessage(PaymentBankSlip paymentBankSlip) {
		kafkaPaymentBankSlipTemplate.send(topicName, paymentBankSlip);
	}

}
