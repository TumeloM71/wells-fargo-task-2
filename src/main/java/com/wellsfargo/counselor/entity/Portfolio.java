package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @Column(name = "clientId")
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "clientId")
    private Client client;

    @Column
    private LocalDate creationDate;

    protected Portfolio(){}

    public Portfolio(long portfolioId, Client client, LocalDate creationDate) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
