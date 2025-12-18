package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BreachRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ruleName;

    @Column(nullable = false)
    private BigDecimal penaltyPerDay;

    @Column(nullable = false)
    private Double maxPenaltyPercentage;

    private boolean active = true;

    private boolean isDefaultRule = false;

    @PrePersist
    @PreUpdate
    public void validate() {
        if (penaltyPerDay == null || penaltyPerDay.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Penalty per day must be greater than zero");
        }
        if (maxPenaltyPercentage == null || maxPenaltyPercentage <= 0 || maxPenaltyPercentage > 100) {
            throw new IllegalArgumentException("Invalid max penalty percentage");
        }
    }
}
