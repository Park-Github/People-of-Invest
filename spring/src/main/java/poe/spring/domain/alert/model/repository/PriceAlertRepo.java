package poe.spring.domain.alert.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.alert.model.entity.PriceAlert;

import java.util.List;

public interface PriceAlertRepo extends JpaRepository<PriceAlert, Long> {
    List<PriceAlert> findByAlertId(Long alertId);
}
