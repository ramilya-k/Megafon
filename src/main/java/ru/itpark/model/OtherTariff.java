package ru.itpark.model;

public class OtherTariff extends Tariff {
    public OtherTariff(long id, String name, int subscriptionFee, String territoryOfAction, String features, String additionalInfo) {
        super(id, name, subscriptionFee, territoryOfAction, features, additionalInfo);
    }
}
