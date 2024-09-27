package poe.spring.domain.alert.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.alert.model.entity.StrategyAlert;

import java.util.List;

public interface StrategyAlertRepo extends JpaRepository<StrategyAlert, Long> {
    List<StrategyAlert> findByAlertId(Long alertId);
}
