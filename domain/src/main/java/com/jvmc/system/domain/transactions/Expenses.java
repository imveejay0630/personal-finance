package com.jvmc.system.domain.transactions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ToString
@Entity
@Getter
@Setter
@Table(name = "expenses")
public class Expenses implements Serializable {

    @Id
    private String guid;

    private Date transactionDate;

    private String expenseType;

    private BigDecimal amount;

    private String remarks;

    private Date createDate;

    private Date updateDate;
}
