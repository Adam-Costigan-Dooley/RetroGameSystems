package com.example.retrovideogamesystemca2;

import com.example.retrovideogamesystemca2.Game;

public class GameMachine {

    private String machineName;

    private String manufacturer;

    private String description;

    private String type;

    private String media;

    private int machineReleaseYear;

    private double machinePrice;

    private String imageUrl;

    private int gamesCount;

    public GameMachine(String machineName, String manufacturer, String description, String type, String media, int machineReleaseYear, double machinePrice, String imageUrl) {
        this.machineName = machineName;
        this.manufacturer = manufacturer;
        this.description = description;
        this.type = type;
        this.media = media;
        this.machineReleaseYear = machineReleaseYear;
        this.machinePrice = machinePrice;
        this.imageUrl = imageUrl;
        this.gamesCount = 0;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public int getMachineReleaseYear() {
        return machineReleaseYear;
    }

    public void setMachineReleaseYear(int machineReleaseYear) {
        this.machineReleaseYear = machineReleaseYear;
    }

    public double getMachinePrice() {
        return machinePrice;
    }

    public void setMachinePrice(double machinePrice) {
        this.machinePrice = machinePrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    @Override
    public String toString() {
        return machineName + " - " + manufacturer + " (" + type + ", " + media + ", Year: " + machineReleaseYear + ", Price: €"+ machinePrice + ")";
    }
}
