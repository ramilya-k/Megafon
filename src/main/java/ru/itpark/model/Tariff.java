package ru.itpark.model;

public class Tariff {
    private long id;
    private String name;
    private int subscriptionFee;
    private String territoryOfAction;
    private String features;
    private String details;

    public Tariff(long id, String name, int subscriptionFee, String territoryOfAction, String features, String details) {
        this.id = id;
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.territoryOfAction = territoryOfAction;
        this.features = features;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getTerritoryOfAction() {
        return territoryOfAction;
    }

    public void setTerritoryOfAction(String territoryOfAction) {
        this.territoryOfAction = territoryOfAction;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
