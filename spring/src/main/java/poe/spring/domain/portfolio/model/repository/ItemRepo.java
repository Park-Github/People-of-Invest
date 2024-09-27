package poe.spring.domain.portfolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poe.spring.domain.portfolio.model.entity.Item;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long> {
    List<Item> findByPortfolioId(Long portfolioId);
}
