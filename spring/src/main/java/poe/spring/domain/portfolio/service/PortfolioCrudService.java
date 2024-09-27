package poe.spring.domain.portfolio.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poe.spring.domain.portfolio.model.repository.*;

@Service
@RequiredArgsConstructor
public class PortfolioCrudService {

    private final PortfolioRepo portfolioRepo;
    private final ItemRepo itemRepo;
    private final CashRepository cashRepository;
    private final CashTransactionRepo cashTransactionRepo;
    private final StockTransactionRepo stockTransactionRepo;

    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }

}
