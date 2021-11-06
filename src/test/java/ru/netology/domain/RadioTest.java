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

}