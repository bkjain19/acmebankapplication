package com.acmebank.accountmanager.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="transaction")
public class TransactionEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long accountID;
    private BigDecimal amount;
    private String reference;

    private BigDecimal balance;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionTime;
}
