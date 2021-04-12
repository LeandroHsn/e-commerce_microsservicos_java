package one.digitalinnovation.web.payment.repository;

import one.digitalinnovation.web.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
