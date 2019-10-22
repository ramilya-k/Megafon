package ru.itpark.model;

public class InternetSharingTariff extends Tariff {
    private boolean unlimitedInternet;

    public InternetSharingTariff(long id, String name, int subscriptionFee, String territoryOfAction, String features, String additionalInfo, boolean unlimitedInternet) {
        super(id, name, subscriptionFee, territoryOfAction, features, additionalInfo);
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }
}
