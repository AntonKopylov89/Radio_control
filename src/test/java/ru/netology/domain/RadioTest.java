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

    @ParameterizedTest
    @CsvFileSource(resources = "/dataNextRadioStation.csv")
    void sholdNextRadioStation(int currentRadioStation, int expected) {
        Radio rad = new Radio();

        rad.setNext(currentRadioStation);

        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataPrevRadioStation.csv")
    void sholdPrevRadioStation(int currentRadioStation, int expected) {
        Radio rad = new Radio();

        rad.setPrev(currentRadioStation);

        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataIncreaseVolume.csv")
    void sholdIncreaseVolume(int currentVolume, int expected) {
        Radio rad = new Radio();

        rad.increaseVolume(currentVolume);

        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataReduceVolume.csv")
    void sholdReduseVolume(int currentVolume, int expected) {
        Radio rad = new Radio();

        rad.reduceVolume(currentVolume);

        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


}
