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
    public int currentVolume;

    public void setCurrentVolume(int currentVolume){
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void NextVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume +1;
        }
        if (currentVolume >= 10) {
            this.currentVolume = 10;
        }
    }
    public void PrevVolume(int currentVolume) {
        if (currentVolume < 11) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume >= 0) {
            this.currentVolume = 0;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
    }
}

