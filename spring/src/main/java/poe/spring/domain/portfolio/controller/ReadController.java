package poe.spring.domain.portfolio.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.domain.portfolio.service.PortfolioCrudService;

@RestController
@RequiredArgsConstructor
public class ReadController {

    private final PortfolioCrudService crudService;

}