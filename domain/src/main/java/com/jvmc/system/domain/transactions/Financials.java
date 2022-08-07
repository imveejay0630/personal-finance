package com.jvmc.system.domain.transactions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@ToString
@Entity
@Getter
@Setter
@Table(name = "financials")
public class Financials implements Serializable {

    @Id
    private String guid;

    private String financialType;

    private Date transactionDate;

    private String remarks;

    private Date createDate;

    private Date updateDate;

    private UUID financialUUID;
}
