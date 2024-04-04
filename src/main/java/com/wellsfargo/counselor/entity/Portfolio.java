package com.wellsfargo.counselor.entity;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String creation_date;

    @OneToMany(mappedBy = "Portfolio")
    private Set<Security> securities;

    protected Portfolio() {

    }

    public Portfolio(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }
}
