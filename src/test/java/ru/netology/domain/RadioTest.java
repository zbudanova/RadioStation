package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.NextRadioStation(0);

        int expected = 1;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldPervRadioStation() {
        Radio radio = new Radio();

        radio.PrevRadioStation(2);

        int expected = 1;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();

        radio.NextVolume(11);

        int expected = 10;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldPervVolume() {
        Radio radio = new Radio();

        radio.PrevVolume(0);

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
}