package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldCurrentRadioStation() {

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {

        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldPervRadioStation() {

        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.currentRadioStation;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolume() {

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {

        radio.nextVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldPervVolume() {

        radio.prevVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }
}