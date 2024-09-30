package poe.spring.domain.portfolio.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.domain.portfolio.service.PortfolioCrudService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/{id}/portfolio/create")
public class CreateController {

    private final PortfolioCrudService crudService;

    @PostMapping
    public ResponseEntity<Api<Map<String, Long>>> create(
            @PathVariable Long id,
            @RequestBody String name
    ) {
        Long portfolioId = crudService.create(id, name);

        Map<String, Long> data = new HashMap<>();
        data.put("portfolio_id", portfolioId);

        Api<Map<String, Long>> response = Api.<Map<String, Long>>builder()
                .data(data)
                .statusCode(String.valueOf(HttpStatus.CREATED.value()))
                .resultMessage("Created a new portfolio successfully.")
                .build();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

}
