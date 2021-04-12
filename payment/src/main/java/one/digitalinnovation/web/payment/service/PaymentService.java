package one.digitalinnovation.web.payment.service;

import one.digitalinnovation.web.checkout.event.CheckoutCreatedEvent;
import one.digitalinnovation.web.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
