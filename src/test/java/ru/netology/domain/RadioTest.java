package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/dataCurrentRadioStation.csv")
    void shouldSetCurrentRadioStation(int currentRadioStation, int expected) {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(currentRadioStation);

        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void sholdNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        rad.setNext();

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void sholdNextRadioStationFrom9To0() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        rad.setNext();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void sholdPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        rad.setPrev();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void sholdPrevRadioStationFrom0To9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        rad.setPrev();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void sholdIncreaseVolume() {
        Radio rad = new Radio();

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void sholdIncreaseVolumeFrom10() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void sholdReduseVolume() {
        Radio rad = new Radio();

        rad.reduceVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void sholdReduseVolumeFrom1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        rad.reduceVolume();


        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }


}
