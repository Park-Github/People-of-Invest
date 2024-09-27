package poe.spring.domain.alert.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poe.spring.domain.alert.model.repository.AlertRepo;
import poe.spring.domain.alert.model.repository.PriceAlertRepo;
import poe.spring.domain.alert.model.repository.StrategyAlertRepo;

@Service
@RequiredArgsConstructor
public class AlertCrudService {

    private final AlertRepo alertRepo;
    private final PriceAlertRepo priceAlertRepo;
    private final StrategyAlertRepo strategyAlertRepo;

    public void create() {
    }

    public void read() {
    }

    public void update() {
    }

    public void delete() {
    }

}
