package poe.spring.domain.portfolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.portfolio.model.entity.Cash;

import java.util.List;

public interface CashRepository extends JpaRepository<Cash, Long> {
    List<Cash> findByPortfolioId(Long portfolioId);
}
