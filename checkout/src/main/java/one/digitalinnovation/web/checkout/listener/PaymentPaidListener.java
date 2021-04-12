package one.digitalinnovation.web.checkout.listener;

import one.digitalinnovation.web.checkout.entity.CheckoutEntity;
import one.digitalinnovation.web.checkout.service.CheckoutService;
import one.digitalinnovation.web.checkout.streaming.PaymentPaidSink;
import one.digitalinnovation.web.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
