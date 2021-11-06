package ru.netology.domain;

public class Radio {
    public int currentRadioStation;

    public void setCurrentRadioStation(int currentRadioStation){
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void NextRadioStation(int currentRadioStation) {
        if (currentRadioStation < 10) {
            this.currentRadioStation = currentRadioStation +1;
        }
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
        }
    }
    public void PrevRadioStation(int currentRadioStation) {
        if (currentRadioStation < 10) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        }
    }
    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation > 0) {
            return;
        }
        if (currentRadioStation < 10) {
            return;
        }

    }
}

