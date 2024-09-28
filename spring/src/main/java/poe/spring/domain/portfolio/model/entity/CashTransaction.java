package poe.spring.domain.portfolio.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CashTransaction {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    private Double amount;

    private String type;

    @Column(name = "exchange_rate")
    private Double exchangeRate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cash_id")
    private Cash cash;

}
