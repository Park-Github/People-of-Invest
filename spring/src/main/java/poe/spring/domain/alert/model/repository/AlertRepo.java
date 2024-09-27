package poe.spring.domain.alert.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.alert.model.entity.Alert;

import java.util.List;

public interface AlertRepo extends JpaRepository<Alert, Long> {
    List<Alert> findByMemberId(Long memberId);
}
