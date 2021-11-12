package ru.netology.domain;

public class Radio {
    int currentRadioStation;

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

    public void nextRadioStation() {
        if (currentRadioStation < 10) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation < 10) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }

    }
    int currentVolume;

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

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }
    public void prevVolume() {
        if (currentVolume < 11) {
            currentVolume = currentVolume - 1;;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }

    }
}

