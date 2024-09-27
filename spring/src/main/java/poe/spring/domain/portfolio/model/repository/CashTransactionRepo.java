package poe.spring.domain.portfolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.portfolio.model.entity.CashTransaction;

import java.util.List;

public interface CashTransactionRepo extends JpaRepository<CashTransaction, Long> {
    List<CashTransaction> findByCashId(Long cashId);
}
