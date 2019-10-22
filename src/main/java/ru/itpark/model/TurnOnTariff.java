package ru.itpark.model;

public class TurnOnTariff extends Tariff {
    private int minutes;
    private int sms;
    private boolean unlimitedInternet;
    private int cashbackPercentage;


    public TurnOnTariff(long id, String name, int subscriptionFee, String territoryOfAction, String features, String details, int minutes, int sms, boolean unlimitedInternet, int cashbackPercentage) {
        super(id, name, subscriptionFee, territoryOfAction, features, details);
        this.minutes = minutes;
        this.sms = sms;
        this.unlimitedInternet = unlimitedInternet;
        this.cashbackPercentage = cashbackPercentage;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public int getCashbackPercentage() {
        return cashbackPercentage;
    }

    public void setCashbackPercentage(int cashbackPercentage) {
        this.cashbackPercentage = cashbackPercentage;
    }
}
