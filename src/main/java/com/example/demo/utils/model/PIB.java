package com.example.demo.utils.model;

public class PIB {
    private String year;
    private Double consumption;
    private Double investment;
    private Double publicSpending;
    private Double exports;
    private Double importsItem;

    public PIB(String year, Double consumption, Double investment,Double exports, Double importsItem , Double publicSpending) {
        this.year = year;
        this.consumption = consumption;
        this.investment = investment;
        this.publicSpending = publicSpending;
        this.exports = exports;
        this.importsItem = importsItem;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Double getInvestment() {
        return investment;
    }

    public void setInvestment(Double investment) {
        this.investment = investment;
    }

    public Double getPublicSpending() {
        return publicSpending;
    }

    public void setPublicSpending(Double publicSpending) {
        this.publicSpending = publicSpending;
    }

    public Double getExports() {
        return exports;
    }

    public void setExports(Double exports) {
        this.exports = exports;
    }

    public Double getImportsItem() {
        return importsItem;
    }

    public void setImportsItem(Double importsItem) {
        this.importsItem = importsItem;
    }
}
