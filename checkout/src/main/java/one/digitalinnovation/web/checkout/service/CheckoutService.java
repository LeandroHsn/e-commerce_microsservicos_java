package one.digitalinnovation.web.checkout.service;

import one.digitalinnovation.web.checkout.entity.CheckoutEntity;
import one.digitalinnovation.web.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
