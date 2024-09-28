package poe.spring.domain.portfolio.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.domain.portfolio.service.PortfolioCrudService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/portfolio")
public class DeleteController {

    private final PortfolioCrudService crudService;

}
