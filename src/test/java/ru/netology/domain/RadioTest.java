package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldCurrentRadioStationMax() {
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCurrentRadioStationMin() {
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCurrentRadioStationOverMax() {
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCurrentRadioStationUnderMin() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldPervRadioStation() {
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCurrentVolumeMax() {
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldCurrentVolumeMin() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldCurrentVolumeOverMax() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldCurrentVolumeUnderMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolume() {
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldPervVolume() {
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}