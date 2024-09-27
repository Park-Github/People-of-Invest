package poe.spring.domain.alert.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StrategyAlert {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String strategy;

    private String input;

    private String message;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_id")
    private Alert alert;

}
