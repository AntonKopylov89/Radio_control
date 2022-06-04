package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio rad = new Radio();
    @ParameterizedTest
    @CsvFileSource(resources = "/dataCurrentRadioStation.csv")
    void shouldSetCurrentRadioStation(int currentRadioStation, int expected) {

        rad.setCurrentRadioStation(currentRadioStation);

        assertEquals(expected, rad.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNumberOfRadioStation.csv")
    void shouldSetNumberOfRadioStation(int numberOfRadioStation, int expected) {

        rad.setNumberOfRadioStation(numberOfRadioStation);

        assertEquals(expected, rad.getNumberOfRadioStation());
    }

    @Test
    void sholdNextRadioStation() {
        rad.setCurrentRadioStation(1);

        rad.setNext();

        assertEquals(2, rad.getCurrentRadioStation());
    }

    @Test
    void sholdNextRadioStationFrom9To0() {
        rad.setCurrentRadioStation(9);

        rad.setNext();

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void sholdPrevRadioStation() {
        rad.setCurrentRadioStation(1);

        rad.setPrev();

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void sholdPrevRadioStationFrom0To9() {
        rad.setCurrentRadioStation(0);

        rad.setPrev();

        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    void sholdIncreaseVolume() {
        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    void sholdIncreaseVolumeFrom100() {
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    void sholdReduseVolume() {
        rad.reduceVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    void sholdReduseVolumeFrom1() {
        rad.setCurrentVolume(1);

        rad.reduceVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    Radio rad1 = new Radio(25);
    @Test
    void sholdNextRadioStationFrom24To0() {

        rad1.setCurrentRadioStation(24);

        rad1.setNext();

        assertEquals(0, rad1.getCurrentRadioStation());
    }

    @Test
    void sholdPrevRadioStationFrom0To24() {
        rad1.setCurrentRadioStation(0);

        rad1.setPrev();

        assertEquals(24, rad1.getCurrentRadioStation());
    }
}
