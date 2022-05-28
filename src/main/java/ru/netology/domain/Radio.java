package ru.netology.domain;

public class Radio {
    private int currentRadioStation = 1;
    private int currentVolume =  1;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNext(int currentRadioStation) {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void setPrev(int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume == 10) {
            return;
        }
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume(int currentVolume) {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}
