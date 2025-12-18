package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PenaltyCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Contract contract;

    private Integer daysDelayed;

    private BigDecimal calculatedPenalty;

    private LocalDateTime calculatedAt;

    @PrePersist
    public void onCreate() {
        this.calculatedAt = LocalDateTime.now();
        if (daysDelayed == null || daysDelayed < 0) {
            daysDelayed = 0;
        }
        if (calculatedPenalty == null) {
            calculatedPenalty = BigDecimal.ZERO;
        }
    }
}
