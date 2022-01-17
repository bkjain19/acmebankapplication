package com.acmebank.accountmanager.repository.entity;

import com.acmebank.accountmanager.model.TransferStatus;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="transfer")
public class TransferEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long fromAccountId;
    private Long toAccountId;

    private BigDecimal amount;
    private TransferStatus status;

    private String reference;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transferTime;
}
