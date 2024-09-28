package poe.spring.domain.portfolio.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.common.Api;
import poe.spring.domain.portfolio.dto.PortfolioDto;
import poe.spring.domain.portfolio.service.PortfolioCrudService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/portfolio")
public class CreateController {

    private final PortfolioCrudService crudService;

    public ResponseEntity<Api<Void>> create(@RequestBody PortfolioDto portfolioDto) {
        crudService.create(portfolioDto);
        return ResponseEntity.ok(Api.success(null));
    }

}
