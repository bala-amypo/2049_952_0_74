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
public class BreachReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Contract contract;

    private Integer daysDelayed;

    private BigDecimal penaltyAmount;

    private LocalDateTime generatedAt;

    @PrePersist
    public void onCreate() {
        this.generatedAt = LocalDateTime.now();
    }
}
